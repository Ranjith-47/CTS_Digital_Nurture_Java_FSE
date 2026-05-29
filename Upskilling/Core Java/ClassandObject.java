class Car {
    String make;
    String model;
    int year;

    void showDetails() {
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }
}

public class ClassandObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Tata";
        car1.model = "Nexon";
        car1.year = 2020;

        Car car2 = new Car();
        car2.make = "Renault";
        car2.model = "Duster";
        car2.year = 2026;

        System.out.println("Car 1 Details:");
        car1.showDetails();

        System.out.println("Car 2 Details:");
        car2.showDetails();
    }
}