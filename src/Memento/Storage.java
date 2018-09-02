package Memento;

public class Storage {
  private Memento memento;

  public Storage(Memento memento) {
    this.memento = memento;
  }

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }

}


// 备份 - 恢复 模式，跟redux 很像，通过getState()的形式获取 数据结构
// 这里的create 有点像快照的意思
