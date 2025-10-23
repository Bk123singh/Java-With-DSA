

public class Opps {

    public static void main(String[] args) {
    //   Pen p1 =new Pen();// creat an obeject in memory . it always store in the form of heap 
    //     p1.setColor("bule");
    //     System.out.println(p1.getColor);
    //     p1.setTip(6);
    //     System.out.println(p1.getTip);
    //     // p1.setColor("yello");
    //     p1.color = "yellow";
    //     System.out.println(p1.color);



        // Bankaccount s1 = new Bankaccount();
        // s1.name= "bishal";
        // System.out.println(s1.name);
        // s1.age= 21;
        // System.out.println(s1.age);
        // s1.blance = 200;
        // System.out.println(s1.blance);
        Book b1=new Book();
       b1.color = "green";
       b1.price = 505;
        System.out.println(b1.color);
        System.out.println(b1.price);
        
    }
}

// class Bankaccount{
//     String name;
//     int age;
//     int blance;

//     void setname(String newname){
//         name = newname;
//     }
//     void setage(int newage){
//         age=newage;
//     }
//     void setblance(int newblance){
//          blance = newblance;
//     }

// }
 
 

// class Pen{
//     String color; 
//     int tip;

//     String getColor{
//         retur this.color;
//     }
//     int gerTip{
//         return this.Tip;   // this key word is used to refer to the curr
//     }
//     void setColor(String newColor){
//         color =newColor;
//     }
//     void setTip(int newTip){
//         tip=newTip;
//     }

// }

// class Student {
//     String name;
//     int age;

//     void setName(String newName){
//         name = newName;
//     }

//     void setAge(int newAge){
//         age= newAge;
//     }
// }
class Book{
    String color;
    int price;

    void setcolor(String newcolor){
        color =newcolor;
    }
     void setprice(int newprice){
        price =newprice;
     }
}