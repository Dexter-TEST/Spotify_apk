package p.x81;
import p.a00;
import p.iv6;
import p.mv6;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;

public class x81 extends a00	// class@002c28 from classes.dex
{
    public final iv6 a;
    public Object b;

    public void x81(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       int i1;
       x81 tb;
       if (mv6.f(p0)) {
          while (true) {
             int i = this.get();
             if (i1 = i & 0xfe) {
                return;
             }
             i1 = 1;
             if (i == i1) {
                if (this.compareAndSet(i1, 3) && (tb = this.b) != null) {
                   this.b = null;
                   x81 ta = this.a;
                   ta.onNext(tb);
                   if (this.get() != 4) {
                      ta.onComplete();
                   }
                }
                return;
             }else if(this.compareAndSet(0, 2)){
             }
          }
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.lazySet(8);
       return 2;
    }
    public void cancel(){
       this.set(4);
       this.b = null;
    }
    public final void clear(){
       this.lazySet(32);
       this.b = null;
    }
    public final void d(Object p0){
       int i1;
       int i = this.get();
       while (true) {
          x81 ta = this.a;
          if (i == 8) {
             this.b = p0;
             this.lazySet(16);
             ta.onNext(null);
             if (this.get() != 4) {
                ta.onComplete();
             }
             return;
          }else if(i1 = i & 0xfd){
             return;
          }else if(i == 2){
             this.lazySet(3);
             ta.onNext(p0);
             if (this.get() != 4) {
                ta.onComplete();
                break ;
             }
             break ;
          }else {
             this.b = p0;
             if (this.compareAndSet(0, 1)) {
                return;
             }
             if ((i = this.get()) == 4) {
                this.b = null;
                return;
             }
          }
       }
       return;
    }
    public final boolean isEmpty(){
       boolean b = (this.get() != 16)? true: false;
       return b;
    }
    public final Object poll(){
       if (this.get() != 16) {
          return null;
       }
       this.lazySet(32);
       x81 tb = this.b;
       this.b = null;
       return tb;
    }
}
