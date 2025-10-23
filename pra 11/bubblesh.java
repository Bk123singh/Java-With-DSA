public class bubblesh{
    public static void shorts(int arra[]){
        for(int turn=0;turn<arra.length-1;turn++){
    for(int j=0; j<arra.length-1-turn;j++){
        if(arra[j]>arra[j+1]){
        int temp=arra[j];
            arra[j]=arra[j+1];
            arra[j+1]=temp;
        }
    }
    }
    }

    public static void select(int arra[]){
        for(int i=0; i<arra.length-1;i++){
            int minPos=i;
            for(int j=0;j<arra.length;j++){
                if(arra[minPos]>arra[j]){
                    minPos=j;
                    int temp= arra[minPos];
                    arra[minPos]=arra[i];
                    arra[i]=temp;
                }
            }
        }
    }
    public static void print(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arra[]={5,4,2,1,3};
        select(arra);
        print(arra);

    }

}