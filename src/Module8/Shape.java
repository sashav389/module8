package Module8;

public abstract class Shape {
    protected String name;
    public String getName(){
        return this.name;
    }
}
 class Circle extends Shape{
     public Circle(){
         this.name = "Circle";
     }
 }

class Square extends Shape{
     public Square(){
         this.name = "Square";
     }
 }

class Triangle extends Shape{
     public Triangle(){
         this.name = "Triangle";
     }
 }

class Rectangle extends Shape{
     public Rectangle(){
         this.name = "Rectangle";
     }
 }

class Sphere extends Shape{
     public Sphere(){
         this.name = "Sphere";
     }
 }



