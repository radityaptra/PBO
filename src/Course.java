public class Course {
    String code;
    String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String update(String name) {
        return name;
    }

    public String getName() {
        return name;
    }
}
