import org.w3c.dom.ls.LSOutput;

public class CompareLength {
    public static void main(String[] args) {
        int[] p1 = {1, 2, 3};
        int[] p2 ={4, 5};
        if (p2.length > p1.length){
            System.out.println("p2 is longer");
        }
        else if (p2.length < p1.length){
            System.out.println("p1 is longer");
        }
        else {
            System.out.println("p1 and p2 have the same length");
        }
    }
}
