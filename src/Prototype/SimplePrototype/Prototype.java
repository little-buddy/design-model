package Prototype.SimplePrototype;

public class Prototype implements Cloneable{

//  clone 方法名称 随意，因为 Cloneable 是一个空接口，关键在于super.clone() Object.clone()

  public Object clone() throws CloneNotSupportedException{
    Prototype proto = (Prototype) super.clone();
    return proto;
  }
}

// 浅复制 -> 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向
// 深复制 -> 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建