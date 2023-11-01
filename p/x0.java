package p.x0;
import p.am3;
import p.w0;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import java.lang.Class;
import java.util.logging.Logger;
import p.t0;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.s0;
import java.lang.Object;
import p.v0;
import java.util.logging.Level;
import java.lang.Throwable;
import p.ty0;
import java.util.concurrent.locks.LockSupport;
import p.u0;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.StringBuilder;
import p.q0;
import java.util.concurrent.Future;
import p.r0;
import java.lang.IllegalArgumentException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p.en6;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.lang.InterruptedException;
import java.util.Locale;
import p.kg4;
import java.util.concurrent.TimeoutException;

public abstract class x0 implements am3	// class@002be6 from classes.dex
{
    public Object a;
    public s0 b;
    public w0 c;
    public static final boolean t;
    public static final Logger v;
    public static final ty0 w;
    public static final Object x;

    static {
       x0.t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
       x0 ox0 = x0.class;
       x0.v = Logger.getLogger(ox0.getName());
       t0 v2 = new t0(AtomicReferenceFieldUpdater.newUpdater(w0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w0.class, w0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ox0, w0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ox0, s0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ox0, Object.class, "a"));
       Throwable throwable = null;
       x0.w = v2;
       if (throwable) {
          x0.v.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable);
       }
       x0.x = new Object();
    }
    public void x0(){
       super();
    }
    public static void c(x0 p0){
       w0 a;
       s0 os0;
       x0 ox0;
       s0 c1;
       int i = 0;
       while (true) {
          x0 c = p0.c;
          if (x0.w.f(p0, c, w0.c)) {
             while (c != null) {
                if ((a = c.a) != null) {
                   c.a = null;
                   LockSupport.unpark(a);
                }
                c = c.b;
             }
             do {
                c = p0.b;
             } while (x0.w.d(p0, c, s0.d));
             while (true) {
                os0 = i;
                if ((ox0 = c) != null) {
                   c1 = ox0.c;
                   ox0.c = os0;
                }else {
                   break ;
                }
             }
             while (os0 != null) {
                i = os0.c;
                c1 = os0.a;
                if (c1 instanceof u0) {
                   u0 a1 = c1.a;
                   if (a1.a == c1 && x0.w.e(a1, c1, x0.f(c1.b))) {
                      continue ;
                   }
                }else {
                   x0.d(c1, os0.b);
                }
                os0 = i;
             }
             return;
          }
       }
    }
    public static void d(Runnable p0,Executor p1){
       try{
          p1.execute(p0);
       }catch(java.lang.RuntimeException e0){
          x0.v.log(Level.SEVERE, "RuntimeException while executing runnable "+p0+" with executor "+p1, e0);
       }
       return;
    }
    public static Object f(am3 p0){
       if (p0 instanceof x0) {
          x0 a = p0.a;
          if (a instanceof q0) {
             x0 ox0 = a;
             if (ox0.a != null) {
                a = (ox0.b != null)? new q0(ox0.b, false): q0.d;
             }
          }
          return a;
       }else if(((x0.t ^ 1) & p0.isCancelled())){
          return q0.d;
       }else {
          int i = 0;
          try{
          label_0032 :
             Object obj = p0.get();
             if (i) {
                Thread.currentThread().interrupt();
             }
             if (obj == null) {
                obj = x0.x;
             }
             return obj;
          }catch(java.lang.InterruptedException e0){
             i = 1;
             goto label_0032 ;
          }catch(java.util.concurrent.ExecutionException e5){
             return new r0(e5.getCause());
          }catch(java.util.concurrent.CancellationException e2){
             if (!p0.isCancelled()) {
                return new r0(new IllegalArgumentException("get\(\) threw CancellationException, despite reporting isCancelled\(\) == false: "+p0, e2));
             }else {
                return new q0(e2, false);
             }
          }
       }
    }
    public final void a(Runnable p0,Executor p1){
       p0.getClass();
       p1.getClass();
       x0 tb = this.b;
       s0 d = s0.d;
       if (tb != d) {
          s0 os0 = new s0(p0, p1);
          while (true) {
             os0.c = tb;
             if (x0.w.d(this, tb, os0)) {
                return;
             }
             if ((tb = this.b) != d) {
             }
          }
       }
       x0.d(p0, p1);
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
       q0 oq0;
       x0 ta = this.a;
       boolean b = true;
       int i = (ta == null)? 1: 0;
       if ((i | ta instanceof u0)) {
          if (x0.t) {
             oq0 = new q0(new CancellationException("Future.cancel\(\) was called."), p0);
          }else if(p0){
             oq0 = q0.c;
          }else {
             oq0 = q0.d;
          }
          int i1 = 0;
          x0 ox0 = this;
          while (true) {
             if (x0.w.e(ox0, ta, oq0)) {
                x0.c(ox0);
                if (ta instanceof u0) {
                   u0 b1 = ta.b;
                   if (b1 instanceof x0) {
                      ox0 = b1;
                      i1 = ((ta = ox0.a) == null)? 1: 0;
                      if (i1 = i1 | ta instanceof u0) {
                         i1 = 1;
                      }
                   }else {
                      b1.cancel(p0);
                      break ;
                   }
                }
             }else {
                ta = ox0.a;
                if (!ta instanceof u0) {
                   b = i1;
                   break ;
                }
             }
          }
       }else {
          b = false;
       }
       return b;
    }
    public final Object e(Object p0){
       if (!p0 instanceof q0) {
          if (p0 instanceof r0) {
             throw new ExecutionException(p0.a);
          }
          if (p0 == x0.x) {
             p0 = null;
          }
          return p0;
       }else {
          CancellationException uCancellatio = new CancellationException("Task was cancelled.");
          uCancellatio.initCause(p0.b);
          throw uCancellatio;
       }
    }
    public final String g(){
       u0 b;
       x0 ta = this.a;
       if (ta instanceof u0) {
          String str = "setFuture=[";
          String str1 = ((b = ta.b) == this)? "this future": String.valueOf(b);
          return en6.p(str, str1, "]");
       }else if(this instanceof ScheduledFuture){
          return "remaining delay=["+this.getDelay(TimeUnit.MILLISECONDS)+" ms]";
       }else {
          return null;
       }
    }
    public final Object get(){
       x0 ta;
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       int i = ((ta = this.a) != null)? 1: 0;
       if ((i & (ta instanceof u0 ^ 1))) {
          return this.e(ta);
       }else {
          ta = this.c;
          w0 c = w0.c;
          if (ta != c) {
             w0 ow0 = new w0();
             do {
                ty0 w = x0.w;
                w.t(ow0, ta);
                if (w.f(this, ta, ow0)) {
                label_0030 :
                   LockSupport.park(this);
                   if (!Thread.interrupted()) {
                      i = ((ta = this.a) != null)? 1: 0;
                      int i1 = ta instanceof u0 ^ 1;
                      if (i = i & i1) {
                         return this.e(ta);
                      }else {
                         goto label_0030 ;
                      }
                   }else {
                      this.h(ow0);
                      throw new InterruptedException();
                   }
                }
             } while ((ta = this.c) == c);
          }
          return this.e(this.a);
       }
    }
    public final Object get(long p0,TimeUnit p1){
       w0 c;
       x0 a1;
       int i4;
       x0 ox01;
       x0 ox02;
       long l3;
       TimeUnit timeUnit1;
       x0 a2;
       x0 ox0 = this;
       long l = p0;
       TimeUnit timeUnit = p1;
       long l1 = timeUnit.toNanos(l);
       if (Thread.interrupted()) {
          throw new InterruptedException();
       }
       x0 a = ox0.a;
       int i = 1;
       int i1 = (a != null)? 1: 0;
       int i2 = a instanceof u0 ^ i;
       if (i1 = i1 & i2) {
          return ox0.e(a);
       }else {
          i1 = 0;
          long l2 = ((l1 - i1) > 0)? System.nanoTime() + l1: i1;
          if ((l1 - 1000) >= 0) {
             a = ox0.c;
             c = w0.c;
             if (a != c) {
                w0 ow0 = new w0();
                do {
                   ty0 w = x0.w;
                   w.t(ow0, a);
                   if (w.f(ox0, a, ow0)) {
                      while (true) {
                         LockSupport.parkNanos(ox0, l1);
                         if (!Thread.interrupted()) {
                            int i3 = ((a1 = ox0.a) != null)? 1: 0;
                            i4 = a1 instanceof u0 ^ i;
                            if (i3 = i3 & i4) {
                            }else {
                               l1 = l2 - System.nanoTime();
                               if ((l1 - 1000) < 0) {
                                  ox0.h(ow0);
                                  ox01 = ox0;
                                  ox02 = ox01;
                                  l3 = l1;
                                  timeUnit1 = timeUnit;
                               label_00b3 :
                                  c = 0;
                               }else {
                                  continue ;
                               }
                            }
                         }else {
                            ox0.h(ow0);
                            throw new InterruptedException();
                         }
                      }
                      return ox0.e(a1);
                   }
                } while ((a = ox0.c) == c);
             }
             return ox0.e(ox0.a);
          }else {
             ox01 = ox0;
             ox02 = ox01;
             l3 = l1;
             timeUnit1 = timeUnit;
          }
          if ((l3 - c) > 0) {
             i4 = ((a2 = ox02.a) != null)? 1: 0;
             i1 = a2 instanceof u0 ^ i;
             if (i4 = i4 & i1) {
                return ox02.e(a2);
             }else if(!Thread.interrupted()){
                l3 = l2 - System.nanoTime();
                goto label_00b3 ;
             }else {
                throw new InterruptedException();
             }
          }else {
             String str = ox01.toString();
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
             if (ox01.isDone()) {
                throw new TimeoutException(kg4.l(str3, " but future completed as timeout expired"));
             }else {
                throw new TimeoutException(str3+" for "+str);
             }
          }
       }
    }
    public final void h(w0 p0){
       x0 tc;
       p0.a = null;
       while (true) {
          if ((tc = this.c) == w0.c) {
          }else {
             Thread thread = null;
             while (true) {
                if (tc == null) {
                   return;
                }
                w0 b = tc.b;
                if (tc.a != null) {
                   thread = tc;
                }else if(thread != null){
                   thread.b = b;
                   if (thread.a == null) {
                   }
                }else if(!x0.w.f(this, tc, b)){
                   continue ;
                }
                tc = b;
             }
             return;
          }
       }
    }
    public final boolean isCancelled(){
       return this.a instanceof q0;
    }
    public final boolean isDone(){
       x0 ta;
       int i = ((ta = this.a) != null)? 1: 0;
       return ((ta instanceof u0 ^ 1) & i);
    }
    public final String toString(){
       String str1;
       StringBuilder str = super.toString()+"[status=";
       if (this.a instanceof q0) {
          str = str+"CANCELLED";
       }else if(this.isDone()){
          try{
             str1 = this.g();
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
