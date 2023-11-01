package p.qd6;
import p.ud6;
import p.sd6;
import android.graphics.Matrix;
import p.zc6;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.lang.Math;
import java.lang.Class;
import java.lang.Object;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint;

public final class qd6 extends ud6	// class@00237f from classes.dex
{
    public final sd6 b;
    public final float c;
    public final float d;

    public void qd6(sd6 p0,float p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(Matrix p0,zc6 p1,int p2,Canvas p3){
       qd6 oqd6 = this;
       zc6 ozc6 = p1;
       int i = p2;
       Canvas uCanvas = p3;
       qd6 b = oqd6.b;
       qd6 d = oqd6.d;
       qd6 c = oqd6.c;
       RectF rectF = new RectF(0, 0, (float)Math.hypot((double)(b.c - d), (double)(b.b - c)), 0);
       Matrix matrix = new Matrix(p0);
       matrix.preTranslate(c, d);
       matrix.preRotate(this.b());
       p1.getClass();
       rectF.bottom = rectF.bottom + (float)i;
       rectF.offset(0, (float)(- i));
       int[] i1 = zc6.i;
       i1[0] = ozc6.f;
       i1[1] = ozc6.e;
       i1[2] = ozc6.d;
       ozc6 = ozc6.c;
       RectF left = rectF.left;
       LinearGradient i2 = new LinearGradient(left, rectF.top, left, rectF.bottom, i1, zc6.j, Shader$TileMode.CLAMP);
       ozc6.setShader(i);
       p3.save();
       uCanvas.concat(matrix);
       uCanvas.drawRect(rectF, ozc6);
       p3.restore();
    }
    public final float b(){
       qd6 tb = this.b;
       return (float)Math.toDegrees(Math.atan((double)((tb.c - this.d) / (tb.b - this.c))));
    }
}
