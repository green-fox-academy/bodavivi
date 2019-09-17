public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";


        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        // First
        String part = "always takes longer than";

        quote = (quote.substring(0, 20) +  " " +part + " " + quote.substring(20, 82));


        System.out.println(quote);

        //Second
        String quoteAgain = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String toInsert = " always takes longer than";
        StringBuilder sb = new StringBuilder(quoteAgain);
        int index = quoteAgain.indexOf("It") ;
        sb.insert(index+2, toInsert);

        quoteAgain = sb.toString();


        System.out.println(quoteAgain);
    }
}