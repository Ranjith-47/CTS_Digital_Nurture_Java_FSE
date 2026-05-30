public class JavapDemo {
    public int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        JavapDemo demo = new JavapDemo();
        int result = demo.product(4, 25);
        System.out.println("Product = " + result);
    }
}