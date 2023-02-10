public class App {

    private String name;

    public static void main(String[] args) throws Exception{
    Person me = new Person();

    me.setName("chan");

    System.out.println(me.getName());


    Son myself = new Son();

    System.out.println(myself.surname);

    myself.showsurname();
    
}

}
