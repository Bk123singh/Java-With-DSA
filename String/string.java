import java.util.Scanner;

public class string {
    public static void Printletter(String firstname){
        for(int i = 0; i < firstname.length(); i++){
            System.out.print(firstname.charAt(i) + " ");
            
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
       /*  char arra[] = {'a','b','c','d'};
        String str = "bishal";
        String str1 = new String("singh");

        // immutable
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); */

        //concatenation
        String firstname = "bishal";
        String lastname= "singh";
        //System.out.println(firstname + " " + lastname);
        //System.out.println(firstname.charAt(4));
        Printletter(firstname);

    }
}