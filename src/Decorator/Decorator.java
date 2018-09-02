package Decorator;


public class Decorator implements Sourceable {

  private Sourceable source;

  public Decorator(Sourceable source) {
    this.source = source;
  }

  @Override
  public void method() {
    System.out.println("before decorator!");
    source.method();
    System.out.println("after decorator!");
  }
}

// 实际开发中，这些类都是通过 Spring 的形式 注入的


/*

 代理与装饰的区别就是
    装饰类对代理对象没有控制权
    代理类对代理对象有控制权，可以决定它是否触发

    概念上的意义
 */

