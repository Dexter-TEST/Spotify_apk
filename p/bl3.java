package p.bl3;
import java.util.Iterator;
import p.dl3;
import java.lang.Object;
import p.cl3;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public abstract class bl3 implements Iterator	// class@0010e8 from classes.dex
{
    public cl3 a;
    public cl3 b;
    public int c;
    public final dl3 t;

    public void bl3(dl3 p0){
       this.t = p0;
       super();
       this.a = p0.v.t;
       this.b = null;
       this.c = p0.t;
    }
    public final cl3 a(){
       bl3 ta = this.a;
       bl3 tt = this.t;
       if (ta == tt.v) {
          throw new NoSuchElementException();
       }
       if (tt.t != this.c) {
          throw new ConcurrentModificationException();
       }
       this.a = ta.t;
       this.b = ta;
       return ta;
    }
    public final boolean hasNext(){
       boolean b = (this.a != this.t.v)? true: false;
       return b;
    }
    public final void remove(){
       bl3 tb;
       if ((tb = this.b) == null) {
          throw new IllegalStateException();
       }
       bl3 tt = this.t;
       tt.d(tb, true);
       this.b = null;
       this.c = tt.t;
       return;
    }
}
