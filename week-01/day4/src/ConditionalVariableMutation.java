public class ConditionalVariableMutation {
    public static void main(String[] args) {
        //Task A
        int a = 24;
        double out = 0;

        if ((a % 2) != 0) {
            out++;
        }
        System.out.println(out);

        //Task B

        int b = 13;
        String out2 = "";

        if ((b < 20) && (b > 10)) {
            out2 = "Sweet!";
        }
        else if (b < 10) {
            out2 = "Less!";
        }
        else if (b > 20) {
            out2 ="More!";
        }
        System.out.println(out2);

        //Task C

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if ((credits > 49) && !isBonus) {
            c -= 2;
        }
        else if ((credits < 50) && !isBonus) {
            c -= 1;
        }
        else if (isBonus) {
        }

        System.out.println(c);

        //Task D

        int d = 8;
        int time = 120;
        String out3 = "";

        if (((d % 4) == 0) && time < 201) {
            out3 = "check";
        }
        else if (time > 200) {
            out3 = "Time out";
        }
        else {
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);
    }
}
