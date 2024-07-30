import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class crud {

    public static class Student {
        private int id;
        private String name;
        private int age;

        // Constructor
        Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return "Student{" +
                    "id = " + id +
                    ", name = " + name + '\'' +
                    ", age = " + age +
                    "]";
        }
    }

    // create CRUD class for CRUD operations
    public static class StudentCRUD {
        private static Map<Integer, Student> studentMap = new HashMap<>();
        private static Scanner scanner = new Scanner(System.in);

        private static void createStudent() {
            System.out.println("Enter Student id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (studentMap.containsKey(id)) {
                System.out.print("Student with this id already exists");
            }

            System.out.println("Enter Student name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Student age: ");
            int age = scanner.nextInt();

            Student student = new Student(id, name, age);
            studentMap.put(id, student);
            System.out.println("Student created successfully");

        }

        private static void readStudent() {
            System.out.print("Enter Student id");
            int id = scanner.nextInt();
            scanner.nextLine();

            Student student = studentMap.get(id);
            if (student == null) {
                System.out.print("Student not found");

            } else {
                System.out.print(student);
            }
        }

        private static void updateStudent() {
            System.out.print("Enter Student id");
            int id = scanner.nextInt();
            scanner.nextLine();

            Student student = studentMap.get(id);
            if (student == null) {
                System.out.print("Student not found");
            } else {

                System.out.println("Enter Student name: ");
                String name = scanner.nextLine();

                System.out.println("Enter Student age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                student.setName(name);
                student.setAge(age);

                studentMap.put(id, student);
                System.out.println("Student update successfully");

            }

        }

        private static void deleteStudent() {
            System.out.print("Enter student id");
            int id = scanner.nextInt();
            scanner.nextLine();

            Student student = studentMap.remove(id);
            if (student == null) {
                System.out.println("Student not found! ");

            } else {
                System.out.print("Student deleted successfully");
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----Student CRUD Application----");
            System.out.println("1. create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    StudentCRUD.createStudent();
                    break;
                case 2:
                    StudentCRUD.readStudent();
                    break;
                case 3:
                    StudentCRUD.updateStudent();
                    break;
                case 4:
                    StudentCRUD.deleteStudent();
                    break;
                case 5:
                    System.out.print("Exit");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("invalid choice! try again");

            }

        }
    }
}
