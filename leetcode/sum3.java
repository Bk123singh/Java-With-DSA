 public class sum3 {
    public static void tripeNum(int arra[]){
        for(int i =0; i < arra.length ;  i++){
            for(int j = i+1; j < arra.length; j++){
                for(int k = j+1; k < arra.length; k++){
                    if(arra[i] + arra[j] + arra[k] == 0){
                        System.out.println("(" +  arra[i]  + " ," +  arra[j]  +  " ,"  +  arra[k] +  " ) " );
                        
                    }
                }
            }
        }
        System.out.println("not found");
    }
    public static void main(String [] args){
        int arra[] = {-1,0,1,2,-1,-4};
        tripeNum(arra);
    }

}