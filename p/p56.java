package p.p56;
import android.graphics.drawable.Drawable;
import p.yw6;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import p.t14;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.ColorFilter;

public final class p56 extends Drawable	// class@0021f7 from classes.dex
{
    public final t14 a;
    public final t14 b;
    public final t14 c;
    public final t14 d;
    public final t14 e;
    public final Paint f;
    public final RectF g;
    public static final yw6 h;

    static {
       p56.h = new yw6(12, Integer.class, "level");
    }
    public void p56(int p0,int p1,int p2,int p3){
       super();
       this.d = t14.c(0);
       this.e = t14.c(0);
       Paint paint = new Paint();
       this.f = paint;
       this.g = new RectF();
       paint.setColor(p3);
       t14 ot14 = t14.c(0x437f0000);
       this.b = ot14.e((float)p0).b();
       this.a = ot14.e((float)p1).b();
       this.c = ot14.e((float)p2).b();
    }
    public final void a(){
       p56 tg = this.g;
       tg.set(this.getBounds());
       float f = this.e.i((float)this.getLevel()) / 2.00f;
       float f1 = this.d.i((float)this.getLevel()) / 2.00f;
       tg.offset((f - f1), 0);
       tg.inset(((this.b.i((float)this.getLevel()) + f1) + f), this.a.i((float)this.getLevel()));
       this.invalidateSelf();
    }
    public final void draw(Canvas p0){
       p0.drawRoundRect(this.g, this.c.i((float)this.getLevel()), this.c.i((float)this.getLevel()), this.f);
    }
    public final int getOpacity(){
       return -1;
    }
    public final void onBoundsChange(Rect p0){
       this.a();
    }
    public final boolean onLevelChange(int p0){
       this.a();
       return true;
    }
    public final void setAlpha(int p0){
    }
    public final void setColorFilter(ColorFilter p0){
    }
}
