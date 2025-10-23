public class fractionArra {
    public static void Find(int arra[]){
          float pos = 0 ; 
        float negti = 0;
        float zero = 0;
        for(int i = 0 ; i < arra.length; i++){
            if(arra[i] == 0){
                zero = zero+ 1;
                
            }  else if( arra[i] > 0){
                pos = pos+1;
            } 
            else if(arra[i] < 0) {
             negti=negti+1;
            }
            
        }
        float postive = pos/arra.length;
        float negative = negti/arra.length;
        float Zeros = zero/arra.length;
        System.out.println(postive);
        System.out.println(negative);
        System.out.println(Zeros);
    }
    public static int  Additon(int a, int b){
        return a+b;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arra[] = new int[n];
        for(int i=0; i < arra.length;i++){
            arra[i]=sc.nextInt();
        }
        Find(arra);
     
        
        
    }
    
}