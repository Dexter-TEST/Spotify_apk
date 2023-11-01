package p.ex;
import p.og2;
import android.content.Context;
import p.hx;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.gx;
import java.lang.Class;
import p.sp6;
import p.n6;
import android.content.res.Resources;
import p.en6;
import p.lp6;
import p.nf0;
import p.dx;
import p.cx;

public final class ex implements og2	// class@00151c from classes.dex
{
    public final hx a;
    public final Context b;
    public final int c;

    public void ex(Context p0){
       super();
       this.a = hx.a;
       this.b = p0;
       this.c = 1;
    }
    public final Object apply(Object p0){
       this.a.getClass();
       ex tb = this.b;
       ex tc = this.c;
       int dimensionPix = tb.getResources().getDimensionPixelSize(en6.g(tc));
       lp6 olp6 = new lp6(tb, sp6.D, ((float)tb.getResources().getDimensionPixelSize(en6.j(tc)) * 0x3f19999a));
       olp6.b(n6.b(tb, R.color.white));
       nf0 onf0 = new nf0(olp6, 0x3f19999a);
       onf0.a(n6.b(tb, R.color.blue_light));
       cx uocx = new cx();
       uocx.a = 4;
       uocx.b = dimensionPix;
       uocx.c = dimensionPix;
       uocx.d = true;
       return new dx(p0, onf0, uocx);
    }
}
