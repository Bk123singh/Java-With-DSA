import java.util.*;
public class practice13 { 
    public static void linearsearch(int arra[], int key){
        for(int i =0; i< arra.length; i++){
            if(arra[i] == key){
                system.out.println("the key value " + key);
            }
        }
        system.out.println("key is not found");
    }

    public static void main(String [] args){
        int arra[] = {2,3,5,6,7,5,6,8};
        int key =3;
        linearsearch(arra, key);

    }
}