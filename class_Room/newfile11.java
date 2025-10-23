public class newfile11{
    public static void main(String args[]){
        Book b= new Book(101, 1200);
        b.display();

        Mazine M= new Mazine(102, 1300);
        M.setdata(12, 2024);
        M.display();
        M.dis();
        Journal j= new Journal(103, 1400);
        j.display();
        j.dis();
        
    }
}

class Book{
    int bookcode;
    int bookprice;
    Book(int bookcode, int bookprice){
        this.bookcode=bookcode;
        this.bookprice=bookprice;
    }

    public void display(){
        System.out.println("Bookcode: " + bookcode);
        System.out.println("Bookprice: " + bookprice);
    }
}

class Mazine extends Book{

    Mazine(int bookcode, int bookprice){
        super(bookcode, bookprice);
    }

    public void  dis(){
        System.out.println("Bookcode " + bookcode);
        System.out.println("Bookpeice " + bookprice);
    }

    int mounth;
    int year;
    public void setdata(int mounth, int year){
        this.mounth=mounth;
        this.year=year;
    }

public void display(){
    System.out.println("Mounth : " + mounth);
    System.out.println("year : " + year);
}
}

class Journal extends Book{

    Journal(int bookcode, int bookprice){
        super(bookcode, bookprice);
    }
    
    String language[]={"Hindi", "English" , "Bhojapuri" , "Franch" , "German"};

    public void  dis(){
        System.out.println("Bookcode " + bookcode);
        System.out.println("Bookpeice " + bookprice);
    }

    public void display(){
            System.out.println("language are: ");
        
        for(int i=0; i<language.length;i++){
            System.out.println(language[i]);
        }
    }

    
}
