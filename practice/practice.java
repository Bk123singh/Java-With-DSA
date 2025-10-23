import java.util.Scanner;

public class practice {

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
Grather gs = new Grather();
System.out.println("Enter the value fo a:");
      gs.a =sc.nextInt();
System.out.println("Enter the value fo b:");
      gs.b =sc.nextInt();
System.out.println("Enter the value fo c:");
      gs.c =sc.nextInt();

      gs.caltor();
      gs.great();
      gs.dis();
}
}

class Grather{
    int a,b,c;
    void caltor(){
        if(a > b  &&  a >c){
            System.out.println(a +  " is grather than b and c");
        }
    }
    void great(){
        if( b > a && b > c ){
            System.out.println( b + " is grather than a and c");
        }
    }
    void dis(){
        if(  c >a && c > a){
            System.out.println( c + " is grather than b an a");
        }
    }
    

    }
