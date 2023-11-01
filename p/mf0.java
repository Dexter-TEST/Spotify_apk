package p.mf0;
import android.graphics.drawable.Drawable;
import p.dy1;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Xfermode;
import android.graphics.ColorFilter;

public final class mf0 extends Drawable	// class@001e81 from classes.dex
{
    public final Bitmap a;
    public final float b;
    public final BitmapShader c;
    public final Matrix d;
    public final Paint e;
    public static final dy1 f;

    static {
       mf0.f = new dy1(23, 0);
    }
    public void mf0(Bitmap p0,float p1){
       co5.o(p0, "bitmap");
       super();
       this.a = p0;
       this.b = p1;
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       this.c = uBitmapShade;
       this.d = new Matrix();
       Paint paint = new Paint(1);
       paint.setStyle(Paint$Style.FILL);
       paint.setShader(uBitmapShade);
       this.e = paint;
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       Rect bounds = this.getBounds();
       co5.l(bounds, "bounds");
       float f = bounds.exactCenterX();
       float f1 = bounds.exactCenterY();
       int i = bounds.width();
       float f2 = (float)Math.min(i, bounds.height()) / 2.00f;
       mf0 td = this.d;
       td.reset();
       td.postTranslate((- f), (- f1));
       this.c.setLocalMatrix(td);
       p0.save();
       p0.translate(f, f1);
       mf0 tb = this.b;
       f = (!(tb - 0x3f800000))? 1: 0;
       if (!f) {
          p0.scale(tb, tb);
       }
       p0.drawCircle(0, 0, f2, this.e);
       p0.restore();
       return;
    }
    public final int getIntrinsicHeight(){
       return this.a.getHeight();
    }
    public final int getIntrinsicWidth(){
       return this.a.getWidth();
    }
    public final int getOpacity(){
       mf0 te = this.e;
       if (te.getXfermode() == null) {
          if (!te.getAlpha()) {
             return -2;
          }else if(te.getAlpha() == 255 && !this.a.hasAlpha()){
             return -1;
          }
       }
       return -3;
    }
    public final void setAlpha(int p0){
       this.e.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.e.setColorFilter(p0);
    }
}
