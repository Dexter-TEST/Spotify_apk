package p.nq7;
import java.lang.Runnable;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.jr7;
import p.fm3;
import p.oc2;
import p.ce7;
import java.lang.Object;
import p.pc6;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import p.ij;
import p.t5;
import p.x0;

public final class nq7 implements Runnable	// class@00202f from classes.dex
{
    public final pc6 a;
    public final Context b;
    public final jr7 c;
    public final fm3 t;
    public final oc2 v;
    public final ce7 w;
    public static final int x;

    static {
       es3.d("WorkForegroundRunnable");
    }
    public void nq7(Context p0,jr7 p1,fm3 p2,oc2 p3,ce7 p4){
       super();
       this.a = new pc6();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
    }
    public final void run(){
       if (this.c.q != null && Build$VERSION.SDK_INT < 31) {
          pc6 opc6 = new pc6();
          nq7 tw = this.w;
          tw.c.execute(new ij(this, 9, opc6));
          opc6.a(new t5(this, 11, opc6), tw.c);
          return;
       }else {
          this.a.i(null);
          return;
       }
    }
}
