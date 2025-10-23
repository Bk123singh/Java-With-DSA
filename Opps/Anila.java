public class Anila {
    public static void main(String[] args) {
        
        
        bishal b=new bishal();
        b.name="bishal";
        b.age=21;
        b.sex="male";
        b.display();
        

        
        
    }

    
}
class animal{
    int leg;
    animal(){
        System.out.println("all animal color is black and white");
    }
    void eat(){
        System.out.println("food");
    }
}
class fish extends animal{
    

}
class pen{
    String color;
    int tip;
    void setColor(String newcolor){
        this.color=newcolor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
    void display(){
        System.out.println(tip);
        System.out.println(color);
    }
}
class bishal{
    String name;
    int age;
    String sex;
    String getname(){
        return this.name;
    }
    int getage(){
        return this.age;
    }
    String getsex(){
        return this.sex;
    }
    void display(){
        System.out.println( "Name: " + name );
        System.out.println("Age: "  + age );
        System.out.println("Sex: " + sex);
    }
    
    
}