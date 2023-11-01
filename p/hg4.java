package p.hg4;
import java.util.Iterator;
import p.ch3;
import p.ig4;
import java.lang.Object;
import p.jo6;
import java.lang.String;
import p.co5;
import p.gg4;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public final class hg4 implements Iterator, ch3	// class@001848 from classes.dex
{
    public int a;
    public boolean b;
    public final ig4 c;

    public void hg4(ig4 p0){
       this.c = p0;
       super();
       this.a = -1;
    }
    public final boolean hasNext(){
       int i = 1;
       if (((this.a + i)) < this.c.B.g()) {
       }else {
          i = false;
       }
       return i;
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = true;
       int i = this.a + true;
       this.a = i;
       Object obj = this.c.B.h(i);
       co5.l(obj, "nodes.valueAt\(++index\)");
       return obj;
    }
    public final void remove(){
       if (this.b == null) {
          throw new IllegalStateException("You must call next\(\) before you can remove an element".toString());
       }
       ig4 b = this.c.B;
       b.h(this.a).b = null;
       hg4 ta = this.a;
       jo6 c = b.c;
       Object v = jo6.v;
       if (c[ta] != v) {
          c[ta] = v;
          b.a = true;
       }
       this.a = ta - 1;
       this.b = false;
       return;
    }
}
