package p.n2;
import p.am3;
import p.m2;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import java.lang.Class;
import java.util.logging.Logger;
import p.k2;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.j2;
import java.lang.Object;
import p.l2;
import java.util.logging.Level;
import java.lang.Throwable;
import p.lv1;
import java.util.concurrent.locks.LockSupport;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.StringBuilder;
import p.g2;
import java.util.concurrent.CancellationException;
import p.i2;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import p.kg4;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Delayed;

public abstract class n2 implements am3	// class@001f57 from classes.dex
{
    public Object a;
    public j2 b;
    public m2 c;
    public static final boolean t;
    public static final Logger v;
    public static final lv1 w;
    public static final Object x;

    static {
       n2.t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
       n2 on2 = n2.class;
       n2.v = Logger.getLogger(on2.getName());
       k2 v2 = new k2(AtomicReferenceFieldUpdater.newUpdater(m2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m2.class, m2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(on2, m2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(on2, j2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(on2, Object.class, "a"));
       Throwable throwable = null;
       n2.w = v2;
       if (throwable) {
          n2.v.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable);
       }
       n2.x = new Object();
    }
    public void n2(){
       super();
    }
    public static void c(n2 p0){
       n2 c;
       Thread thread;
       m2 a;
       Thread thread1;
       n2 on2;
       do {
          c = p0.c;
       } while (n2.w.h(p0, c, m2.c));
       while (true) {
          thread = null;
          if (c != null) {
             if ((a = c.a) != null) {
                c.a = thread;
                LockSupport.unpark(a);
             }
             c = c.b;
          }else {
             break ;
          }
       }
       do {
          c = p0.b;
       } while (n2.w.f(p0, c, j2.d));
       while (true) {
          thread1 = thread;
          if ((on2 = c) != null) {
             j2 c1 = on2.c;
             on2.c = thread1;
          }else {
             break ;
          }
       }
       for (; thread1 != null; thread1 = thread1.c) {
          n2.d(thread1.a, thread1.b);
       }
       return;
    }
    public static void d(Runnable p0,Executor p1){
       try{
          p1.execute(p0);
       }catch(java.lang.RuntimeException e0){
          n2.v.log(Level.SEVERE, "RuntimeException while executing runnable "+p0+" with executor "+p1, e0);
       }
       return;
    }
    public final void a(Runnable p0,Executor p1){
       p1.getClass();
       n2 tb = this.b;
       j2 d = j2.d;
       if (tb != d) {
          j2 oj2 = new j2(p0, p1);
          while (true) {
             oj2.c = tb;
             if (n2.w.f(this, tb, oj2)) {
                return;
             }
             if ((tb = this.b) != d) {
             }
          }
       }
       n2.d(p0, p1);
       return;
    }
    public final void b(StringBuilder p0){
       int i = 0;
       try{
       label_0003 :
          Object obj = this.get();
          if (i) {
             Thread.currentThread().interrupt();
          label_0010 :
             p0 = p0+"SUCCESS, result=[";
             String str = (obj == this)? "this future": String.valueOf(obj);
             p0+str+"]";
          }else {
             goto label_0010 ;
          }
       }catch(java.lang.InterruptedException e0){
          i = 1;
          goto label_0003 ;
       }catch(java.util.concurrent.ExecutionException e1){
          p0+"FAILURE, cause=["+e1.getCause()+"]";
       }catch(java.util.concurrent.CancellationException e0){
          p0+"CANCELLED";
       }catch(java.lang.RuntimeException e0){
          p0+"UNKNOWN, cause=["+e0.getClass()+" thrown from get\(\)]";
       }
       return;
    }
    public final boolean cancel(boolean p0){
       g2 og2;
       n2 ta = this.a;
       boolean b = true;
       int i = (ta == null)? 1: 0;
       if ((i | 0)) {
          if (n2.t) {
             og2 = new g2(new CancellationException("Future.cancel\(\) was called."), p0);
          }else if(p0){
             og2 = g2.b;
          }else {
             og2 = g2.c;
          }
          if (n2.w.g(this, ta, og2)) {
             n2.c(this);
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public final Object e(Object p0){
       if (!p0 instanceof g2) {
          if (!p0 instanceof i2) {
             if (p0 == n2.x) {
                p0 = null;
             }
             return p0;
          }else {
             p0.getClass();
             throw new ExecutionException(null);
          }
       }else {
          CancellationException uCancellatio = new CancellationException("Task was cancelled.");
          uCancellatio.initCause(p0.a);
          throw uCancellatio;
       }
    }
    public final void f(m2 p0){
       n2 tc;
       p0.a = null;
       while (true) {
          if ((tc = this.c) == m2.c) {
          }else {
             Thread thread = null;
             while (true) {
                if (tc == null) {
                   return;
                }
                m2 b = tc.b;
                if (tc.a != null) {
                   thread = tc;
                }else if(thread != null){
                   thread.b = b;
                   if (thread.a == null) {
                   }
                }else if(!n2.w.h(this, tc, b)){
                   continue ;
                }
                tc = b;
             }
             return;
          }
       }
    }
    public final Object get(){
       n2 ta;
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       int i = ((ta = this.a) != null)? 1: 0;
       if ((i & 1)) {
          return this.e(ta);
       }else {
          ta = this.c;
          m2 c = m2.c;
          if (ta != c) {
             m2 om2 = new m2();
             do {
                lv1 w = n2.w;
                w.E(om2, ta);
                if (w.h(this, ta, om2)) {
                label_002d :
                   LockSupport.park(this);
                   if (!Thread.interrupted()) {
                      i = ((ta = this.a) != null)? 1: 0;
                      if (i = i & 1) {
                         return this.e(ta);
                      }else {
                         goto label_002d ;
                      }
                   }else {
                      this.f(om2);
                      throw new InterruptedException();
                   }
                }
             } while ((ta = this.c) == c);
          }
          return this.e(this.a);
       }
    }
    public final Object get(long p0,TimeUnit p1){
       m2 c;
       n2 a1;
       n2 on21;
       n2 on22;
       long l3;
       TimeUnit timeUnit1;
       n2 a2;
       n2 on2 = this;
       long l = p0;
       TimeUnit timeUnit = p1;
       long l1 = timeUnit.toNanos(l);
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       n2 a = on2.a;
       int i = 1;
       int i1 = (a != null)? 1: 0;
       if (i1 = i1 & i) {
          return on2.e(a);
       }else {
          i1 = 0;
          long l2 = ((l1 - i1) > 0)? System.nanoTime() + l1: i1;
          if ((l1 - 1000) >= 0) {
             a = on2.c;
             c = m2.c;
             if (a != c) {
                m2 om2 = new m2();
                do {
                   lv1 w = n2.w;
                   w.E(om2, a);
                   if (w.h(on2, a, om2)) {
                      while (true) {
                         LockSupport.parkNanos(on2, l1);
                         if (!Thread.interrupted()) {
                            int i2 = ((a1 = on2.a) != null)? 1: 0;
                            if (i2 = i2 & i) {
                            }else {
                               l1 = l2 - System.nanoTime();
                               if ((l1 - 1000) < 0) {
                                  on2.f(om2);
                                  on21 = on2;
                                  on22 = on21;
                                  l3 = l1;
                                  timeUnit1 = timeUnit;
                               label_00aa :
                                  c = 0;
                               }else {
                                  continue ;
                               }
                            }
                         }else {
                            on2.f(om2);
                            throw new InterruptedException();
                         }
                      }
                      return on2.e(a1);
                   }
                } while ((a = on2.c) == c);
             }
             return on2.e(on2.a);
          }else {
             on21 = on2;
             on22 = on21;
             l3 = l1;
             timeUnit1 = timeUnit;
          }
          if ((l3 - c) > 0) {
             int i3 = ((a2 = on22.a) != null)? 1: 0;
             if (i3 = i3 & i) {
                return on22.e(a2);
             }else if(!Thread.interrupted()){
                l3 = l2 - System.nanoTime();
                goto label_00aa ;
             }else {
                throw new InterruptedException();
             }
          }else {
             String str = on21.toString();
             Locale rOOT = Locale.ROOT;
             String str1 = timeUnit.toString().toLowerCase(rOOT);
             String str2 = " ";
             String str3 = "Waited "+l+str2+timeUnit.toString().toLowerCase(rOOT);
             if (((l3 + 1000)) < 0) {
                str3 = kg4.l(str3, " \(plus ");
                l3 = - l3;
                long l4 = timeUnit1.convert(l3, TimeUnit.NANOSECONDS);
                l3 = l3 - timeUnit1.toNanos(l4);
                timeUnit = ((v11 = l4) && (l3 - 1000) <= 0)? 0: 1;
                if (v11 > 0) {
                   str3 = str3+l4+str2+str1;
                   if (timeUnit) {
                      str3 = kg4.l(str3, ",");
                   }
                   str3 = kg4.l(str3, str2);
                }
                if (timeUnit) {
                   str3 = str3+l3+" nanoseconds ";
                }
                str3 = kg4.l(str3, "delay\)");
             }
             if (on21.isDone()) {
                throw new TimeoutException(kg4.l(str3, " but future completed as timeout expired"));
             }else {
                throw new TimeoutException(str3+" for "+str);
             }
          }
       }
    }
    public final boolean isCancelled(){
       return this.a instanceof g2;
    }
    public final boolean isDone(){
       int i = (this.a != null)? 1: 0;
       return (i & 1);
    }
    public final String toString(){
       String str1;
       StringBuilder str = super.toString()+"[status=";
       if (this.a instanceof g2) {
          str = str+"CANCELLED";
       }else if(this.isDone()){
          try{
             str1 = (this instanceof ScheduledFuture)? "remaining delay=["+this.getDelay(TimeUnit.MILLISECONDS)+" ms]": null;
          }catch(java.lang.RuntimeException e1){
             str1 = "Exception thrown from implementation: "+e1.getClass();
          }
          if (str1 != null && !str1.isEmpty()) {
             str = str+"PENDING, info=["+str1+"]";
          }else if(this.isDone()){
             this.b(str);
          }else {
             str = str+"PENDING";
          }
       }
       return str+"]";
    }
}
