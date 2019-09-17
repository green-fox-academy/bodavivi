import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> finances = new ArrayList<>();
        finances.add(500);
        finances.add(1000);
        finances.add(1250);
        finances.add(175);
        finances.add(800);
        finances.add(120);

        //How much did we spend?

        int sum = 0;

        for (Integer spending : finances){
            sum = sum + spending;
        }

        //Which was our greatest expense?
        int greatestExpense = 0;
        int cheapestExpense = finances.get(0);

        for (Integer expense : finances){
            if (expense > greatestExpense){
                greatestExpense = expense;
            }
            else if (expense < cheapestExpense){
                cheapestExpense = expense;
            }
        }
        System.out.println("Our greatest expense is " + greatestExpense +" and our cheapest expense is " +cheapestExpense);
        //What was the average amount of our spendings?
        int average = (sum/finances.size());
        System.out.println(average);


    }
}
