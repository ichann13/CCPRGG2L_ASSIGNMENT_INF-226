public class Car {

    String name;
    Person owner;

    Car(String Carname, Person ownerName) {

        this.name = Carname;
        this.owner = ownerName;

    }

    void Showowner() {
         System.out.println("The brand of this car is " + this.name + ". The owner of this car is " + owner.name);

    }
    
}
