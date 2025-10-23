





public class pract1 {
    public static int factor(int n) {
     if(n==1||n==0){
        return 1;
     }
     int fnm1 = factor(n-1);
     int fn  = n*fnm1;
     return fn;
    }
    public static int diagonal(int arra[][]){
         int sum=0;
        for(int i= 0; i< arra.length; i++){
            for(int j =0; j < arra[0].length;j++){
                if(i==j){
                  sum += arra[i][j];  
                } else if (i+j==arra.length-1){
                    sum+= arra[i][j];
                }
            }
        }
        return sum;
    }
    public static void bubble(int matrix[]){
        for(int i =0; i < matrix.length-1;i++){
            for(int j=0; j<matrix.length-1-i;j++){

                if(matrix[j] > matrix[j+1]){

                    int temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix [j+1]= temp;
                }
            }
        }
        
    }
    public static void Prints(int matrix[]){
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }
    public static int  Linear(int arra[],int key){
        for(int i =0; i<arra.length; i++){
            if(arra[i] == key){
                return i;
            }
            
        }
        return -1;

    }
    public static void selection(int arra[]){
       for(int i =0; i<arra.length -1;i++){
        int minpos= i;
        for(int j =0; j<arra.length; j++){
            if(arra[minpos] > arra[i]){
            minpos=j;
            }
            int temp = arra[minpos];
            arra[minpos] = arra[i];
            arra[i] = temp;
        }
    }
}
public static void  Increase(int n){
    if(n==0||n==1){
        System.out.println(n);
        return ;
    }
    Increase(n-1);
    System.out.println(n);

}
public static void Dec(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n + " ");
    Dec(n-1);
}
public static int  facto(int n){
    if(n==0){
        return 1;
    }
    return n*facto(n-1);

    
}
public static int  fibno(int n){
    if(n==0||n==1){
        return 1;
    }
    return fibno(n-1) + fibno(n-2);
}
public static int power(int x, int n){
    if(n==0){
        return 1;
    }
    return x*power(x,n-1);
}


    public static void  main(String [] args){
        // int arra[][] = {{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12}};
        
        // System.out.println(diagonal(arra));
        // int matrix []= {2,3,4,5,1,8,9,6,};
        // selection(matrix);
        // Prints(matrix);
        System.out.println(power(2, 5));

        
        
    }
}


