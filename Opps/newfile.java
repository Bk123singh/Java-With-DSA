public class newfile{
    public static void main(String[] args) {
        Hourse h = new Hourse();
        h.eat();
        h.walk();
        Checken c = new Checken();
        c.eat();
        c.walk();
        
    }  
    }
    abstract class Animal{
        void eat(){
            System.out.println("eats");
        }
        abstract void walk();
    }
    
     class Hourse extends Animal{
        void walk(){
            System.out.println("hourse has four legs");
        }
     }
    
     class Checken extends Animal{
    
        void walk() {
            System.out.println("checken has two legs");
        }
        
     }