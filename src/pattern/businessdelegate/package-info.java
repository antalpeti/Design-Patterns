/**
 * <h1>Design Patterns - Business Delegate Pattern</h1>
 *
 * <p>
 * Business Delegate Pattern is used to decouple presentation tier and business tier. It is
 * basically use to reduce communication or remote lookup functionality to business tier code in
 * presentation tier code. In business tier we have following entities.
 * </p>
 *
 * <ul>
 * <li><b>Client</b> - Presentation tier code may be JSP, servlet or UI java code.</li>
 * <li><b>Business Delegate</b> - A single entry point class for client entities to provide access
 * to Business Service methods.</li>
 * <li><b>LookUp Service</b> - Lookup service object is responsible to get relative business
 * implementation and provide business object access to business delegate object.</li>
 * <li><b>Business Service</b> - Business Service interface. Concrete classes implement this
 * business service to provide actual business implementation logic.</li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>Client</i>, <i>BusinessDelegate</i>, <i>BusinessService</i>,
 * <i>LookUpService</i>, <i>JMSService</i> and <i>EJBService</i> representing various entities of
 * Business Delegate patterns.
 * </p>
 *
 * <p>
 * <i>BusinessDelegatePatternDemo</i>, our demo class, will use <i>BusinessDelegate</i> and
 * <i>Client</i> to demonstrate use of Business Delegate pattern.
 * </p>
 *
 * <img src="./business_delegate_pattern_uml_diagram.jpg"
 * alt="Business Delegate Pattern UML Diagram" width="100%">
 */
package pattern.businessdelegate;