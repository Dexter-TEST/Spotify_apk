package p.tk2;
import p.p77;
import android.graphics.Paint;
import android.content.Context;
import p.wk2;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import p.uv1;
import p.d26;
import p.x65;
import p.z65;
import p.l75;
import p.lv1;
import p.ej0;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint$Style;

public final class tk2 implements p77	// class@002789 from classes.dex
{
    public final String a;
    public final Drawable b;
    public final wk2 c;
    public static final Paint d;

    static {
       tk2.d = new Paint(1);
    }
    public void tk2(Context p0,boolean p1){
       vk2 c = (p1)? wk2.c: wk2.b;
       super();
       this.c = c;
       this.a = "GlueRadioCardRippleTransformation \("+c+')';
       this.b = os0.b(p0, c.a);
       return;
    }
    public final String a(){
       return this.a;
    }
    public final Bitmap b(Bitmap p0){
       d26 uod26;
       Bitmap uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), p0.getConfig());
       Canvas uCanvas = new Canvas(uBitmap);
       Matrix matrix = new Matrix();
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.REPEAT, Shader$TileMode.REPEAT);
       try{
          uv1 ouv1 = new uv1(p0);
          uod26 = new d26(new x65(ouv1.b).a());
       }catch(java.lang.Exception e0){
          uod26 = new l75();
       }
       Rect clipBounds = uCanvas.getClipBounds();
       float f = (float)clipBounds.centerX();
       float f1 = (float)clipBounds.centerY();
       int i = Math.round(((float)Math.min(uCanvas.getWidth(), uCanvas.getHeight()) / 2.00f));
       matrix.preTranslate((- f), (- f1));
       uBitmapShade.setLocalMatrix(matrix);
       uCanvas.drawColor(ej0.p(uod26));
       uCanvas.save();
       uCanvas.translate(f, f1);
       tk2 tb = this.b;
       tb.setBounds((- i), (- i), i, i);
       tb.draw(uCanvas);
       uCanvas.restore();
       uCanvas.save();
       Paint d = tk2.d;
       d.setStyle(Paint$Style.FILL);
       d.setShader(uBitmapShade);
       uCanvas.translate(f, f1);
       uCanvas.scale(0x3f000000, 0x3f000000);
       this.c.a(uCanvas, (float)i, d);
       uCanvas.restore();
       p0.recycle();
       return e0;
    }
}
