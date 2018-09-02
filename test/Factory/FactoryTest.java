package Factory;

import Factory.SimpleFactory.SendFactory;
import org.junit.Test;


// 同类别的，这样就不用根据不同的类名进行改变了

public class FactoryTest {

    /* 通过不同的type 进行创建 */
    @Test
    public void Simple_test(){
        SendFactory sf = new SendFactory();
        sf.produce("mail").Send();
        sf.produce("sms").Send();
    }

    /* 省去了传递字符串的烦恼，同时加固了函数的定制化 */
    @Test
    public void More_test(){
        Factory.MoreFactory.SendFactory mf  = new Factory.MoreFactory.SendFactory();
        mf.produceMail().Send();
        mf.produceSms().Send();
    }
    /* 由于纯粹只是构建，可以作为静态方法使用，省去实例化步骤 */
    @Test
    public void Static_test(){
        Factory.StaticFactory.SendFactory.produceMail().Send();
        Factory.StaticFactory.SendFactory.produceSms().Send();
    }
}
