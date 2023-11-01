package p.kl7;
import p.ye7;
import java.lang.Math;
import java.lang.Object;

public final class kl7	// class@001c3a from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    public static final kl7 k;

    static {
       float f6;
       float f7;
       float[] h = ye7.h;
       float f = (float)(((double)ye7.a0() * 0x404fd4bbab8b494c) / 100.00f);
       float[][] f1 = ye7.f;
       int i = 0;
       int i1 = h[i];
       object oobject = f1[i];
       int i2 = h[1];
       int i3 = 2;
       int i4 = h[i3];
       float f2 = (oobject[i3] * i4) + ((oobject[1] * i2) + (oobject[i] * i1));
       object oobject1 = f1[1];
       float f3 = (oobject1[i3] * i4) + ((oobject1[1] * i2) + (oobject1[i] * i1));
       object oobject2 = f1[i3];
       float f4 = (i4 * oobject2[i3]) + ((i2 * oobject2[1]) + (i1 * oobject2[i]));
       float f5 = 0x3f800000;
       if ((0x3feccccccccccccd - (double)f5) >= 0) {
          f6 = 0.10f;
          f7 = 0x3f170a3d;
       }else {
          f6 = 0.13f;
          f7 = 0x3f066666;
       }
       float f8 = f6 + f7;
       f6 = (f5 - ((float)Math.exp((double)(((- f) - 42.00f) / 92.00f)) * 0.28f)) * f5;
       double d = (double)f6;
       if ((0x3ff0000000000000 - d) > 0) {
          f6 = 0x3f800000;
       }else if((d) < 0){
          f6 = 0;
       }
       float[] uofloatArray = new float[]{(((100.00f / f2) * f6) + f5) - f6,(((100.00f / f3) * f6) + f5) - f6,(((100.00f / f4) * f6) + f5) - f6};
       f6 = f5 / ((5.00f * f) + f5);
       float f9 = ((f6 * f6) * f6) * f6;
       f5 = f5 - f9;
       f = (((0.10f * f5) * f5) * (float)Math.cbrt(((double)f * 5.00f))) + (f9 * f);
       float f10 = ye7.a0() / h[1];
       double d1 = (double)f10;
       f5 = 0x3f39999a / (float)Math.pow(d1, 0x3fc999999999999a);
       float[] uofloatArray1 = new float[3];
       uofloatArray1[0] = (float)Math.pow(((double)((uofloatArray[i] * f) * f2) / 100.00f), 0x3fdae147ae147ae1);
       uofloatArray1[1] = (float)Math.pow(((double)((uofloatArray[1] * f) * f3) / 100.00f), 0x3fdae147ae147ae1);
       f6 = (float)Math.pow(((double)((uofloatArray[2] * f) * f4) / 100.00f), 0x3fdae147ae147ae1);
       uofloatArray1[2] = f6;
       int i5 = uofloatArray1[i];
       f2 = i5 * 400.00f;
       int i6 = uofloatArray1[1];
       float kl7 f11 = i6 * 400.00f;
       float f12 = 400.00f * f6;
       float[] uofloatArray2 = uofloatArray;
       f11 = new kl7(f10, ((((f12 / (f6 + 27.13f)) * 0.05f) + (((f2 / (i5 + 27.13f)) * 2.00f) + (f11 / (i6 + 27.13f)))) * f5), f5, f5, f8, 0x3f800000, uofloatArray2, f, (float)Math.pow((double)f, 0x3fd0000000000000), ((float)Math.sqrt(d1) + 0x3fbd70a4));
       kl7.k = f11;
    }
    public void kl7(float p0,float p1,float p2,float p3,float p4,float p5,float[] p6,float p7,float p8,float p9){
       super();
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
}
