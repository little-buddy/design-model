package Singleton.DivideSingle;

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){
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
}

// 由于sync 的jvm 优化机制bug，这里使用了这种方式