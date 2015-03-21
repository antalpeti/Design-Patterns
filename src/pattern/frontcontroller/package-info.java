/**
 * <h1>Design Pattern - Front Controller Pattern</h1>
 *
 * <p>
 * The front controller design pattern is used to provide a centralized request handling mechanism
 * so that all requests will be handled by a single handler. This handler can do the authentication/
 * authorization/ logging or tracking of request and then pass the requests to corresponding
 * handlers. Following are the entities of this type of design pattern.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * <b>Front Controller</b> - Single handler for all kinds of requests coming to the application
 * (either web based/ desktop based).
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Dispatcher</b> - Front Controller may use a dispatcher object which can dispatch the request
 * to corresponding specific handler.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>View</b> - Views are the object for which the requests are made.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>FrontController</i> and <i>Dispatcher</i> to act as Front Controller
 * and Dispatcher correspondingly. <i>HomeView</i> and <i>StudentView</i> represent various views
 * for which requests can come to front controller.
 * </p>
 *
 * <p>
 * <i>FrontControllerPatternDemo</i>, our demo class, will use <i>FrontController</i> to demonstrate
 * Front Controller Design Pattern.
 * </p>
 *
 * <p>
 * <img src="./frontcontroller_pattern_uml_diagram.jpg" alt="Front Controller Pattern UML Diagram"
 * width="100%">
 * </p>
 */
package pattern.frontcontroller;