package p.kd0;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import android.text.style.DynamicDrawableSpan;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Rect;
import java.lang.Math;

public final class kd0 extends ImageSpan	// class@001bee from classes.dex
{

    public void kd0(Drawable p0){
       super(p0);
    }
    public final void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       Drawable drawable = this.getDrawable();
       p0.save();
       Paint$FontMetrics descent = p8.getFontMetrics().descent;
       float f = (float)p6 + descent;
       p0.translate(p4, ((f - ((descent - p8.getFontMetrics().ascent) / 2.00f)) - ((float)drawable.getIntrinsicHeight() / 2.00f)));
       drawable.draw(p0);
       p0.restore();
    }
    public final int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       Drawable drawable = this.getDrawable();
       Rect bounds = drawable.getBounds();
       if (p4 != null) {
          Paint$FontMetricsInt fontMetricsI = p0.getFontMetricsInt();
          Paint$FontMetricsInt ascent = fontMetricsI.ascent;
          p3 = ((fontMetricsI.descent - ascent) / 2) + ascent;
          int i = ((- drawable.getBounds().height()) / 2) + p3;
          int i1 = (drawable.getBounds().height() / 2) + p3;
          p3 = Math.min(fontMetricsI.ascent, i);
          int i2 = Math.max(fontMetricsI.descent, i1);
          p4.ascent = p3;
          p4.descent = i2;
          p4.top = p3;
          p4.bottom = i2;
       }
       return bounds.right;
    }
}
