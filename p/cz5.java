package p.cz5;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.PorterDuffColorFilter;
import p.dz5;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;

public final class cz5 extends Drawable	// class@0012aa from classes.dex
{
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff$Mode k;

    public void cz5(float p0,ColorStateList p1){
       super();
       this.f = false;
       this.g = true;
       this.k = PorterDuff$Mode.SRC_IN;
       this.a = p0;
       this.b = new Paint(5);
       this.b(p1);
       this.c = new RectF();
       this.d = new Rect();
    }
    public final PorterDuffColorFilter a(ColorStateList p0,PorterDuff$Mode p1){
       if (p0 != null && p1 != null) {
          return new PorterDuffColorFilter(p0.getColorForState(this.getState(), 0), p1);
       }
       return null;
    }
    public final void b(ColorStateList p0){
       if (p0 == null) {
          p0 = ColorStateList.valueOf(0);
       }
       this.h = p0;
       this.b.setColor(p0.getColorForState(this.getState(), this.h.getDefaultColor()));
       return;
    }
    public final void c(Rect p0){
       if (p0 == null) {
          p0 = this.getBounds();
       }
       cz5 tc = this.c;
       tc.set((float)p0.left, (float)p0.top, (float)p0.right, (float)p0.bottom);
       cz5 td = this.d;
       td.set(p0);
       if (this.f != null) {
          float f = dz5.a(this.e, this.a, this.g);
          cz5 te = this.e;
          cz5 ta = this.a;
          if (this.g != null) {
             te = (float)(((0x3ff0000000000000 - dz5.a) * (double)ta) + (double)te);
          }
          td.inset((int)Math.ceil((double)te), (int)Math.ceil((double)f));
          tc.set(td);
       }
       return;
    }
    public final void draw(Canvas p0){
       int i;
       cz5 tb = this.b;
       if (this.i != null && tb.getColorFilter() == null) {
          tb.setColorFilter(this.i);
          i = 1;
       }else {
          i = 0;
       }
       p0.drawRoundRect(this.c, this.a, this.a, tb);
       if (i) {
          tb.setColorFilter(null);
       }
       return;
    }
    public final int getOpacity(){
       return -3;
    }
    public final void getOutline(Outline p0){
       p0.setRoundRect(this.d, this.a);
    }
    public final boolean isStateful(){
       cz5 tj;
       boolean b = ((tj = this.j) != null && (tj.isStateful() || ((tj = this.h) != null && (tj.isStateful() || super.isStateful()))))? true: false;
       return b;
    }
    public final void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.c(p0);
    }
    public final boolean onStateChange(int[] p0){
       cz5 tj;
       cz5 th = this.h;
       int colorForStat = th.getColorForState(p0, th.getDefaultColor());
       th = this.b;
       boolean b = (colorForStat != th.getColor())? true: false;
       if (b) {
          th.setColor(colorForStat);
       }
       if ((tj = this.j) != null && (th = this.k) != null) {
          this.i = this.a(tj, th);
          return true;
       }else {
          return b;
       }
    }
    public final void setAlpha(int p0){
       this.b.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
    public final void setTintList(ColorStateList p0){
       this.j = p0;
       this.i = this.a(p0, this.k);
       this.invalidateSelf();
    }
    public final void setTintMode(PorterDuff$Mode p0){
       this.k = p0;
       this.i = this.a(this.j, p0);
       this.invalidateSelf();
    }
}
