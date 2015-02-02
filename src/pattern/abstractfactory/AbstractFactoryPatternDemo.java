package pattern.abstractfactory;

public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {

    // get shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryStyle.SHAPE);

    // get an object of Shape Circle
    Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

    // call draw method of Shape Circle
    shape1.draw();

    // get an object of Shape Rectangle
    Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

    // call draw method of Shape Rectangle
    shape2.draw();

    // get an object of Shape Square
    Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

    // call draw method of Shape Square
    shape3.draw();

    // get color factory
    AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryStyle.COLOR);

    // get an object of Color Red
    Color color1 = colorFactory.getColor(ColorType.RED);

    // call fill method of Red
    color1.fill();

    // get an object of Color Green
    Color color2 = colorFactory.getColor(ColorType.GREEN);

    // call fill method of Green
    color2.fill();

    // get an object of Color Blue
    Color color3 = colorFactory.getColor(ColorType.BlUE);

    // call fill method of Color Blue
    color3.fill();

    System.out.println("\nWith foreach loop.\n");
    Shape shape;
    for (ShapeType shapeType : ShapeType.values()) {
      shape = shapeFactory.getShape(shapeType);
      shape.draw();
    }
    Color color;
    for (ColorType colorType : ColorType.values()) {
      color = colorFactory.getColor(colorType);
      color.fill();
    }
  }
}
