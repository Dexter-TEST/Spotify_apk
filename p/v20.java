package p.v20;
import java.util.Iterator;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w20;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import p.gr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.ArrayBlockingQueue;
import io.reactivex.rxjava3.core.Notification;
import p.yj4;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import p.ed1;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public final class v20 implements Iterator	// class@002967 from classes.dex
{
    public final w20 a;
    public final ObservableSource b;
    public Object c;
    public boolean t;
    public boolean v;
    public Throwable w;
    public boolean x;

    public void v20(ObservableSource p0,w20 p1){
       super();
       this.t = true;
       this.v = true;
       this.b = p0;
       this.a = p1;
    }
    public final boolean hasNext(){
       v20 tw;
       Notification notification;
       if ((tw = this.w) != null) {
          throw iw1.f(tw);
       }
       boolean b = false;
       if (this.t == null) {
          return b;
       }
       if (this.v != null) {
          v20 ta = this.a;
          if (this.x == null) {
             this.x = true;
             ta.c.set(true);
             new gr4(this.b, 4).subscribe(ta);
          }
          try{
             ta.c.set(true);
             notification = ta.b.take();
             Notification a = notification.a;
             if (notification.c()) {
                this.v = b;
                if (a == null || a instanceof yj4) {
                   a = null;
                }
                this.c = a;
                notification = 1;
             }else {
                this.t = b;
                ta = (a == null)? 1: 0;
                if (ta) {
                   notification = 0;
                }else {
                   Throwable throwable = notification.b();
                   this.w = throwable;
                   throw iw1.f(throwable);
                }
             }
             if (!notification) {
             label_006e :
                return b;
             }
          }catch(java.lang.InterruptedException e0){
             notification.c().dispose();
             this.w = e0;
             throw iw1.f(e0);
          }
       }
       b = true;
       goto label_006e ;
    }
    public final Object next(){
       v20 tw;
       if ((tw = this.w) != null) {
          throw iw1.f(tw);
       }
       if (!this.hasNext()) {
          throw new NoSuchElementException("No more elements");
       }
       this.v = true;
       return this.c;
    }
    public final void remove(){
       throw new UnsupportedOperationException("Read only iterator");
    }
}
