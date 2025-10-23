public class practice2darray {

    public static void main(String[] args) {
        int array [] [] = {{4,7,8,},
                            {8,8,7}};
         int countof7 = 0;
         int sum =0;
         for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[0].length ; j++){
                if(array[i][j]== 8){
                    countof7++;
                
                }
                sum += array[i][j];
            }
         }
         System.out.println("Sum of array number " + sum);
         System.out.println(" count of 7 is " + countof7);
    }
}