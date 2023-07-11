package Oop3;
class  Perent {
    static {
        System.out.println("Static Perent init block" + " 1");
    }
    Perent(){

           System.out.println("Perent init block" + " 3");
       }
   }


public class Initialization_blocks extends Perent{
    {
        System.out.println("init block1"+" 4");
    }
    static {
        System.out.println("Static init block" + " 2");
    }
    {
        System.out.println("init block2"+" 5");
    }
    Initialization_blocks(){
        System.out.println("Constructor"+" 6");
    }
    public static void main(String[] args) {
        new Initialization_blocks();
    }
}


