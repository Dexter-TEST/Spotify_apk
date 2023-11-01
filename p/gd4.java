package p.gd4;
import java.lang.Float;
import p.x3;
import java.lang.Object;
import p.id4;
import p.kd4;
import android.animation.ValueAnimator;

public abstract class gd4	// class@0016e9 from classes.dex
{
    public static final x3 a;
    public static final float[] b;

    static {
       gd4.a = new x3(Float.valueOf(0x3f800000));
       gd4.b = new float[2]{0,0x3f800000};
    }
    public static kd4 a(id4 p0){
       kd4 okd4 = new kd4(p0);
       okd4.setFloatValues(gd4.b);
       okd4.setDuration((long)(gd4.a.a.floatValue() * (float)p0.d()));
       return okd4;
    }
}
