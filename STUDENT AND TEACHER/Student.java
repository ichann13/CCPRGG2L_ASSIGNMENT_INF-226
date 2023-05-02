
// Student class
class Student extends Person {
    private String major;

    public Student(String firstName, String lastName, int age, String gender, String major) {
        super(firstName, lastName, age, gender);
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + FirstName + " " + LastName + " and I'm " + age + " years old. I'm majoring in " + major + ".");
    }
}

