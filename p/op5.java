package p.op5;
import p.u07;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.r07;
import p.we7;
import p.zb1;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.y7;
import p.lp5;
import java.util.List;
import java.util.Iterator;
import p.np5;
import java.util.ArrayList;
import java.lang.ref.Reference;
import p.jp5;
import java.lang.StringBuilder;
import p.mz5;
import p.re5;

public final class op5	// class@0002e9 from classes2.dex
{
    public final int a;
    public final long b;
    public final r07 c;
    public final zb1 d;
    public final ConcurrentLinkedQueue e;

    public void op5(u07 p0,TimeUnit p1){
       co5.o(p0, "taskRunner");
       co5.o(p1, "timeUnit");
       super();
       this.a = 5;
       this.b = p1.toNanos(5);
       this.c = p0.f();
       this.d = new zb1(1, this, co5.K(" ConnectionPool", we7.g));
       this.e = new ConcurrentLinkedQueue();
    }
    public final boolean a(y7 p0,lp5 p1,List p2,boolean p3){
       np5 onp5;
       co5.o(p0, "address");
       co5.o(p1, "call");
       Iterator iterator = this.e.iterator();
       while (true) {
          boolean b = false;
          if (!iterator.hasNext()) {
             return b;
          }
          onp5 = iterator.next();
          co5.l(onp5, "connection");
          _monitor_enter(onp5);
          if (p3) {
             if (onp5.g != null) {
                b = 1;
             }
             if (!b) {
             label_0034 :
                _monitor_exit(onp5);
             }
          }
          if (!onp5.i(p0, p2)) {
             goto label_0034 ;
          }else {
             break ;
          }
       }
       p1.c(onp5);
       _monitor_exit(onp5);
       return true;
    }
    public final int b(np5 p0,long p1){
       np5 p = p0.p;
       int i = 0;
       while (true) {
          if (i >= p.size()) {
             return p.size();
          }
          Reference reference = p.get(i);
          if (reference.get() != null) {
             i = i + 1;
          }else {
             re5.a.j(reference.a, "A connection to ".append(p0.b.a.i).append(" was leaked. Did you forget to close a response body?").toString());
             p.remove(i);
             p0.j = true;
             if (p.isEmpty()) {
                break ;
             }
          }
       }
       p0.q = p1 - this.b;
       return 0;
    }
    public final void c(np5 p0){
       this.e.add(p0);
       r07.d(this.c, this.d);
    }
}
