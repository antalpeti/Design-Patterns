/**
 * <h1>Data Access Object Pattern</h1>
 *
 * <p>
 * Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or
 * operations from high level business services. Following are the participants in Data Access
 * Object Pattern.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * <b>Data Access Object Interface</b> - This interface defines the standard operations to be
 * performed on a model object(s).
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Data Access Object concrete class</b> - This class implements above interface. This class is
 * responsible to get data from a data source which can be database / xml or any other storage
 * mechanism.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Model Object or Value Object</b> - This object is simple POJO containing get/set methods to
 * store data retrieved using DAO class.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>Student</i> object acting as a Model or Value
 * Object.<i>StudentDao</i> is Data Access Object Interface.<i>StudentDaoImpl</i> is concrete class
 * implementing Data Access Object Interface. <i>DaoPatternDemo</i>, our demo class, will use
 * <i>StudentDao</i> to demonstrate the use of Data Access Object pattern.
 * </p>
 *
 * <p>
 * <img src="./dao_pattern_uml_diagram.jpg" alt="Data Access Object Pattern Original UML Diagram"
 * width="100%">
 * </p>
 *
 * <p>
 * <img src="./dao_pattern_uml_diagram.gif" alt="Data Access Object Pattern Actual UML Diagram"
 * width="100%">
 * </p>
 */
package pattern.dataaccessobject;