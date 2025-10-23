public class NewPractice{
    public static void main(String[] args) {
        

        Animal an=new Animal();
        an.name="The Rani";
        an.age=21;
        an.eat();

        bishal b=new bishal("Bishal Kuamr", 23);
        b.eat();

        navin n=new navin();
        
        
       




    // Student s=new Student("Rajesh Singh", 32, 22494);
    // s.someVal();
    // s.marksCal(70,70,70,70);



       }

}

class Animal{
    String name;
    int age;
    void eat(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Animal are eat something");
    }
}

class bishal extends Animal{

    public bishal(String name, int age){
        this.name=name;
        this.age=age;
    }
    
}

class navin extends bishal{

}



















class Student{
    String Name;
    int age;
    private int password;
    int phy,che, math, eng;

    public Student(String name, int age, int password){
        this.Name=name;
        this.age=age;
        this.password=password;
    }
    public void someVal(){
        System.out.println("Name : " + Name);
        System.out.println("your age is  : " + age);
        System.out.println("your password is: " + password);
    }

    public void marksCal(int phy, int che, int math, int eng){
        int totalmarks=this.phy+this.che + this.math + this.eng;
        float percentage=totalmarks/4;
        System.out.println("Your percentage is : " + percentage);
    }






}