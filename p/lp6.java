package p.lp6;
import android.graphics.drawable.Drawable;
import android.content.Context;
import p.sp6;
import android.graphics.Rect;
import p.g54;
import java.lang.Object;
import p.jp6;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.graphics.Typeface;
import p.xw5;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import java.lang.String;
import p.k07;
import p.eb3;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import p.kp6;
import android.graphics.Color;
import java.lang.Math;
import android.graphics.Xfermode;
import android.graphics.ColorFilter;

public final class lp6 extends Drawable	// class@001d9c from classes.dex
{
    public sp6 a;
    public float b;
    public k07 c;
    public int d;
    public int e;
    public final Paint f;
    public ColorStateList g;
    public final Rect h;
    public final float[] i;
    public float j;
    public float k;
    public final jp6 l;
    public kp6 m;
    public final float n;
    public final int o;

    public void lp6(Context p0,sp6 p1,float p2){
       super();
       this.d = -1;
       this.e = 255;
       this.h = new Rect();
       float[] uofloatArray = new float[1];
       this.i = uofloatArray;
       g54 uofloatArray1 = new g54(this);
       this.l = new jp6(this);
       this.m = uofloatArray1;
       this.o = 1;
       this.a = p1;
       this.b = p2;
       this.n = p0.getResources().getDisplayMetrics().density;
       this.f();
       Paint paint = new Paint();
       this.f = paint;
       paint.setColor(this.d);
       paint.setTypeface(xw5.c(p0, R.font.spoticon));
       paint.setTextSize(p2);
       paint.setTextAlign(Paint$Align.LEFT);
       paint.setAntiAlias(1);
       this.g();
    }
    public final String a(){
       lp6 to;
       lp6 tc = this.c;
       if (tc.b != null) {
          return tc.d;
       }
       int i = 1;
       if ((to = this.o) != 3 && (to != i && eb3.o(this) == i)) {
          i = 0;
       }
       tc = this.c;
       k07 e = (i)? tc.e: tc.d;
       return e;
    }
    public final void b(int p0){
       this.g = null;
       this.d = p0;
       this.f.setColor(p0);
       this.e();
       this.invalidateSelf();
    }
    public final void c(ColorStateList p0){
       this.g = p0;
       this.onStateChange(this.getState());
       this.invalidateSelf();
    }
    public final void d(float p0){
       this.b = p0;
       this.f.setTextSize(p0);
       this.f();
       this.g();
       this.invalidateSelf();
    }
    public final void draw(Canvas p0){
       this.m.c(p0);
    }
    public final void e(){
       this.f.setAlpha(((Color.alpha(this.d) * this.e) / 255));
    }
    public final void f(){
       sp6 a;
       int i = Math.round((this.b / this.n));
       lp6 ta = this.a;
       int i1 = 0;
       int i2 = 0;
       int i3 = Integer.MAX_VALUE;
       while (true) {
          a = ta.a;
          if (i1 < a.length) {
             int i4 = a[i1] - i;
             if ((i4 = Math.abs(i4)) > i3) {
                break ;
             }else {
                i2 = i1 + 1;
                i3 = i4;
                int i6 = i2;
                i2 = i1;
                i1 = i6;
             }
          }else {
             break ;
          }
       }
       k07 i5 = new k07(a[i2], ta.b[i2], ta.c[i2], ta.t[i2], 0);
       this.c = i;
       return;
    }
    public final void g(){
       lp6 tf = this.f;
       tf.getTextBounds(this.c.d, 0, 1, this.h);
       tf.getTextWidths(this.c.d, 0, 1, this.i);
       lp6 tb = this.b;
       this.k = -1.01f * tb;
       this.j = tb * 0x3f82fbef;
    }
    public final int getIntrinsicHeight(){
       return this.m.a();
    }
    public final int getIntrinsicWidth(){
       return this.m.i();
    }
    public final int getOpacity(){
       int alpha;
       lp6 tf = this.f;
       if (tf.getXfermode() == null) {
          if (!(alpha = tf.getAlpha())) {
             return -2;
          }else if(alpha == 255){
             return -1;
          }
       }
       return -3;
    }
    public final boolean isStateful(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public final boolean onStateChange(int[] p0){
       lp6 tg;
       if ((tg = this.g) == null) {
          return false;
       }
       int colorForStat = tg.getColorForState(p0, this.d);
       this.d = colorForStat;
       this.f.setColor(colorForStat);
       this.e();
       this.invalidateSelf();
       return true;
    }
    public final void setAlpha(int p0){
       this.e = p0;
       this.e();
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
       this.f.setColorFilter(p0);
       this.invalidateSelf();
    }
}
