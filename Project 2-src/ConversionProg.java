import java.util.Scanner;

public class ConversionProg {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your distance in meters:");
        int meters = input.nextInt();

        int option;

        do {
            System.out.println();
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Quit the program");
            System.out.print("Enter your choice : ");

            option = input.nextInt();

            switch(option)
            {
                case 1:
                    System.out.printf("%d meters is %.1f kilometers\n",meters, meters * 0.001);//convertion formula
                    break;
                case 2:
                    System.out.printf("%d meters is %.1f inches\n",meters, meters * 39.37);
                    break;
                case 3:
                    System.out.printf("%d meters is %.1f feet\n",meters, meters * 3.281);
                    break;
                case 4:

                    break;

                default: System.out.println("\nError; negative numbers can not be executed "); //error message
                    break;

            }
        }
        while(option != 4);

        System.out.println("Bye!");
    }
}
