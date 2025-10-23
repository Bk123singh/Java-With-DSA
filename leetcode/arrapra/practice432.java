public class practice432 {
    public static void Targ(int arra[], int target){
        for(int i=0; i<=arra.length;i++){
            for(int j = i+1;j<arra.length;j++){
                if(arra[i] + arra[j] == target){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arra[] = { 3,5,7,11,15};
        int target = 22;
        Targ(arra, target);
        
    }
}