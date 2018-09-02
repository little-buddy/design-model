package Adapter.ObjectAdapter;

import Adapter.ClassAdapter.Source;
import Adapter.ClassAdapter.Targetable;

public class Wrapper implements Targetable {
  private Source source;

  public Wrapper(Source source) {
    this.source = source;
  }


  @Override
  public void method1() {
    System.out.println("this is the targetable method!");
  }

  @Override
  public void method2() {
    source.method1();
  }
}

// 其实thunk，柯里化的一种实现
