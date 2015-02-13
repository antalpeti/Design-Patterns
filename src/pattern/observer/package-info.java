/**
 * <h1>Design Patterns - Observer Pattern</h1>
 *
 * <p>
 * Observer pattern is used when there is one-to-many relationship between objects such as if one
 * object is modified, its depenedent objects are to be notified automatically. Observer pattern
 * falls under behavioral pattern category.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object
 * having methods to attach and detach observers to a client object. We have created an abstract
 * class Observer and a concrete class Subject that is extending class Observer.
 * </p>
 *
 * <p>
 * ObserverPatternDemo, our demo class, will use Subject and concrete class object to show observer
 * pattern in action.
 * </p>
 *
 * <img src="./observer_pattern_uml_diagram.jpg" alt="Observer Pattern UML Diagram" width="100%">
 */
package pattern.observer;