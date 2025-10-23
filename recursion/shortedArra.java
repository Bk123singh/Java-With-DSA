public class shortedArra { 
    public static boolean  Shorted(int arra[] , int i){
        if(i == arra.length-1){
            return true;
        }
        if(arra[i] > arra[i+1]){
            return false;
        }
         return Shorted(arra, i+1);
    }

    public static void main(String[] args) {
     int arra[] ={1,2,3,4,5}  ;
     System.out.println(Shorted(arra, 0));
    }
}