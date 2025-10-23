public class oopp {

    public static void main(String[] args) {
      butter b1= new butter();
      b1.eat();
      b1.legs;

    }
}
//inheratance
class Animal{
    
    int eat;
    int food;
    int leg;
    void legs(){
        System.out.println("there has two legs");
    }
    void seteat(int eat){
        this.eat= eat;

    }
    void setfood(int food){
        this.food=food;
    }
}
class birds extends Animal{
    void fly(){
        System.out.println("birds age fly");
    }


}
class butter extends Animal{
    void eat(){
        System.out.println("Buttterfly are is fly in sky");
    }
}

class Student{

   
    String name;
    int age;
    int roll;
    Student(){

    }
    Student(Student s1){
        this.name= s1.name;
        this.age=s1.age;

    }
}
