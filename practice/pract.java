
public  class pract {
    public static int  diagonal(int arra[][]){
        int sum=0;
        for(int i =0; i<=arra.length;i++){
            for(int j=0;j<=arra[0].length;j++){
                if(i==j){
                  sum +=arra[i][j]; 
                } else if (i+j==arra.length-1){
                    sum +=arra[i][j];

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arra[][]= {{1,2,3,4},
                        {4,5,6,5},
                        {7,8,9,2},
                        {10,11,13,14}};
        System.out.println(diagonal(arra));
    }
}