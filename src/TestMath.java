public class TestMath {
    public static void main(String[] args) {
        Math math1 = new Math();
        double r = 2.5;

        System.out.println("Czy parzysta? " + math1.isEven(6));
        System.out.println("Czy nieparzysta? " + math1.isOdd(7));
        System.out.println("Pole koła o promieniu: " + r + " wynosi: " + math1.circleField(r));
        System.out.println("a do potęgi 2 wynosi: " + math1.power(4));
    }
}
