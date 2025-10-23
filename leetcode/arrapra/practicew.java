

public  class practicew{
    public static void Subarray(int arra[]){
        int ts = 0;
        for(int i=0; i<arra.length;i++){
            int curr=i;
            for(int j =i+1; j<arra.length;j++){
                System.out.print("(" + j + "," + curr+ ")");
                ts++;
            }
        }
        System.out.println();
    System.out.println(ts);
    }
    public static void main(String [] args){
       int arra[] = { 1,2,3,4,56,7,5};
       
        Subarray(arra);
    }
}