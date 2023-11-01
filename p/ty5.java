package p.ty5;
import p.p77;
import android.content.Context;
import java.lang.Object;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import java.lang.StringBuilder;
import java.lang.String;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint$Style;

public final class ty5 implements p77	// class@002809 from classes.dex
{
    public final Drawable a;
    public final String b;
    public final boolean c;

    public void ty5(Context p0,boolean p1){
       super();
       this.a = os0.b(p0, R.drawable.collection_station_ripple);
       this.c = p1;
       String str = "RippleListItemTransformation";
       char c = (p1)? '1': '0';
       this.b = str+c;
       return;
    }
    public final String a(){
       return this.b;
    }
    public final Bitmap b(Bitmap p0){
       Bitmap uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), p0.getConfig());
       Canvas uCanvas = new Canvas(uBitmap);
       Paint paint = new Paint(1);
       Matrix matrix = new Matrix();
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       Rect clipBounds = uCanvas.getClipBounds();
       float f = (float)clipBounds.centerX();
       float f1 = (float)clipBounds.centerY();
       int i = Math.min(uCanvas.getWidth(), uCanvas.getHeight()) / 2;
       matrix.postTranslate((- f), (- f1));
       uBitmapShade.setLocalMatrix(matrix);
       paint.setStyle(Paint$Style.FILL);
       paint.setShader(uBitmapShade);
       uCanvas.save();
       uCanvas.translate(f, f1);
       int i1 = - i;
       ty5 ta = this.a;
       ta.setBounds(i1, i1, i, i);
       ta.draw(uCanvas);
       uCanvas.restore();
       uCanvas.save();
       uCanvas.translate(f, f1);
       uCanvas.scale(0x3f2147ae, 0x3f2147ae);
       if (this.c != null) {
          uCanvas.drawCircle(0, 0, (float)i, paint);
       }else {
          f1 = (float)i1;
          float f2 = (float)i;
          uCanvas.drawRect(f1, f1, f2, f2, paint);
       }
       uCanvas.restore();
       p0.recycle();
       return uBitmap;
    }
}
