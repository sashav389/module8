package Module8;
import static Module8.GetShape.getShape;

public class Main {
    public static void main(String[] args) {
       // створюємо різні фігури
       Shape circle = new Circle();
       Shape triangle = new Triangle();
       Shape sphere = new Sphere();
       Shape rectangle = new Rectangle();
       Shape square = new Square();
       // використовуємо метод getShape з окремого класу GetShape
       System.out.println(getShape(circle) + " " + getShape(sphere) + " " + getShape(rectangle));
    }
}