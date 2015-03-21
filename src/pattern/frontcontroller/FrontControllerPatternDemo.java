package pattern.frontcontroller;

public class FrontControllerPatternDemo {
  public static void main(String[] args) {
    FrontController frontController = new FrontController();
    frontController.dispatchRequest(RequestType.HOME);
    frontController.dispatchRequest(RequestType.STUDENT);
  }
}
