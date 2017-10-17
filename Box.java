public class Box extends Rectangle {
    double length;
    double width;
    double height;
    double area;

    public double getArea() {
        area = 2 * (width * length + height * length + height * width);
        return area;
    }

    Box(double mainLength, double mainWidth, double mainHeight) {
        length = mainLength;
        width = mainWidth;
        height = mainHeight;


    }
}
