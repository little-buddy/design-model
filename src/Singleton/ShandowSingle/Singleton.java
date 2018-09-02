package Singleton.ShandowSingle;

import java.util.Vector;

public class Singleton {
    private static Singleton instance = null;
//    这里的vector 其实就是js的数组功能
    private Vector properties = null;
    private Singleton(){
    }

    public Vector getProperties() {
        return properties;
    }

    private static synchronized void syncinit(){
        if(instance==null){
            instance = new Singleton();
        }
    }
    public static Singleton getInstance(){
        if(instance==null){
            syncinit();
        }
        return instance;
    }
    public void updateProperties(){
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }
}

// 静态类不能实现接口
// 静态类都是static 方法，无法被覆盖

// 由于sync 的jvm 优化机制bug，这里使用了这种方式