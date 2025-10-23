import java.util.*;
public class Arra {
    public static void main(String []args){
       int marks [] = new int[50];
       Scanner sc = new Scanner(System.in);
       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();
       marks[3] = sc.nextInt();
       marks[4] = sc.nextInt();
       System.out.println("Phy = " + marks[0]);
       System.out.println("che = " + marks[1]);
       System.out.println("math = " + marks[2]);
       System.out.println("Eng = " + marks[3]);
       System.out.println("bio = " + marks[4]);
       int percentage;
       percentage = (marks[0] + marks[2] + marks[3] + marks[1] + marks[4])/5;
       System.out.println("percentage = " + percentage);
    }
}