public class backtraking {
    public static void Changearr(int arra[], int i, int val){
        //base
        if(i==arra.length){
            Print(arra);
            return;
        }


        // recurestion
        arra[i]=val;
        Changearr(arra, i+1, val+1);
        arra[i]= arra[i]- 2;
        

    }

// find subsets

public static void Subsets(String str , String ans, int i){
//base case
if(i==str.length()){
    if(ans.length()==0){
        System.out.println("null");
    }
    else{
        System.out.println(ans);
    }
    
    return;
}
//recureaston
//yes choice
Subsets(str, ans + str.charAt(i), i +1);
//no
Subsets(str, ans, i+1);
}

    public static void Print(int arra[]){
        for(int i =0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String []args){
        int arra[] = new int[5];
        String str = "abc";
        Subsets(str, " ", 0);


    }
}