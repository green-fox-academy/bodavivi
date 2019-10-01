package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  String sound;

  public StringedInstrument(String name, int numberOfStrings, String sound){
    super(name);
    this.numberOfStrings = numberOfStrings;
    this.sound = sound;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings +"-stringed instrument that goes " + sound );
  }
}
