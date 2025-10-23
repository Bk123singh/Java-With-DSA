import java.util.*;
public class leep{
public static void main(String [] args){
int year ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter for check the year is leep or nor:");
year =sc.nextInt();
if((year%4==0 && year%100 != 0) || ( year%400 ==0)){
System.out.println(year + " is leep  year");
} else {
System.out.println( year + " is not leep year");
}
}
}