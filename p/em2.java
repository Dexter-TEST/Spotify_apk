package p.em2;
import android.graphics.drawable.Drawable;
import p.dm2;
import android.graphics.Paint;
import p.bm2;
import p.cm2;
import java.lang.Class;
import java.lang.Object;
import p.dd6;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;

public final class em2 extends Drawable	// class@0014b4 from classes.dex
{
    public final Paint a;
    public final bm2 b;
    public dd6 c;
    public static final int d;

    public void em2(dm2 p0,int p1,int p2,boolean p3,float p4){
       LinearGradient new dd6(p1, p4, p2);
       super();
       Paint paint = new Paint();
       this.a = paint;
       bm2 v7 = new bm2(p0, p1, p2, p3, p4);
       this.b = v7;
       v7.b = p1;
       v7.c = p2;
       v7.e = p4;
       v7.a.getClass();
       this.c = new dd6(p1, p4, p2);
       this.invalidateSelf();
       new dd6(p1, p4, p2) = new LinearGradient(0, 0, 0, 0x3f800000, 0, -15592942, Shader$TileMode.REPEAT);
       paint.setShader(new dd6(p1, p4, p2));
    }
    public final void draw(Canvas p0){
       dd6 b;
       Rect bounds = this.getBounds();
       em2 tc = this.c;
       tc.getClass();
       p0.save();
       int i = bounds.width();
       int i1 = bounds.height();
       dd6 a = tc.a;
       float f = 0;
       int i2 = (f - a)? 1: 0;
       dd6 c = tc.c;
       if (i2) {
          float f1 = (float)i;
          float f2 = (float)i1;
          b = tc.b;
          b.set(f, f, f1, f2);
          dd6 d = tc.d;
          d.setScale(f1, f2);
          tc.e.setLocalMatrix(d);
          c.setShader(tc.e);
          p0.drawRoundRect(b, a, a, c);
       }else {
          p0.scale((float)i, (float)i1);
          b = c;
          b.setShader(tc.e);
          p0.drawRect(0, 0, 0x3f800000, 0x3f800000, b);
       }
       p0.restore();
       if (this.b.d != null) {
          p0.save();
          p0.scale((float)bounds.width(), (float)(bounds.height() + 1));
          p0.drawRect(0, 0, 0x3f800000, 0x3f800000, this.a);
          p0.restore();
       }
       return;
    }
    public final Drawable$ConstantState getConstantState(){
       em2 tb = this.b;
       tb.f = this.getChangingConfigurations();
       return tb;
    }
    public final int getOpacity(){
       return -1;
    }
    public final Drawable mutate(){
       return this.getConstantState().newDrawable();
    }
    public final void setAlpha(int p0){
    }
    public final void setColorFilter(ColorFilter p0){
    }
}
