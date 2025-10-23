public class findinglargest{
public static void largest(int number[]){
int n = Integer.MIN_VALUE;
for(int i = 0 ; i<number.length ; i++){
if(n <  number[i]){
largest = number[i];
}
}
System.out.println(largest);
}
public static void main(String [] args){
int number[] = {3,4,5,6,7,12,6,33};
 
System.out.println("largest number is : "  +  largest(number));
}
}
