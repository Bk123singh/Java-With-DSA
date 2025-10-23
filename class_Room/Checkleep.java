public class Checkleep {

    public static void main(String[] args) {
        int sum =0;

        int count=0;
        int i=2000;
        while(i <=3000){
            if(i%4==0){
                System.out.println(i);
                sum = sum+i;
            }
            count ++;
            i++ ;
            
        }
        System.out.println(sum);

    }
}