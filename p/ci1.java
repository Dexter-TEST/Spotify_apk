package p.ci1;
import java.lang.Math;
import android.content.Context;
import android.util.TypedValue;
import p.ox7;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Object;
import p.lj0;
import android.graphics.Color;
import p.ry7;

public final class ci1	// class@00120f from classes.dex
{
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public static final int f;

    static {
       ci1.f = (int)Math.round(5.10f);
    }
    public void ci1(Context p0){
       TypedValue typedValue3;
       int i1;
       int i2;
       TypedValue typedValue = ox7.F(p0, R.attr.elevationOverlayEnabled);
       int i = 0;
       boolean b = (typedValue != null && (typedValue.type == 18 && typedValue.data != null))? true: false;
       TypedValue typedValue1 = ((typedValue1 = ox7.F(p0, R.attr.elevationOverlayColor)) != null)? typedValue1.data: 0;
       TypedValue typedValue2 = ((typedValue2 = ox7.F(p0, R.attr.elevationOverlayAccentColor)) != null)? typedValue2.data: 0;
       if ((typedValue3 = ox7.F(p0, R.attr.colorSurface)) != null) {
          i = typedValue3.data;
       }
       super();
       this.a = b;
       this.b = typedValue1;
       this.c = typedValue2;
       this.d = i;
       this.e = p0.getResources().getDisplayMetrics().density;
       return;
    }
    public final int a(float p0,int p1){
       ci1 tc;
       if (this.a != null) {
          int i = 255;
          int i1 = (lj0.h(p1, i) == this.d)? 1: 0;
          if (i1) {
             ci1 te = this.e;
             p0 = ((te) > 0 && (p0) > 0)? Math.min(((((float)Math.log1p((double)(p0 / te)) * 4.50f) + 2.00f) / 100.00f), 0x3f800000): 0;
             int i2 = Color.alpha(p1);
             p1 = ry7.M(lj0.h(p1, i), p0, this.b);
             if ((0 - p0) > 0 && (tc = this.c) != null) {
                p1 = lj0.f(lj0.h(tc, ci1.f), p1);
             }
             return lj0.h(p1, i2);
          }
       }
       return p1;
    }
}
