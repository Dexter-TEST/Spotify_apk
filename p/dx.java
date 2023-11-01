package p.dx;
import android.graphics.drawable.Drawable;
import p.nf0;
import p.cx;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.Rect;
import android.graphics.Matrix;
import java.lang.IllegalArgumentException;
import android.graphics.RectF;
import android.graphics.Matrix$ScaleToFit;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.ColorFilter;

public final class dx extends Drawable	// class@0013da from classes.dex
{
    public final Drawable a;
    public final Drawable b;
    public final cx c;
    public final Rect d;
    public final Matrix e;
    public final Matrix f;
    public static final int g;

    public void dx(Drawable p0,nf0 p1,cx p2){
       int intrinsicHei;
       co5.o(p0, "drawable");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       int intrinsicWid = p1.getIntrinsicWidth();
       int i = 1;
       int i1 = (intrinsicWid >= 0)? 1: 0;
       if (i1) {
          if ((intrinsicHei = p1.getIntrinsicHeight()) < 0) {
             i = 0;
          }
          if (i) {
             this.d = new Rect(0, 0, intrinsicWid, intrinsicHei);
             this.e = new Matrix();
             this.f = new Matrix();
             return;
          }else {
             throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.".toString());
          }
       }else {
          throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.".toString());
       }
    }
    public static void a(Drawable p0,Rect p1,Matrix p2,boolean p3){
       RectF rectF = new RectF();
       RectF rectF1 = new RectF();
       int intrinsicHei = p0.getIntrinsicHeight();
       int intrinsicWid = p0.getIntrinsicWidth();
       p2.reset();
       if (!p3 && (intrinsicHei >= 0 && intrinsicWid >= 0)) {
          p0.setBounds(0, 0, intrinsicWid, intrinsicHei);
          rectF.set(0, 0, (float)intrinsicWid, (float)intrinsicHei);
          rectF1.set(p1);
          if (!co5.c(rectF, rectF1)) {
             p2.setRectToRect(rectF, rectF1, Matrix$ScaleToFit.CENTER);
             p2.mapRect(rectF);
             p2.postScale(Math.max((rectF1.width() / rectF.width()), (rectF1.height() / rectF.height())), Math.max((rectF1.width() / rectF.width()), (rectF1.height() / rectF.height())), rectF1.centerX(), rectF1.centerY());
          }
       }else {
          p0.setBounds(p1);
       }
       return;
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       dx te = this.e;
       dx ta = this.a;
       if (!te.isIdentity()) {
          p0.concat(te);
          ta.draw(p0);
          p0.restoreToCount(p0.save());
       }else {
          ta.draw(p0);
       }
       te = this.f;
       ta = this.b;
       if (!te.isIdentity()) {
          p0.concat(te);
          ta.draw(p0);
          p0.restoreToCount(p0.save());
       }else {
          ta.draw(p0);
       }
       return;
    }
    public final int getIntrinsicHeight(){
       int i = (this.c.d != null)? -1: this.a.getIntrinsicHeight();
       return i;
    }
    public final int getIntrinsicWidth(){
       int i = (this.c.d != null)? -1: this.a.getIntrinsicWidth();
       return i;
    }
    public final int getOpacity(){
       return Drawable.resolveOpacity(this.a.getOpacity(), this.b.getOpacity());
    }
    public final void onBoundsChange(Rect p0){
       cx a;
       int i1;
       co5.o(p0, "bounds");
       dx tc = this.c;
       int i = 1;
       dx.a(this.a, p0, this.e, (tc.d ^ i));
       cx c = ((a = tc.a) != 3 && a != i)? 0: 1;
       if (a != i && a != 2) {
          i = 0;
       }
       dx td = this.d;
       c = (i1)? tc.c: (p0.right - tc.c) - td.width();
       cx b = (i)? tc.b: (p0.bottom - tc.b) - td.height();
       td.offsetTo(c, b);
       dx.a(this.b, td, this.f, false);
       return;
    }
    public final void setAlpha(int p0){
       this.a.setAlpha(p0);
       this.b.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.a.setColorFilter(p0);
    }
}
