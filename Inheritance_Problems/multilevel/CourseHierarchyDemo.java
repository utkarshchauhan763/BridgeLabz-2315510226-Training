// Educational Course Hierarchy - Multilevel Inheritance Example
// Best practices: private fields, @Override, clear documentation

class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() { return courseName; }
    public int getDuration() { return duration; }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() { return platform; }
    public boolean isRecorded() { return isRecorded; }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() { return fee; }
    public double getDiscount() { return discount; }
}

public class CourseHierarchyDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Masterclass", 30, "Udemy", true, 4999, 500);
        System.out.println("Course: " + poc.getCourseName() + ", Duration: " + poc.getDuration() + " days");
        System.out.println("Platform: " + poc.getPlatform() + ", Recorded: " + poc.isRecorded());
        System.out.println("Fee: " + poc.getFee() + ", Discount: " + poc.getDiscount());
    }
}
