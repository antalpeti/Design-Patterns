package pattern.factory;


public class FactoryPatternDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    // get an object of Circle and call its draw method.
    Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

    // call draw method of Circle
    shape1.draw();

    // get an object of Rectangle and call its draw method.
    Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

    // call draw method of Rectangle
    shape2.draw();

    // get an object of Square and call its draw method.
    Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

    // call draw method of circle
    shape3.draw();

    System.out.println("\nWith foreach loop.\n");
    Shape shape;
    for (ShapeType shapeType : ShapeType.values()) {
      shape = shapeFactory.getShape(shapeType);
      shape.draw();
    }
  }
}
