package p.o72;
import p.zn0;
import p.yz;
import p.iv6;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.yh6;

public final class o72 extends yz implements zn0	// class@0020c2 from classes.dex
{
    public final bi5 w;

    public void o72(iv6 p0,bi5 p1){
       super(p0);
       this.w = p1;
    }
    public final int b(int p0){
       return this.d(p0);
    }
    public final boolean c(Object p0){
       boolean b;
       if (this.t != null) {
          return false;
       }
       yz ta = this.a;
       if (this.v != null) {
          ta.onNext(null);
          return true;
       }else if(b = this.w.test(p0)){
          ta.onNext(p0);
       }
       return b;
    }
    public final void onNext(Object p0){
       if (!this.c(p0)) {
          this.b.a(1);
       }
       return;
    }
    public final Object poll(){
       Object obj;
       yz tc = this.c;
       while (true) {
          if ((obj = tc.poll()) == null) {
             return null;
          }
          if (this.w.test(obj)) {
             break ;
          }else if(this.v == 2){
             tc.a(1);
          }
       }
       return obj;
    }
}
