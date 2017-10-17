import java.util.ArrayList;
import java.util.Random;

/*
    http://xahlee.info/java-a-day/interface.html
    https://www.jetbrains.com/help/idea/creating-java-classes,-interfaces,-enumerations-and-annotations.html
    https://www.youtube.com/watch?v=NnZQ-C0x4hs
*/

public class Main {

    private static double nextDouble(){

        Random randomArea = new Random();
        double random = randomArea.nextDouble();

        //generate random dimensions to pass into the Measurable constructors?

        return random;

    }
    private static double calculateSum(ArrayList<Measurable>measures){
        double sum = 0;

        for (int i = 0; i <= measures.size(); i++)
        {
            sum = sum + measures.get(i).getArea();
        }

        System.out.println("Sum: " + sum);
        return sum;

    }

    public static void main(String[] args) {
        ArrayList<Measurable> measures = new ArrayList<>();
    /*
        Measurable measureRect = new Rectangle();
        measureRect.getArea();

        Measurable measureBox = new Box();
        measureBox.getArea();

        Measurable measureCircle = new Circle();
        measureCircle.getArea();

        Measurable measureSphere = new Sphere();
        measureSphere.getArea();
    */

        Random randomChance = new Random();
        double chance = randomChance.nextDouble();

        for (int i = 0; i < 1000; i++){
        if (chance < 0.25)
        {
            double length = nextDouble();
            double width = nextDouble();
            Rectangle r = new Rectangle(length, width); //somehow need to send in dimensions
            measures.add(r);
        }
        else if (chance < 0.5)
        {
            double length = nextDouble();
            double width = nextDouble();
            double height = nextDouble();
            Box b = new Box(length, width, height);
            measures.add(b);
        }
        else if (chance < 0.75)
        {
            double radius = nextDouble();
            Circle c = new Circle (radius);
            measures.add(c);
        }
        else if (chance < 1)
        {
            double radius = nextDouble();
            Sphere s = new Sphere(radius);
            measures.add(s);
        }
        }
    /*
        System.out.println("Hello World!");
        System.out.println(measureRect.getArea());
        System.out.println(measureBox.getArea());
        System.out.println(measureCircle.getArea());
        System.out.println(measureSphere.getArea());
    */

        calculateSum(measures);
    }


}
