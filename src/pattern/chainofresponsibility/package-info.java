/**
 * <h1>Chain of Responsibility Pattern</h1>
 *
 * <p>
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for
 * a request. This pattern decouples sender and receiver of a request based on type of request. This
 * pattern comes under behavioral patterns.
 * </p>
 *
 * <p>
 * In this pattern, normally each receiver contains reference to another receiver. If one object
 * cannot handle the request then it passes the same to the next receiver and so on.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We have created an abstract class <i>AbstractLogger</i> with a level of logging. Then we have
 * created three types of loggers extending the <i>AbstractLogger</i>. Each logger checks the level
 * of message to its level and print accordingly otherwise does not print and pass the message to
 * its next logger.
 * </p>
 *
 * <img src="./chain_pattern_uml_diagram.jpg" alt="Chain Pattern UML Diagram" width="100%">
 */
package pattern.chainofresponsibility;