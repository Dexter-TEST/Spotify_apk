package p.xd5;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Paint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p.ud5;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.os.SystemClock;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public final class xd5 extends BitmapDrawable	// class@002c57 from classes.dex
{
    public final boolean a;
    public final float b;
    public final ud5 c;
    public Drawable d;
    public final long e;
    public boolean f;
    public int g;
    public static final Paint h;

    static {
       xd5.h = new Paint();
    }
    public void xd5(Context p0,Bitmap p1,Drawable p2,ud5 p3,boolean p4,boolean p5){
       super(p0.getResources(), p1);
       this.g = 255;
       this.a = p5;
       this.b = p0.getResources().getDisplayMetrics().density;
       this.c = p3;
       int i = (p3 != ud5.b && !p4)? 1: 0;
       if (i) {
          this.d = p2;
          this.f = true;
          this.e = SystemClock.uptimeMillis();
       }
       return;
    }
    public static void a(ImageView p0,Context p1,Bitmap p2,ud5 p3,boolean p4,boolean p5){
       Drawable drawable = p0.getDrawable();
       if (drawable instanceof Animatable) {
          drawable.stop();
       }
       xd5 v7 = new xd5(p1, p2, drawable, p3, p4, p5);
       p0.setImageDrawable(v7);
       return;
    }
    public final void draw(Canvas p0){
       xd5 tb;
       int i = 0;
       if (this.f == null) {
          super.draw(p0);
       }else {
          float f3 = (float)(SystemClock.uptimeMillis() - this.e) / 200.00f;
          if ((0x3f800000 - f3) >= 0) {
             this.f = i;
             this.d = null;
             super.draw(p0);
          }else if((tb = this.d) != null){
             tb.draw(p0);
          }
          super.setAlpha((int)((float)this.g * f3));
          super.draw(p0);
          super.setAlpha(this.g);
       }
       if (this.a != null) {
          Paint h = xd5.h;
          h.setColor(-1);
          tb = this.b;
          Path path = new Path();
          float f = (float)i;
          path.moveTo(f, f);
          float f1 = (float)((int)(16.00f * tb) + i);
          path.lineTo(f1, f);
          path.lineTo(f, f1);
          p0.drawPath(path, h);
          h.setColor(this.c.a);
          Path path1 = new Path();
          path1.moveTo(f, f);
          float f2 = (float)((int)(tb * 15.00f) + i);
          path1.lineTo(f2, f);
          path1.lineTo(f, f2);
          p0.drawPath(path1, h);
       }
       return;
    }
    public final void onBoundsChange(Rect p0){
       xd5 td;
       if ((td = this.d) != null) {
          td.setBounds(p0);
       }
       super.onBoundsChange(p0);
       return;
    }
    public final void setAlpha(int p0){
       xd5 td;
       this.g = p0;
       if ((td = this.d) != null) {
          td.setAlpha(p0);
       }
       super.setAlpha(p0);
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       xd5 td;
       if ((td = this.d) != null) {
          td.setColorFilter(p0);
       }
       super.setColorFilter(p0);
       return;
    }
}
