package Interfaces;

public class Main {
    public static void main(String[] args) {
/*
        Driver driver2 =new Driver() ;
        Pilot pilot2 =new Pilot ();

        driver2.driving();
        pilot2.fly();

 */

       Driving[]driving1 = new  Driving []{
               new Driver()
       };

        for (Driving driving : driving1){
            driving.driving();
        }
        Fly[]fly1 = new Fly[]{
                new Pilot()
        };
        for (Fly fly :fly1){
            fly.fly();
        }




    }
}
