
import com.sun.jdi.VMOutOfMemoryException;
import java.util.Arrays;

public class shortings {

    public static void BubbleShort(int arra[]){

        for(int turn=0; turn< arra.length;turn++){
            for(int j=0; j<arra.length-1-turn;j++){
                if(arra[j]>arra[j+1]){
                    int temp=arra[j];
                    arra[j]=arra[j+1];
                    arra[j+1]=temp;
                }
            }
        }

    }

    public static void selectionShort(int arra[]){
        for(int i=0;i<arra.length-1; i++){
            int minPos=i;

            for(int j=i+1;j<arra.length;j++){
                if(arra[minPos] > arra[j]){
                    minPos=j;
                }

            }

            int temp=arra[minPos];
            arra[minPos]=arra[i];
            arra[i]=temp;
        }
    }

    public static void PrintArr(int arra[]){
        for(int i=0;i<arra.length;i++){
            
                System.out.print(arra[i]+ " ");
           
        }
        
    }

    public static void InsertionSort(int arra[]){
        for(int i=0;i<arra.length;i++){
            int curr=arra[i];
            int prev=i-1;

            while(prev>0 && arra[prev]>curr){
                arra[prev+1]=arra[prev];
                prev--;

            }
            arra[prev+1]=curr;
        }
    }

    public static void countingSort(int arras[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arras.length; i++) {
            largest = Math.max(largest, arras[i]);
        }

        int count[]=new int[largest+1];

        for(int i=0; i< arras.length;i++){
            count[arras[i]]++;

        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arras[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){

        int arra[]={5,3,2,4,1};
        // selectionShort(arra);
        int arras[]={1,4,1,3,2,4,3,7};

        countingSort(arras);
        

        // Arrays.sort(arra);

        // InsertionSort(arra);
        PrintArr(arras);
        
    }
    
}
