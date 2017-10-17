public class Rectangle implements Measurable{
    double length;
    double width;
    double area;

    public double getArea() {

        area = length * width;
        return area;
    }

    Rectangle(double mainLength, double mainWidth) {

        length = mainLength;
        width = mainWidth;

       // Rectangle rect = new Rectangle();
    }

}
