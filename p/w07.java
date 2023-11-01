package p.w07;
import p.q15;
import p.f25;
import p.n25;
import p.a28;
import java.lang.Object;
import java.util.concurrent.ExecutionException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Exception;

public final class w07 implements q15, f25, n25	// class@002aa1 from classes.dex
{
    public final Object a;
    public final int b;
    public final a28 c;
    public int t;
    public int v;
    public int w;
    public Exception x;
    public boolean y;

    public void w07(int p0,a28 p1){
       super();
       this.a = new Object();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       w07 ta = this.a;
       _monitor_enter(ta);
       this.w = this.w + 1;
       this.y = true;
       this.b();
       _monitor_exit(ta);
    }
    public final void b(){
       w07 tb = this.b;
       if ((((this.t + this.v) + this.w)) == tb) {
          w07 tc = this.c;
          if (this.x != null) {
             tc.j(new ExecutionException(new StringBuilder(54)+this.v+" out of "+tb+" underlying tasks failed", this.x));
             return;
          }else if(this.y != null){
             tc.i();
             return;
          }else {
             tc.k(null);
          }
       }
       return;
    }
    public final void c(Exception p0){
       w07 ta = this.a;
       _monitor_enter(ta);
       this.v = this.v + 1;
       this.x = p0;
       this.b();
       _monitor_exit(ta);
    }
    public final void onSuccess(Object p0){
       p0 = this.a;
       _monitor_enter(p0);
       this.t = this.t + 1;
       this.b();
       _monitor_exit(p0);
    }
}
