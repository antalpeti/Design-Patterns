/**
 * <h1>Design Patterns - Filter Pattern</h1>
 *
 * <p>
 * Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of
 * objects using different criteria and chaining them in a decoupled way through logical operations.
 * This type of design pattern comes under structural pattern as this pattern combines multiple
 * criteria to obtain single criteria.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We're going to create a Person object, Criteria interface and concrete classes implementing this
 * interface to filter list of Person objects. CriteriaPatternDemo, our demo class uses Criteria
 * objects to filter List of Person objects based on various criteria and their combinations.
 * </p>
 *
 * <img src="./filter_pattern_uml_diagram.jpg" alt="Filter Pattern UML Diagram" width="100%">
 */
package pattern.filter;