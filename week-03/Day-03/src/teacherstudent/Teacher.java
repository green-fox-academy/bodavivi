package teacherstudent;

public class Teacher {
  public static void main(String[] args) {

    Teacher Jolika =  new Teacher();
    Student Zolika = new Student();

    Jolika.teach(Zolika);
    Jolika.answer();
  }

  public void teach(Student student){
    student.learn();
  }

  public void answer(){
    System.out.println("The teacher is answering the question.");
  }
}
