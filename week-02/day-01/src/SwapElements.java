public class SwapElements {
    public static void main(String[] args) {
        String [] abc = {"first", "second", "third"};
        String c = abc [2];
        abc [2] = abc [0];
        abc [0] = c;


        for (String cba : abc){
            System.out.println(cba);

            }
        }

    }
