package p.ec3;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.content.Context;
import p.ud5;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.os.SystemClock;
import android.graphics.Point;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.String;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public final class ec3 extends Drawable	// class@00145d from classes.dex
{
    public Drawable a;
    public final Drawable b;
    public final long c;
    public boolean d;
    public int e;
    public final boolean f;
    public final float g;
    public final ud5 h;
    public static final Paint i;

    static {
       ec3.i = new Paint();
    }
    public void ec3(Context p0,Drawable p1,Drawable p2,ud5 p3){
       super();
       this.e = 255;
       this.b = p1;
       boolean b = false;
       this.f = b;
       this.g = p0.getResources().getDisplayMetrics().density;
       this.h = p3;
       if (p3 != ud5.b) {
          b = true;
       }
       if (b) {
          this.a = p2;
          this.d = true;
          this.c = SystemClock.uptimeMillis();
       }
       return;
    }
    public static Path a(Point p0,int p1){
       Point point = new Point((p0.x + p1), p0.y);
       Point point1 = new Point(p0.x, (p0.y + p1));
       Path path = new Path();
       path.moveTo((float)p0.x, (float)p0.y);
       path.lineTo((float)point.x, (float)point.y);
       path.lineTo((float)point1.x, (float)point1.y);
       return path;
    }
    public final void draw(Canvas p0){
       int i2;
       ec3 ta;
       int i = 0;
       ec3 tb = this.b;
       if (this.d == null) {
          tb.draw(p0);
       }else {
          float f = (float)(SystemClock.uptimeMillis() - this.c) / 200.00f;
          if ((0x3f800000 - f) >= 0) {
             this.d = i;
             this.a = null;
             tb.draw(p0);
          }else if((ta = this.a) != null){
             ta.draw(p0);
          }
          tb.setAlpha((int)((float)this.e * f));
          tb.draw(p0);
          tb.setAlpha(this.e);
          this.invalidateSelf();
       }
       if (this.f != null) {
          Paint i1 = ec3.i;
          i1.setColor(-1);
          ec3 tg = this.g;
          p0.drawPath(ec3.a(new Point(i, i), (int)(16.00f * tg)), i1);
          if (i2 = this.h.ordinal()) {
             if (i2 != 1) {
                if (i2 == 2) {
                   i2 = 0xffff0000;
                }else {
                   throw new IllegalStateException("Unknown LoadedFrom type.");
                }
             }else {
                i2 = -256;
             }
          }else {
             i2 = -16711936;
          }
          i1.setColor(i2);
          p0.drawPath(ec3.a(new Point(i, i), (int)(tg * 15.00f)), i1);
       }
       return;
    }
    public final int getIntrinsicHeight(){
       return this.b.getIntrinsicHeight();
    }
    public final int getIntrinsicWidth(){
       return this.b.getIntrinsicWidth();
    }
    public final int getOpacity(){
       return this.b.getOpacity();
    }
    public final int[] getState(){
       return this.b.getState();
    }
    public final boolean isStateful(){
       return this.b.isStateful();
    }
    public final void onBoundsChange(Rect p0){
       this.b.setBounds(p0);
       super.onBoundsChange(p0);
    }
    public final boolean onStateChange(int[] p0){
       return this.b.setState(p0);
    }
    public final void setAlpha(int p0){
       ec3 ta;
       this.e = p0;
       if ((ta = this.a) != null) {
          ta.setAlpha(p0);
       }
       this.b.setAlpha(p0);
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       ec3 ta;
       if ((ta = this.a) != null) {
          ta.setColorFilter(p0);
       }
       this.b.setColorFilter(p0);
       return;
    }
    public final boolean setState(int[] p0){
       return this.b.setState(p0);
    }
}
