public class PatternMatching {
    public static void findType(Object obj) {
        switch (obj) {
            case Integer n ->
                System.out.println("Integer value: " + n);
            case String s ->
                System.out.println("String value: " + s);
            case Double d ->
                System.out.println("Double value: " + d);
            case Boolean b ->
                System.out.println("Boolean value: " + b);
            case null ->
                System.out.println("Object is null");
            default ->
                System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        findType(123);
        findType("Apple");
        findType(47.98);
        findType(true);
        findType(null);
        findType(new StringBuffer("Test"));
    }
}