public class MethodOverloading {
    public static int sum(int N1, int N2) {
        return N1 + N2;
    }

    public static double sum(double X, double Y) {
        return X + Y;
    }

    public static int sum(int A, int B, int C) {
        return A + B + C;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10 = " + sum(5, 10));
        System.out.println("Sum of 8.5 and 2.6 = " + sum(8.5, 2.6));
        System.out.println("Sum of 10, 25 and 35 = " + sum(10, 25, 35));
    }
}