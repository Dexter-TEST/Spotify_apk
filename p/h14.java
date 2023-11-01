package p.h14;
import java.lang.Object;
import p.lq5;
import p.d14;
import p.g14;
import java.util.AbstractMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import p.vh0;
import java.util.Map;

public final class h14	// class@0017bf from classes.dex
{

    public void h14(){
       super();
    }
    public static lq5 a(Object p0){
       return p0.a;
    }
    public static g14 b(Object p0){
       return p0;
    }
    public static int c(Object p0,int p1,Object p2){
       int i = 0;
       if (p0.isEmpty()) {
       }else {
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             Object key = uEntry.getKey();
             p2.getClass();
             int i1 = d14.a(p2.a, key, uEntry.getValue());
             int i2 = vh0.G0(i1) + i1;
             i2 = i2 + vh0.E0(p1);
             i = i + i2;
          }
       }
       return i;
    }
    public static boolean d(Object p0){
       return (p0.a ^ 0x01);
    }
    public static g14 e(Object p0,Object p1){
       if (!p1.isEmpty()) {
          if (p0.a == null) {
             p0 = p0.d();
          }
          p0.c();
          if (!p1.isEmpty()) {
             p0.putAll(p1);
          }
       }
       return p0;
    }
    public static g14 f(){
       return g14.b.d();
    }
    public static void g(Object p0){
       p0.a = false;
    }
}
