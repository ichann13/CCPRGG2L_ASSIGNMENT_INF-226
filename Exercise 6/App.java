public class App {
    public static void main(String[] args) throws Exception {
       

        //item in form of a diaper
        //polymorphic variable
        GroceryItem item1 = new Diaper();
        item1.name = "Mommy Poko ";
        item1.showItemname();
        item1.price = 250;
       


        //item in form of a coffee
        GroceryItem item2 = new Coffee();
        item2.name = "Barako ";
        item2.showItemname();
        item2.price = 109;
        


        //polymorphic parameter
        Cashier c1 = new Cashier();
        c1.checkOut(item1);
        c1.showprice(item1);

        Cashier c2 = new Cashier();
        c2.checkOut(item2);
        c2.showprice(item2);

        GroceryItem[] itemArray = new GroceryItem[2];
        
        itemArray [0] = item1;
        itemArray [1] = item2;
        
        int Total = 0;
        for (int i = 0; i < itemArray.length; i++){
             itemArray[i].showItemname();

             Total += itemArray[i].price;
            
             System.out.println("Total amount: " + Total);
            
        }

        Dog mydog = new Dog();
        mydog.eat();
     
    }
}
