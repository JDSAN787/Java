

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;


// import javax.xml.bind.JAXB; does not exist passed Java 8, I had to look for different imports

 public class CellPhoneList {

     List<CellPhone> cellPhoneList;
     String model, manufacturer;
     double retailPrice;

     public CellPhoneList(List<CellPhone> cellPhoneList, String model, String manufacturer, double retailPrice) {
         this.cellPhoneList = cellPhoneList;
         this.model = model;
         this.manufacturer = manufacturer;
         this.retailPrice = retailPrice;
         xmlWrite(model, manufacturer, String.valueOf(retailPrice));
     }

     private static void xmlWrite(String a, String b, String c) {

         try {
// using the specific imports for the build

             DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
             Document doc = docBuilder.newDocument();

             Element rootElement = doc.createElement("CELLPHONE");
             doc.appendChild(rootElement);

             Element base = doc.createElement("BASE");
             base.appendChild(doc.createTextNode("http:fut"));
             rootElement.appendChild(base);

             Element model = doc.createElement("MODEL");
             model.appendChild(doc.createTextNode(String.valueOf(a)));
             base.appendChild(model);

             Element manufacture = doc.createElement("MANUFACTURE");
             manufacture.appendChild(doc.createTextNode(String.valueOf(b)));
             base.appendChild(manufacture);

             Element rate = doc.createElement("RETAIL");
             rate.appendChild(doc.createTextNode(String.valueOf(c)));
             base.appendChild(rate);

             TransformerFactory transformerFactory = TransformerFactory.newInstance();
             Transformer transformer = transformerFactory.newTransformer();
             DOMSource source = new DOMSource(doc);
             StreamResult result = new StreamResult(new File("cellphone.xml"));
             transformer.transform(source, result);
             System.out.println("File saved!");
         } catch (ParserConfigurationException | TransformerException pce) {
             pce.printStackTrace();
         }

     }
 }