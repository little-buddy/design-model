package Adapter.ClassAdapter;

public class Adapter extends Source implements Targetable {
  @Override
  public void method2() {
    System.out.println("this is the targetable method!");
  }
}

// 一般用于接口不匹配所造成的类的兼容性问题
// 类的适配器模式
// 对象的适配器模式
// 接口的适配器模式

// 其实接口的声明 是为了让程序更好的 debug