/**
 * <h1>Design Pattern - Transfer Object Pattern</h1>
 *
 * <p>
 * The Transfer Object pattern is used when we want to pass data with multiple attributes in one
 * shot from client to server. Transfer object is also known as Value Object. Transfer Object is a
 * simple POJO class having getter/setter methods and is serializable so that it can be transferred
 * over the network. It does not have any behavior. Server Side business class normally fetches data
 * from the database and fills the POJO and send it to the client or pass it by value. For client,
 * transfer object is read-only. Client can create its own transfer object and pass it to server to
 * update values in database in one shot. Following are the entities of this type of design pattern.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * <b>Business Object</b> - Business Service fills the Transfer Object with data.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Transfer Object</b> - Simple POJO having methods to set/get attributes only.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Client</b> - Client either requests or sends the Transfer Object to Business Object.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>StudentBO</i> as Business Object,<i>Student</i> as Transfer Object
 * representing our entities.
 * </p>
 *
 * <p>
 * <i>TransferObjectPatternDemo</i>, our demo class, is acting as a client here and will use
 * <i>StudentBO</i> and <i>Student</i> to demonstrate Transfer Object Design Pattern.
 * </p>
 *
 * <p>
 * <img src="./transferobject_pattern_uml_diagram.jpg" alt="Transfer Object Pattern UML Diagram"
 * width="100%">
 * </p>
 */
package pattern.transferobject;