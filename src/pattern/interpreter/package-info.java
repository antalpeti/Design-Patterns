/**
 * <h1>Design Patterns - Interpreter Pattern</h1>
 *
 * <p>
 * Interpreter pattern provides a way to evaluate language grammar or expression. This type of
 * pattern comes under behavioral pattern. This pattern involves implementing an expression
 * interface which tells to interpret a particular context. This pattern is used in SQL parsing,
 * symbol processing engine etc.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create an interface Expression and concrete classes implementing the Expression
 * interface. A class TerminalExpression is defined which acts as a main interpreter of context in
 * question. Other classes OrExpression, AndExpression are used to create combinational expressions.
 * </p>
 *
 * <p>
 * InterpreterPatternDemo, our demo class, will use Expression class to create rules and demonstrate
 * parsing of expressions.
 * </p>
 *
 * <img src="./interpreter_pattern_uml_diagram.jpg" alt="Interpreter Pattern UML Diagram"
 * width="100%">
 */
package pattern.interpreter;