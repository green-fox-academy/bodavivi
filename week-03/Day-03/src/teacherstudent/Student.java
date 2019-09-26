package teacherstudent;

public class Student {
  public static void main(String[] args) {

    Student Bettike = new Student();
    Teacher Aron = new Teacher();

    Bettike.question(Aron);
    Bettike.learn();
  }

  public void learn(){
    System.out.println("Student learning sth new.");
  }
  public void question(Teacher teacher){
        teacher.answer();
  }
}
