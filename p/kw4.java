package p.kw4;
import p.zo0;
import p.fv1;
import p.fw4;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicReference;
import p.aw4;
import p.yf2;
import p.zv6;
import p.f37;
import java.lang.Object;
import p.ir0;
import p.ew4;
import p.dw4;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import p.co5;
import java.lang.RuntimeException;
import p.iw1;

public final class kw4 extends zo0	// class@001c96 from classes.dex
{
    public final ObservableSource a;
    public final AtomicReference b;
    public final aw4 c;
    public final ObservableSource t;
    public static final fv1 v;

    static {
       kw4.v = new fv1();
    }
    public void kw4(fw4 p0,ObservableSource p1,AtomicReference p2,aw4 p3){
       super();
       this.t = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public static f37 c(yf2 p0,zv6 p1){
       return new f37(p1, 7, p0);
    }
    public final void a(ir0 p0){
       kw4 tb;
       ew4 uoew4;
       while (true) {
          tb = this.b;
          if ((uoew4 = tb.get()) != null && !uoew4.isDisposed()) {
             break ;
          }else {
             ew4 uoew41 = new ew4(this.c.call(), tb);
             while (true) {
                if (tb.compareAndSet(uoew4, uoew41)) {
                   tb = 1;
                }else {
                   if (tb.get() != uoew4) {
                      tb = 0;
                   }
                }
                if (!tb) {
                }else {
                   uoew4 = uoew41;
                }
             }
          }
       }
       ew4 t = uoew4.t;
       tb = (!uoew4.t.get() && t.compareAndSet(false, true))? 1: 0;
       p0.accept(uoew4);
       if (tb) {
          this.a.subscribe(uoew4);
       }
       return;
    }
    public final void b(){
       ew4 uoew4;
       kw4 tb = this.b;
       if ((uoew4 = tb.get()) != null && uoew4.isDisposed()) {
          do {
          } while (tb.compareAndSet(uoew4, null) || tb.get() != uoew4);
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       this.t.subscribe(p0);
    }
}
