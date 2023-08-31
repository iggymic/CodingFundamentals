import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeCalculator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 5);
        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println(calculator.calculateShapeArea(circle));
        System.out.println(calculator.calculateShapeArea(rectangle));


        System.out.println(circle);
        System.out.println(rectangle);
    }
}