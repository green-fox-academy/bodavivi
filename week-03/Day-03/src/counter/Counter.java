package counter;

public class Counter {
  int integer;
  int basic = 0;

  Counter(){
    this.integer = 0;
  }

  Counter(int num){
    this.integer = num;
    this.basic = num;
  }

  public void add (int number){
    integer = integer + number;
  }

  public void add(){
    integer+= 1;
  }

  public int get(){
    integer = integer;
    return integer;
  }

  public void reset(){
    integer = basic;
  }
}
