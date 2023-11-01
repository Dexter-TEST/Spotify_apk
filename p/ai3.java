package p.ai3;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class ai3 implements Serializable	// class@000f8a from classes.dex
{
    public final int a;
    public final ConcurrentHashMap b;
    public int c;

    public void ai3(int p0,int p1){
       super();
       this.b = new ConcurrentHashMap(p0, 0x3f4ccccd, 4);
       this.a = p1;
    }
    private void readObject(ObjectInputStream p0){
       this.c = p0.readInt();
    }
    private void writeObject(ObjectOutputStream p0){
       p0.writeInt(this.c);
    }
    public final void a(Object p0,Serializable p1){
       if (this.b.size() >= this.a) {
          _monitor_enter(this);
          if (this.b.size() >= this.a) {
             this.b.clear();
          }
          _monitor_exit(this);
       }
       this.b.putIfAbsent(p0, p1);
       return;
    }
    public Object readResolve(){
       return new ai3(this.c, this.c);
    }
}
