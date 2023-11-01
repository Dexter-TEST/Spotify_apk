package p.kz0;
import java.util.Locale;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;
import android.content.Context;
import p.u53;
import p.i77;
import p.xl0;
import p.zq7;
import p.ks;
import java.lang.StackTraceElement;
import p.o11;
import p.i73;
import java.util.List;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.Long;
import p.ns;
import java.lang.Thread;
import p.ms;
import p.ko1;

public final class kz0	// class@001cad from classes.dex
{
    public final Context a;
    public final u53 b;
    public final i77 c;
    public final nq6 d;
    public static final String e;
    public static final HashMap f;

    static {
       Object[] objArray = new Object[]{"17.2.1"};
       kz0.e = String.format(Locale.US, "Crashlytics Android SDK/%s", objArray);
       HashMap hashMap = new HashMap();
       kz0.f = hashMap;
       hashMap.put("armeabi", Integer.valueOf(5));
       hashMap.put("armeabi-v7a", Integer.valueOf(6));
       hashMap.put("arm64-v8a", Integer.valueOf(9));
       hashMap.put("x86", Integer.valueOf(0));
       hashMap.put("x86_64", Integer.valueOf(1));
    }
    public void kz0(Context p0,u53 p1,i77 p2,xl0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static ks a(zq7 p0,int p1){
       zq7 b = p0.b;
       zq7 a = p0.a;
       zq7 c = p0.c;
       int i = 0;
       if (c != null) {
       }else {
          c = new StackTraceElement[i];
       }
       p0 = p0.t;
       if (p1 >= 8) {
          zq7 ozq7 = p0;
          while (ozq7 != null) {
             ozq7 = ozq7.t;
             i = i + 1;
          }
       }
       o11 oo11 = new o11(9);
       if (b != null) {
          oo11.b = b;
          oo11.c = a;
          oo11.t = new i73(kz0.b(c, 4));
          oo11.w = Integer.valueOf(i);
          if (p0 != null && !i) {
             p1++;
             oo11.v = kz0.a(p0, p1);
          }
          return oo11.g();
       }else {
          throw new NullPointerException("Null type");
       }
    }
    public static i73 b(StackTraceElement[] p0,int p1){
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return new i73(uArrayList);
          }
          object oobject = p0[i];
          o11 oo11 = new o11(10);
          oo11.w = Integer.valueOf(p1);
          long l = 0;
          long l1 = (oobject.isNativeMethod())? Math.max((long)oobject.getLineNumber(), l): l;
          String str = "".append(oobject.getClassName()).append(".").append(oobject.getMethodName()).toString();
          String fileName = oobject.getFileName();
          if (!oobject.isNativeMethod() && oobject.getLineNumber() > 0) {
             l = (long)oobject.getLineNumber();
          }
          oo11.b = Long.valueOf(l1);
          if (str != null) {
             oo11.c = str;
             oo11.t = fileName;
             oo11.v = Long.valueOf(l);
             uArrayList.add(oo11.h());
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new NullPointerException("Null symbol");
    }
    public static ms c(Thread p0,StackTraceElement[] p1,int p2){
       String name;
       ko1 oko1 = new ko1(6);
       if ((name = p0.getName()) == null) {
          throw new NullPointerException("Null name");
       }
       oko1.b = name;
       oko1.c = Integer.valueOf(p2);
       oko1.t = new i73(kz0.b(p1, p2));
       return oko1.i();
    }
}
