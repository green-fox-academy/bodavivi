package animal;

public class MainAnimal {
  public static void main(String[] args) {
    Animal doggie = new Animal();
    Animal kitty = new Animal();
    Animal donkey = new Animal();
    Animal horse = new Animal();
    Animal sheep = new Animal();

    doggie.eat();

    kitty.drink();

    donkey.play();

    horse.play();
    horse.eat();

    sheep.drink();

    Farm farm = new Farm();

    farm.animals[0] = doggie;
    farm.animals[1] = kitty;
    farm.animals[2] = donkey;
    farm.animals[3] = horse;
    farm.animals[4] = sheep;

    farm.slaugter();

    System.out.println("That's it");

    farm.breed();

    System.out.println("sth else");

  }
}
