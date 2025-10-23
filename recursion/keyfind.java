public class keyfind {
   public static  int firstocc(int arra[], int key,int i){
    if(i==arra.length){
        return  -1;
    }
    if (arra[i] == key){
        return i;
    }
    return firstocc(arra, key, i+1);

   } 
   
   public static int lastOcc(int arra [], int i, int key){
   if(i==arra.length){
    return -1;
   }
   
    int isFound = lastOcc(arra, i+1, key);
   if(isFound == -1  &&  arra[i] == key){
    return i;
   }
   return isFound;
   }

    public static void main(String[] args) {
        int arra [] = {8,3,6,9,5,10,2,5,3 };
        System.out.println(lastOcc(arra, 0, 5));
    }
}