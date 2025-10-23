
import java.util.Scanner;

public class ClassStudent {

    public static void main(String[] args) {
    //    Empoole st = new Empoole();
    //             st.Intit();
    //             st.display();
    //             st.year();
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Enter your name: ");   
            st.name = sc.nextLine();
        System.out.println("Enter your age:");
            st.age=sc.nextInt();
        System.out.println("enter the school name: ");
            st.schoolName= sc.nextLine();
        System.out.println("Enter your roll No.");
            st.rollNo = sc.nextInt();
        System.out.print("enter the phy marks:");
            st.marks[0] = sc.nextInt();
        System.out.println("Enter the che marks:");
            st.marks[1] = sc.nextInt();
        System.out.println("Enter the math marks:");
            st.marks[2] = sc.nextInt();
            st.display();
            st.Tomarks();
            studt s1= new studt();
            
    }
}


class Empoole{
    int age;
    int id;
    int salary;
    void Intit(){
         age = 31;
         id= 101;
         salary = 21500;
    }
    void display(){
        System.out.println("Age  = " + age);
        System.out.println("id no is: " + id);
        System.out.println("monthly salary is: " + salary  );

         }
         void year(){
            System.out.println("yearly salary is: "  + 12*salary);

         }
        
    }

    class  Student{
        String name;
        int age;
        int rollNo;
        static  String schoolName;
        int marks[] = new int[3];
        float per;

    void display(){
        System.out.println("Student Name : " + name);
        System.out.println(" Age   :      " + age );
        System.out.println("Roll Num. : " + rollNo);
        }
        void Tomarks(){
            int phy = marks[0];
            int che= marks[1];
            int math = marks[2];
            int total= (phy+che+math);
            System.out.println("Total marks is : " + total);
             per=(phy + che + math )/3;
            System.out.println("Percentage: "+ per);
        }
        void grade(){
            if(per<=90){
                System.out.println("your grade is:  A+ ");

            }
            if (per<=80){
                System.out.println("your grade is:   A ");
            }
            
            if (per<=75){
                System.out.println("your grade is:  B+ ");
            }
            if (per<=70){
                System.out.println("your grade is:  B " );
            }
            if (per<=65){
                System.out.println("your grade is:  c+ " );
            }

            if (per<=60){
                System.out.println("your grade is:  c " );
            }
            else {
                System.out.println("your are fail");
            }
        }
       
    }

    class studt extends Student{


    }
