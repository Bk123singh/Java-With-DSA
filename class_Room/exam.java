public class exam {

    public static void main(String args []){

        Book b= new Book(101, 1200);
        b.display();

        journal j= new journal();
        
        j.display();
         Mazaine m = new Mazaine();
         m.display();
        
        
    }
}

class Book{
    int bookcode;
    int bookprice;

     Book(int bookcode, int bookprice ){
        this.bookcode=bookcode;
        this.bookprice=bookprice;
    }

    public void display(){
        System.out.println("Bookcode: " + bookcode);
        System.out.println("Bookprice: " + bookprice);
    }


}


class journal extends Book{

    
    

    String arra[]={"hindi", " English", "Franch", "italic"};

Mazaine(int bookcode, int bookprice)
    super(bookcode, bookprice);


    public void display(){
        for(int i=0; i<arra.length;i++){
        System.out.println(arra[i]);
    }

}
}


class Mazaine extends Book{
    int mounth; 
    int year;
    

    public void setdata(int x, int y){
        mounth=x;
        year=y;
    }

    public void display(){
        System.out.println("Mounth: " + mounth);
        System.out.println("Year: " + year);
    }
}
