
package labweek4_kenanakyurek;


public class Student {
    private String studentID;
    private String name; 

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
    
    public void displayInfo(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student name: " + name);
    }
}
