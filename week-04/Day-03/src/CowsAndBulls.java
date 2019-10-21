import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  public static void main(String[] args) {
    CowsAndBulls game = new CowsAndBulls();
    game.gameStart();
    System.out.println("Lets find out the number!");

    game.game();

  }

  public int gameStart() {
    int toFind = 0;

    while(toFind < 1000){
    toFind = (int) (Math.random() * 10000);}

    return toFind;
  }

  public void game() {

    int guessCounter = 0;
    int bullCounter = 0;
    int cowCounter = 0;
    System.out.println("Write here your guess!");

    CowsAndBulls gameplay = new CowsAndBulls();

    int gameStarter = gameplay.gameStart();


    String gameString = Integer.toString(gameStarter);

    String numbers = "0123456789";

    int guess = 0;
    int guessNumber = 1;

    if (guess == gameStarter) {
      System.out.println("You won. You guessed the number by " + guessCounter + " steps.");
    }
    while (guess != gameStarter) {
      System.out.print((guessNumber) + ". guess: ");
      guessNumber++;
      Scanner scanner = new Scanner(System.in);
      guess = scanner.nextInt();
      String guessString = Integer.toString(guess);
      for (int i = 0; i < 4; i++) {
        if (guessString.charAt(i) == gameString.charAt(i)) {
          bullCounter++;
          if (i == 0) {
            guessString = ("x" + guessString.substring(i + 1, 4));
            gameString = ("y" + gameString.substring(i + 1, 4));
          } else if (i == 3) {
            guessString = (guessString.substring(0, 3) + "x");
            gameString = (gameString.substring(0, 3) + "y");
          } else {
            guessString = (guessString.substring(0, i) + "x" + guessString.substring(i + 1, 4));
            gameString = (gameString.substring(0, i) + "y" + gameString.substring(i + 1, 4));
          }
        }
      }

      for (int i = 0; i < 4; i++) {
        if (numbers.contains(Character.toString(guessString.charAt(i)))) {
          for (int j = 0; j < 4; j++) {
            if (numbers.contains(Character.toString(gameString.charAt(j)))) {
              if (guessString.charAt(i) == gameString.charAt(j)) {
                cowCounter++;
                if (i == 0) {
                  guessString = ("x" + guessString.substring(i + 1, 4));
                } else if (i == 3) {
                  guessString = (guessString.substring(0, 3) + "x");
                } else {
                  guessString = (guessString.substring(0, i) + "x" + guessString.substring(i + 1, 4));
                }

                if (j == 0) {
                  gameString = ("y" + gameString.substring(j + 1, 4));
                } else if (j == 3) {
                  gameString = (gameString.substring(0, 3) + "y");
                } else {
                  gameString = (gameString.substring(0, j) + "y" + gameString.substring(j + 1, 4));
                }
              }
            }
          }
        }
      }
      gameString = Integer.toString(gameStarter);
      System.out.println("Bulls: " + bullCounter);
      System.out.println("Cows: " + cowCounter );
      bullCounter = 0;
      cowCounter = 0;
    }
    System.out.println();
    System.out.println("Y*O*U W*O*N !");

  }
}


