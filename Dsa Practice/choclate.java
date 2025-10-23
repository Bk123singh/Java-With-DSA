public class choclate{
    public static int  chocalat(int arra[], int m){
        int num;
        for(int i =0; i<arra.length;i++){
              int dis1 = arra[i];
            for(int j =i+m-1;j<arra.length;j++ ){
             num = dis1-arra[j];
            }
        }
        return num;

        
        
    }

    public static void main(String [] args){
        int arra[]= {7,3,2,4,9,12,56};
        int m=3;
        chocalat(arra, m);
    }
}