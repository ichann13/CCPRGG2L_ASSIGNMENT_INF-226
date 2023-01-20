public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.attack();

        Weapon Sword = new Weapon();
        Sword.name = "Blade of Despair";
        Sword.damage = 160;
        Sword.rarity = "SUPER RARE";
        Sword.addDamage(10);
        Sword.addDamage(20);
        System.out.println(Sword.WeaponName());

        Sword.sayNameofWeapon();
   

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.attack();

        Weapon Staff = new Weapon();
        Staff.name = "Clock of Destiny";
        Staff.damage = 60;
        Staff.rarity = "Rare";
        Staff.addDamage(5);
        Staff.addDamage(5);
        System.out.println(Staff.WeaponName());

        Staff.sayNameofWeapon();
       

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.attack();

        Weapon Knife = new Weapon();
        Knife.name = "Dusk blade";
        Knife.damage = 60;
        Knife.rarity = "Rare";
        Knife.addDamage(15);
        Knife.addDamage(20);
        System.out.println(Knife.WeaponName());
       
        Knife.sayNameofWeapon();


        Character Archer = new Character();

        Archer.strength = 5;
        Archer.agility = 10;
        Archer.intelligence = 10;
        Archer.name = "Ash";
        Archer.sayMyName();
        Archer.attack();

        Weapon Bow = new Weapon();
        Bow.name = "Fire bow";
        Bow.damage = 90;
        Bow.rarity = "Rare";
        Bow.addDamage(10);
        Bow.addDamage(10);
        System.out.println(Bow.WeaponName());

        Bow.sayNameofWeapon();

     }
}
