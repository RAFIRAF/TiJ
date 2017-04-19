package typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rafal on 02017-04-17.
 */
abstract class Shape{
    void draw(){
        System.out.println(this+".draw()"); // !
    }
    abstract public String toString();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}
class Rhomboid extends Shape{
    @Override
    public String toString() {
        return "Rhomboid";
    }
}
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(),new Square(),new Triangle(), new Rhomboid()
        );
        for (Shape shape :shapeList) {
            shape.draw();
        }
        Shape rhomboid = new Rhomboid();
        Rhomboid rhomboid1 = (Rhomboid)rhomboid;
        Circle circle;
        if (rhomboid instanceof Circle)
            circle = (Circle)rhomboid;
        else System.out.println("rhomboid not a Circle");
    }
}
