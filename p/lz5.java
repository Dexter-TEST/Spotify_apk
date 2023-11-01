package p.lz5;
import android.graphics.drawable.Drawable;
import p.dy1;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kz5;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Xfermode;
import android.graphics.ColorFilter;

public final class lz5 extends Drawable	// class@001df4 from classes.dex
{
    public final kz5 a;
    public final Matrix b;
    public final RectF c;
    public final Paint d;
    public static final dy1 e;

    static {
       lz5.e = new dy1(25, 0);
    }
    public void lz5(Bitmap p0,float p1){
       co5.o(p0, "bitmap");
       super();
       this.a = new kz5(p0, p1);
       this.b = new Matrix();
       this.c = new RectF();
       this.d = new Paint();
    }
    public final void draw(Canvas p0){
       lz5 ta = this.a;
       co5.o(p0, "canvas");
       lz5 tb = this.b;
       tb.reset();
       tb.setScale(((float)this.getBounds().width() / (float)ta.a.getWidth()), ((float)this.getBounds().height() / (float)ta.a.getHeight()));
       ta.d.setLocalMatrix(tb);
       this.d.setColor(0xffff0000);
       tb = this.c;
       tb.set(this.getBounds());
       p0.drawRoundRect(tb, ta.b, ta.b, ta.e);
       p0.restoreToCount(p0.save());
    }
    public final Drawable$ConstantState getConstantState(){
       lz5 ta = this.a;
       ta.c = this.getChangingConfigurations();
       return ta;
    }
    public final int getIntrinsicHeight(){
       return -1;
    }
    public final int getIntrinsicWidth(){
       return -1;
    }
    public final int getOpacity(){
       lz5 ta = this.a;
       int i = -3;
       if (ta.e.getXfermode() == null) {
          if (!ta.e.getAlpha()) {
             i = -2;
          }else if(ta.e.getAlpha() == 255 && !ta.a.hasAlpha()){
             i = -1;
          }
       }
       return i;
    }
    public final Drawable mutate(){
       Drawable uDrawable = this.getConstantState().newDrawable();
       co5.l(uDrawable, "constantState.newDrawable\(\)");
       return uDrawable;
    }
    public final void setAlpha(int p0){
       this.a.e.setAlpha(p0);
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
    }
}
