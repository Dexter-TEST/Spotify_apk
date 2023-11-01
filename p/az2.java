package p.az2;
import android.content.Context;
import p.sp6;
import java.lang.Object;
import java.lang.Class;
import android.graphics.drawable.Drawable;
import p.uw5;
import p.zy2;
import android.content.res.Resources;
import p.xj0;
import java.lang.String;
import p.cz2;
import p.r45;
import p.yy2;
import p.bz2;
import android.util.LruCache;

public final class az2	// class@00101f from classes.dex
{
    public final Drawable a;
    public final Context b;
    public final zy2 c;
    public final float d;

    public void az2(Context p0){
       super();
       p0.getClass();
       this.b = p0;
       this.a = uw5.m(p0, R.attr.pasteColorPlaceholderBackground);
       this.c = new zy2(this);
       this.d = (float)xj0.e0(32.00f, p0.getResources());
    }
    public final Drawable a(String p0,cz2 p1){
       if (p0 == null) {
          return this.a;
       }
       az2 tc = this.c;
       tc.getClass();
       return tc.get(new yy2(uw5.s(p0).e(sp6.z), p1.b, p1.a));
    }
}
