package p.bc6;
import java.lang.String;
import p.k80;
import p.wh0;
import p.zq7;
import java.lang.StackTraceElement;
import java.lang.Thread;
import java.util.LinkedList;
import java.lang.Object;
import java.util.Map;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Float;
import java.lang.Math;
import java.lang.StringBuilder;

public abstract class bc6	// class@00109b from classes.dex
{
    public static final k80 a;
    public static final k80 b;

    static {
       bc6.a = k80.a("0");
       bc6.b = k80.a("Unity");
    }
    public static int a(k80 p0,k80 p1){
       int i = wh0.a(3, p0) + (wh0.g(2, 0) + (wh0.g(1, 0) + 0));
       if (p1 != null) {
          i = i + wh0.a(4, p1);
       }
       return i;
    }
    public static int b(zq7 p0,int p1){
       zq7 a;
       int i = 1;
       int i1 = 0;
       int i2 = wh0.a(i, k80.a(p0.b)) + i1;
       if ((a = p0.a) != null) {
          i2 = i2 + wh0.a(3, k80.a(a));
       }
       a = p0.c;
       int len = a.length;
       for (int i3 = 0; i3 < len; i3 = i3 + 1) {
          int i4 = bc6.f(a[i3], i);
          int i5 = wh0.b(i4) + wh0.d(4);
          i5 = i5 + i4;
          i2 = i2 + i5;
       }
       if ((p0 = p0.t) != null) {
          if (p1 < 8) {
             int i6 = bc6.b(p0, (p1 + i));
             i2 = i2 + ((wh0.b(i6) + wh0.d(6)) + i6);
          }else {
             while (p0 != null) {
                p0 = p0.t;
                i1 = i1 + 1;
             }
             i2 = i2 + wh0.f(7, i1);
          }
       }
       return i2;
    }
    public static int c(zq7 p0,Thread p1,StackTraceElement[] p2,Thread[] p3,LinkedList p4,k80 p5,k80 p6){
       int i = wh0.d(1);
       int i1 = bc6.g(p1, p2, 4, 1);
       int i2 = (wh0.b(i1) + i) + i1;
       i1 = 0;
       i2 = i2 + i1;
       int len = p3.length;
       for (int i3 = 0; i3 < len; i3 = i3 + 1) {
          int i4 = bc6.g(p3[i3], p4.get(i3), i1, i1);
          int i5 = wh0.b(i4) + i;
          i5 = i5 + i4;
          i2 = i2 + i5;
       }
       int i6 = bc6.b(p0, 1);
       k80 a = bc6.a;
       i1 = wh0.g(3, 0) + (wh0.a(2, a) + (wh0.a(1, a) + i1));
       i6 = bc6.a(p5, p6);
       return (((wh0.b(i6) + wh0.d(3)) + i6) + (((wh0.b(i1) + wh0.d(3)) + i1) + (((wh0.b(i6) + wh0.d(2)) + i6) + i2)));
    }
    public static int d(zq7 p0,Thread p1,StackTraceElement[] p2,Thread[] p3,LinkedList p4,k80 p5,k80 p6,Map p7,ActivityManager$RunningAppProcessInfo p8,int p9){
       int i = bc6.c(p0, p1, p2, p3, p4, p5, p6);
       int i1 = ((wh0.b(i) + wh0.d(1)) + i) + 0;
       if (p7 != null) {
          Iterator iterator = p7.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             int i2 = wh0.a(1, k80.a(key));
             if (value == null) {
                value = "";
             }
             int i3 = wh0.a(2, k80.a(value)) + i2;
             int i4 = wh0.b(i3) + wh0.d(2);
             i4 = i4 + i3;
             i1 = i1 + i4;
          }
       }
       if (p8 != null) {
          i1 = i1 + (wh0.d(3) + 1);
       }
       return (wh0.f(4, p9) + i1);
    }
    public static int e(Float p0,int p1,boolean p2,int p3,long p4,long p5){
       int i = 0;
       if (p0 != null) {
          p0.floatValue();
          i = i + (wh0.d(1) + 4);
       }
       return (wh0.g(6, p5) + (wh0.g(5, p4) + (wh0.f(4, p3) + ((wh0.d(3) + 1) + ((wh0.b(((p1 >> 31) ^ (p1 << 1))) + wh0.d(2)) + i)))));
    }
    public static int f(StackTraceElement p0,boolean p1){
       int i = 1;
       int i1 = 0;
       int i2 = (p0.isNativeMethod())? wh0.g(i, (long)Math.max(p0.getLineNumber(), i1)): wh0.g(i, 0);
       i = wh0.a(2, k80.a(p0.getClassName()+"."+p0.getMethodName())) + (i2 + i1);
       if (p0.getFileName() != null) {
          i = i + wh0.a(3, k80.a(p0.getFileName()));
       }
       if (!p0.isNativeMethod() && p0.getLineNumber() > 0) {
          i = i + wh0.g(4, (long)p0.getLineNumber());
       }
       if (p1) {
          i1 = 2;
       }
       return (wh0.f(5, i1) + i);
    }
    public static int g(Thread p0,StackTraceElement[] p1,int p2,boolean p3){
       p2 = wh0.f(2, p2) + wh0.a(1, k80.a(p0.getName()));
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = bc6.f(p1[i], p3);
          int i2 = wh0.b(i1) + wh0.d(3);
          i2 = i2 + i1;
          p2 = p2 + i2;
       }
       return p2;
    }
    public static void h(wh0 p0,int p1,StackTraceElement p2,boolean p3){
       int i = 2;
       p0.o(p1, i);
       p0.n(bc6.f(p2, p3));
       int i1 = 0;
       int i2 = 1;
       if (p2.isNativeMethod()) {
          p0.q(i2, (long)Math.max(p2.getLineNumber(), i1));
       }else {
          p0.q(i2, 0);
       }
       p0.i(i, k80.a(p2.getClassName()+"."+p2.getMethodName()));
       if (p2.getFileName() != null) {
          p0.i(3, k80.a(p2.getFileName()));
       }
       if (!p2.isNativeMethod() && p2.getLineNumber() > 0) {
          p0.q(4, (long)p2.getLineNumber());
       }
       if (p3) {
          i1 = 4;
       }
       p0.p(5, i1);
       return;
    }
    public static void i(wh0 p0,zq7 p1,int p2,int p3){
       zq7 a;
       p0.o(p3, 2);
       p3 = 1;
       p0.n(bc6.b(p1, p3));
       p0.i(p3, k80.a(p1.b));
       if ((a = p1.a) != null) {
          p0.i(3, k80.a(a));
       }
       a = p1.c;
       int len = a.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          bc6.h(p0, 4, a[i1], p3);
       }
       if ((p1 = p1.t) != null) {
          if (p2 < 8) {
             bc6.i(p0, p1, (p2 + p3), 6);
          }else {
             while (p1 != null) {
                p1 = p1.t;
                i = i + 1;
             }
             p0.p(7, i);
          }
       }
       return;
    }
    public static void j(wh0 p0,Thread p1,StackTraceElement[] p2,int p3,boolean p4){
       int i = 1;
       int i1 = 2;
       p0.o(i, i1);
       p0.n(bc6.g(p1, p2, p3, p4));
       p0.i(i, k80.a(p1.getName()));
       p0.p(i1, p3);
       int len = p2.length;
       for (p3 = 0; p3 < len; p3++) {
          bc6.h(p0, 3, p2[p3], p4);
       }
       return;
    }
}
