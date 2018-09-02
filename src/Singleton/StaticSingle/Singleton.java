package Singleton.StaticSingle;

public class Singleton {
    private static Singleton instance = null;

    //    单例的构造方法一定是私有的，然后通过内部的public方法去构造，直接通过new实例化会报错
    private Singleton(){
    }
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }
    public Object readResolve(){
        return getInstance();
    }
}

// 这个的缺点就是，一旦构造函数抛出异常，实例将永远得到不到创建

// synchronized


