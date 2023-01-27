public class Person {

    String name;
    int age;
    
      
    Person(String PersonName, int PersonAge) {
        this.name = PersonName;
        this.age = PersonAge;
    
       }
    
       void addFriend(Person Friend){
         System.out.println(this.name + " is friends with " + Friend.name);
         
       }
           
       void addClassmate(Person Classmate){
         System.out.println(this.name + " is classmates with " + Classmate.name);

       }

    }
    