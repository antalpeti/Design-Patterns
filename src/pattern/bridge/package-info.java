/**
 * <h1>Design Patterns - Bridge Pattern</h1>
 *
 * <p>
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two
 * can vary independently. This type of design pattern comes under structural pattern as this
 * pattern decouples implementation class and abstract class by providing a bridge structure between
 * them.
 * </p>
 *
 * <p>
 * This pattern involves an interface which acts as a bridge which makes the functionality of
 * concrete classes independent from interface implementer classes. Both types of classes can be
 * altered structurally without affecting each other.
 * </p>
 *
 * <p>
 * We are demonstrating use of Bridge pattern via following example in which a circle can be drawn
 * in different colors using same abstract class method but different bridge implementer classes.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We have a DrawAPI interface which is acting as a bridge implementer and concrete classes
 * RedCircle, GreenCircle implementing the DrawAPI interface. Shape is an abstract class and will
 * use object of DrawAPI. BridgePatternDemo, our demo class will use Shape class to draw different
 * colored circle.
 * </p>
 *
 * <img src="./bridge_pattern_uml_diagram.jpg" alt="Bridge Pattern UML Diagram" width="100%">
 */
package pattern.bridge;