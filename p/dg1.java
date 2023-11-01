package p.dg1;
import android.view.animation.PathInterpolator;
import p.s95;

public abstract class dg1	// class@00133d from classes.dex
{
    public static final PathInterpolator a;
    public static final PathInterpolator b;
    public static final PathInterpolator c;
    public static final PathInterpolator d;

    static {
       dg1.a = s95.b(0x3f19999a, 0, 0x3f333333, 0x3f800000);
       dg1.b = s95.b(0.30f, 0, 0.40f, 0x3f800000);
       dg1.c = s95.b(0x3f800000, 0, 0x3f333333, 0x3f800000);
       dg1.d = s95.b(0.30f, 0, 0, 0x3f800000);
       s95.b(0x3f800000, 0, 0x3f800000, 0x3f800000);
       s95.b(0, 0, 0, 0x3f800000);
       s95.b(0.30f, 0, 0x3f333333, 0x3f800000);
    }
}
