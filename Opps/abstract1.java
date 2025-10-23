public class abstract1 {

    public static void main(String[] args) {
       Checken ch = new Checken();
        // animals -> hourse -> mustang
        
    }
}

 abstract class Animal{
    Animal(){
        System.out.println("constrocutor is called animal");
    }
    void eat(){
        System.out.println("eat grass");
    }
    abstract void walk(); 
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("constrocuton is called hourse");
    }
    void walk(){
        System.out.println("hourse has four leg");
    }
    
}

class Mustang extends Hourse{
    void Mustang(){
        System.out.println("constructor are called mustang");
    }
    void walk(){
        System.out.println(" has");
    }
    
}

class Checken extends Mustang{
    void Checken(){
        System.out.println("checken   constrocutor is called");
    }
    void walk(){
        System.out.print("checken has two legs");
    }
}

