public class Sphere extends Circle {
    double radius;
    double area;

    @Override
    public double getArea() {
        area =  4 * Math.PI * radius * radius;
        return area;
    }

    Sphere(double mainRadius) {

        radius = mainRadius;
        //Sphere sphere = new Sphere();
    }
}
