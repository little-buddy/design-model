package ChainOfResponsibility;

public class MyHandler extends AbstractHandler implements Handler {

  private String name;
  public MyHandler(String name) {
    this.name = name;
  }

  @Override
  public void operator() {
    System.out.println(name+"deal!");
    if(getHandler()!=null){
      getHandler().operator();
    }

  }
}

// 一旦重写，要调用原未被覆盖的方法。就只能使用 super 了吧

// 责任链其实就是js 里面的链式调用，有多个对象，每个对象持有下一个对象的引用，这样会形成一条链
// 请求在这条链上传递，知道某一对象决定处理该请求
