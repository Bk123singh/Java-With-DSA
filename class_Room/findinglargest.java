import java.util.*;
public class findinglargest{
public static void largest(int number[]){
int largest = integer.Min_value;
for(int i = 0 ; i<number.length ; i++){
if(largest <  number[i]){
largest = number[i];
}
}
}
public static void main(String [] args){
int number [] = {3,4,5,6,7,12,6,33};
 int index = largest(number);
System.out.println("largest number is :" + index);
}
}
