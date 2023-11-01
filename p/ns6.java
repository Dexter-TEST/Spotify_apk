package p.ns6;
import java.lang.Runnable;
import java.lang.String;
import p.es3;
import p.uq7;
import p.xq6;
import java.lang.Object;
import p.wk5;
import java.lang.Class;
import p.qq7;
import java.util.HashMap;
import p.ur7;
import java.util.Set;

public final class ns6 implements Runnable	// class@00203f from classes.dex
{
    public final uq7 a;
    public final xq6 b;
    public final boolean c;

    static {
       es3.d("StopWorkRunnable");
    }
    public void ns6(uq7 p0,xq6 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void run(){
       ur7 our7;
       Set set;
       if (this.c != null) {
          this.a.F.l(this.b);
       }else {
          uq7 f = this.a.F;
          ns6 tb = this.b;
          f.getClass();
          qq7 a = tb.a.a;
          wk5 c = f.C;
          _monitor_enter(c);
          if ((our7 = f.x.remove(a)) == null) {
             es3.c().getClass();
             _monitor_exit(c);
          }else if((set = f.y.get(a)) != null && set.contains(tb)){
             es3.c().getClass();
             f.y.remove(a);
             _monitor_exit(c);
             wk5.d(our7);
          }else {
             _monitor_exit(c);
          }
       }
       es3.c().getClass();
       return;
    }
}
