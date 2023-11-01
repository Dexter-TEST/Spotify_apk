package p.ai7;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class ai7 implements Interpolator	// class@000f8e from classes.dex
{
    public final int a;

    public void ai7(int p0){
       this.a = p0;
       super();
    }
    public final float getInterpolation(float p0){
       switch (this.a){
           case 0:
             p0 = p0 - 0x3f800000;
             return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
           case 1:
             return ((((p0 * p0) * p0) * p0) * p0);
           case 2:
             p0 = p0 - 0x3f800000;
             return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
           case 3:
             p0 = p0 - 0x3f800000;
             return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
           default:
             p0 = p0 - 0x3f800000;
             return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
       }
    }
}
