package Class_Diagram;
import java.util.ArrayList;
import java.util.List;

class Students {
    private String name;
    private int studentId;
    private String gender;
    private List<Course> courses = new ArrayList<>();
    private List<String> grades = new ArrayList<>();

    public Students(String name, int studentId, String gender) {
        this.name = name;
        this.studentId = studentId;
        this.gender = gender;
    }

    public void enrollInCourse(Course course, String grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Gender: " + gender);
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course: " + courses.get(i).getCourseName() +
                               " | Grade: " + grades.get(i));
        }
    }
}

class Course {
    private String courseName;
    private String courseId;
    private int credits;

    public Course(String courseName, String courseId, int credits) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credits = credits;
    }

    public String getCourseName() { 
        return courseName;
     }
    public String getCourseId() { 
        return courseId;
     }
    public int getCredits() {
         return credits; 
        }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Credits: " + credits);
    }
}

class Faculty {
    private String facultyName;
    private String facultyId;
    private String department;

    public Faculty(String facultyName, String facultyId, String department) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", "Cs39", 4);
        Course c2 = new Course("Full Stack", "Cs39", 4);

        Students student1 = new Students("Pushpendra", 1, "Male");
        Students student2 = new Students("Kshtiz", 2, "Male");

        student1.enrollInCourse(c1, "A");
        student1.enrollInCourse(c2, "O");

        student2.enrollInCourse(c1, "A");
        student2.enrollInCourse(c2, "A");

        Faculty faculty1 = new Faculty("Mr. Asutosh Sir", "F101", "CSE");
        Faculty faculty2 = new Faculty("Mr. Divyam Manchanda Sir", "F102", "CSE");

        student1.displayInfo();
        faculty1.displayInfo();
        c1.displayCourseInfo();

        student2.displayInfo();
        faculty2.displayInfo();
        c2.displayCourseInfo();
    }
}
