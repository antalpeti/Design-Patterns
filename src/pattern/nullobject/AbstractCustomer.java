package pattern.nullobject;

public abstract class AbstractCustomer {
  protected String name;

  /**
   * Tell that is the given type is defined or undefined.
   *
   * @return true if the the type is undefined<br>
   *         false if the type is defined
   */
  public abstract boolean isNil();

  public abstract String getName();
}
