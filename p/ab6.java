package p.ab6;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import p.kb3;
import p.ak4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import p.cd1;

public final class ab6 implements Observer, Disposable	// class@000f4f from classes.dex
{
    public final Observer a;
    public Disposable b;
    public boolean c;
    public kb3 t;
    public boolean v;

    public void ab6(Observer p0){
       super();
       this.a = p0;
    }
    public final void a(){
       object oobject;
       while (true) {
          _monitor_enter(this);
          ab6 tt = this.t;
          boolean b = false;
          if (tt == null) {
             this.c = b;
             _monitor_exit(this);
             return;
          }else {
             this.t = null;
             _monitor_exit(this);
             ab6 ta = this.a;
             kb3 c = tt.c;
             kb3 a = tt.a;
             while (c != null) {
                int i = 0;
                while (true) {
                   if (i < a && (oobject = c[i]) != null) {
                      if (ak4.b(ta, oobject)) {
                         b = true;
                      }else {
                         i = i + 1;
                      }
                   }else {
                      c = c[a];
                   }
                }
                return;
             }
             if (b) {
             }else {
                continue ;
             }
          }
       }
    }
    public void dispose(){
       this.v = true;
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       ab6 tt;
       if (this.v != null) {
          return;
       }
       _monitor_enter(this);
       if (this.v != null) {
          _monitor_exit(this);
          return;
       }else if(this.c != null){
          if ((tt = this.t) == null) {
             tt = new kb3(0);
             this.t = tt;
          }
          tt.b(ak4.a);
          _monitor_exit(this);
          return;
       }else {
          this.v = true;
          this.c = true;
          _monitor_exit(this);
          this.a.onComplete();
          return;
       }
    }
    public final void onError(Throwable p0){
       ab6 tt;
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          _monitor_enter(this);
          boolean b = true;
          if (this.v == null) {
             if (this.c != null) {
                this.v = b;
                if ((tt = this.t) == null) {
                   tt = new kb3(0);
                   this.t = tt;
                }
                p0[0] = new yj4(p0);
                _monitor_exit(this);
                return;
             }else {
                this.v = b;
                this.c = b;
                b = 0;
             }
          }
          _monitor_exit(this);
          if (b) {
             RxJavaPlugins.c(p0);
             return;
          }else {
             this.a.onError(p0);
             return;
          }
       }
    }
    public final void onNext(Object p0){
       ab6 tt;
       if (this.v != null) {
          return;
       }
       if (p0 == null) {
          this.b.dispose();
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }else {
          _monitor_enter(this);
          if (this.v != null) {
             _monitor_exit(this);
             return;
          }else if(this.c != null){
             if ((tt = this.t) == null) {
                tt = new kb3(0);
                this.t = tt;
             }
             tt.b(p0);
             _monitor_exit(this);
             return;
          }else {
             this.c = true;
             _monitor_exit(this);
             this.a.onNext(p0);
             this.a();
             return;
          }
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
