/**
 * <h1>Design Patterns - Momento Pattern</h1>
 *
 * <p>
 * Memento pattern is used to restore state of an object to a previous state. Memento pattern falls
 * under behavioral pattern category.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * Memento pattern uses three actor classes. Memento contains state of an object to be restored.
 * Originator creates and stores states in Memento objects and Caretaker object is responsible to
 * restore object state from Memento. We have created classes Memento, Originator and CareTaker.
 * </p>
 *
 * <p>
 * MementoPatternDemo, our demo class, will use CareTaker and Originator objects to show restoration
 * of object states.
 * </p>
 *
 * <img src="memento_pattern_uml_diagram.jpg" alt="Memento Pattern UML Diagram" width="100%">
 */
package pattern.momento;