/**
 * <h1>Design Patterns - Mediator Pattern</h1>
 *
 * <p>
 * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
 * This pattern provides a mediator class which normally handles all the communications between
 * different classes and supports easy maintenance of the code by loose coupling. Mediator pattern
 * falls under behavioral pattern category.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are demonstrating mediator pattern by example of a chat room where multiple users can send
 * message to chat room and it is the responsibility of chat room to show the messages to all users.
 * We have created two classes ChatRoom and User. User objects will use ChatRoom method to share
 * their messages.
 * </p>
 *
 * <p>
 * MediatorPatternDemo, our demo class, will use User objects to show communication between them.
 * </p>
 *
 * <img src="./mediator_pattern_uml_diagram.jpg" alt="Mediator Pattern UML Diagram" width="100%">
 */
package pattern.mediator;