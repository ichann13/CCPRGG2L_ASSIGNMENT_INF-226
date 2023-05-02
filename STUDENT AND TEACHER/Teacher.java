class Teacher extends Person {
    private String subject;

    public Teacher(String firstName, String lastName, int age, String gender, String subject) {
        super(firstName, lastName, age, gender);
        this.subject = subject;


    }

    public void introduce() {
        System.out.println("Hi, my name is " + "Mr./Ms. " + LastName + " and I'm " + age + " years old. I teach " + subject + ".");
    }
}
