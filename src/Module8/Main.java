package Module8;

import Names.NameConstants;
import Shape.*;


import static Module8.GettingShape.printShape;

public class Main {
    public static void main(String[] args) {
       Shape circle = new Circle(NameConstants.circleName);
       Shape sphere = new Sphere(NameConstants.sphereName);
       Shape hexagon = new Hexagon(NameConstants.hexagonName);
       Shape cube = new Cube(NameConstants.cubeName);
       Shape quadrangle = new Quadrangle(NameConstants.quadrangleName);
       Shape cone = new Cone(NameConstants.coneName);

       printShape(circle);
       printShape(sphere);
       printShape(hexagon);
       printShape(cube);
       printShape(quadrangle);
       printShape(cone);


    }
}