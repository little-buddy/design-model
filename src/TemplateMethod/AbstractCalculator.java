package TemplateMethod;

public abstract class AbstractCalculator {

  public final int calculate(String exp,String opt){
    int array[] = split(exp,opt);
    return calculate(array[0],array[1]);
  }

  abstract public int calculate(int num1,int num2);

  public int[] split(String exp,String opt){
    String array[] = exp.split(opt);
    int arrayInt[] = new int[2];
    arrayInt[0] = Integer.parseInt(array[0]);
    arrayInt[1] = Integer.parseInt(array[1]);
    return arrayInt;

  }
}


/*
*     final修饰类 -> 该类不可被继承
*     final修饰方法 -> 该方法不能再子类覆盖
*     final修饰字段属性 -> 属性第一次初始化后不能被修改
*
*     static
*       修饰成员函数 -> 则该函数不能使用this
*       不能修饰 -> 构造函数、函数参数、局部变量
*       修饰成员字段 -> 按修饰先后被虚拟机加载
*       修饰语句块 -> 安声明先后初始化
*       修饰的方法和字段只属于类
* */
