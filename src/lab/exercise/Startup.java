package lab.exercise;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        System.out.println("\nCircle with red border");
        shapeDecorator.draw();
        
        shapeDecorator = new RedShapeDecorator(rectangle);
        System.out.println("\nRectangle with red border");
        shapeDecorator.draw();
    }
}
