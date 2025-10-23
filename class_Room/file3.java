import java.util.*;
public class file3{
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
Addition st = new Addition();
st.result();
st.display();

 }
}


class Addition{
 int a =2;
int b = 3;

void resutl(){
int c = a+b;
}
void disply(){
System.out.println("result " + c);
}
}
