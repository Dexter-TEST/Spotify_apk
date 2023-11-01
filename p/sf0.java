package p.sf0;
import android.graphics.drawable.Drawable;
import android.content.Context;
import p.sp6;
import android.graphics.Paint;
import p.lp6;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public final class sf0 extends Drawable	// class@002616 from classes.dex
{
    public final float a;
    public final lp6 b;
    public final int c;
    public final Paint d;

    public void sf0(Context p0,float p1,float p2,int p3,int p4){
       super();
       this.d = new Paint(1);
       lp6 olp6 = new lp6(p0, sp6.q0, p1);
       this.b = olp6;
       olp6.b(p4);
       this.a = p2;
       this.c = p3;
    }
    public final void draw(Canvas p0){
       float f = this.getBounds().exactCenterX();
       float f1 = this.getBounds().exactCenterY();
       sf0 td = this.d;
       td.setColor(this.c);
       p0.drawCircle(f, f1, (this.a / 2.00f), td);
       p0.save();
       td = this.b;
       p0.translate((f - ((float)td.getIntrinsicWidth() / 2.00f)), (f1 - ((float)td.getIntrinsicHeight() / 2.00f)));
       td.draw(p0);
       p0.restore();
    }
    public final int getIntrinsicHeight(){
       return (int)this.a;
    }
    public final int getIntrinsicWidth(){
       return (int)this.a;
    }
    public final int getOpacity(){
       return -2;
    }
    public final void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       sf0 tb = this.b;
       tb.setBounds(0, 0, tb.getIntrinsicWidth(), tb.getIntrinsicHeight());
    }
    public final void setAlpha(int p0){
       this.d.setAlpha(p0);
       this.b.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.d.setColorFilter(p0);
       this.b.setColorFilter(p0);
    }
}
