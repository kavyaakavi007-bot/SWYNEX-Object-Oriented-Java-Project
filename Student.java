public class Student extends Person {

    private int student_id;
    private String course;

    public Student(String name, int age, int student_id, String course) {
        super(name, age);
        set_student_id(student_id);
        set_course(course);
    }

    public int get_student_id() {
        return student_id;
    }

    public String get_course() {
        return course;
    }

    public void set_student_id(int student_id) {
        if (student_id <= 0) {
            throw new IllegalArgumentException(
                "Student ID must be positive."
            );
        }
        this.student_id = student_id;
    }

    public void set_course(String course) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be empty.");
        }
        this.course = course.trim();
    }

    @Override
    public void display_details() {
        System.out.println("Name: " + get_name());
        System.out.println("Age: " + get_age());
        System.out.println("Student ID: " + student_id);
        System.out.println("Course: " + course);
        System.out.println("--------------------------------");
    }
}