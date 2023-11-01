package p.nb4;
import p.hr0;
import p.rb4;
import java.lang.Object;
import p.xn5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.ap0;
import p.ep0;
import java.lang.Throwable;
import p.or7;
import p.wb4;
import p.xt;
import java.lang.Iterable;

public final class nb4 implements hr0	// class@001fa5 from classes.dex
{
    public final int a;
    public final rb4 b;

    public void nb4(rb4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
             rb4 v = this.b.v;
             _monitor_enter(v);
             p0 = v.a.a(p0);
             if (p0.b()) {
                v.c.accept(p0.c());
             }
             p0 = p0.b.iterator();
             while (p0.hasNext()) {
                v.b.accept(p0.next());
             }
             _monitor_exit(v);
             return;
             break;
           case 1:
           case 2:
             this.b.z = p0;
             this.b.x.accept(p0);
             Iterator iterator = this.b.y.iterator();
             while (iterator.hasNext()) {
                iterator.next().accept(p0);
             }
             return;
             break;
           default:
             this.b.a(p0);
             return;
       }
       this.b.w.accept(p0);
       return;
    }
}
