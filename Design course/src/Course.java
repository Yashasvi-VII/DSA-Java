public class Course {
    static int maxCapacity = 100;

    String courseName;
    int totalNoOfEnrolledStudents;
    String[] enrolledStudents;


    Course(String courseName) {
        this.courseName = courseName;
        this.totalNoOfEnrolledStudents = 0;
        this.enrolledStudents= new String[maxCapacity];
    }


    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName) {
        enrolledStudents[totalNoOfEnrolledStudents] = studentName;
        totalNoOfEnrolledStudents++;
    }

    void unEnrollStudents(String studentName) {
        System.out.println("student removed");
        totalNoOfEnrolledStudents--;
    }
}
