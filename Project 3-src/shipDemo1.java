public class shipDemo1 {

    public static void main (String[]args){

        final int NUM_SHIP = 2;

        Ship[] ships=new Ship[NUM_SHIP];


        ships[0]=new CruiseShip("Disney Magic","1990",1336);
        ships[1]=new CargoShip("Black Pearl","1800",50000);


        for(int index =0;index< 2; index++){
            System.out.println(ships[index].toString());
        }
    }

}
