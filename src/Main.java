import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Masukkan ID student: ");
        String studentId = sc.nextLine();

        System.out.print("Masukkan nama student: ");
        String studentName = sc.nextLine();

        // Object
        Student student1 = new Student(studentId, studentName);
        Teacher teacher1 = new Teacher();

        // Input course details

        System.out.print("Masukkan jumlah course yang akan ditambahkan: ");
        int numCourses = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Masukkan kode course " + i + ": ");
            String courseCode = sc.nextLine();

            System.out.print("Masukkan nama course " + i + ": ");
            String courseName = sc.nextLine();

            Course course = new Course(courseCode, courseName);
            student1.addCourse(course);
        }


        // Detail student 1
        student1.printStudentDetails();
        System.out.println("Mata kuliah yang diambil:");
        for (Course c : student1.getCourses()) {
            System.out.println("- Kode: " + c.getCode() + ", nama: " + c.getName());
        }

        System.out.print("\nMasukkan NIP dosen: ");
        String nip = sc.nextLine();

        teacher1.setNip(nip);
        System.out.println("NIP dosen: " + teacher1.getNip());

        System.out.print("Masukkan gaji dosen: ");
        double salary = sc.nextDouble();
        teacher1.setSalary(salary);
        System.out.println("gaji dosen: " + teacher1.getSalary());

        sc.close();
            
    }
}