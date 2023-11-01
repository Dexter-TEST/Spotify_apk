package p.kb0;
import java.lang.Object;
import p.kl7;
import android.graphics.Color;
import p.ye7;
import java.lang.Math;
import p.lj0;

public final class kb0	// class@001bdc from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public void kb0(float p0,float p1,float p2,float p3,float p4,float p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public static kb0 a(int p0){
       kl7 k = kl7.k;
       float f = ye7.I(Color.red(p0));
       float f1 = ye7.I(Color.green(p0));
       float f2 = ye7.I(Color.blue(p0));
       float[][] i = ye7.i;
       object oobject = i[0];
       float f3 = (oobject[2] * f2) + ((oobject[1] * f1) + (oobject[0] * f));
       object oobject1 = i[1];
       float f4 = (oobject1[2] * f2) + ((oobject1[1] * f1) + (oobject1[0] * f));
       object oobject2 = i[2];
       f2 = (f2 * oobject2[2]) + ((f1 * oobject2[1]) + (f * oobject2[0]));
       float[][] f5 = ye7.f;
       object oobject3 = f5[0];
       oobject2 = f5[1];
       object oobject4 = f5[2];
       kl7 g = k.g;
       float f6 = g[0] * ((oobject3[2] * f2) + ((oobject3[1] * f4) + (oobject3[0] * f3)));
       f1 = g[1] * ((oobject2[2] * f2) + ((oobject2[1] * f4) + (oobject2[0] * f3)));
       f = g[2] * ((f2 * oobject4[2]) + ((f4 * oobject4[1]) + (f3 * oobject4[0])));
       kl7 h = k.h;
       double d = 100.00f;
       f2 = (float)Math.pow(((double)(Math.abs(f6) * h) / d), 0x3fdae147ae147ae1);
       f3 = (float)Math.pow(((double)(Math.abs(f1) * h) / d), 0x3fdae147ae147ae1);
       float f7 = (float)Math.pow(((double)(Math.abs(f) * h) / d), 0x3fdae147ae147ae1);
       f6 = (Math.signum(f6) * 400.00f) * f2;
       f6 = f6 / (f2 + 27.13f);
       f1 = (Math.signum(f1) * 400.00f) * f3;
       f1 = f1 / (f3 + 27.13f);
       f = (Math.signum(f) * 400.00f) * f7;
       f = f / (f7 + 27.13f);
       double d1 = (double)f;
       f3 = (float)((((double)f1 * -12.00f) + ((double)f6 * 11.00f)) + d1) / 11.00f;
       f2 = (float)((double)(f6 + f1) - (d1 * 2.00f)) / 9.00f;
       f1 = f1 * 20.00f;
       float f8 = ((21.00f * f) + ((f6 * 20.00f) + f1)) / 20.00f;
       f6 = (((f6 * 40.00f) + f1) + f) / 20.00f;
       f1 = 180.00f;
       f7 = 0x40490fdb;
       f = ((float)Math.atan2((double)f2, (double)f3) * f1) / f7;
       float f9 = 360.00f;
       if ((f) < 0) {
          f = f + f9;
       }else if((f9 - f) >= 0){
          f = f - f9;
       }
       float f10 = f;
       f7 = (f7 * f10) / f1;
       g = k.a;
       kl7 d2 = k.d;
       f1 = (float)Math.pow((double)((f6 * k.b) / g), (double)(k.j * d2)) * 100.00f;
       Math.sqrt((double)(f1 / 100.00f));
       f = g + 4.00f;
       f9 = (((double)f10 - 0x403423d70a3d70a4) < 0)? f9 + f10: f10;
       f2 = (float)Math.pow((0x3ffa3d70a3d70a3d - Math.pow(0x3fd28f5c28f5c28f, (double)k.f)), 0x3fe75c28f5c28f5c) * (float)Math.pow((double)(((((((float)(Math.cos(((((double)f9 * 0x400921fb54442d18) / 180.00f) + 2.00f)) + 3.80f) * 0.25f) * 3846.15f) * k.e) * k.c) * (float)Math.sqrt((double)((f2 * f2) + (f3 * f3)))) / (f8 + 0x3e9c28f6)), 0x3feccccccccccccd);
       float f11 = f2 * (float)Math.sqrt(((double)f1 / 100.00f));
       Math.sqrt((double)((f2 * d2) / f));
       float kb0 f12 = (float)Math.log((double)(((k.i * f11) * 0.02f) + 0x3f800000)) * 0x422f7048;
       d1 = (double)f7;
       float f13 = f12 * (float)Math.cos(d1);
       float f14 = f12 * (float)Math.sin(d1);
       f12 = new kb0(f10, f11, f1, ((0x3fd9999a * f1) / ((0.01f * f1) + 0x3f800000)), f13, f14);
       return f12;
    }
    public static kb0 b(float p0,float p1,float p2){
       kl7 k = kl7.k;
       double d = (double)p0 / 100.00f;
       Math.sqrt(d);
       Math.sqrt((double)(((p1 / (float)Math.sqrt(d)) * k.d) / (k.a + 4.00f)));
       float f = (float)Math.log((((double)(k.i * p1) * 0x3f9758e219652bd4) + 0x3ff0000000000000)) * 0x422f7048;
       double d1 = (double)((0x40490fdb * p2) / 180.00f);
       kb0 k1 = new kb0(p2, p1, p0, ((0x3fd9999a * p0) / ((0.01f * p0) + 0x3f800000)), (f * (float)Math.cos(d1)), (f * (float)Math.sin(d1)));
       return k;
    }
    public final int c(kl7 p0){
       float f;
       kb0 okb0 = this;
       kl7 okl7 = p0;
       kb0 b = okb0.b;
       double d = 100.00f;
       kb0 c = okb0.c;
       double d1 = 0;
       if (d1 - (double)b) {
          double d2 = (double)c;
          if (d1 - d2) {
             f = b / (float)Math.sqrt((d2 / d));
          label_0020 :
             f = (float)Math.pow(((double)f / Math.pow((0x3ffa3d70a3d70a3d - Math.pow(0x3fd28f5c28f5c28f, (double)okl7.f)), 0x3fe75c28f5c28f5c)), 0x3ff1c71c71c71c72);
             d2 = (double)((okb0.a * 0x40490fdb) / 180.00f);
             float f1 = (okl7.a * (float)Math.pow(((double)c / d), ((0x3ff0000000000000 / (double)okl7.d) / (double)okl7.j))) / okl7.b;
             float f2 = (float)Math.sin(d2);
             float f3 = (float)Math.cos(d2);
             float f4 = ((0x3e9c28f6 + f1) * 23.00f) * f;
             f4 = f4 / (((f * 108.00f) * f2) + (((11.00f * f) * f3) + ((((((float)(Math.cos((2.00f + d2)) + 3.80f) * 0.25f) * 3846.15f) * okl7.e) * okl7.c) * 23.00f)));
             f3 = f3 * f4;
             f4 = f4 * f2;
             f1 = f1 * 460.00f;
             f2 = ((288.00f * f4) + ((451.00f * f3) + f1)) / 0x44af6000;
             float f5 = ((f1 - (891.00f * f3)) - (261.00f * f4)) / 0x44af6000;
             f1 = ((f1 - (f3 * 220.00f)) - (f4 * 6300.00f)) / 0x44af6000;
             f3 = Math.signum(f2);
             f4 = 100.00f / okl7.h;
             okl7 = okl7.g;
             f3 = ((f3 * f4) * (float)Math.pow((double)(float)Math.max(d1, (((double)Math.abs(f2) * 27.13f) / (400.00f - (double)Math.abs(f2)))), 2.38f)) / okl7[0];
             f2 = ((Math.signum(f5) * f4) * (float)Math.pow((double)(float)Math.max(0, (((double)Math.abs(f5) * 27.13f) / (400.00f - (double)Math.abs(f5)))), 2.38f)) / okl7[1];
             f1 = ((Math.signum(f1) * f4) * (float)Math.pow((double)(float)Math.max(0, (((double)Math.abs(f1) * 27.13f) / (400.00f - (double)Math.abs(f1)))), 2.38f)) / okl7[2];
             float[][] g = ye7.g;
             object oobject = g[0];
             object oobject1 = g[1];
             object oobject2 = g[2];
             return lj0.b((double)((oobject[2] * f1) + ((oobject[1] * f2) + (oobject[0] * f3))), (double)((oobject1[2] * f1) + ((oobject1[1] * f2) + (oobject1[0] * f3))), (double)((f1 * oobject2[2]) + ((f2 * oobject2[1]) + (f3 * oobject2[0]))));
          }
       }
       f = 0;
       goto label_0020 ;
    }
}
