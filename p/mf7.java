package p.mf7;
import p.cf7;
import java.lang.Math;
import android.graphics.Path;
import java.lang.Object;
import java.lang.ThreadLocal;
import android.graphics.PathMeasure;
import p.wa4;
import java.io.Closeable;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.RectF;
import p.zh3;
import android.os.Build$VERSION;
import android.graphics.Paint;

public abstract class mf7	// class@001e88 from classes.dex
{
    public static final cf7 a;
    public static final cf7 b;
    public static final cf7 c;
    public static final cf7 d;
    public static final float e;

    static {
       mf7.a = new cf7(0);
       mf7.b = new cf7(1);
       mf7.c = new cf7(2);
       mf7.d = new cf7(3);
       mf7.e = (float)(Math.sqrt(2.00f) / 2.00f);
    }
    public static void a(Path p0,float p1,float p2,float p3){
       PathMeasure pathMeasure = mf7.a.get();
       Path path = mf7.b.get();
       Path path1 = mf7.c.get();
       pathMeasure.setPath(p0, false);
       float length = pathMeasure.getLength();
       float f = 0x3f800000;
       if (!(f - p1) && !(0 - p2)) {
          return;
       }
       if ((length - f) >= 0 && ((double)Math.abs(((p2 - p1) - f)) - 0x3f847ae147ae147b) >= 0) {
          p1 = p1 * length;
          p2 = p2 * length;
          f = Math.min(p1, p2);
          p3 = p3 * length;
          f = f + p3;
          p1 = Math.max(p1, p2) + p3;
          if ((length - f) >= 0 && (length - p1) >= 0) {
             f = (float)wa4.c(f, length);
             p1 = (float)wa4.c(p1, length);
          }
          if ((f) < 0) {
             f = (float)wa4.c(f, length);
          }
          if ((p1) < 0) {
             p1 = (float)wa4.c(p1, length);
          }
          if (!(p2 = p1 - f)) {
             p0.reset();
             return;
          }else if(p2 >= 0){
             f = f - length;
          }
          path.reset();
          pathMeasure.getSegment(f, p1, path, true);
          if ((length - p1) > 0) {
             path1.reset();
             pathMeasure.getSegment(0, (p1 % length), path1, true);
             path.addPath(path1);
          }else if((f) < 0){
             path1.reset();
             pathMeasure.getSegment((f + length), length, path1, true);
             path.addPath(path1);
          }
          p0.set(path);
       }
       return;
    }
    public static void b(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static float c(){
       return Resources.getSystem().getDisplayMetrics().density;
    }
    public static float d(Matrix p0){
       float[] uofloatArray = mf7.d.get();
       uofloatArray[0] = 0;
       uofloatArray[1] = 0;
       float e = mf7.e;
       uofloatArray[2] = e;
       uofloatArray[3] = e;
       p0.mapPoints(uofloatArray);
       return (float)Math.hypot((double)(uofloatArray[2] - uofloatArray[0]), (double)(uofloatArray[3] - uofloatArray[1]));
    }
    public static void e(Canvas p0,RectF p1,zh3 p2,int p3){
       if (Build$VERSION.SDK_INT < 23) {
          p0.saveLayer(p1, p2, p3);
       }else {
          p0.saveLayer(p1, p2);
       }
       return;
    }
}
