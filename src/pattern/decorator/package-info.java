/**
 * <h1>Design Patterns - Decorator Pattern</h1>
 *
 * <p>
 * Decorator pattern allows a user to add new functionality to an existing object without altering
 * its structure. This type of design pattern comes under structural pattern as this pattern acts as
 * a wrapper to existing class.
 * </p>
 *
 * <p>
 * This pattern creates a decorator class which wraps the original class and provides additional
 * functionality keeping class methods signature intact.
 * </p>
 *
 * <p>
 * We are demonstrating the use of decorator pattern via following example in which we will decorate
 * a shape with some color without alter shape class.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We're going to create a Shape interface and concrete classes implementing the Shape interface. We
 * will then create an abstract decorator class ShapeDecorator implementing the Shape interface and
 * having Shape object as its instance variable.
 * </p>
 *
 * <p>
 * RedShapeDecorator is concrete class implementing ShapeDecorator.
 * </p>
 *
 * <p>
 * DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.
 * </p>
 *
 * <img src="decorator_pattern_uml_diagram.jpg" alt="Decorator Pattern UML Diagram" width="100%">
 */
package pattern.decorator;