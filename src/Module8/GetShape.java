package Module8;

public class GetShape {
    public static String getShape(Object o){
        // як в завданні використовуємо через клас Shape
        Shape ob = (Shape) o;
        return ob.getName();
    }
}
