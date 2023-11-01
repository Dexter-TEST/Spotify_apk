package p.eb6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import p.iv6;
import java.lang.Object;
import p.kb3;
import p.ak4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import p.mv6;

public final class eb6 implements FlowableSubscriber, kv6	// class@001457 from classes.dex
{
    public final iv6 a;
    public kv6 b;
    public boolean c;
    public kb3 t;
    public boolean v;

    public void eb6(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       this.b.a(p0);
    }
    public final void b(){
       eb6 tt;
       while (true) {
          _monitor_enter(this);
          if ((tt = this.t) == null) {
             this.c = false;
             _monitor_exit(this);
             return;
          }else {
             this.t = null;
             _monitor_exit(this);
             if (tt.a(this.a)) {
                break ;
             }
          }
       }
       return;
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final void onComplete(){
       eb6 tt;
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
       eb6 tt;
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
       eb6 tt;
       if (this.v != null) {
          return;
       }
       if (p0 == null) {
          this.b.cancel();
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
             this.b();
             return;
          }
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
