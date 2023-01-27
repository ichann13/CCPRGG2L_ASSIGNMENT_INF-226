public class Pet {
   
    String name;
    int age;
    Person owner;
   

    Pet(String Petname, int Petage, Person ownerName) {
       this.name = Petname;
       this.age = Petage;
       this.owner = ownerName;

    } 
    
    void Showowner () {
        System.out.println ("My name is" + this.name + ". My owner name is " + owner.name);

    }
}
