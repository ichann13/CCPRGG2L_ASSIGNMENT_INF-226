public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 20, "Male", "Computer Science");
        Teacher teacher = new Teacher("Jane", "Johnson", 45, "Female", "Math");

        student.introduce();
        teacher.introduce();
    }
}
