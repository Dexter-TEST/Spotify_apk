package p.al4;
import p.vi7;
import p.rf5;
import p.m12;
import p.wl6;
import p.ft0;
import android.content.Context;
import p.sp6;
import p.lp6;
import android.content.res.Resources;

public final class al4 extends vi7	// class@000fa6 from classes.dex
{
    public final rf5 t;
    public final m12 v;
    public final wl6 w;
    public final ft0 x;

    public void al4(rf5 p0,m12 p1,wl6 p2){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       ft0 uoft0 = new ft0();
       this.x = uoft0;
       uoft0.e = true;
    }
    public static lp6 e(Context p0,sp6 p1){
       return new lp6(p0, p1, (float)p0.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
    }
}
