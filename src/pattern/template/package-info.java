/**
 * <h1>Design Patterns - Template Pattern</h1>
 *
 * <p>
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 * Its subclasses can override the method implementation as per need but the invocation is to be in
 * the same way as defined by an abstract class. This pattern comes under behavior pattern category.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>Game</i> abstract class defining operations with a template method
 * set to be final so that it cannot be overridden. <i>Cricket</i> and <i>Football</i> are concrete
 * classes that extend <i>Game</i> and override its methods.
 * </p>
 *
 * <p>
 * <i>TemplatePatternDemo</i>, our demo class, will use <i>Game</i> to demonstrate use of template
 * pattern.
 * </p>
 *
 * <img src="./template_pattern_uml_diagram.jpg" alt="Template Pattern UML Diagram" width="100%">
 */
package pattern.template;