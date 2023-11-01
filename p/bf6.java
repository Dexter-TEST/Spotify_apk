package p.bf6;
import android.graphics.drawable.Drawable;
import p.af6;
import java.lang.Object;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.animation.ValueAnimator;
import p.ze6;
import android.graphics.drawable.Drawable$Callback;
import java.lang.Math;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Canvas;
import p.et0;
import android.graphics.ColorFilter;

public final class bf6 extends Drawable	// class@0010b5 from classes.dex
{
    public final af6 a;
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public ze6 f;

    public void bf6(){
       super();
       this.a = new af6(0, this);
       Paint paint = new Paint();
       this.b = paint;
       this.c = new Rect();
       this.d = new Matrix();
       paint.setAntiAlias(true);
    }
    public final void a(){
       bf6 te;
       if ((te = this.e) != null && (!te.isStarted() && ((te = this.f) != null && (te.o != null && this.getCallback() != null)))) {
          this.e.start();
       }
       return;
    }
    public final void b(){
       bf6 f;
       ze6 g;
       ze6 h;
       ze6 c;
       LinearGradient c1;
       bf6 uobf6 = this;
       Rect bounds = this.getBounds();
       int i = bounds.width();
       int i1 = bounds.height();
       if (i && (i1 && (f = uobf6.f) != null)) {
          if ((g = f.g) <= null) {
             g = Math.round((f.i * (float)i));
          }
          bf6 f1 = uobf6.f;
          if ((h = f1.h) <= null) {
             h = Math.round((f1.j * (float)i1));
          }
          RadialGradient bf6 f2 = uobf6.f;
          int i2 = 1;
          if (f2.f != i2) {
             if ((c = f2.c) != i2 && c != 3) {
                c1 = 0;
             }
             if (i2) {
                g = 0;
             }
             if (!i2) {
                h = 0;
             }
             f1 = uobf6.f;
             c1 = new LinearGradient(0, 0, (float)g, (float)h, f1.b, f1.a, Shader$TileMode.CLAMP);
          }else {
             f = uobf6.f;
             f2 = new RadialGradient(((float)g / 2.00f), ((float)h / 2.00f), (float)((double)Math.max(g, h) / Math.sqrt(2.00f)), f.b, f.a, Shader$TileMode.CLAMP);
          }
          uobf6.b.setShader(c);
       }
       return;
    }
    public final void draw(Canvas p0){
       ze6 c;
       if (this.f != null) {
          bf6 tb = this.b;
          if (tb.getShader() != null) {
             float f = (float)Math.tan(Math.toRadians((double)this.f.m));
             bf6 tc = this.c;
             float f1 = ((float)tc.width() * f) + (float)tc.height();
             f = (f * (float)tc.height()) + (float)tc.width();
             bf6 te = this.e;
             float f2 = 0;
             float animatedFrac = (te != null)? te.getAnimatedFraction(): 0;
             if ((c = this.f.c) != 1) {
                if (c != 2) {
                   if (c != 3) {
                      f = et0.l(f, (- f), animatedFrac, (- f));
                   }else {
                      f = et0.l((- f1), f1, animatedFrac, f1);
                   }
                }else {
                   f = et0.l((- f), f, animatedFrac, f);
                }
                f2 = f;
                f = 0;
             }else {
                f = et0.l(f1, (- f1), animatedFrac, (- f1));
             }
             te = this.d;
             te.reset();
             te.setRotate(this.f.m, ((float)tc.width() / 2.00f), ((float)tc.height() / 2.00f));
             te.postTranslate(f2, f);
             tb.getShader().setLocalMatrix(te);
             p0.drawRect(tc, tb);
          }
       }
       return;
    }
    public final int getOpacity(){
       bf6 tf;
       int i = ((tf = this.f) != null && (tf.n != null && tf.p == null))? -3: -1;
       return i;
    }
    public final void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.c.set(0, 0, p0.width(), p0.height());
       this.b();
       this.a();
    }
    public final void setAlpha(int p0){
    }
    public final void setColorFilter(ColorFilter p0){
    }
}
