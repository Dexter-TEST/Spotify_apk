package p.dv0;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.gr;
import java.util.List;
import p.jr;
import p.kr;
import p.ir;
import p.xu;
import p.iw;
import p.zu;
import p.co5;
import java.lang.Math;
import java.lang.reflect.Constructor;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Comparable;
import p.ej4;
import p.oh6;
import p.la0;
import com.google.android.gms.common.api.Scope;
import p.ai2;
import p.db1;
import p.gj0;
import android.view.View;
import p.wh7;
import p.jh7;
import p.ts7;

public final class dv0 implements Comparator	// class@0013c0 from classes.dex
{
    public final int a;
    public static final dv0 b;

    static {
       dv0.b = new dv0(14);
    }
    public void dv0(int p0){
       this.a = p0;
       super();
    }
    public final int a(File p0,File p1){
       switch (this.a){
           case 5:
             return (int)(p0.lastModified() - p1.lastModified());
           case 6:
             return p1.getName().compareTo(p0.getName());
           default:
             return p0.getName().compareTo(p1.getName());
       }
    }
    public final int b(gr p0,gr p1){
       switch (this.a){
           case 12:
           default:
             return p0.a.c.compareTo(p1.a.c);
       }
       return p0.b.get(0).a.c.compareTo(p1.b.get(0).a.c);
    }
    public final int c(xu p0,xu p1){
       switch (this.a){
           case 10:
           default:
             return p0.a.c.compareTo(p1.a.c);
       }
       return p0.b.b.compareTo(p1.b.b);
    }
    public final int compare(Object p0,Object p1){
       ai2 d;
       int i2;
       int i4;
       int i = 1;
       int i1 = 0;
       switch (this.a){
           case 0:
             float f = jh7.m(p0);
             float f1 = jh7.m(p1);
             if ((f1 - f) > 0) {
                i = -1;
             }else if((f - f1) < 0){
                i = 0;
             }
             return i;
             break;
           case 1:
             return ((((p1.i - p1.h) + i) * (((p1.g - p1.f) + i) * ((p1.e - p1.d) + i))) - (((p0.i - p0.h) + i) * (((p0.g - p0.f) + i) * ((p0.e - p0.d) + i))));
           case 2:
             return (p0.a - p1.a);
           case 3:
             i2 = ((d = p0.d) == null)? 1: 0;
             int i3 = (p1.d == null)? 1: 0;
             if (i2 != i3) {
                if (d != null) {
                label_0117 :
                   i = -1;
                }
             }else if((d = p0.a) != p1.a){
                if (d != null) {
                   goto label_0117 ;
                }
             }else if(i = p1.b - p0.b){
                if (i4 = p0.c - p1.c) {
                   i1 = i4;
                label_012a :
                   return i1;
                }else {
                   goto label_012a ;
                }
             }
             i1 = i;
             goto label_012a ;
             break;
           case 4:
             return p0.b.compareTo(p1.b);
           case 5:
             return this.a(p0, p1);
           case 6:
             return this.a(p0, p1);
           case 7:
             return this.a(p0, p1);
           case 8:
             return p0.compareTo(p1);
           case 9:
             return ej4.n(Integer.valueOf(p1.length()), Integer.valueOf(p0.length()));
           case 10:
             return this.c(p0, p1);
           case 11:
             return this.c(p0, p1);
           case 12:
             return this.b(p0, p1);
           case 13:
             return this.b(p0, p1);
           case 14:
             co5.o(p0, "cc1");
             co5.o(p1, "cc2");
             return p0.c.compareTo(p1.c);
           case 15:
             return ej4.n(p0.a, p1.a);
           case 16:
             return ej4.n(Integer.valueOf(p1.getParameterTypes().length), Integer.valueOf(p0.getParameterTypes().length));
           case 17:
             co5.o(p0, "a");
             co5.o(p1, "b");
             int i5 = Math.min(p0.length(), p1.length());
             i2 = 4;
             while (true) {
                if (i2 < i5) {
                   char c = p0.charAt(i2);
                   char c1 = p1.charAt(i2);
                   if (c != c1) {
                      if (co5.r(c, c1) < 0) {
                      label_0047 :
                         i = -1;
                         break ;
                      }else {
                         break ;
                      }
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   i4 = p0.length();
                   int i6 = p1.length();
                   if (i4 != i6) {
                      if (i4 < i6) {
                         goto label_0047 ;
                      }else {
                         break ;
                      }
                   }else {
                      i = 0;
                      break ;
                   }
                }
             }
             return i;
             break;
           default:
             return ej4.n(p0.a, p1.a);
       }
    }
}
