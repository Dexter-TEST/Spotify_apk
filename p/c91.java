package p.c91;
import java.lang.Runnable;
import p.d91;
import java.lang.Object;
import p.es3;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import p.ey6;
import p.xq6;
import p.nq5;
import p.wk5;
import p.rr7;
import p.qq7;
import p.qr7;
import java.util.HashMap;
import p.vf;
import android.os.Handler;

public final class c91 implements Runnable	// class@0011be from classes.dex
{
    public final int a;
    public final d91 b;

    public void c91(d91 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       switch (this.a){
           case 0:
           case 1:
           case 2:
             c91 tb = this.b;
             if (tb.x == null) {
                tb.x = 1;
                Objects.toString(tb.c);
                es3.c().getClass();
                if (tb.t.t.i(tb.C, null)) {
                   ey6 c = tb.t.c;
                   d91 c1 = tb.c;
                   rr7 d = c.d;
                   _monitor_enter(d);
                   Objects.toString(c1);
                   es3.c().getClass();
                   c.a(c1);
                   qr7 oqr7 = new qr7(c, c1);
                   c.b.put(c1, oqr7);
                   c.c.put(c1, tb);
                   c.a.b.postDelayed(oqr7, 0x927c0);
                   _monitor_exit(d);
                }else {
                   tb.b();
                }
             }else {
                Objects.toString(tb.c);
                es3.c().getClass();
             }
             return;
             break;
           default:
       }
       d91.a(this.b);
       return;
    }
}
