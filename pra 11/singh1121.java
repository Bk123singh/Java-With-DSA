public class singh1121{
    public static boolean  compair(int arra[]){
        for(int i=0; i<arra.length;i++){
            int element= arra[i];
            for(int j=i+1; j<arra.length;j++){
                if(arra[j]==element){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arra[]={1,2,3,4,2};
        compair(arra);
    }
    
}
