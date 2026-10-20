import java.util.ArrayList;

public class Management {

    private ArrayList<Student> students = new ArrayList<>();

    // Add a student
    public boolean add_students(Student student) {

        for (Student stu : students) {
            if (stu.get_student_id() == student.get_student_id()) {
                System.out.println("Student ID already exists!");
                return false;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!");
        return true;
    }

    // Display all students
    public void display_details() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n--- All Students ---");

        for (Student stu : students) {
            stu.display_details();
        }
    }

    // Search for a student
    public Student search_students(int student_id) {

        for (Student stu : students) {
            if (stu.get_student_id() == student_id) {
                return stu;
            }
        }

        return null;
    }

    // Update student details
    public boolean update_student(
        int student_id,
        String name,
        int age,
        String course
    ) {
        Student student = search_students(student_id);

        if (student == null) {
            System.out.println("STUDENT NOT FOUND!");
            return false;
        }

        try {
            // Validate all values before changing the student
            Student validatedStudent =
                new Student(name, age, student_id, course);

            student.setName(validatedStudent.get_name());
            student.setAge(validatedStudent.get_age());
            student.set_course(validatedStudent.get_course());

            System.out.println("Student details updated successfully!");
            return true;

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid details: " + e.getMessage());
            return false;
        }
    }

    // Delete a student
    public boolean delete_student(int student_id) {

        Student student = search_students(student_id);

        if (student == null) {
            System.out.println("STUDENT NOT FOUND!");
            return false;
        }

        students.remove(student);
        System.out.println("Student deleted successfully!");
        return true;
    }
}