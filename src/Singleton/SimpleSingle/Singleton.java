package Singleton.SimpleSingle;

public class Singleton {
    private static Singleton instance = null;

    //    单例的构造方法一定是私有的，然后通过内部的public方法去构造，直接通过new实例化会报错
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public Object readResolve(){
        return instance;
    }
}

// 这个类唯一的缺点就是 多线程中会多次实例化，需要增加锁的机制

/*
*       java 对象的序列化
*           作用：-> 为了保存在内存中的各种对象的状态(也就是实例变量，而不是方法),并且可以把保存的状态再读出来
*
*           场景：-> 1、想把内存的对象状态保存到一个文件中或者数据库的时候
*                   2、用socket在网络上传输的时候
*                   3、通过RMI传输对象的时候
*
*           想从一个jvm中调用另一个jvm中的对象。可以考虑用 序列化
*           session 序列化 来降低服务器的内存开销
*
*           序列化中的 1L 和 一串数字(是根据它所有成员通过算法生成)的区别就是，serialVersionUID 在1L中只要对象属性成员变了值就会变，导致对象扩展
*           而无法读取原存储对象，但是指定了一串数字，对象即使扩展依旧能反序列化原对象
*
*           一般session的持久化就是存在 服务端的Cookie 中，避免了创建文件和数据库
*
*           为什么要用redis？
*               在InProc模式下容易丢失，并且引发并发问题。如果使用sqlServer又消耗了性能
*               Cookie则容易将一些用户信息暴露，加密同样消耗性能
*               Redis解决的问题：
*                   存取速度快
*                   用户数据不易丢失
*                   用户多的情况下容易支持集群
*                   能够查看在线用户
*                   能够实现用户一处登陆
*                   支持持久化
*
*
*           static 声明无法被序列化
*           有些变量不想被序列化又不想使用static transient
*
*           引出来一个话题就是 redis 实现session的分布式共享
* */
