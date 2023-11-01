package p.ez5;
import p.q77;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;
import p.co5;
import android.graphics.Paint;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.Matrix;
import java.lang.Math;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;

public final class ez5 implements q77	// class@00152a from classes.dex
{
    public final Integer a;

    public void ez5(Integer p0){
       super();
       this.a = p0;
    }
    public final String a(){
       return "rounded_corner";
    }
    public final Bitmap b(Bitmap p0,Integer p1,Integer p2){
       ez5 a;
       Object obj = p0;
       co5.o(obj, "input");
       int i = p1.intValue();
       float f = ((a = this.a) != null)? (float)a.intValue(): (float)i * 0.10f;
       Paint paint = new Paint(3);
       int i1 = p1.intValue();
       int i2 = p2.intValue();
       Bitmap uBitmap = Bitmap.createBitmap(i1, i2, p0.getConfig());
       co5.l(uBitmap, "createBitmap\(outputWidth…tputHeight, input.config\)");
       Canvas uCanvas = new Canvas(uBitmap);
       uCanvas.drawColor(0, PorterDuff$Mode.CLEAR);
       Matrix matrix = new Matrix();
       BitmapShader float f1 = (float)Math.max(((double)i1 / (double)p0.getWidth()), ((double)i2 / (double)p0.getHeight()));
       float f2 = (float)2;
       matrix.setTranslate((((float)i1 - ((float)p0.getWidth() * f1)) / f2), (((float)i2 - ((float)p0.getHeight() * f1)) / f2));
       matrix.preScale(f1, f1);
       f1 = new BitmapShader(obj, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       f1.setLocalMatrix(matrix);
       paint.setShader(f1);
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
       Path path = new Path();
       path.addRoundRect(new RectF(0, 0, (float)uCanvas.getWidth(), (float)uCanvas.getHeight()), uofloatArray, Path$Direction.CW);
       uCanvas.drawPath(path, paint);
       if (!co5.c(obj, uBitmap)) {
          p0.recycle();
       }
       return uBitmap;
    }
}
