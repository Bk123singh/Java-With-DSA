public class exception {

    public static void main(String args[]) {
        try{
            int data=20/0;
            int arra[]= new int[5];
            arra[5]=30/0;
        } catch(ArithmeticException e){
            System.out.println("task one is complete");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task two is complete");
        };
        

        
            System.out.println("rest of code bishal");
        

    }
}