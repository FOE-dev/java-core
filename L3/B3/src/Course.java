import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private Instructor instructor;
    private List<Student> students;

    public Course(String courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void Display() {
        System.out.println("Danh sách học viên trong khóa '" + courseName + "':");
        for (Student student : students) {
            System.out.println(" - " + student);
        }
    }

    @Override
    public String toString() {
        String instructorName = (instructor != null) ? instructor.getName() : "Chưa có giảng viên";
        return courseName + " (ID: " + courseId + ") - Giảng viên: " + instructorName;
    }
}
