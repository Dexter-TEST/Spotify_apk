package p.dd6;
import java.lang.Object;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import p.bd6;
import p.b7;
import android.graphics.Path;

public final class dd6	// class@001328 from classes.dex
{
    public final float a;
    public final RectF b;
    public final Object c;
    public final Object d;
    public Object e;

    public void dd6(int p0,float p1,int p2){
       LinearGradient p1;
       super();
       this.c = new Paint(1);
       this.d = new Matrix();
       this.b = new RectF();
       this.a = p1;
       p1 = new LinearGradient(0, 0, 0x3f800000, 0x3f800000, p0, p2, Shader$TileMode.CLAMP);
       this.e = p1;
    }
    public void dd6(bd6 p0,float p1,RectF p2,b7 p3,Path p4){
       super();
       this.e = p3;
       this.c = p0;
       this.a = p1;
       this.b = p2;
       this.d = p4;
    }
}
