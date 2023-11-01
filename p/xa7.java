package p.xa7;
import android.text.style.ReplacementSpan;
import p.tj1;
import android.graphics.Paint$FontMetricsInt;
import java.lang.NullPointerException;
import java.lang.String;
import android.graphics.Paint;
import java.lang.CharSequence;
import java.lang.Math;
import p.e94;
import p.oz6;
import java.nio.ByteBuffer;
import android.graphics.Canvas;
import p.hj1;
import java.lang.Class;
import java.lang.Object;
import p.j8;
import android.graphics.Typeface;

public final class xa7 extends ReplacementSpan	// class@002c3e from classes.dex
{
    public final Paint$FontMetricsInt a;
    public final tj1 b;
    public float c;

    public void xa7(tj1 p0){
       super();
       this.a = new Paint$FontMetricsInt();
       this.c = 0x3f800000;
       if (p0 == null) {
          throw new NullPointerException("metadata cannot be null");
       }
       this.b = p0;
       return;
    }
    public final int a(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       xa7 ta = this.a;
       p0.getFontMetricsInt(ta);
       float f = (float)Math.abs((ta.descent - ta.ascent)) * 0x3f800000;
       xa7 tb = this.b;
       e94 uoe94 = tb.d();
       int i = 14;
       int i1 = uoe94.a(i);
       int i2 = 0;
       short shortx = (i1)? uoe94.b.getShort((i1 + uoe94.a)): 0;
       this.c = f / (float)shortx;
       e94 uoe941 = tb.d();
       if (shortx = uoe941.a(i)) {
          uoe941.b.getShort((shortx + uoe941.a));
       }
       uoe941 = tb.d();
       if (tb = uoe941.a(12)) {
          i2 = uoe941.b.getShort((tb + uoe941.a));
       }
       short s = (short)(int)((float)i2 * this.c);
       if (p4 != null) {
          p4.ascent = ta.ascent;
          p4.descent = ta.descent;
          p4.top = ta.top;
          p4.bottom = ta.bottom;
       }
       return s;
    }
    public final void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       Paint paint = p8;
       hj1.a().getClass();
       xa7 b = this.b;
       tj1 b1 = b.b;
       paint.setTypeface(b1.v);
       p0.drawText(b1.c, (b.a * 2), 2, p4, (float)p6, p8);
       paint.setTypeface(p8.getTypeface());
    }
    public final int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       return this.a(p0, p1, p2, p3, p4);
    }
}
