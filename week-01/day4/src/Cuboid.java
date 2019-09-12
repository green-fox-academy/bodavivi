public class Cuboid {
    public static void main(String[] args) {
        int a = 10;
        double squared = Math.pow(a, 2);
        double cubed = Math.pow(a, 3);

        int surface = (int) (6 * (squared));
        int volume = (int) cubed;

        System.out.println("The cuboids sides are " +a +" meters and surface is " + surface +" squaremeters, and the volume is" +cubed +" cubemeters.");



    }
}
