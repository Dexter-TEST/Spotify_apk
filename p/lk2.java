package p.lk2;
import android.text.style.ReplacementSpan;
import android.content.Context;
import android.graphics.Rect;
import p.l95;
import android.widget.TextView;
import java.lang.Object;
import java.util.Map;
import p.k95;
import java.lang.Class;
import android.util.AttributeSet;
import android.view.View;
import p.hm1;
import p.bc2;
import android.text.TextPaint;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.String;
import android.graphics.RectF;
import java.lang.Math;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint$FontMetrics;

public final class lk2 extends ReplacementSpan	// class@001d6d from classes.dex
{
    public final int a;
    public final TextPaint b;
    public final Drawable c;
    public final Rect t;

    public void lk2(Context p0,int p1,int p2){
       super();
       this.t = new Rect();
       this.a = p2;
       k95 ok95 = l95.c.get(TextView.class);
       ok95.getClass();
       if (!p1) {
          p1 = ok95.b();
       }
       View view = ok95.a(p0, null, p1);
       if (view instanceof TextView && !view instanceof hm1) {
          bc2.a(view, p0);
       }
       TextPaint paint = view.getPaint();
       this.b = paint;
       paint.setColor(view.getTextColors().getDefaultColor());
       this.c = view.getBackground();
       return;
    }
    public final void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       lk2 c;
       lk2 olk2 = this;
       Canvas uCanvas = p0;
       float f = p4;
       p0.save();
       lk2 t = olk2.t;
       p8.getTextBounds("X", 0, 1, t);
       lk2 b = olk2.b;
       lk2 a = olk2.a;
       uCanvas.translate(0, (- b.descent()));
       uCanvas.translate(0, (((float)(int)(b.descent() - b.ascent()) - (float)t.height()) / 2.00f));
       float f1 = (float)p6;
       RectF rectF = new RectF(f, (b.ascent() + f1), ((b.measureText(p1, p2, p3) + (float)(a * 2)) + f), (b.descent() + f1));
       if ((c = olk2.c) != null) {
          c.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
          c.draw(uCanvas);
       }
       uCanvas.translate((float)a, 0);
       p0.drawText(p1, p2, p3, p4, f1, b);
       p0.restore();
       return;
    }
    public final int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (p4 != null) {
          Paint$FontMetrics fontMetrics = p0.getFontMetrics();
          p4.ascent = (int)fontMetrics.ascent;
          p4.bottom = (int)fontMetrics.bottom;
          p4.descent = (int)fontMetrics.descent;
          p4.leading = (int)fontMetrics.leading;
          p4.top = (int)fontMetrics.top;
       }
       return (int)(this.b.measureText(p1, p2, p3) + (float)(this.a * 2));
    }
}
