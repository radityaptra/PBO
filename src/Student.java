import java.util.ArrayList;
import java.util.List;

public class Student {
    long id;
    String name;
    ArrayList<Course> courses;
    List<Course> courseObj;
    
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
        this.courseObj = new ArrayList<>();
    }

    // Method to print the details of the student
    public void printStudentDetails() {
    // Print the name of the student
        System.out.println("Id: " + id);
    
    // Print the grade of the student
        System.out.println("Name: " + name);
    }

    public ArrayList<Course> getCourses() {
    // Return the courses ArrayList
        return courses;
    }

    public void addCourse(Course course) {
        // Add the given course to the courses ArrayList
        courses.add(course);
    }

    // Method to remove a course from the student's course list
    public void removeCourse(Course course) {
    // Remove the given course from the courses ArrayList
        courses.remove(course);
    }

    public void getCourseObj() {
        System.out.println("Name: " + name);
        for (Course item : courseObj) {
            System.out.println("Total Courses: " + item.getName());
        }
    }
}