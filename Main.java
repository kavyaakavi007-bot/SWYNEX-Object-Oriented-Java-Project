import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Management management = new Management();

        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine().trim());

                switch (choice) {

                    case 1:
                        try {
                            System.out.print("Enter Student Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = Integer.parseInt(sc.nextLine().trim());

                            System.out.print("Enter Student ID: ");
                            int id = Integer.parseInt(sc.nextLine().trim());

                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();

                            Student student =
                                new Student(name, age, id, course);

                            management.add_students(student);

                        } catch (IllegalArgumentException e) {
                            System.out.println(
                                "Invalid input: " + e.getMessage()
                            );
                        }
                        break;

                    case 2:
                        management.display_details();
                        break;

                    case 3:
                        try {
                            System.out.print("Enter Student ID to search: ");
                            int searchId =
                                Integer.parseInt(sc.nextLine().trim());

                            Student foundStudent =
                                management.search_students(searchId);

                            if (foundStudent != null) {
                                System.out.println("\nStudent Found:");
                                foundStudent.display_details();
                            } else {
                                System.out.println("STUDENT NOT FOUND!");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println(
                                "Please enter a valid numeric ID."
                            );
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Enter Student ID to update: ");
                            int updateId =
                                Integer.parseInt(sc.nextLine().trim());

                            System.out.print("Enter New Name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            int newAge =
                                Integer.parseInt(sc.nextLine().trim());

                            System.out.print("Enter New Course: ");
                            String newCourse = sc.nextLine();

                            management.update_student(
                                updateId,
                                newName,
                                newAge,
                                newCourse
                            );

                        } catch (NumberFormatException e) {
                            System.out.println(
                                "Please enter valid numeric values."
                            );
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("Enter Student ID to delete: ");
                            int deleteId =
                                Integer.parseInt(sc.nextLine().trim());

                            management.delete_student(deleteId);

                        } catch (NumberFormatException e) {
                            System.out.println(
                                "Please enter a valid numeric ID."
                            );
                        }
                        break;

                    case 6:
                        running = false;
                        System.out.println(
                            "Thank you for using Student Management System!"
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice! Please select 1 to 6."
                        );
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid menu number.");
            }
        }

        sc.close();
    }
}