public class Circle implements Measurable {
    double radius;
    double area;

    @Override
    public double getArea() {
        area =  Math.PI * radius * radius;
        return area;
    }

    Circle(double mainRadius) {

        radius = mainRadius;
        // Circle circle = new Circle();
    }
}
