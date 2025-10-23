import java.util.*;
public class practice211 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcutor gs = new Calcutor(); 
    System.out.println("Enter the value fo a:");
      gs.a =sc.nextInt();
    System.out.println("Enter the value fo b:");
      gs.b =sc.nextInt();
    System.out.println("Enter the operator + , - , * ,/");
    gs.c= sc.next().charAt(0);
      gs.add();


        
    }
}

class Calcutor{
    Calcutor(){
        System.out.println("it is a calcutor programing:");
    }
    int a,b;
    char c;
    
   void add(){
    if(c=='+'){
        System.out.println("sum = " +  (a+b));
    } else if(c=='-'){
        System.out.println("substration = "  + (a-b));
    }
    else if(c == '*'){
        System.out.println("multiple = " + (a*b));
    } 
    else if(c=='/'){
        System.out.println("divison = " + (a/b));
    }

   }
}