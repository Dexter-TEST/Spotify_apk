package p.j50;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Math;

public final class j50 implements Interpolator	// class@001a69 from classes.dex
{

    public void j50(){
       super();
    }
    public final float getInterpolation(float p0){
       double d = (double)p0;
       return (float)((Math.sin((((d - 0x3fc8000000000000) * 0x401921fb54442d18) / (double)0x3f400000)) * Math.pow(2.00f, (-10.00f * d))) + 0x3ff0000000000000);
    }
}
