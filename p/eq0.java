package p.eq0;
import p.tq0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import p.jr7;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Class;
import java.util.AbstractCollection;
import p.es3;
import p.uq0;
import java.util.Objects;
import p.fq7;
import p.eq7;

public abstract class eq0	// class@0014d6 from classes.dex
{
    public final tq0 a;
    public final ArrayList b;
    public final ArrayList c;
    public Object d;
    public fq7 e;

    public void eq0(tq0 p0){
       co5.o(p0, "tracker");
       super();
       this.a = p0;
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public abstract boolean a(jr7 p0);
    public abstract boolean b(Object p0);
    public final void c(Collection p0){
       co5.o(p0, "workSpecs");
       this.b.clear();
       this.c.clear();
       eq0 tb = this.b;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (this.a(obj)) {
             tb.add(obj);
          }
       }
       tb = this.c;
       iterator = this.b.iterator();
       while (iterator.hasNext()) {
          tb.add(iterator.next().a);
       }
       if (this.b.isEmpty()) {
          this.a.b(this);
       }else {
          eq0 ta = this.a;
          ta.getClass();
          tq0 c = ta.c;
          _monitor_enter(c);
          if (ta.d.add(this)) {
             if (ta.d.size() == 1) {
                ta.e = ta.a();
                Objects.toString(ta.e);
                es3.c().getClass();
                ta.d();
             }
             tq0 e = ta.e;
             this.d = e;
             this.d(this.e, e);
          }
          _monitor_exit(c);
       }
       this.d(this.e, this.d);
       return;
    }
    public final void d(fq7 p0,Object p1){
       if (this.b.isEmpty() || p0 == null) {
          return;
       }
       if (p1 != null && !this.b(p1)) {
          p0.b(this.b);
       }else {
          p1 = this.b;
          co5.o(p1, "workSpecs");
          fq7 c = p0.c;
          _monitor_enter(c);
          if ((p0 = p0.a) != null) {
             p0.c(p1);
          }
          _monitor_exit(c);
       }
       return;
    }
}
