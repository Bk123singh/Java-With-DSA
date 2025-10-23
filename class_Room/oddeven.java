import java.util.*;
public class oddeven{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number for check the number is odd or even");
int n = sc.nextInt();
if(n%2==0){
System.out.println( n + " is even ");
} else {
System.out.println( n + " is odd ");
}
} 
}