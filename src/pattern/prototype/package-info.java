/**
 * <h1>Design Patterns - Prototype Pattern</h1>
 * <p>
 * Prototype pattern refers to creating duplicate object while keeping performance in mind. This
 * type of design pattern comes under creational pattern as this pattern provides one of the best
 * ways to create an object.
 * </p>
 *
 * <p>
 * This pattern involves implementing a prototype interface which tells to create a clone of the
 * current object. This pattern is used when creation of object directly is costly. For example, an
 * object is to be created after a costly database operation. We can cache the object, returns its
 * clone on next request and update the database as and when needed thus reducing database calls.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We're going to create an abstract class Shape and concrete classes extending the Shape class. A
 * class ShapeCache is defined as a next step which stores shape objects in a Hashtable and returns
 * their clone when requested.
 * </p>
 *
 * <p>
 * PrototypPatternDemo, our demo class will use ShapeCache class to get a Shape object.
 * </p>
 * <img src="./prototype_pattern_uml_diagram.jpg" alt="Prototype Pattern UML Diagram" width="100%">
 */
package pattern.prototype;

