package p.js7;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import p.ls7;
import p.k24;
import p.uc4;
import p.o90;
import java.util.Calendar;
import com.spotify.litesignup.phonesignup.view.OtpInputView;

public final class js7 implements View$OnClickListener	// class@001b3a from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;

    public void js7(int p0,int p1,Object p2){
       this.a = p1;
       this.c = p2;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       js7 tb = this.b;
       js7 tc = this.c;
       switch (this.a){
           case 0:
             break;
           default:
             tc.a(tb);
             return;
       }
       uc4 ouc4 = uc4.a(tb, tc.t.t.b);
       ls7 t = tc.t;
       k24 c = t.c;
       o90 a = c.a;
       uc4 a1 = ouc4.a;
       if (a1.compareTo(a.a) < 0) {
          ouc4 = a;
       }else {
          o90 b = c.b;
          if (a1.compareTo(b.a) > 0) {
             ouc4 = b;
          }
       }
       t.u(ouc4);
       t.v(1);
       return;
    }
}
