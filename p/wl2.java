package p.wl2;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import p.uv1;
import com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import p.fe;
import p.dg1;
import android.view.animation.PathInterpolator;

public final class wl2 implements id4	// class@002b5b from classes.dex
{
    public final uv1 a;
    public fe b;
    public static final x3 c;
    public static final x3 t;

    static {
       wl2.c = new x3(Integer.valueOf(0));
       wl2.t = new x3(Integer.valueOf(266));
    }
    public void wl2(uv1 p0){
       super();
       this.a = p0;
    }
    public final void a(float p0){
       StretchingGradientDrawable stretchingGr = this.a.h();
       stretchingGr.f = (int)this.b.a(p0);
       stretchingGr.a();
    }
    public final void b(){
       wl2 ta = this.a;
       float f = ta.n();
       StretchingGradientDrawable stretchingGr = ta.h();
       float f1 = (float)this.d();
       fe stretchingGr1 = new fe(((float)wl2.c.a.intValue() / f1), ((float)wl2.t.a.intValue() / f1), ((((0x3f000000 * f) - (float)(stretchingGr.e + stretchingGr.f)) / f) * f), 0, dg1.d);
       this.b = stretchingGr;
    }
    public final int d(){
       return (wl2.t.a.intValue() + wl2.c.a.intValue());
    }
}
