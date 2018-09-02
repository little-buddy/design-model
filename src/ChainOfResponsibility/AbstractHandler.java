package ChainOfResponsibility;

public abstract class AbstractHandler {
  private Handler handler;

  public Handler getHandler(){
    return handler;
  }
  public void setHandler(Handler hander){
    this.handler = hander;
  }
}
