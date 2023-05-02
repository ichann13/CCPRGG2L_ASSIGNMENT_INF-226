public class Person{
    String FirstName;
    String LastName;
    int age;
    String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        String major = "major";
        System.out.println("Hi, my Name is " + FirstName + " " + LastName + " and Im " + age + " years old. Major in " + major + ".");

    }
}
