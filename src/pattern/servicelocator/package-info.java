/**
 * <h1>Design Pattern - Service Locator Pattern</h1>
 *
 * <p>
 * The service locator design pattern is used when we want to locate various services using JNDI
 * lookup. Considering high cost of looking up JNDI for a service, Service Locator pattern makes use
 * of caching technique. For the first time a service is required, Service Locator looks up in JNDI
 * and caches the service object. Further lookup or same service via Service Locator is done in its
 * cache which improves the performance of application to great extent. Following are the entities
 * of this type of design pattern.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * <b>Service</b> - Actual Service which will process the request. Reference of such service is to
 * be looked upon in JNDI server.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Context / Initial Context</b> - JNDI Context carries the reference to service used for lookup
 * purpose.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Service Locator</b> - Service Locator is a single point of contact to get services by JNDI
 * lookup caching the services.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Cache</b> - Cache to store references of services to reuse them
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Client</b> - Client is the object that invokes the services via ServiceLocator.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>ServiceLocator</i>,<i>InitialContext</i>, <i>Cache</i>,
 * <i>Service</i> as various objects representing our entities.<i>Service1</i> and <i>Service2</i>
 * represent concrete services.
 * </p>
 *
 * <p>
 * <i>ServiceLocatorPatternDemo</i>, our demo class, is acting as a client here and will use
 * <i>ServiceLocator</i> to demonstrate Service Locator Design Pattern.
 * </p>
 *
 * <p>
 * <img src="./servicelocator_pattern_uml_diagram.jpg" alt="Service Locator Pattern UML Diagram"
 * width="100%">
 * </p>
 */
package pattern.servicelocator;