package p.sk5;
import p.ek3;
import java.lang.Object;
import p.fk3;
import p.am0;
import p.rk5;
import p.kj3;
import p.co5;
import java.lang.Runnable;
import android.os.Handler;
import p.vj3;

public final class sk5 implements ek3	// class@002648 from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public boolean t;
    public Handler v;
    public final fk3 w;
    public final am0 x;
    public final rk5 y;
    public static final sk5 z;

    static {
       sk5.z = new sk5();
    }
    public void sk5(){
       super();
       this.c = true;
       this.t = true;
       this.w = new fk3(this);
       this.x = new am0(4, this);
       this.y = new rk5(this);
    }
    public final void b(){
       int i = 1;
       int i1 = this.b + i;
       this.b = i1;
       if (i1 == i) {
          if (this.c != null) {
             this.w.f(kj3.ON_RESUME);
             this.c = false;
          }else {
             sk5 tv = this.v;
             co5.i(tv);
             tv.removeCallbacks(this.x);
          }
       }
       return;
    }
    public final vj3 getLifecycle(){
       return this.w;
    }
}
