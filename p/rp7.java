package p.rp7;
import p.qp7;
import p.xp7;
import android.view.WindowInsets;
import android.view.View;
import p.aa3;

public class rp7 extends qp7	// class@002535 from classes.dex
{
    public aa3 m;

    public void rp7(xp7 p0,WindowInsets p1){
       super(p0, p1);
       this.m = null;
    }
    public xp7 b(){
       return xp7.g(this.c.consumeStableInsets(), null);
    }
    public xp7 c(){
       return xp7.g(this.c.consumeSystemWindowInsets(), null);
    }
    public final aa3 h(){
       if (this.m == null) {
          qp7 tc = this.c;
          int stableInsetL = tc.getStableInsetLeft();
          int stableInsetT = tc.getStableInsetTop();
          int stableInsetR = tc.getStableInsetRight();
          this.m = aa3.a(stableInsetL, stableInsetT, stableInsetR, tc.getStableInsetBottom());
       }
       return this.m;
    }
    public boolean m(){
       return this.c.isConsumed();
    }
    public void q(aa3 p0){
       this.m = p0;
    }
}
