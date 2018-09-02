package Visitor;

public class VisitorDemo {
  interface Service {
    public void accept(Visitor visitor);
  }
  static class Visitor{
    public void process(Service service){
      System.out.println("基本业务");
    }
    public void process(Saving service){
      System.out.println("存款");
    }
    public void process(Draw service){
      System.out.println("提款");
    }
    public void process(Fund service){
      System.out.println("基金");
    }
  }

  static class Saving implements Service{
    public void accept(Visitor visitor){
      visitor.process(this);
    }
  }
  static class Draw implements Service{
    public void accept(Visitor visitor){
      visitor.process(this);
    }
  }
  static class Fund implements Service{
    public void accept(Visitor visitor){
      visitor.process(this);
    }
  }
}
