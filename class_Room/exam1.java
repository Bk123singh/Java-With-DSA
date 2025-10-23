public class exam1 {

    public static void main(String args[]) {

       
        Book b = new Book(101, 1200);
        b.display();

        
        // journal j = new journal(201, 800);
        // j.display();

        
        Mazaine m = new Mazaine(301, 500);
        m.setdata(11, 2024);
        m.display();
    }
}

class Book {
    int bookcode;
    int bookprice;

    
    Book(int bookcode, int bookprice) {
        this.bookcode = bookcode;
        this.bookprice = bookprice;
    }

    public void display() {
        System.out.println("Bookcode: " + bookcode);
        System.out.println("Bookprice: " + bookprice);
    }
}

// class journal extends Book {
//     String[] arra = { "Hindi", "English", "French", "Italian" };

   
//     journal(int bookcode, int bookprice) {
//         super(bookcode, bookprice);
//     }
//         super.display();
//         System.out.println("Languages available:");
//         public void display(){
//             for(int i=0; i<arra.length;i++){
//             System.out.println(arra[i]);
//         }
//     }
// }

class Mazaine extends Book {
    int month;
    int year;

    
    Mazaine(int bookcode, int bookprice) {
        super(bookcode, bookprice);
    }

    public void setdata(int x, int y) {
        month = x;
        year = y;
    }

    
    public void display() {
        super.display(); 
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}