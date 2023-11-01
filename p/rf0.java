package p.rf0;
import p.q77;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Integer;
import p.co5;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;

public final class rf0 implements q77	// class@0024d4 from classes.dex
{

    public void rf0(){
       super();
    }
    public final String a(){
       return "circle";
    }
    public final Bitmap b(Bitmap p0,Integer p1,Integer p2){
       co5.o(p0, "input");
       int i = Math.min(p0.getWidth(), p0.getHeight());
       Bitmap uBitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
       co5.l(uBitmap, "createBitmap\(minSize, mi… Bitmap.Config.ARGB_8888\)");
       Paint paint = new Paint(1);
       paint.setShader(new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
       new Canvas(uBitmap).drawCircle(((float)i / 2.00f), ((float)i / 2.00f), ((float)i / 2.00f), paint);
       if (!co5.c(p0, uBitmap)) {
          p0.recycle();
       }
       return uBitmap;
    }
}
