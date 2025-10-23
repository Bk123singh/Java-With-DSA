public class solution {
    public static void twoSum(int num[] , int tar) {
        int sum = 0;
        for (int i = 0; i <= num.length; i++){
           if(tar == sum){
            break;
            
            
            
           }
           sum+=num[i];
           System.out.println(num.length);
           
            
    }
    System.out.println("Result = "+sum);

    }

    public static void main(String[] args) {
        int num[] = { 2, 7, 11, 15 };
        int tar=20;
        twoSum(num,tar);
    }
}