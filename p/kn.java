package p.kn;
import p.jn;
import p.uf;
import p.xe0;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import java.util.Iterator;
import p.el3;
import java.lang.Class;
import p.xl3;
import p.in;

public final class kn	// class@001c4d from classes.dex
{
    public final xl3 a;
    public final xe0 b;
    public final Executor c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;
    public static final jn h;

    static {
       kn.h = new jn();
    }
    public void kn(uf p0,xe0 p1){
       xe0 b;
       super();
       this.d = new CopyOnWriteArrayList();
       this.f = Collections.emptyList();
       this.a = p0;
       this.b = p1;
       this.c = ((b = p1.b) != null)? b: kn.h;
       return;
    }
    public final void a(Runnable p0){
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a.getClass();
       }
       if (p0 != null) {
          p0.run();
       }
       return;
    }
    public final void b(List p0,Runnable p1){
       int i = this.g + 1;
       this.g = i;
       kn te = this.e;
       if (p0 == te) {
          if (p1 != null) {
             p1.run();
          }
          return;
       }else {
          int i1 = 0;
          kn ta = this.a;
          if (p0 == null) {
             this.e = null;
             this.f = Collections.emptyList();
             ta.d(i1, te.size());
             this.a(p1);
             return;
          }else if(te == null){
             this.e = p0;
             this.f = Collections.unmodifiableList(p0);
             ta.k(i1, p0.size());
             this.a(p1);
             return;
          }else {
             in v7 = new in(this, te, p0, i, p1);
             this.b.c.execute(v7);
             return;
          }
       }
    }
}
