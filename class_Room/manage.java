
public class manage{
    public static void main(String[] args) {
        book b1 = new book();
        b1.setName("bishal kumar");
        b1.setAge(21);
        b1.setRool(22494);
        b1.schoolName = " vivekananda global universtity";
        b1.display();
        
    }
}
 

 class book {
    String name;
    int age;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age= age;
        
    }
    void setRool(int rool){
        this.roll= roll;
    }
    book(){
        System.out.println("Welcome my firend: ");
    }
    void display(){
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("roll no. " + roll);
        System.out.println("school Name " + schoolName);
    }
}

class  Empoole {
    Empoole(){
        
    }
}