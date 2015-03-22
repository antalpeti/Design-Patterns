/**
 * <h1>Design Pattern - Intercepting Filter Pattern</h1>
 *
 * <p>
 * The intercepting filter design pattern is used when we want to do some pre-processing /
 * post-processing with request or response of the application. Filters are defined and applied on
 * the request before passing the request to actual target application. Filters can do the
 * authentication/ authorization/ logging or tracking of request and then pass the requests to
 * corresponding handlers. Following are the entities of this type of design pattern.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * <b>Filter</b> - Filter which will performs certain task prior or after execution of request by
 * request handler.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Filter Chain</b> - Filter Chain carries multiple filters and help to execute them in defined
 * order on target.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Target</b> - Target object is the request handler
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Filter Manager</b> - Filter Manager manages the filters and Filter Chain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Client</b> - Client is the object who sends request to the Target object.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a <i>FilterChain</i>,<i>FilterManager</i>, <i>Target</i>, <i>Client</i> as
 * various objects representing our entities.<i>AuthenticationFilter</i> and <i>DebugFilter</i>
 * represent concrete filters.
 * </p>
 *
 * <p>
 * <i>InterceptingFilterDemo</i>, our demo class, will use <i>Client</i> to demonstrate Intercepting
 * Filter Design Pattern.
 * </p>
 *
 * <p>
 * <img src="./interceptingfilter_pattern_uml_diagram.jpg"
 * alt="Intercepting Filter Pattern UML Diagram" width="100%">
 * </p>
 */
package pattern.interceptingfilter;