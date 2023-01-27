
public class App {

    public static void main(String[] args) throws Exception {

    
        Person Me = new Person("Christian", 18);
        Person Friend = new Person("TOSH", 18);
        Person Classmate = new Person("Nickos", 18);
        Person Classmate2 = new Person(" Julius ", 18);
        Person Classmate3 = new Person(" Clarky ", 19);

        Me.addFriend(Friend);
        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        Pet Dog = new Pet (" ZAKI ", 5, Me);

        Car RacingCar = new Car (" LightningMcQueen ", Me);
        
        Dog.Showowner();    
        RacingCar.Showowner();      
    
    }

    
}
