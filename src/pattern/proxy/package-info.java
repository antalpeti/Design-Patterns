/**
 * <h1>Design Patterns - Proxy Pattern</h1>
 *
 * <p>
 * In proxy pattern, a class represents functionality of another class. This type of design pattern
 * comes under structural pattern.
 * </p>
 *
 * <p>
 * In proxy pattern, we create object having original object to interface its functionality to outer
 * world.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create an Image interface and concrete classes implementing the Image interface.
 * ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
 * </p>
 *
 * <p>
 * ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display
 * as it needs.
 * </p>
 *
 * <img src="proxy_pattern_uml_diagram.jpg" alt="Proxy Pattern UML Diagram" width="100%">
 */
package pattern.proxy;