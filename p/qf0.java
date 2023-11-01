package p.qf0;
import p.p77;
import java.lang.Object;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;

public final class qf0 implements p77	// class@00238b from classes.dex
{
    public final Paint a;

    public void qf0(){
       super();
       this.a = new Paint(1);
    }
    public final String a(){
       return "circle";
    }
    public final Bitmap b(Bitmap p0){
       Bitmap uBitmap;
       int i = Math.min(p0.getWidth(), p0.getHeight());
       if ((uBitmap = Bitmap.createBitmap(p0, ((p0.getWidth() - i) / 2), ((p0.getHeight() - i) / 2), i, i)) != p0) {
          p0.recycle();
       }
       p0 = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
       qf0 ta = this.a;
       ta.setShader(new BitmapShader(uBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
       new Canvas(p0).drawCircle(((float)i / 2.00f), ((float)i / 2.00f), ((float)i / 2.00f), ta);
       uBitmap.recycle();
       return p0;
    }
}
