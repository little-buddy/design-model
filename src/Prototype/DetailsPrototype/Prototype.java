package Prototype.DetailsPrototype;

import java.io.*;

public class Prototype implements Cloneable,Serializable {

  private static final long serialVersionUID = 1L;
  private String string;

  private SerializableObject obj;

  /* 浅复制 */
  public Object clone() throws CloneNotSupportedException{
    Prototype proto = (Prototype)super.clone();
    return proto;
  }

  /* 深复制 */
  public Object deepCone() throws IOException,ClassNotFoundException{
//    写入当前对象的二进制流
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(this);
//    读出二进制流的新对象
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return ois.readObject();
  }

  public String getString(){
    return string;
  }

  public void setString(String string){
    this.string = string;
  }

  public SerializableObject getObj() {
    return obj;
  }

  public void setObj(SerializableObject obj) {
    this.obj = obj;
  }

  class SerializableObject implements Serializable{

    private static final long serialVersionUID = 1L;
  }
}

// 复制对象的时候也需要 进行序列化

/*
*     序列化：
*       包含：
*         属性，基本数据类型、数组、以及其他对象的应用
*         类名
*       不包含：
*         方法
*         static
*         transient
* */