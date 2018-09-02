package Builder.SimpleBuilder;

import Factory.SimpleFactory.MailSender;
import Factory.SimpleFactory.Sender;
import Factory.SimpleFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {
  private List<Sender> list = new ArrayList<Sender>();

  public void produceMailSender(int count){
    for(int i=0;i<count;i++){
      list.add(new MailSender());
    }
  }

  public void produceSmsSender(int count){
    for(int i =0;i<count;i++){
      list.add(new SmsSender());
    }
  }
}

// 建造者模式就是将很多功能集成到一个类里，这个类可以创造出比较复杂的东西
// 工厂是相对于单个对象而言的，而建造者是相对于功能而言，是建立在抽象对象之上的
