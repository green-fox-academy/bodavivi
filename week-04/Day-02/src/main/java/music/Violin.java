package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    super("Violin",4, "Screech");
  }

  public Violin(int numberOfStrings){
    super("Violin",numberOfStrings, "Screech");
  }
}
