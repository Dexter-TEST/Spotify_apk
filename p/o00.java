package p.o00;
import p.kv6;
import p.xj;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.p00;
import p.mv6;
import p.vv7;
import p.kb3;
import java.lang.Object;
import p.ak4;
import p.yj4;
import java.lang.Throwable;
import p.ya4;
import java.lang.String;

public final class o00 extends AtomicLong implements kv6, xj	// class@002080 from classes.dex
{
    public final iv6 a;
    public final p00 b;
    public boolean c;
    public boolean t;
    public kb3 v;
    public boolean w;
    public boolean x;
    public long y;

    public void o00(iv6 p0,p00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
       }
       return;
    }
    public final void b(){
       o00 tv;
       while (true) {
          if (this.x != null) {
             return;
          }
          _monitor_enter(this);
          if ((tv = this.v) == null) {
             break ;
          }else {
             this.v = null;
             _monitor_exit(this);
             tv.e(this);
          }
       }
       this.t = false;
       _monitor_exit(this);
       return;
    }
    public final void c(long p0,Object p1){
       o00 tv;
       if (this.x != null) {
          return;
       }
       if (this.w == null) {
          _monitor_enter(this);
          if (this.x != null) {
             _monitor_exit(this);
             return;
          }else if(!(this.y - p0)){
             _monitor_exit(this);
             return;
          }else if(this.t != null){
             if ((tv = this.v) == null) {
                tv = new kb3(0);
                this.v = tv;
             }
             tv.b(p1);
             _monitor_exit(this);
             return;
          }else {
             this.c = true;
             _monitor_exit(this);
             this.w = true;
          }
       }
       this.test(p1);
       return;
    }
    public final void cancel(){
       if (this.x == null) {
          this.x = true;
          this.b.z(this);
       }
       return;
    }
    public final boolean test(Object p0){
       if (this.x != null) {
          return true;
       }
       if (ak4.c(p0)) {
          this.a.onComplete();
          return true;
       }else if(p0 instanceof yj4){
          this.a.onError(p0.a);
          return true;
       }else {
          long l = this.get();
          if (l) {
             this.a.onNext(p0);
             if (l - Long.MAX_VALUE) {
                this.decrementAndGet();
             }
             return false;
          }else {
             this.cancel();
             this.a.onError(new ya4("Could not deliver value due to lack of requests"));
             return true;
          }
       }
    }
}
