package p.rl2;
import p.fl2;
import p.dt3;
import p.sv7;
import p.ko1;
import java.lang.String;
import android.content.Context;
import p.re;
import p.el2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p.vo;
import p.gt7;
import p.a28;
import p.k07;
import p.q12;
import p.do5;
import p.u44;
import java.lang.Object;
import p.wt7;
import p.l07;
import p.hl2;
import android.content.Intent;
import p.yf1;

public final class rl2 extends fl2	// class@00250c from classes.dex
{
    public static int k;
    public static final ko1 l;

    static {
       rl2.k = 1;
       rl2.l = new ko1("ClientTelemetry.API", new sv7(4), new dt3());
    }
    public void rl2(Context p0){
       super(p0, rl2.l, re.d, el2.c);
    }
    public void rl2(Context p0,GoogleSignInOptions p1){
       super(p0, vo.b, p1, new dt3(16));
    }
    public a28 e(gt7 p0){
       k07 ok07 = new k07();
       q12[] oq12Array = new q12[]{do5.D};
       ok07.e = oq12Array;
       ok07.b = false;
       ok07.d = new u44(15, p0);
       wt7 owt7 = new wt7(ok07, oq12Array, 0, ok07.c);
       return this.c(2, owt7);
    }
    public synchronized int f(){
       int i;
       if (rl2.k == 1) {
          fl2 ta = this.a;
          hl2 c = hl2.c;
          if (!(i = c.b(ta, 0xbdfcb8))) {
             rl2.k = 4;
          }else if(c.a(i, ta, null) == null && yf1.a(ta)){
             rl2.k = 3;
          }else {
             rl2.k = 2;
          }
       }
       return rl2.k;
    }
}
