public class practicearra {
public static void Twosum(int arra[] , int target){
    int i;
    int j; 
    for(i = 0; i <arra.length; i++){
    for( j =i+1; j < arra.length; j++){
        if(((arra[i]) + (arra[j]) )== target){
            System.out.println("("  +  i + " , "  + j + " )" );
            
            
        }
    }
}
System.out.println("not found ");
}


    public static void main(String[] args) {
        int arra[] = {2,7,11,15};
        int target = 22;
        Twosum(arra, target);
    }
}