import square.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square s1 = new Square(5, true);
        Square s2 = new Square(10);
        Square s3 = new Square();

        System.out.println(s1);
        s1.howToColor();
        System.out.println(s2);
        s2.howToColor();
        System.out.println(s3);
        s3.howToColor();
    }
}