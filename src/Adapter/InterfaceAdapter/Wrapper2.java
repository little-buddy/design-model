package Adapter.InterfaceAdapter;

public class Wrapper2 implements Sourceable {
  @Override
  public void method1() {

  }

  @Override
  public void method2() {

  }
}

// 通过一个类将复杂的接口 内的方法全服为空实现一遍
// 然后在继承这个类去实现需要的方法
// 这感觉像是 java面向对象的死板规则，而不是什么设计模式

/*
    1 -> 将一个类转换成满足另一个新接口的类，新类继承原类实现新接口
    2 -> 将一个对象转换成满足另一个新接口的对象
    3 -> 当不希望实现一个接口中所有逇方法时
* */
