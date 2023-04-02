class CtoFConverter {

    //first Celsius
    public static double Celsius(int Fahrenheit) {
        //the correct formula for converting to Fahrenheit
        return (Fahrenheit - 32)*5/9;
    }

    public static void main (String[] args) {
        for(int i=0;i<21;i++)
        {
         System.out.println(i + " Fahrenheit is equivalents to " + Celsius(i) + " in Celsius.");
        }

    }

}
