
package labweek4_kenanakyurek;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int capacity;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public void displayInfo(){
        System.out.println("Course name: " + courseName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current enrolled student count: " + enrolledStudents.size());
        
        for(int i = 0; i < enrolledStudents.size();i++){
            enrolledStudents.get(i).displayInfo();
        }
        
    }
}
