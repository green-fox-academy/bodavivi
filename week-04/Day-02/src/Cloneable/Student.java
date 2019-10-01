package Cloneable;

public class Student extends Person implements Cloneable{
  String previousOrganization;
  int skippedDays;

  public static void main(String[] args) {
    Student john = new Student("John", 20, "male", "BME");

    Student johnTheClone;

    try {
      johnTheClone = (Student) john.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }

  public Student(String name, int age, String gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student(){
    this.previousOrganization = "Google";
    this.skippedDays = 0;

  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + name +", a " + age + " year old" + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays (int numberOfDays){

    skippedDays+= numberOfDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
