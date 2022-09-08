package Module8;

import Shape.Shape;
import interfaces.Poligones;
import interfaces.Quads;
import interfaces.ShapesOfRotation;
import interfaces.VolumetricShapes;

class Circle extends Shape {
    public Circle(String circleName) {
        this.name = circleName;
    }
}
class Cylinder extends Shape implements ShapesOfRotation {
    public Cylinder(String cylinderName){
        this.name = cylinderName;
    }
}
class Cone extends Shape implements ShapesOfRotation{
    public Cone(String cylinderName){
        this.name = cylinderName;
    }
}
class Triangle extends Shape{
    public Triangle(String triangleName){
        this.name = triangleName;
    }
}
class Pentagon extends Shape implements Poligones {
    public Pentagon(String pentagonName){
        this.name = pentagonName;
    }
}
class Hexagon extends Shape implements Poligones {
    public Hexagon(String hexagonName){
        this.name = hexagonName;
    }
}
class Quadrangle extends Shape implements Quads{
    public Quadrangle(String quadrangleName){
        this.name = quadrangleName;
    }
}
class Square extends Shape implements Quads{
    public Square(String squareName){
        this.name = squareName;
    }
}
class Cube extends Shape implements VolumetricShapes {
    public Cube(String cubeName){
        this.name = cubeName;
    }
}
class Sphere extends Shape implements VolumetricShapes {
    public Sphere(String sphereName){
        this.name = sphereName;
    }
}


