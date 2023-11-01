package p.rp6;
import android.text.style.ImageSpan;
import p.lp6;
import p.qp6;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import android.text.style.DynamicDrawableSpan;
import android.graphics.Rect;

public final class rp6 extends ImageSpan	// class@002534 from classes.dex
{
    public final qp6 a;
    public final boolean b;

    public void rp6(lp6 p0){
       super(p0, 0);
       this.a = qp6.a;
       this.b = true;
    }
    public static void a(rp6 p0,Canvas p1,CharSequence p2,int p3,int p4,float p5,int p6,int p7,int p8,Paint p9){
       if (p0.b != null) {
          p0.getDrawable().b(p9.getColor());
       }
       super.draw(p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return;
    }
    public static void b(rp6 p0,char p1,Canvas p2,CharSequence p3,int p4,int p5,float p6,int p7,int p8,Paint p9){
       lp6 drawable = p0.getDrawable();
       if (p0.b != null) {
          drawable.b(p9.getColor());
       }
       Rect rect = new Rect();
       char[] uocharArray = new char[]{p1};
       Paint paint = p9;
       paint.getTextBounds(uocharArray, 0, 1, rect);
       super.draw(p2, p3, p4, p5, p6, p7, p8, ((drawable.getIntrinsicHeight() / 2) + (p8 - (rect.height() / 2))), paint);
       return;
    }
    public final void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       this.a.a(this, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
}
