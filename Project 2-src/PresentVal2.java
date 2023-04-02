import java.util.Scanner; // parse primitive types and strings using regular expressions
import java.lang.Math; //for executing the math, and for later executing Math.pow

public class PresentVal2{
    public static void main(String args[]){

    //FutureValue
    Scanner opt1= new Scanner(System.in);
    System.out.println("Enter the future value:");
    double futureval= opt1.nextDouble(); // store output


    //Annual Interest Rate
    Scanner opt2= new Scanner(System.in);
    System.out.println("Enter the Annual Interest Rate:");
    double anualintrate= opt2.nextDouble();


    //Number of Years
    Scanner opt3= new Scanner(System.in);
    System.out.println("Enter the number of years that you plan to let the money sit in the account:");
    double years= opt3.nextDouble();

    //Out put for present result
    double ans1=presentValue(futureval,anualintrate,years); // call method
    String str = String.format("%.02f",ans1);// 2 digits after decimals
    System.out.println("The present amount to be deposited today is: $" + str);//set the output

    }
    static double presentValue(double f,double r, double n){
        r=1 + (r / 100);// rate of interest is r, so we need to use r/100 while calculating
        double x=Math.pow(r,n); // (1+r)^n can be calculated by using inbuilt pow function
        return (f/x); // return the present value
    }

}
