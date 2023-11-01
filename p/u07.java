package p.u07;
import p.s07;
import p.we7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.te7;
import java.lang.Class;
import java.util.logging.Logger;
import java.util.ArrayList;
import p.t07;
import p.i07;
import java.lang.Thread;
import p.r07;
import java.lang.IllegalStateException;
import java.lang.System;
import java.util.Iterator;
import java.lang.Math;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Long;
import java.lang.Integer;

public final class u07	// class@00035a from classes2.dex
{
    public final s07 a;
    public int b;
    public boolean c;
    public long d;
    public final ArrayList e;
    public final ArrayList f;
    public final t07 g;
    public static final u07 h;
    public static final Logger i;

    static {
       String str = co5.K(" TaskRunner", we7.g);
       co5.o(str, "name");
       u07.h = new u07(new s07(new te7(str, true)));
       Logger logger = Logger.getLogger(u07.class.getName());
       co5.l(logger, "getLogger\(TaskRunner::class.java.name\)");
       u07.i = logger;
    }
    public void u07(s07 p0){
       super();
       this.a = p0;
       this.b = 0x2710;
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.g = new t07(this);
    }
    public static final void a(u07 p0,i07 p1){
       p0.getClass();
       Thread thread = Thread.currentThread();
       thread.setName(p1.a);
       _monitor_enter(p0);
       p0.b(p1, p1.a());
       _monitor_exit(p0);
       thread.setName(thread.getName());
    }
    public final void b(i07 p0,long p1){
       i07 c = p0.c;
       co5.i(c);
       boolean b = false;
       int i = (c.d == p0)? 1: 0;
       if (i) {
          r07 f = c.f;
          c.f = b;
          c.d = null;
          this.e.remove(c);
          if ((p1 - -1) && (f == null && c.c == null)) {
             c.e(p0, p1, true);
          }
          if ((c.e.isEmpty() ^ true)) {
             this.f.add(c);
          }
          return;
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final i07 c(){
       i07 oi07;
       u07 ou07 = this;
       byte[] a = we7.a;
       while (true) {
          u07 f = ou07.f;
          oi07 = null;
          if (f.isEmpty()) {
             return oi07;
          }
          u07 a1 = ou07.a;
          a1.getClass();
          long l = System.nanoTime();
          Iterator iterator = f.iterator();
          long l1 = Long.MAX_VALUE;
          i07 oi071 = oi07;
          while (true) {
             if (iterator.hasNext()) {
                i07 oi072 = iterator.next().e.get(0);
                long l2 = oi072.d - l;
                l2 = Math.max(0, l2);
                if ((l2) > 0) {
                   l1 = Math.min(l2, l1);
                }else if(oi071 != null){
                   iterator = 1;
                label_004f :
                   if (oi071 != null) {
                      oi071.d = -1;
                      oi07 = oi071.c;
                      co5.i(oi07);
                      oi07.e.remove(oi071);
                      f.remove(oi07);
                      oi07.d = oi071;
                      ou07.e.add(oi07);
                      if (iterator || (ou07.c == null || !((f.isEmpty() ^ 1)))) {
                         u07 g = ou07.g;
                         co5.o(g, "runnable");
                         a1.a.execute(g);
                         break ;
                      }
                      break ;
                   }else if(ou07.c != null){
                      if ((l1 - (ou07.d - l)) < 0) {
                         this.notify();
                      }
                   }else {
                      ou07.c = true;
                      l = l + l1;
                      ou07.d = l;
                      long l3 = 0xf4240;
                      try{
                         l = l1 / l3;
                         Long.signum(l);
                         l3 = l3 * l;
                         l3 = l1 - l3;
                         if ((l) > 0 || (l1) > 0) {
                            ou07.wait(l, (int)l3);
                         }
                      }catch(java.lang.InterruptedException e0){
                         this.d();
                      }
                      ou07.c = false;
                   }
                }else {
                   oi071 = oi072;
                }
             }else {
                iterator = 0;
                goto label_004f ;
             }
          }
          return oi071;
       }
       return oi07;
    }
    public final void d(){
       int i;
       int i1;
       u07 te = this.e;
       if ((i = te.size() - 1) >= 0) {
          while (true) {
             i1 = i - 1;
             te.get(i).b();
             if (i1 >= 0) {
                i = i1;
             }
          }
       }
       te = this.f;
       if ((i = te.size() - 1) >= 0) {
          while (true) {
             i1 = i - 1;
             r07 or07 = te.get(i);
             or07.b();
             if (or07.e.isEmpty()) {
                te.remove(i);
                break ;
             }else if(i1 < 0){
                i = i1;
             }
          }
       }
       return;
    }
    public final void e(r07 p0){
       u07 tf;
       co5.o(p0, "taskQueue");
       if (p0.d == null) {
          tf = this.f;
          if ((p0.e.isEmpty() ^ 0x01)) {
             co5.o(tf, "<this>");
             if (!tf.contains(p0)) {
                tf.add(p0);
             }
          }else {
             tf.remove(p0);
          }
       }
       u07 ta = this.a;
       if (this.c != null) {
          ta.getClass();
          this.notify();
       }else {
          ta.getClass();
          tf = this.g;
          co5.o(tf, "runnable");
          ta.a.execute(tf);
       }
       return;
    }
    public final r07 f(){
       _monitor_enter(this);
       u07 tb = this.b;
       this.b = tb + 1;
       _monitor_exit(this);
       return new r07(this, co5.K(Integer.valueOf(tb), "Q"));
    }
}
