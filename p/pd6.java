package p.pd6;
import p.ud6;
import p.rd6;
import android.graphics.Matrix;
import p.zc6;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.Region$Op;

public final class pd6 extends ud6	// class@002240 from classes.dex
{
    public final rd6 b;

    public void pd6(rd6 p0){
       super();
       this.b = p0;
    }
    public final void a(Matrix p0,zc6 p1,int p2,Canvas p3){
       zc6 ozc6 = p1;
       int i = p2;
       Canvas uCanvas = p3;
       pd6 b = this.b;
       rd6 f = b.f;
       rd6 g = b.g;
       RectF rectF = new RectF(b.b, b.c, b.d, b.e);
       p1.getClass();
       int i1 = 0;
       int i2 = 1;
       int i3 = 0;
       int i4 = ((g - i3) < 0)? 1: 0;
       zc6 g1 = ozc6.g;
       int[] k = zc6.k;
       int i5 = 3;
       int i6 = 2;
       if (i4) {
          k[i1] = i1;
          k[i2] = ozc6.f;
          k[i6] = ozc6.e;
          k[i5] = ozc6.d;
       }else {
          g1.rewind();
          g1.moveTo(rectF.centerX(), rectF.centerY());
          g1.arcTo(rectF, f, g);
          g1.close();
          rectF.inset((float)(- i), (float)(- i));
          k[i1] = i1;
          k[i2] = ozc6.d;
          k[i6] = ozc6.e;
          k[i5] = ozc6.f;
       }
       float f1 = 2.00f;
       float f2 = rectF.width() / f1;
       if ((f2 - i3) > 0) {
          float f3 = 0x3f800000;
          float RadialGradient f4 = f3 - ((float)i / f2);
          float[] l = zc6.l;
          l[i2] = f4;
          l[i6] = ((f3 - f4) / f1) + f4;
          f4 = new RadialGradient(rectF.centerX(), rectF.centerY(), f2, k, l, Shader$TileMode.CLAMP);
          zc6 b1 = ozc6.b;
          b1.setShader(f4);
          p3.save();
          uCanvas.concat(p0);
          uCanvas.scale(f3, (rectF.height() / rectF.width()));
          if (!i4) {
             uCanvas.clipPath(g1, Region$Op.DIFFERENCE);
             uCanvas.drawPath(g1, ozc6.h);
          }
          p3.drawArc(rectF, f, g, 1, b1);
          p3.restore();
       }
       return;
    }
}
