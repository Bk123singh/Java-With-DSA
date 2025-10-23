import java.util.*;
public class compairnumber{
public static void main(String [] args){
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
a = sc.nextInt();
System.out.println("Enter the value of b:");
b = sc.nextInt();
System.out.println("Enter the value of c:");
c = sc.nextInt();
if(a > b && a > b){
System.out.println("A is largest");
}
if (b > a && b > c){
System.out.println("b is largest");
}
else { 
System.out.println("c is largest");
}
}
}