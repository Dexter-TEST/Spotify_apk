package p.lj0;
import java.lang.ThreadLocal;
import java.lang.Math;
import android.graphics.Color;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;

public abstract class lj0	// class@001d62 from classes.dex
{
    public static final ThreadLocal a;

    static {
       lj0.a = new ThreadLocal();
    }
    public static void a(int p0,int p1,int p2,float[] p3){
       float f = (float)p0 / 0x437f0000;
       float f1 = (float)p1 / 0x437f0000;
       float f2 = (float)p2 / 0x437f0000;
       float f3 = Math.max(f, Math.max(f1, f2));
       float f4 = Math.min(f, Math.min(f1, f2));
       float f5 = f3 - f4;
       float f6 = 2.00f;
       float f7 = (f3 + f4) / f6;
       int i = 0;
       if (!(f4 - f3)) {
          f1 = 0;
          f5 = 0;
       }else if(!(f - f3)){
          f1 = ((f1 - f2) / f5) % 6.00f;
       }else if(!(f1 - f3)){
          f1 = ((f2 - f) / f5) + f6;
       }else {
          f1 = 4.00f + ((f - f1) / f5);
       }
       f5 = f5 / (0x3f800000 - Math.abs(((f6 * f7) - 0x3f800000)));
       f = 360.00f;
       f1 = (f1 * 60.00f) % f;
       if ((f1 - i) < 0) {
          f1 = f1 + f;
       }
       f = ((f1 - i) < 0)? 0: Math.min(f1, f);
       p3[0] = f;
       f = ((f5 - i) < 0)? 0: Math.min(f5, 0x3f800000);
       p3[1] = f;
       if ((f7 - i) >= 0) {
          i = Math.min(f7, 0x3f800000);
       }
       p3[2] = i;
       return;
    }
    public static int b(double p0,double p1,double p2){
       int i2;
       int i4;
       double d = ((0xbfdfe90ff9724745 * p2) + ((0xbff8985f06f69446 * p1) + (0x4009ecbfb15b573f * p0))) / 100.00f;
       double d1 = ((0x3fa53f7ced916873 * p2) + ((0x3ffe0346dc5d6388 * p1) + (0xbfef013a92a30553 * p0))) / 100.00f;
       double d2 = ((0x3ff0e978d4fdf3b6 * p2) + ((0xbfca1cac083126e9 * p1) + (0x3fac84b5dcc63f14 * p0))) / 100.00f;
       double d3 = 0x3fac28f5c28f5c29;
       double d4 = 0x3fdaaaaaaaaaaaab;
       d = ((0x3f69a5c37387b719 - d) > 0)? (Math.pow(d, d4) * 0x3ff0e147ae147ae1) - d3: d * 12.92f;
       d1 = ((0x3f69a5c37387b719 - d1) > 0)? (Math.pow(d1, d4) * 0x3ff0e147ae147ae1) - d3: d1 * 12.92f;
       d2 = ((0x3f69a5c37387b719 - d2) > 0)? (Math.pow(d2, d4) * 0x3ff0e147ae147ae1) - d3: d2 * 12.92f;
       d3 = 0x406fe00000000000;
       int i = (int)Math.round((d * d3));
       int i1 = 0;
       i = (i < 0)? 0: Math.min(i, 255);
       int i3 = ((i2 = (int)Math.round((d1 * d3))) < 0)? 0: Math.min(i2, 255);
       if ((i4 = (int)Math.round((d2 * d3))) >= 0) {
          i1 = Math.min(i4, 255);
       }
       return Color.rgb(i, i3, i1);
    }
    public static double c(int p0,int p1){
       int i = 255;
       if (Color.alpha(p1) != i) {
          throw new IllegalArgumentException("background can not be translucent: #"+Integer.toHexString(p1));
       }
       if (Color.alpha(p0) < i) {
          p0 = lj0.f(p0, p1);
       }
       double d = lj0.d(p0) + 0x3fa999999999999a;
       double d1 = lj0.d(p1) + 0x3fa999999999999a;
       double d2 = Math.max(d, d1);
       return (d2 / Math.min(d, d1));
    }
    public static double d(int p0){
       ThreadLocal a = lj0.a;
       double[] uodoubleArra = a.get();
       int i = 3;
       if (uodoubleArra == null) {
          uodoubleArra = new double[i];
          a.set(uodoubleArra);
       }
       int i1 = Color.red(p0);
       int i2 = Color.green(p0);
       int i3 = Color.blue(p0);
       if (uodoubleArra.length == i) {
          double d = 0x406fe00000000000;
          double d1 = (double)i1 / d;
          double d2 = 2.40f;
          double d3 = 0x3ff0e147ae147ae1;
          double d4 = 12.92f;
          d1 = ((d1 - 0x3fa4b5dcc63f1412) < 0)? d1 / d4: Math.pow(((d1 + 0x3fac28f5c28f5c29) / d3), d2);
          double d5 = (double)i2 / d;
          d5 = ((d5 - 0x3fa4b5dcc63f1412) < 0)? d5 / d4: Math.pow(((d5 + 0x3fac28f5c28f5c29) / d3), d2);
          d2 = (double)i3 / d;
          d2 = ((d2 - 0x3fa4b5dcc63f1412) < 0)? d2 / d4: Math.pow(((d2 + 0x3fac28f5c28f5c29) / d3), 2.40f);
          uodoubleArra[0] = ((0x3fc71a9fbe76c8b4 * d2) + ((0x3fd6e2eb1c432ca5 * d5) + (0x3fda64c2f837b4a2 * d1))) * 100.00f;
          d = ((0x3fb27bb2fec56d5d * d2) + ((0x3fe6e2eb1c432ca5 * d5) + (0x3fcb367a0f9096bc * d1))) * 100.00f;
          uodoubleArra[1] = d;
          uodoubleArra[2] = ((d2 * 0x3fee6a7ef9db22d1) + ((d5 * 0x3fbe83e425aee632) + (d1 * 0x3f93c36113404ea5))) * 100.00f;
          return (d / 100.00f);
       }else {
          throw new IllegalArgumentException("outXyz must have a length of 3.");
       }
    }
    public static int e(int p0,float p1,int p2){
       int i3;
       int i = 255;
       if (Color.alpha(p2) != i) {
          throw new IllegalArgumentException("background can not be translucent: #"+Integer.toHexString(p2));
       }
       double d = (double)p1;
       if ((lj0.c(lj0.h(p0, i), p2) - d) < 0) {
          return -1;
       }
       int i1 = 0;
       int i2 = 0;
       while (i1 <= 10 && (i3 = i - i2) > 1) {
          i3 = i2 + i;
          i3 = i3 / 2;
          if ((lj0.c(lj0.h(p0, i3), p2) - d) < 0) {
             i2 = i3;
          }else {
             i = i3;
          }
          i1++;
       }
       return i;
    }
    public static int f(int p0,int p1){
       int i = Color.alpha(p1);
       int i1 = Color.alpha(p0);
       int i2 = (((i1 - 255) * (i - 255)) / 255) - 255;
       return Color.argb(i2, lj0.g(Color.red(p0), i1, Color.red(p1), i, i2), lj0.g(Color.green(p0), i1, Color.green(p1), i, i2), lj0.g(Color.blue(p0), i1, Color.blue(p1), i, i2));
    }
    public static int g(int p0,int p1,int p2,int p3,int p4){
       if (!p4) {
          return 0;
       }
       return ((((p1 - 255) * (p2 * p3)) + ((p0 * 255) * p1)) / (p4 * 255));
    }
    public static int h(int p0,int p1){
       if (p1 >= 0 && p1 <= 255) {
          return ((p0 & 0xffffff) | (p1 << 24));
       }
       throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
