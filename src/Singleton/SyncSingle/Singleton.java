package Singleton.SyncSingle;

public class Singleton {
    private static Singleton instance = null;

//    单例的构造方法一定是私有的，然后通过内部的public方法去构造，直接通过new实例化会报错
    private Singleton(){
    }
    // 事实上只需要在第一次创建的时候同步，后续并不需要
//    锁的是方法
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
//    锁的时具体的变量
    /*
    *   question:
    *       java 中的指令 创建对象和赋值操作是分开的，也就是 instance = new Singleton() 是分2步执行的
    *       但是jvm并不保证这两个操作的顺序
    *
    *       假设A B线程同时进入第一个判断
    *
    *       A 先进入synchronized块，由于jvm内部的机制，jvm先划出一些分配给Singleton实例的空白内存，并赋值给instance
    *       (没有初始化)，此时A离开了Singleton块
    *
    *       B进入synchronized块，由于instance此时为null，因此它马上离开synchronized块，之后B打算使用Singleton实例时获取的是null
    *
    *       这里面就涉及到 创建对象的过程
    * */
    public static Singleton getInstance_(){
        if(instance==null){
            synchronized(instance){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public Object readResolve(){
        return instance;
    }
}

// synchronized


