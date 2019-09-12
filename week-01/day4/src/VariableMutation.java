public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 8;
        System.out.println(a);

        int b = 100;
        b -= 94;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        double square = Math.pow(e, 3);
        System.out.println(square);

        int f1 = 123;
        int f2 = 345;
        boolean isItBigger = (f1 > f2);
        if(isItBigger) {
            System.out.println("f1 is bigger than f2");
        }
        else {
            System.out.println("f1 is smaller or equal to f2");
        }

        int g1 = 350;
        int g2 = 200;
        boolean theDoubleOfG2IsBigger = ((g2 *=2) > g1);
        if (theDoubleOfG2IsBigger) {
            System.out.println("The double of g2 is bigger than g1.");
        }
        else {
            System.out.println("The double of g2 is smaller or equal to g1.");
        }

        int h = 135798745;
        boolean ADividerOfH = ((h % 11) == 0);
        if (ADividerOfH) {
            System.out.println("11 is a Divider of 135798745");
        }
        else {
            System.out.println("11 is not a divider of 135798745.");
        }

        int i1 = 10;
        int i2 = 3;
        double i2Squared = Math.pow(i2, 2);
        double i2Cubed = Math.pow(i2, 3);
        boolean iToI = (i1 > (i2Squared)) && (i1 < (i2Cubed));
        if (iToI) {
            System.out.println("i1 is higher than i2 squared and smaller than i2 cubed");
        }
        else {
            System.out.println("i1 is not higher than i2 squared and smaller than i2 cubed at the same time");
        }

        int j = 1521;
        boolean jIsDividableby = ((j % 3) == 0) || ((j % 5) == 0);
        if (jIsDividableby) {
            System.out.println("j is dividable by 3 or 5");
        }
        else
            System.out.println("j is not dividable by 3 or 5");


    }
}
