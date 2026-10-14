package labweek4_kenanakyurek;

import java.util.ArrayList;
import java.util.Scanner;

public class LabWeek4_KenanAkyurek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();

        System.out.print("Enter how many courses do you want to create: ");
        int courseAmount = scanner.nextInt();

        while (courseAmount < 3) {
            System.out.println("You must create at least 3 courses.");
            System.out.print("Enter how many courses do you want to create: ");
            courseAmount = scanner.nextInt();
        }

        for (int i = 0; i < courseAmount; i++) {

            System.out.print("Enter course name: ");
            String courseName = scanner.next();

            System.out.print("Enter course capacity: ");
            int courseCapacity = scanner.nextInt();

            Course course = new Course(courseName, courseCapacity);

            courses.add(course);
        }

        System.out.println("Courses:");

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).getCourseName());
        }

        System.out.print("How many students do you want to register: ");
        int studentAmount = scanner.nextInt();

        for (int k = 0; k < studentAmount; k++) {

            System.out.print("Enter student ID: ");
            String studentID = scanner.next();

            System.out.print("Enter student name: ");
            String studentName = scanner.next();

            System.out.print("Enter course name: ");
            String wantedCourseName = scanner.next();

            Student student = new Student(studentID, studentName);

            boolean courseFound = false;

            for (int i = 0; i < courses.size(); i++) {

                if (courses.get(i).getCourseName().equals(wantedCourseName)) {

                    courseFound = true;

                    if (courses.get(i).getEnrolledStudents().size()
                            >= courses.get(i).getCapacity()) {

                        System.out.println("This course is full. Registration failed.");

                    } else {

                        boolean duplicate = false;

                        for (int j = 0;
                             j < courses.get(i).getEnrolledStudents().size();
                             j++) {

                            if (courses.get(i).getEnrolledStudents().get(j)
                                    .getStudentID().equals(student.getStudentID())) {

                                duplicate = true;
                            }
                        }

                        if (duplicate == true) {

                            System.out.println(
                                    "This student is already registered for this course."
                            );

                        } else {

                            courses.get(i).getEnrolledStudents().add(student);

                            System.out.println("Registration successful.");
                        }
                    }
                }
            }

            if (courseFound == false) {
                System.out.println("No course found with that name.");
            }
        }

        System.out.println("All Courses:");

        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).displayInfo();
        }
    }
}