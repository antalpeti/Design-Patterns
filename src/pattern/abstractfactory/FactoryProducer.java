package pattern.abstractfactory;

public class FactoryProducer {
  public static AbstractFactory getFactory(FactoryStyle choice) {

    if (choice == FactoryStyle.SHAPE) {
      return new ShapeFactory();

    } else if (choice == FactoryStyle.COLOR) {
      return new ColorFactory();
    }

    return null;
  }
}
