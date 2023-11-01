package p.g71;
import p.ej1;
import java.lang.ThreadLocal;
import java.lang.Object;
import android.text.TextPaint;
import android.graphics.Paint;

public final class g71 implements ej1	// class@0016b1 from classes.dex
{
    public final TextPaint a;
    public static final ThreadLocal b;

    static {
       g71.b = new ThreadLocal();
    }
    public void g71(){
       super();
       TextPaint textPaint = new TextPaint();
       this.a = textPaint;
       textPaint.setTextSize(10.00f);
    }
}
