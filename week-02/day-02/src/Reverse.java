// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverseMethod(reversed);
    }

    public static String reverseMethod (String rev){
        String reverse = "";
        for (int i = rev.length() -1; i >= 0 ; i--) {
            reverse = (reverse + rev.charAt(i));



        }

        System.out.println(reverse);
        return reverse;
    }
}