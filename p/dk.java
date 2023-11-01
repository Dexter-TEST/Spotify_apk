package p.dk;
import android.animation.TypeEvaluator;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Math;
import p.et0;

public final class dk implements TypeEvaluator	// class@001367 from classes.dex
{
    public static final dk a;

    static {
       dk.a = new dk();
    }
    public void dk(){
       super();
    }
    public final Object evaluate(float p0,Object p1,Object p2){
       int i = p1.intValue();
       int i1 = p2.intValue();
       return Integer.valueOf((Math.round(((float)Math.pow((double)et0.l((float)Math.pow((double)((float)(i1 & 0x00ff) / 0x437f0000), 2.20f), (float)Math.pow((double)((float)(i & 0x00ff) / 0x437f0000), 2.20f), p0, (float)Math.pow((double)((float)(i & 0x00ff) / 0x437f0000), 2.20f)), 0x3fdd1745d1745d17) * 0x437f0000)) | (((Math.round(((float)Math.pow((double)et0.l((float)Math.pow((double)((float)((i1 >> 16) & 0x00ff) / 0x437f0000), 2.20f), (float)Math.pow((double)((float)((i >> 16) & 0x00ff) / 0x437f0000), 2.20f), p0, (float)Math.pow((double)((float)((i >> 16) & 0x00ff) / 0x437f0000), 2.20f)), 0x3fdd1745d1745d17) * 0x437f0000)) << 16) | (Math.round((et0.l(((float)((i1 >> 24) & 0x00ff) / 0x437f0000), ((float)((i >> 24) & 0x00ff) / 0x437f0000), p0, ((float)((i >> 24) & 0x00ff) / 0x437f0000)) * 0x437f0000)) << 24)) | (Math.round(((float)Math.pow((double)et0.l((float)Math.pow((double)((float)((i1 >> 8) & 0x00ff) / 0x437f0000), 2.20f), (float)Math.pow((double)((float)((i >> 8) & 0x00ff) / 0x437f0000), 2.20f), p0, (float)Math.pow((double)((float)((i >> 8) & 0x00ff) / 0x437f0000), 2.20f)), 0x3fdd1745d1745d17) * 0x437f0000)) << 8))));
    }
}
