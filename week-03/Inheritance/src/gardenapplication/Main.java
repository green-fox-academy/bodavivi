package gardenapplication;

public class Main {
  public static void main(String[] args) {
    Garden newGarden = new Garden();

    Flower waterLily = new Flower("yellow");
    Flower iris = new Flower ("blue");
    Tree magnolia = new Tree ("purple");
    Tree maple = new Tree ("orange");


    newGarden.addFlower(waterLily);
    newGarden.addFlower(iris);
    newGarden.addTree(magnolia);
    newGarden.addTree(maple);

    System.out.println("\n ------------------- \n");

    newGarden.watering();

    System.out.println("\n ------------------- \n");

    newGarden.watering();
  }
}
