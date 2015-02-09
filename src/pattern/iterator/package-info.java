/**
 * <h1>Design Patterns - Iterator Pattern</h1>
 *
 * <p>
 * Iterator pattern is very commonly used design pattern in Java and .Net programming environment.
 * This pattern is used to get a way to access the elements of a collection object in sequential
 * manner without any need to know its underlying representation.
 * </p>
 *
 * <p>
 * Iterator pattern falls under behavioral pattern category.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We're going to create a Iterator interface which narrates navigation method and a Container
 * interface which retruns the iterator. Concrete classes implementing the Container interface will
 * be responsible to implement Iterator interface and use it.
 * </p>
 *
 * <p>
 * IteratorPatternDemo, our demo class will use NamesRepository, a concrete class implementation to
 * print a Names stored as a collection in NamesRepository.
 * </p>
 *
 * <img src="./iterator_pattern_uml_diagram.jpg" alt="Iterator Pattern UML Diagram" width="100%">
 */
package pattern.iterator;