package comparable;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }


  @Override
  public int compareTo(Domino o) {
    if (this.getLeftSide() < o.getLeftSide()){
      return -1;
    }else if (this.getLeftSide() == o.getLeftSide()){
      if (this.getRightSide() < o.getRightSide()){
        return -1;
      }else if (this.getRightSide() == o.getRightSide()){
        return 0;
      }else{
        return 1;
      }
    }else{
      return 1;
    }
  }
}