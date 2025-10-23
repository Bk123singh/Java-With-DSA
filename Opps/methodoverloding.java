public class methodoverloding {

    public static void main(String[] args) {
        // Calator cal = new Calator();
        // cal.add(5, 6);
        // cal.add((float)4.2, (float)3.2);
        // cal.add(4, 6, 7);
        deer d = new deer();
        d.eat();
        
    }
}
//function overlowding
class Calator{
    void add(int a, int b){
        System.out.println(a+b);
    }

void add(float a, float b){
    System.out.println(a+b);
}
void add(int a, int b , int c){
    System.out.println(a+b+c);

}
}
//function 
class Animal{
  void eat(){
    System.out.println("eat any things");
  }  
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}

