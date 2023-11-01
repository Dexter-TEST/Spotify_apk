package p.jp6;
import p.kp6;
import p.lp6;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.String;
import android.graphics.Paint;

public final class jp6 implements kp6	// class@001b1f from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int t;
    public final lp6 v;

    public void jp6(lp6 p0){
       this.v = p0;
       super();
    }
    public final int a(){
       return ((this.v.h.height() + this.b) + this.t);
    }
    public final void c(Canvas p0){
       jp6 tv = this.v;
       tv.getBounds();
       p0.translate((float)(this.a - tv.h.left), ((float)this.b + tv.j));
       p0.drawText(tv.a(), 0, 1, 0, 0, tv.f);
       p0.restoreToCount(p0.save());
    }
    public final int i(){
       lp6 h = this.v.h;
       return (((h.right - h.left) + this.a) + this.c);
    }
}
