import java.util.Scanner;

public class area{
public static void main(String [] args){
float area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of r:");
float r =sc.nextFloat();
float pie = 3.14f;
area =  pie*r*r;
float peri = 2*pie*r;
System.out.println("area = " + area);
System.out.println("perimeter = " + peri);
}
} 
