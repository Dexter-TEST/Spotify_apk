package p.bb6;
import p.g92;
import p.cc7;
import p.kb3;
import p.ak4;
import java.lang.Object;
import p.iv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import p.kv6;
import p.zj4;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Flowable;

public final class bb6 extends g92	// class@001092 from classes.dex
{
    public final g92 b;
    public boolean c;
    public kb3 t;
    public boolean v;

    public void bb6(cc7 p0){
       super();
       this.b = p0;
    }
    public final void onComplete(){
       bb6 tt;
       if (this.v != null) {
          return;
       }
       _monitor_enter(this);
       if (this.v != null) {
          _monitor_exit(this);
          return;
       }else {
          boolean b = true;
          this.v = b;
          if (this.c != null) {
             if ((tt = this.t) == null) {
                tt = new kb3(0);
                this.t = tt;
             }
             tt.b(ak4.a);
             _monitor_exit(this);
             return;
          }else {
             this.c = b;
             _monitor_exit(this);
             this.b.onComplete();
             return;
          }
       }
    }
    public final void onError(Throwable p0){
       bb6 tt;
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          _monitor_enter(this);
          boolean b = true;
          if (this.v == null) {
             this.v = b;
             if (this.c != null) {
                if ((tt = this.t) == null) {
                   tt = new kb3(0);
                   this.t = tt;
                }
                p0[0] = new yj4(p0);
                _monitor_exit(this);
                return;
             }else {
                this.c = b;
                b = 0;
             }
          }
          _monitor_exit(this);
          if (b) {
             RxJavaPlugins.c(p0);
             return;
          }else {
             this.b.onError(p0);
             return;
          }
       }
    }
    public final void onNext(Object p0){
       bb6 tt;
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
          tt.b(p0);
          _monitor_exit(this);
          return;
       }else {
          this.c = true;
          _monitor_exit(this);
          this.b.onNext(p0);
          this.z();
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       bb6 tt;
       boolean b = true;
       if (this.v == null) {
          _monitor_enter(this);
          if (this.v == null) {
             if (this.c != null) {
                if ((tt = this.t) == null) {
                   tt = new kb3(0);
                   this.t = tt;
                }
                tt.b(new zj4(p0));
                _monitor_exit(this);
                return;
             }else {
                this.c = b;
                b = 0;
             }
          }
          _monitor_exit(this);
       }
       if (b) {
          p0.cancel();
       }else {
          this.b.onSubscribe(p0);
          this.z();
       }
       return;
    }
    public final void u(iv6 p0){
       this.b.subscribe(p0);
    }
    public final void z(){
       bb6 tt;
       while (true) {
          _monitor_enter(this);
          if ((tt = this.t) == null) {
             break ;
          }else {
             this.t = null;
             _monitor_exit(this);
             tt.a(this.b);
          }
       }
       this.c = false;
       _monitor_exit(this);
       return;
    }
}
