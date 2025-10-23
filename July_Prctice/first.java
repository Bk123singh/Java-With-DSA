

public class first{

    public static void Sum(int arra[]){
        int largest=0;
        int sum=0;
        for(int i=0;i<arra.length;i++){
            largest=Math.max(arra[i], largest);
            sum+=arra[i];
        }
        System.out.println("Total sum of the array: " + sum);
        System.out.println(" The largest number is : " + largest);
    }

    public static  int BinearySearch(int arra[], int target){
        
        int si=0;
        int ei=arra.length;

        while(si<=ei){
            int mid=(si+ei)/2;
            if(arra[mid]==target){
                return mid;
            }
            if(arra[mid]<target){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
return -1;
    }

    public static void ReverseArr(int arra[]){
        int first=0;
        int last=arra.length-1;
        while(first<= last){
            int temp=arra[last];
            arra[last]=arra[first];
            arra[first]=temp;
            first++;
            last--;
        }

    }
    public static void PrintArra(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
    }


    public static void main(String args[]){
        int arra[]={3,4,5,6,7,8};
        ReverseArr(arra);
        PrintArra(arra);


    }
}