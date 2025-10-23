
public class static11 {

    public static void main(String [] args){

        Checken ch= new Checken();
    
    

    }
}
//static keyword

// class Student{
//     static int returnPercentage(int phy,int che, int math){
//         return (math + phy + che)/3;
//     }
//     String name;
//     int roll;
//     int age;
//      static String schoolName;

//     void setName(String name){
//         this.name=name;
//     }
//     void getName(){
//         this.name = name;
//     }
// }

//super keyword

class Animal{
    Animal(){
        System.out.println("animal constrocutor is called");
    }
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("hours constrocutor is called");
    }
}
class Checken extends Animal{
    Checken(){
        System.out.println("checken constrocutor is called");
    }
}