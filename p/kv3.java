package p.kv3;
import java.lang.Iterable;
import p.ch3;
import java.lang.Object;
import java.util.Iterator;
import p.lv3;

public abstract class kv3 implements Iterable, ch3	// class@001c8e from classes.dex
{
    public final long a;
    public final long b;
    public final long c;

    public void kv3(long p0,long p1){
       super();
       this.a = p0;
       if ((p0 - p1) >= 0) {
       }else {
          long l = p1 % 1;
          if ((l) < 0) {
             l = l + 1;
          }
          p0 = p0 % 1;
          if ((p0) < 0) {
             p0 = p0 + 1;
          }
          l = (l - p0) % 1;
          if ((l) < 0) {
             l = l + 1;
          }
          p1 = p1 - l;
       }
       this.b = p1;
       this.c = 1;
       return;
    }
    public final Iterator iterator(){
       lv3 v7 = new lv3(this.a, this.b, this.c);
       return v7;
    }
}
