public class swp {
    
   
    public static void main(String [] args){
      int arra[] = {1,4,3,2};
      int first=0;
        int last= arra.length-1;
        while(first < last){
           int temp;
           temp = arra[last];
           arra[last]= arra[first];
           arra[first] =temp; 
           first ++;
           last --;
        }
      for(int i=0; i <= arra.length; i++){
          System.out.print( arra[i] + " ");
          
      } 
      
    
}
}