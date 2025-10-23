public class nestedTry{
    public static void main(String[] args) {
        try{
        try{
            int data=40/0;
        } catch(ArithmeticException e){
            System.out.println("first is completed");
        }
        try{
            int arra[]=new int[4];
            arra[4]=4/0;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("second is completed");
    }
        catch(Exception e){
            System.out.println(e);
        };
        System.out.println("All are is completed");
    }
}
