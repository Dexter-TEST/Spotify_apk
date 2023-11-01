package p.fc0;
import android.graphics.drawable.Drawable;
import android.content.Context;
import p.ec0;
import p.sp6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.Paint;
import android.content.res.Resources;
import p.xj0;
import p.lp6;
import android.graphics.Canvas;
import android.graphics.ColorFilter;

public final class fc0 extends Drawable	// class@00159b from classes.dex
{
    public final int a;
    public final ec0 b;
    public final sp6 c;
    public final float d;
    public final Paint e;
    public final float f;
    public final float g;
    public final float h;
    public final lp6 i;
    public final int j;
    public final int k;

    public void fc0(Context p0,int p1,ec0 p2,sp6 p3){
       co5.o(p0, "context");
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       float f = 0x3f800000;
       float f1 = (p3 == sp6.n0)? 0x3f733333: 0x3f800000;
       this.d = f1;
       this.e = new Paint(1);
       ec0 a = p2.a;
       this.f = (float)xj0.e0((float)a, p0.getResources());
       f1 = (float)xj0.e0((float)(a + 1), p0.getResources());
       this.g = f1;
       int i = xj0.e0((float)p2.b, p0.getResources());
       int i1 = i % 2;
       float f2 = (float)i;
       if (i1) {
          f2 = f2 + f;
       }
       this.h = f2;
       lp6 olp6 = new lp6(p0, p3, f2);
       olp6.b(-1);
       olp6.setBounds(0, 0, olp6.getIntrinsicWidth(), olp6.getIntrinsicHeight());
       this.i = olp6;
       f1 = (int)(f1 * (float)2);
       this.j = f1;
       this.k = xj0.e0(7.00f, p0.getResources());
       this.setBounds(0, 0, f1, f1);
       return;
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       fc0 te = this.e;
       te.setColor(0x33000000);
       fc0 tg = this.g;
       p0.drawCircle(tg, tg, tg, te);
       te.setColor(this.a);
       p0.drawCircle(tg, tg, this.f, te);
       float f = ((float)this.j - this.h) / (float)2;
       p0.translate(f, (this.d * f));
       this.i.draw(p0);
       p0.restoreToCount(p0.save());
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof fc0) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.b != p0.b) {
          b = false;
       }
       return b;
    }
    public final int getIntrinsicHeight(){
       return this.j;
    }
    public final int getIntrinsicWidth(){
       return this.j;
    }
    public final int getOpacity(){
       return -2;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.c.hashCode() + (this.a * 31)) * 31));
    }
    public final void setAlpha(int p0){
    }
    public final void setColorFilter(ColorFilter p0){
    }
}
