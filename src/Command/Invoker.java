package Command;

public class Invoker {
  private Command command;

  public Invoker(Command command){
    this.command = command;
  }
  public void action(){
    command.exe();
  }
}

// 命令模式就是发出者 和 执行者 之间解耦。
