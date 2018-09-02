package AbstractFactory;

import org.junit.Test;

public class AbstractFactory {
    /* 当某些类的实例化比较频繁的时候，那工厂方法应该是独立的，更易于维护 */
    @Test
    public void x_test(){
        SendSmsFactory ssf = new SendSmsFactory();
        SendMailFactory smf = new SendMailFactory();
        ssf.produce().Send();
        smf.produce().Send();
    }
}
