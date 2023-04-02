//import files
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.*;
import java.io.IOException;

// import javax.xml.bind.JAXB; does not exist passed Java 8, I had to look for different imports

public class CellPhoneStoreApp {

    static Scanner sc;

    public static int input_val;

    public static void main(String[] arg) throws IOException {

        sc = new Scanner(System.in);
        start();
    }

    private static void start() throws IOException {
        menus();
        input_val = sc.nextInt();
        System.out.println(check(input_val));

        optionHandle(input_val);
    }

    // menu options-to display
    private static void menus() {
        System.out.print("--------Menu Selections-------\n" +
                "1 - Create cell phones and write in text file\n" +
                "2 - Display cell phones from text file\n" + "3 - Create cell phones and write in xml file\n" +
                "4 - Display cell phones from xml file\n" + "5 - Exit\n" + "? ");
    }

    private static String check(int a) {

        String ch;
        switch (a) {
            case 1:
                ch = "Creating cellphone objects and write into txt file...";
                break;
            case 2:
                ch = "Reading cellphone list from txt file";
                break;
            case 3:
                ch = "creating cellphone objects and store in XML file...";
                break;
            case 4:
                ch = "Reading cell phone list from XML file..";
                break;
            case 5:
                ch = "Good Bye!";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
        ;
        return ch;
    }

// creation of the input for the file

    private static void optionHandle(int i) throws IOException {

        List<CellPhone> cell = new ArrayList<>();
        CellPhone cellPhone;
        CellPhoneList cellPhoneList;

        switch (i) {
            case 1:
                sc = new Scanner(System.in);
                System.out.print("Enter cellphone model :");
                String model = sc.nextLine();
                System.out.print("Enter cellphone name :");
                String manufacturer = sc.nextLine();
                System.out.print("Enter cellphone price :");
                double retailPrice = sc.nextDouble();

                cell.add(new CellPhone(model, manufacturer, retailPrice));
                cellPhone = new CellPhone(model, manufacturer, retailPrice);

                write(cellPhone.getModel() + " " + cellPhone.getManufacturer() + " " + cellPhone.getRetailPrice());
                start();

                break;
            case 2:
                readTxt();
                start();
                break;

            case 3:

                sc = new Scanner(System.in);
                System.out.print("Enter cellphone model :");
                String models = sc.nextLine();
                System.out.print("Enter cellphone name :");
                String manufacturers = sc.nextLine();
                System.out.print("Enter cellphone price :");
                double retailPrices = sc.nextDouble();
                cellPhoneList = new CellPhoneList(cell, models, manufacturers, retailPrices);
                start();
                break;
            case 4:

                readXml();
                start();
                break;
            case 5:

                break;
        }

    }

// creation of the file

    private static void write(String s) {

        File log = new File("cellphone.txt");
        try {
            if (!log.exists()) {
                log.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(log, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(s + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
        }
    }

    private static void readTxt() throws IOException {

        // File path is passed as parameter
        File file = new File("cellphone.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;

        System.out.println("Model               Manufacturer            retail price");
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st + " ");
    }
// Creating xml file
    private static void readXml() {

        try {
            File file = new File("cellphone.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("BASE");
            System.out.println("Model               Manufacturer        retail price");
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);

// out print for the element for the typ of model/manu/price

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    System.out.print(eElement.getElementsByTagName("MODEL").item(0).getTextContent() + " ");
                    System.out.print(eElement.getElementsByTagName("MANUFACTURE").item(0).getTextContent() + " ");
                    System.out.println(eElement.getElementsByTagName("RETAIL").item(0).getTextContent()+"");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();



        }
    }
}