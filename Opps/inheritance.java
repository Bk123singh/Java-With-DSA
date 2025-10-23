

public class inheritance {

    public static void main(String[] args) {
        // dog body =new dog();
        // body.color= " sinu";
        // body.eat();
        // body.leg = 4;
        // body.bread = " jakash";
        // System.out.println(body.color);
        // System.out.println(body.bread);

        Fish sark = new Fish();
        sark.color ="yellow";
        System.out.println(sark.color);
        sark.eat();
        sark.swimg();


        
    }
}
//base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
 class Birds extends Animal {
    int leg;
    void fly(){
        System.out.println("birds are flying");
    }
 }
 
class  mammals extends Animal{
    int leg;
    void walk(){
        System.out.println("mammals are walk");
    }
}

class Fish extends Animal{
    int leg ;
    void swimg(){
        System.out.println("fish are swiming");
    }
}



// drived class
class mamals extends Animal{
int leg;


}

// drived class
class  dog extends mamals{
    String bread;

}

//drived class
// class Fish extends Animal{
//     int fins;
//     void swims(){
//         System.out.println("swims");
//     }
    

// }