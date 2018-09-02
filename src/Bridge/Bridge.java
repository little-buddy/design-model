package Bridge;

public abstract class Bridge {
  private Sourceable source;
  public void method(){
    source.method();
  }

  public Sourceable getSource() {
    return source;
  }
  public void setSource(Sourceable source){
    this.source = source;
  }
}

/*
    把事物 与 具体实现分开，使他们各自独立变化。将抽象化与实现化解耦，使得二者可以独立变化
* */
