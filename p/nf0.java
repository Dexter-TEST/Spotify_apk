package p.nf0;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import java.lang.IllegalArgumentException;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.ColorFilter;

public final class nf0 extends Drawable	// class@001fc5 from classes.dex
{
    public final Drawable a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public ColorStateList e;
    public int f;
    public int g;

    public void nf0(Drawable p0,float p1){
       co5.o(p0, "drawable");
       super();
       this.a = p0;
       this.b = p1;
       int i = 1;
       Paint paint = new Paint(i);
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth(0);
       this.c = paint;
       paint = new Paint(i);
       paint.setStyle(Paint$Style.FILL);
       this.d = paint;
       this.f = 255;
       if (p0.getIntrinsicWidth() < 0 || p0.getIntrinsicHeight() < 0) {
          i = 0;
       }
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException("Drawables without intrinsic size are not supported.".toString());
       }
    }
    public final void a(int p0){
       this.e = ColorStateList.valueOf(p0);
       this.d.setColor(p0);
       this.g = p0;
       this.b();
       this.invalidateSelf();
    }
    public final void b(){
       this.c.setAlpha(((Color.alpha(0) * this.f) / 255));
       this.d.setAlpha(((Color.alpha(this.g) * this.f) / 255));
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       int i = p0.save();
       p0.translate(this.getBounds().exactCenterX(), this.getBounds().exactCenterY());
       float f = (float)Math.min(this.getBounds().width(), this.getBounds().height());
       nf0 tc = this.c;
       float f1 = (f / 2.00f) - (tc.getStrokeWidth() / 2.00f);
       float f2 = 0;
       p0.drawCircle(f2, f2, f1, this.d);
       if ((f2 - tc.getStrokeWidth()) > 0) {
          p0.drawCircle(f2, f2, f1, tc);
       }
       nf0 ta = this.a;
       int intrinsicWid = ta.getIntrinsicWidth();
       int intrinsicHei = ta.getIntrinsicHeight();
       p0.scale((f / (float)Math.max(intrinsicWid, intrinsicHei)), (f / (float)Math.max(intrinsicWid, intrinsicHei)));
       p0.scale(this.b, this.b);
       p0.translate(((float)(- intrinsicWid) / 2.00f), ((float)(- intrinsicHei) / 2.00f));
       ta.draw(p0);
       p0.restoreToCount(i);
       return;
    }
    public final int getIntrinsicHeight(){
       nf0 ta = this.a;
       int intrinsicWid = ta.getIntrinsicWidth();
       return (int)((float)Math.max(intrinsicWid, ta.getIntrinsicHeight()) / this.b);
    }
    public final int getIntrinsicWidth(){
       nf0 ta = this.a;
       int intrinsicWid = ta.getIntrinsicWidth();
       return (int)((float)Math.max(intrinsicWid, ta.getIntrinsicHeight()) / this.b);
    }
    public final int getOpacity(){
       int alpha = this.d.getAlpha();
       int i = -3;
       if (alpha) {
          alpha = (alpha != 255)? -3: -1;
       }else {
          alpha = -2;
       }
       if (alpha != i) {
          i = (alpha != -1)? this.a.getOpacity(): -1;
       }
       return i;
    }
    public final boolean isStateful(){
       nf0 te = this.e;
       boolean b = true;
       te = (te != null && te.isStateful() == b)? 1: 0;
       if (!te && !this.a.isStateful()) {
          b = false;
       }
       return b;
    }
    public final void onBoundsChange(Rect p0){
       co5.o(p0, "bounds");
       super.onBoundsChange(p0);
       nf0 ta = this.a;
       ta.setBounds(0, 0, ta.getIntrinsicWidth(), ta.getIntrinsicHeight());
    }
    public final boolean onStateChange(int[] p0){
       nf0 te;
       int colorForStat;
       co5.o(p0, "state");
       nf0 ta = this.a;
       boolean b = (ta.isStateful())? ta.setState(p0): 0;
       if ((te = this.e) != null) {
          nf0 td = this.d;
          int color = td.getColor();
          colorForStat = te.getColorForState(p0, color);
          td.setColor(colorForStat);
          this.g = colorForStat;
          if (colorForStat != color) {
             colorForStat = 1;
          label_002c :
             colorForStat = (colorForStat | b) | 0;
             this.b();
             if (colorForStat) {
                this.invalidateSelf();
             }
             return colorForStat;
          }
       }
       colorForStat = 0;
       goto label_002c ;
    }
    public final void setAlpha(int p0){
       this.f = p0;
       this.b();
       this.a.setAlpha(p0);
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
       this.d.setColorFilter(p0);
       this.c.setColorFilter(p0);
       this.a.setColorFilter(p0);
       this.invalidateSelf();
    }
}
