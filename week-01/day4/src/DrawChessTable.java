public class DrawChessTable {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if ((i % 2) == 1) {
                System.out.println("% % % %");
            } else {
                System.out.println(" % % % %");
            }
        }
    }
}
