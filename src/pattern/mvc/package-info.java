/**
 * <h1>Design Patterns - MVC Pattern</h1>
 *
 * <p>
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate
 * application's concerns.
 * </p>
 * <ul>
 * <li><b>Model</b> - Model represents an object or JAVA POJO carrying data. It can also have logic
 * to update controller if its data changes.</li>
 * <li><b>View</b> - View represents the visualization of the data that model contains.</li>
 * <li><b>Controller</b> - Controller acts on both model and view. It controls the data flow into
 * model object and updates the view whenever data changes. It keeps view and model separate.</li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>Student</i> object acting as a model.<i>StudentView</i> will be a
 * view class which can print student details on console and <i>StudentController</i> is the
 * controller class responsible to store data in <i>Student</i> object and update view
 * <i>StudentView</i> accordingly.
 * </p>
 *
 * <p>
 * <i>MVCPatternDemo</i>, our demo class, will use <i>StudentController</i> to demonstrate use of
 * MVC pattern.
 * </p>
 *
 * <p>
 * <img src="./mvc_pattern_uml_diagram.jpg" alt="MVC Pattern Original UML Diagram" width="100%">
 * </p>
 *
 * <p>
 * <img src="./mvc_pattern_uml_diagram.gif" alt="MVC Pattern Actual UML Diagram" width="100%">
 * </p>
 */
package pattern.mvc;