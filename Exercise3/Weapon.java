public class Weapon {

    String name;
    int damage;
    String rarity;

    public void sayNameofWeapon() {
        System.out.println("Name of the weapon " + name);
    }
    
    public void sayDamageofWeapon() {
        System.out.println("Damage of the weapon" + damage);
    }

    public void sayRarityofWeapon() {
        System.out.println("Rarity of the weapon" + rarity);
    
    }

    public void addDamage(int addDamage) {

        int newDamage = this.damage + addDamage; 
        System.out.println("Damage Increased from " + addDamage + " to " + newDamage);
        this.damage = newDamage;

    }
        
      String WeaponName(){
    
        return this.name + " " +  this.rarity;

   }

}
    