
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class main {
    static ArrayList<student>  students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int choice;
        do { 
          System.out.println("\n=== Student Management Menu ===");
          System.out.println("1. Add student");
          System.out.println("2.Display all students");
          System.out.println("3. Search student by ID");
          System.out.println("4. Delete student by ID");
          System.out.println("5. Update student by ID");
          System.out.println("6. Sort students by CGPA");
          System.out.println("7. Exit");
          System.out.println("Enter your choice:");
          choice = sc.nextInt();

          switch(choice){
              case 1:
             addStudent();
              break;
              case 2:
              displayAllStudents();
              break;
               case 3:
                searchStudent();
                break; 
                case 4:
                deleteStudent();
                break;
                case 5:
                updateStudent();
                break;
                case 6:
                sortStudentsByCGPA();
                break; 
                case 7:
                System.out.println("Exiting the program....");
                break;
                default:
                System.out.println("Invalid choice. Please try again.");
        }   

        } while(choice != 7);

    }
     public   static void addStudent(){
        System.out.println("Enter student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter student age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student course:");
        String course = sc.nextLine();

        System.out.println("Enter student CGPA:");
        float cgpa = sc.nextFloat();
        sc.nextLine();

        student newStudent = new student(id, name, age, course, cgpa);
        students.add(newStudent);
        System.out.println("Student added successfully!");    
    }
      public static void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students to display.");
        }else{
            System.out.println("\n list of all students:");
            for(student s: students){
                s.display();
                System.out.println("________");

            }
        }
      }
      public static void searchStudent(){
        System.out.println("Enter student ID to search:");
        int id = sc.nextInt();
        boolean found = false;

        for(student s : students){
            if(s.getId() == id){
                System.out.println("student found:");
                s.display();
                found = true;
                break;
              
            }
        }
        if(!found){
            System.out.println("Student with ID " + id + "not found.");
        }
      }
      public static void deleteStudent() {
    System.out.println("Enter student ID to delete:");
    int id = sc.nextInt();
    boolean found = false;

    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getId() == id) {
            students.remove(i);
            System.out.println("Student with ID " + id + " deleted successfully.");
            found = true;
            break; // Stop after deleting
        }
    }

    if (!found) {
        System.out.println("Student with ID " + id + " not found.");
    }
}
         public static void updateStudent(){
            System.out.println("Enter student ID to update:");
            int id = sc.nextInt();
            sc.nextLine();
            boolean found = false;
            
            for(int i=0;i<students.size();i++){
                if(students.get(i).getId()== id){
                    System.out.println("Enter new name:");
                    String name = sc.nextLine();
                    System.out.println("Enter new age:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new course:");
                    String course = sc.nextLine();
                    System.out.println("Enter new cgpa:");
                    float cgpa = sc.nextFloat();
                    sc.nextLine();

                    students.set(i,new student(id,name,age,course,cgpa));
                    System.out.println("Student updated successfully!");
                    found = true;
                    break;
         }
      }
      if(!found){
        System.out.println("Student with ID " + id + " not found.");
      }
    }
    public  static void sortStudentsByCGPA(){
        if(students.isEmpty()){
            System.out.println("No students to sort.");    
        }else{
              students.sort(Comparator.comparingDouble(student::getcgpa).reversed());
           System.out.println("Students sorted by CGPA in descending order:");
           displayAllStudents();
        }
    }
}

    
    
