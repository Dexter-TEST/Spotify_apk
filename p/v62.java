package p.v62;
import io.reactivex.rxjava3.core.FlowableEmitter;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.ra6;
import p.mv6;
import p.vv7;
import java.lang.Throwable;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import java.lang.Class;

public abstract class v62 extends AtomicLong implements FlowableEmitter, kv6	// class@00298d from classes.dex
{
    public final iv6 a;
    public final ra6 b;

    public void v62(iv6 p0){
       super();
       this.a = p0;
       this.b = new ra6();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
          this.e();
       }
       return;
    }
    public final void b(){
       v62 tb = this.b;
       if (this.d()) {
          return;
       }
       this.a.onComplete();
       tb.dispose();
       return;
    }
    public final boolean c(Throwable p0){
       v62 tb = this.b;
       if (this.d()) {
          return false;
       }
       this.a.onError(p0);
       tb.dispose();
       return true;
    }
    public final void cancel(){
       this.b.dispose();
       this.f();
    }
    public final boolean d(){
       return this.b.isDisposed();
    }
    public void e(){
    }
    public void f(){
    }
    public boolean g(Throwable p0){
       return this.c(p0);
    }
    public void onComplete(){
       this.b();
    }
    public final void onError(Throwable p0){
       NullPointerException nullPointerE;
       if (p0 == null) {
          nullPointerE = iw1.b("onError called with a null Throwable.");
       }
       if (!this.g(nullPointerE)) {
          RxJavaPlugins.c(nullPointerE);
       }
       return;
    }
    public final String toString(){
       Object[] objArray = new Object[]{this.getClass().getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
}
