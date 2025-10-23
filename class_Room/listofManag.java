import java.util.*;

class Student {
    String name;
    int ERP;
    int age;
    double marks;
    

    public Student(String name, int ERP, int age, double marks) {
        this.name = name;
        this.ERP=ERP;
        this.age = age;
        this.marks = marks;
    }
    public boolean compareERP(int otherERP) {
        return this.ERP == otherERP;
    }

    public String toString() {
        return "Name: " + name +", ERP: " + ERP + ", Age: " + age + ", Marks: " + marks;
    }
   


}

public class listofManag{
    private LinkedList<Student> studentList;

    public listofManag() {
        studentList = new LinkedList<>();
    }

    public void addStudent(String name, int ERP, int age, double marks) {
        Student student = new Student(name,ERP, age, marks);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void searchStudent(String name) {
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchbyERP(int ERP){
        for(Student student: studentList){
            if(student.compareERP(ERP)){
                System.out.println(student);
                return;
            }
        }
        System.out.println("student not found");
    }


    public static void main(String[] args) {
        listofManag sms = new listofManag();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Search for ERP:");
            System.out.println("5. Exits");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your ERP NO.");
                    int ERP = scanner.nextInt();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();
                    sms.addStudent(name,ERP, age, marks);
                    break;
                case 2:
                    sms.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    sms.searchStudent(searchName);
                    break;
                case 4:
                    System.out.print("Enter your ERP No.");
                    int SearchERP=scanner.nextInt();
                    sms.searchbyERP(SearchERP);
                
                case 5:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}