public class OperatorPrecedence {
    public static void main(String[] args) {
        int X = 20, Y = 8, Z = 4;
        int result = X + Y * Z;
        System.out.println("Result of X + Y * Z: " + result);
        result = (X + Y) * Z;
        System.out.println("Result of (X + Y) * Z: " + result);
        result = X - Y / Z;
        System.out.println("Result of X - Y / Z: " + result);
        result = (X * Y) / Z;
        System.out.println("Result of (X * Y) / Z: " + result);
    }
}