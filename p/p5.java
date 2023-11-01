package p.p5;
import p.uc2;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View;
import p.if6;
import p.s5;
import p.w5;
import p.s64;
import p.v64;
import p.l64;
import p.d64;

public final class p5 extends uc2	// class@0021f9 from classes.dex
{
    public final ActionMenuItemView A;

    public void p5(ActionMenuItemView p0){
       this.A = p0;
       super(p0);
    }
    public final if6 b(){
       w5 k;
       ActionMenuItemView d = this.A.D;
       if6 oif6 = null;
       if (d != null && (k = d.a.K) != null) {
          oif6 = k.a();
       }
       return oif6;
    }
    public final boolean c(){
       if6 oif6;
       p5 tA = this.A;
       ActionMenuItemView b = tA.B;
       boolean b1 = false;
       if (b != null && (b.c(tA.y) && ((oif6 = this.b()) != null && oif6.a()))) {
          b1 = true;
       }
       return b1;
    }
}
