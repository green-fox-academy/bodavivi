public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String part = "always takes longer than";

        quote = (quote.substring(0, 20) +  " " +part + " " + quote.substring(20, 60));

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
    }
}