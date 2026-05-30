import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Sample");
            System.out.println("Class Name: " + cls.getName());
            Method[] method = cls.getDeclaredMethods();
            System.out.println("\nMethods in Class:");
            for (Method m : method) {
                System.out.print("Method: " + m.getName());
                Parameter[] p = m.getParameters();
                System.out.print(" (");
                for (int i = 0; i < p.length; i++) {
                    System.out.print(p[i].getType().getSimpleName());
                    if (i < p.length - 1)
                        System.out.print(", ");
                }
                System.out.println(")");
            }
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method greet = cls.getMethod("greet", String.class);
            System.out.println("\nInvoking Method:");
            greet.invoke(obj, "Kumar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}