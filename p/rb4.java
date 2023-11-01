package p.rb4;
import p.vc1;
import p.b7;
import java.lang.Object;
import java.lang.Iterable;
import p.xo0;
import p.er7;
import java.util.concurrent.CopyOnWriteArrayList;
import p.nb4;
import p.ob1;
import p.hr0;
import p.ap0;
import p.xn5;
import p.or7;
import p.wb4;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p.in7;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.w42;

public final class rb4 implements vc1	// class@0024b4 from classes.dex
{
    public int A;
    public final ob1 a;
    public final ob1 b;
    public final ob1 c;
    public final ob1 t;
    public final or7 v;
    public final ap0 w;
    public final xn5 x;
    public final CopyOnWriteArrayList y;
    public Object z;

    public void rb4(b7 p0,Object p1,Iterable p2,xo0 p3,xo0 p4,er7 p5,er7 p6){
       super();
       this.y = new CopyOnWriteArrayList();
       int i = 1;
       this.A = i;
       ob1 oob1 = new ob1(new nb4(this, 0), null);
       this.a = oob1;
       ob1 oob11 = new ob1(new nb4(this, i), null);
       this.b = oob11;
       this.x = new xn5();
       nb4 onb4 = new nb4(this, 2);
       this.c = new ob1(p5, oob1);
       ob1 oob12 = new ob1(p6, oob11);
       this.t = oob12;
       this.v = new or7(p0.b, oob12, onb4);
       nb4 onb41 = new nb4(this, 3);
       this.w = p3.d(onb41);
       this.z = p1;
       onb4.accept(p1);
       p1 = p2.iterator();
       while (p1.hasNext()) {
          this.t.accept(p1.next());
       }
       p1 = this.x;
       ap0 uoap0 = p4.d(onb41);
       xn5 b = p1.b;
       if (b.get() != xn5.c) {
          while (true) {
             xn5 a = p1.a;
             if (!b.compareAndSet(a, uoap0)) {
                if (b.get() != a) {
                   i = 0;
                }
             }
             if (i) {
                a.a();
                break ;
             }else {
                throw new IllegalStateException("Attempt at setting the active delegate twice");
             }
          }
       }
       return;
    }
    public final void a(Object p0){
       int i = 3;
       if (this.A != i) {
          if (this.A == 2) {
             return;
          }
          try{
             p0.getClass();
             this.c.accept(p0);
             return;
          }catch(java.lang.RuntimeException e0){
             throw new IllegalStateException("Exception processing event: "+p0, e0);
          }
       }else {
          Object[] objArray = new Object[i];
          objArray[0] = p0.getClass().getName();
          objArray[1] = p0;
          objArray[2] = this.z;
          throw new IllegalStateException(String.format("This loop has already been disposed. You cannot dispatch events after disposal - event received: %s=%s, currentModel: %s", objArray));
       }
    }
    public final void b(hr0 p0){
       rb4 tz;
       if (this.A == 3) {
          throw new IllegalStateException("This loop has already been disposed. You cannot observe a disposed loop");
       }
       if (this.A == 2) {
          return;
       }
       w42 ow42 = new w42(p0);
       this.y.add(ow42);
       if ((tz = this.z) != null && ow42.b == 1) {
          ow42.a(tz, false);
       }
       return;
    }
    public synchronized final void dispose(){
       if (this.A == 3) {
          return;
       }
       this.A = 2;
       this.y.clear();
       this.a.dispose();
       this.b.dispose();
       this.x.dispose();
       this.w.dispose();
       this.c.dispose();
       this.t.dispose();
       this.A = 3;
       return;
    }
}
