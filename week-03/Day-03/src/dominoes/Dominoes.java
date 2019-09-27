package dominoes;

import dominoes.Domino;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    Random random = new Random();
    int ranDomino = random.nextInt(dominoes.size()-1);
    List<Domino> rightOrder = new ArrayList<>();
    int counter = 0;

    rightOrder.add(dominoes.get(ranDomino));
    dominoes.remove(ranDomino);

    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j < dominoes.size(); j++) {
        if (rightOrder.get(rightOrder.size()-1).getRightSide() == dominoes.get(j).getLeftSide()) {
          rightOrder.add(dominoes.get(j));
          dominoes.remove(j);
        }
      }
      i--;
    }
    System.out.println();

    System.out.println(rightOrder);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}