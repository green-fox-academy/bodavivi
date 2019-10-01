package implementcharsequences;

public class Shifter implements CharSequence{
  String string;
  int shift;

  public Shifter(String string, int shift){
    this.string = string;
    this.shift = shift;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    int summa = index + shift;
    while (summa >= string.length()) {
      summa = summa - string.length();
    }
    return string.charAt(summa);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
