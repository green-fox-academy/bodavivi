package aircraftcarrier;

import org.w3c.dom.ls.LSOutput;

public class Aircraft {
  int maxAmmo;
  int currentAmmo;
  int baseDamage;

  public static void main(String[] args) {

  }

  public Aircraft(int maxAmmo,int currentAmmo, int baseDamage){
    this.maxAmmo = 0;
    this.currentAmmo = 0;
    this.baseDamage = baseDamage;
  }

  public int fight(){
    int damage = baseDamage * currentAmmo;
    currentAmmo = 0;
    return damage;
  }

  public int refill(int number){

    if (number + currentAmmo >= maxAmmo){
      currentAmmo = maxAmmo;
      return number - (maxAmmo-currentAmmo);
    }else{
      currentAmmo+= number;
      return number - (maxAmmo-currentAmmo);
    }
  }

  public String getType(){
   return this.getClass().getSimpleName();
  }

  public String getStatus(){
    return ("Type" + Aircraft.class + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + (currentAmmo * baseDamage));
  }

  public boolean isPriority(Aircraft aircraft){
    if (aircraft.getClass().getSimpleName().equals("F35")){
      return true;
    }else{
      return false;
    }
  }
}
