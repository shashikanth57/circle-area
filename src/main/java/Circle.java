public class Circle {

    public double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                "Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        double radius = 5;

        System.out.println(
            "Area = " + c.calculateArea(radius));
    }
}