/**
 * <h1>Design Pattern - Abstract Factory Pattern</h1>
 *
 * <p>
 * Abstract Factory patterns work around a super-factory which creates other factories. This factory
 * is also called as factory of factories. This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object.
 * </p>
 *
 * <p>
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects
 * without explicitly specifying their classes. Each generated factory can give the objects as per
 * the Factory pattern.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>Shape</i> and <i>Color</i> interfaces and concrete classes
 * implementing these interfaces. We create an abstract factory class <i>AbstractFactory</i> as next
 * step. Factory classes <i>ShapeFactory</i> and <i>ColorFactory</i> are defined where each factory
 * extends <i>AbstractFactory</i>. A factory creator/generator class <i>FactoryProducer</i> is
 * created.
 * </p>
 *
 * <p>
 * <i>AbstractFactoryPatternDemo</i>, our demo class uses <i>FactoryProducer</i> to get a
 * <i>AbstractFactory</i> object. It will pass information (<i>CIRCLE / RECTANGLE / SQUARE</i> for
 * <i>Shape</i>) to <i>AbstractFactory</i> to get the type of object it needs. It also passes
 * information (<i>RED / GREEN / BLUE</i> for <i>Color</i>) to <i>AbstractFactory</i> to get the
 * type of object it needs.
 * </p>
 *
 * <img src="./abstractfactory_pattern_uml_diagram.jpg" alt="Abstract Factory Pattern UML Diagram"
 * width="100%">
 */
package pattern.abstractfactory;