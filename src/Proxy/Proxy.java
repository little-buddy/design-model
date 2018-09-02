package Proxy;

import Decorator.Source;
import Decorator.Sourceable;

public class Proxy implements Sourceable {

  private Source source;

  public Proxy(Source source) {
    this.source = source;
  }

  @Override
  public void method() {
    before();
    source.method();
    after();
  }
  public void before(){
    System.out.println("before proxy!");
  }

  public void after(){
    System.out.println("after proxy");
  }
}

/*
*     如果以后的方法在使用的时候需要对原有的方法进行该井，有2中方法
*       修改原有的方法来适应，且对产生的结果进行控制
*       采用代理类调用原有的方法， 就是 Monkey
* */