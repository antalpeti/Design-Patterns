package pattern.frontcontroller;

public class Dispatcher {
  private StudentView studentView;
  private HomeView homeView;

  public Dispatcher() {
    studentView = new StudentView();
    homeView = new HomeView();
  }

  public void dispatch(RequestType request) {
    if (request == RequestType.HOME) {
      studentView.show();
    } else {
      homeView.show();
    }
  }
}
