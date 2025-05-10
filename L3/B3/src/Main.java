public class Main {
    public static void main(String[] args) {

        Instructor gv1 = new Instructor(1, "Thầy Nam");
        Instructor gv2 = new Instructor(2, "Cô Lan");


        Student s1 = new Student(101, "An");
        Student s2 = new Student(102, "Bình");


        Course c1 = new Course("C001", "Lập trình Java", gv1);
        Course c2 = new Course("C002", "Lập trình Web", gv2);


        s1.registerCourse(c1);
        s1.registerCourse(c2);
        s2.registerCourse(c1);

        c1.Display();
        c2.Display();


        s2.unregisterCourse(c1);

        System.out.println("\nSau khi xóa Bình khỏi khóa học Java:");
        c1.Display();
    }
}
