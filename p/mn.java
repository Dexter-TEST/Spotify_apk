package p.mn;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import p.ln;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import p.en6;
import java.lang.IllegalStateException;
import java.lang.String;
import p.nc4;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.av7;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;
import java.lang.Thread;
import p.ht7;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import p.w51;

public abstract class mn	// class@001ed0 from classes.dex
{
    public int a;
    public pq3 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Executor g;
    public ln h;
    public ln i;

    public void mn(SignInHubActivity p0){
       super();
       this.c = false;
       this.d = false;
       this.e = true;
       this.f = false;
       p0.getApplicationContext();
       this.g = ln.y;
    }
    public final void a(){
       if (this.h != null) {
          boolean b = true;
          if (this.c == null) {
             this.f = b;
          }
          if (this.i != null) {
             this.h.getClass();
             this.h = null;
          }else {
             this.h.getClass();
             mn th = this.h;
             th.t.set(b);
             if (th.b.cancel(false)) {
                this.i = this.h;
             }
             this.h = null;
          }
       }
       return;
    }
    public final void b(){
       int i1;
       if (this.i == null && this.h != null) {
          this.h.getClass();
          mn th = this.h;
          mn tg = this.g;
          int i = 2;
          if (th.c != 1) {
             if ((i1 = en6.A(th.c)) != 1) {
                if (i1 != i) {
                   throw new IllegalStateException("We should never reach this state");
                }else {
                   throw new IllegalStateException("Cannot execute task: the task has already been executed \(a task can be executed only once\)");
                }
             }else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
             }
          }else {
             th.c = i;
             th.a.b = null;
             tg.execute(th.b);
          }
       }
       return;
    }
    public final void c(){
       av7 uoav7 = this;
       Iterator iterator = uoav7.k.iterator();
       if (!iterator.hasNext()) {
          try{
             uoav7.j.tryAcquire(0, 5, TimeUnit.SECONDS);
          }catch(java.lang.InterruptedException e0){
             Thread.currentThread().interrupt();
          }
          return;
       }else {
          iterator.next().getClass();
          throw new UnsupportedOperationException();
       }
    }
    public final String d(){
       StringBuilder str = new StringBuilder(64);
       w51.a(this, str);
       return en6.o(str+" id=", this.a, "}");
    }
    public final String toString(){
       return this.d();
    }
}
