/**
 * <h1>Design Pattern - Factory Pattern</h1>
 *
 * <p>
 * Factory pattern is one of most used design pattern in Java. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to create an object.
 * </p>
 *
 * <p>
 * In Factory pattern, we create object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We're going to create a <i>Shape</i> interface and concrete classes implementing the <i>Shape</i>
 * interface. A factory class <i>ShapeFactory</i> is defined as a next step.
 * </p>
 *
 * <p>
 * <i>FactoryPatternDemo</i>, our demo class will use <i>ShapeFactory</i> to get a <i>Shape</i>
 * object. It will pass information (<i>CIRCLE / RECTANGLE / SQUARE</i>) to <i>ShapeFactory</i> to
 * get the type of object it needs.
 * </p>
 *
 * <img src="./factory_pattern_uml_diagram.jpg" alt="Factory Pattern UML Diagram" width="100%">
 */
package pattern.factory;