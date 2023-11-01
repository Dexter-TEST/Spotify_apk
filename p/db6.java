package p.db6;
import p.xj;
import p.hv6;
import p.an5;
import p.kb3;
import p.ak4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.xj4;
import io.reactivex.rxjava3.core.Observable;

public final class db6 extends hv6 implements xj	// class@001318 from classes.dex
{
    public final hv6 a;
    public boolean b;
    public kb3 c;
    public boolean t;

    public void db6(an5 p0){
       super();
       this.a = p0;
    }
    public final void a(){
       db6 tc;
       while (true) {
          _monitor_enter(this);
          if ((tc = this.c) == null) {
             break ;
          }else {
             this.c = null;
             _monitor_exit(this);
             tc.e(this);
          }
       }
       this.b = false;
       _monitor_exit(this);
       return;
    }
    public final void onComplete(){
       db6 tc;
       if (this.t != null) {
          return;
       }
       _monitor_enter(this);
       if (this.t != null) {
          _monitor_exit(this);
          return;
       }else {
          boolean b = true;
          this.t = b;
          if (this.b != null) {
             if ((tc = this.c) == null) {
                tc = new kb3(0);
                this.c = tc;
             }
             tc.b(ak4.a);
             _monitor_exit(this);
             return;
          }else {
             this.b = b;
             _monitor_exit(this);
             this.a.onComplete();
             return;
          }
       }
    }
    public final void onError(Throwable p0){
       db6 tc;
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          _monitor_enter(this);
          boolean b = true;
          if (this.t == null) {
             this.t = b;
             if (this.b != null) {
                if ((tc = this.c) == null) {
                   tc = new kb3(0);
                   this.c = tc;
                }
                p0[0] = new yj4(p0);
                _monitor_exit(this);
                return;
             }else {
                this.b = b;
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
       db6 tc;
       if (this.t != null) {
          return;
       }
       _monitor_enter(this);
       if (this.t != null) {
          _monitor_exit(this);
          return;
       }else if(this.b != null){
          if ((tc = this.c) == null) {
             tc = new kb3(0);
             this.c = tc;
          }
          tc.b(p0);
          _monitor_exit(this);
          return;
       }else {
          this.b = true;
          _monitor_exit(this);
          this.a.onNext(p0);
          this.a();
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       db6 tc;
       boolean b = true;
       if (this.t == null) {
          _monitor_enter(this);
          if (this.t == null) {
             if (this.b != null) {
                if ((tc = this.c) == null) {
                   tc = new kb3(0);
                   this.c = tc;
                }
                tc.b(new xj4(p0));
                _monitor_exit(this);
                return;
             }else {
                this.b = b;
                b = 0;
             }
          }
          _monitor_exit(this);
       }
       if (b) {
          p0.dispose();
       }else {
          this.a.onSubscribe(p0);
          this.a();
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       this.a.subscribe(p0);
    }
    public final boolean test(Object p0){
       return ak4.b(this.a, p0);
    }
}
