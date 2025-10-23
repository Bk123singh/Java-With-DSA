public class oppsPractice {

   public static void main(String args[]){
      performed f= new performed(20, 2);
      f.add();
      f.division();
      f.display();

   }
}

class performed{
   int a;
   int b;
   int add;
   int divide;
   performed(int a, int b){
      this.a=a;
      this.b=b;
   }

   public void add(){
     add=a+b;
   }
        divide=a/b;
   }

   public void display(){
      System.out.println("Aditiion: " + add);
      System.out.println(divide);
   }
   
}