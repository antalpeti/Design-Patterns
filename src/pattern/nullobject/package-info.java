/**
 * <h1>Design Patterns - Null Object Pattern</h1>
 *
 * <p>
 * In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting
 * if check for a null value, Null Object reflects a do nothing relationship. Such Null object can
 * also be used to provide default behaviour in case data is not available.
 * </p>
 *
 * <p>
 * In Null Object pattern, we create an abstract class specifying various operations to be done,
 * concrete classes extending this class and a null object class providing do nothing implemention
 * of this class and will be used seemlessly where we need to check null value.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>AbstractCustomer</i> abstract class defining operations. Here the
 * name of the customer and concrete classes extending the <i>AbstractCustomer</i> class. A factory
 * class <i>CustomerFactory</i> is created to return either <i>RealCustomer</i> or
 * <i>NullCustomer</i> objects based on the name of customer passed to it.
 * </p>
 *
 * <p>
 * <i>NullPatternDemo</i>, our demo class, will use <i>CustomerFactory</i> to demonstrate the use of
 * Null Object pattern.
 * </p>
 *
 * <img src="./null_pattern_uml_diagram.jpg" alt="Null Pattern UML Diagram" width="100%">
 */
package pattern.nullobject;