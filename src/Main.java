import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Masukkan ID student: ");
        long studentId = sc.nextLong();
        sc.nextLine(); // Consume newline left-over

        System.out.print("Masukkan nama student: ");
        String studentName = sc.nextLine();

        // Object
        Student student1 = new Student(studentId, studentName);
        Teacher teacher1 = new Teacher();

        // Detail student 1
        student1.printStudentDetails();

        // Input course details
        System.out.print("Masukkan jumlah course yang akan ditambahkan: ");
        int numCourses = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Masukkan kode course " + i + ": ");
            String courseCode = sc.nextLine();

            System.out.print("Masukkan kode course " + i + ": ");
            String courseName = sc.nextLine();

            Course course = new Course(courseCode, courseName);
            student1.addCourse(course);
        }

        // Display list of courses
        System.out.println("\nDaftar Course: ");
        for (int i = 0; i < student1.getCourses().size(); i++) {
            System.out.println((i + 1) + ". " + student1.getCourses().get(i).getName());
        }

        // Ask if user wants to delete a course
        System.out.print("\nApakah ada course yang ingin dihapus? (y/n): ");
        String deleteOption = sc.nextLine();

        if (deleteOption.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nomer course yang ingin dihapus: ");
            int courseNumber = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            // Validate course number
            if (courseNumber > 0 && courseNumber <= student1.getCourses().size()) {
                Course removedCourse = student1.getCourses().remove(courseNumber - 1);
                System.out.println("Course '" + removedCourse.getName() + "' berhasil dihapus.");
            } else {
                System.out.println("Invalid course number.");
            }

            // Display updated list of courses
            System.out.println("\nCourses after deletion: ");
            for (int i = 0; i < student1.getCourses().size(); i++) {
                System.out.println((i + 1) + ". " + student1.getCourses().get(i).getName());
            }
        }

        // Input teacher's NIP and salary
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
