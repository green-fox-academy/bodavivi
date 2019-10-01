package GreenFoxInheritanceExercise;

public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }

  public Mentor(){

  }

  @Override
  public void getGoal(){
    System.out.println("Educate brilliant junior developers");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
  }

  public void clone(){

  }
}
