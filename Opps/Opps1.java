public class Opps1{
    public static void main(String args[]){

        Fish f= new Fish();
        

    }
}
 abstract class Animal{

    Animal(){
        System.out.println("animal is calling");
    }
    void eat(){
        System.out.println("everyoun is eating");
    }
    abstract  void walk();
    
}

class Hourse extends Animal{

    Hourse(){
        System.out.println("hourse is calling");
    }
    void walk(){
        System.out.println("houre has four leg");
    }
    void clolor(){
        System.out.println("hourse is black");
    }
}

class Fish extends   Hourse{
     Fish(){
                System.out.println("fish is calling");
            }
    void swims(){
        System.out.println("fish is swiming");
    }
    void walk(){
        System.out.println("fish has no leg");
    }
}