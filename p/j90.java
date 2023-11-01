package p.j90;
import p.bv5;
import p.i90;
import java.lang.Object;
import p.mp2;
import java.lang.String;
import p.av6;
import java.util.Date;
import p.r;
import java.lang.Long;
import p.yu6;
import p.l90;
import p.ps2;
import p.ui3;
import p.c90;
import p.co5;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import p.w37;
import p.v37;
import java.lang.Number;
import java.lang.StringBuilder;
import java.util.List;
import p.gg1;
import p.zu5;

public final class j90	// class@001a8c from classes.dex
{
    public final bv5 a;
    public final i90 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public void j90(bv5 p0,i90 p1){
       Long longx;
       int i2;
       super();
       this.a = p0;
       this.b = p1;
       this.k = -1;
       if (p1 != null) {
          this.h = p1.c;
          this.i = p1.d;
          p1 = p1.f;
          int i = p1.a.length / 2;
          int i1 = 0;
          while (i1 < i) {
             String str = p1.c(i1);
             String str1 = "Date";
             boolean b = true;
             if (av6.i0(str, str1, b)) {
                this.c = p1.b(str1);
                this.d = p1.g(i1);
             }else {
                str1 = "Expires";
                if (av6.i0(str, str1, b)) {
                   this.g = p1.b(str1);
                }else {
                   str1 = "Last-Modified";
                   if (av6.i0(str, str1, b)) {
                      this.e = p1.b(str1);
                      this.f = p1.g(i1);
                   }else if(av6.i0(str, "ETag", b)){
                      this.j = p1.g(i1);
                   }else if(av6.i0(str, "Age", b)){
                      if ((longx = yu6.d0(p1.g(i1))) != null) {
                         long l = longx.longValue();
                         if ((l - 0x7fffffff) > 0) {
                            i2 = Integer.MAX_VALUE;
                         }else if((l) < 0){
                            i2 = 0;
                         }else {
                            i2 = (int)l;
                         }
                      }else {
                         i2 = -1;
                      }
                      this.k = i2;
                   }
                }
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public final l90 a(){
       j90 b;
       j90 c1;
       j90 oj901;
       long l1;
       j90 k;
       String str2;
       long l2;
       String str3;
       j90 oj902;
       String str4;
       long l3;
       String str5;
       long l4;
       j90 j;
       j90 g;
       ps2 g1;
       j90 oj90 = this;
       j90 a = oj90.a;
       i90 oi90 = null;
       if ((b = oj90.b) == null) {
          return new l90(a, oi90);
       }
       if (a.a.j != null && b.e == null) {
          return new l90(a, oi90);
       }
       i90 a1 = b.a;
       c90 value = a1.getValue();
       int i = 0;
       int i1 = (a.a().b == null && (a1.getValue().b == null && !co5.c(b.f.a("Vary"), "*")))? 1: 0;
       if (!i1) {
          return new l90(a, oi90);
       }else {
          c90 uoc90 = a.a();
          if (uoc90.a == null) {
             bv5 c = a.c;
             String str = "If-Modified-Since";
             String str1 = "If-None-Match";
             if (c.a(str) != null || c.a(str1) != null) {
                i = 1;
             }
             if (!i) {
                long l = 0;
                j90 i2 = oj90.i;
                if ((c1 = oj90.c) != null) {
                   oj901 = b;
                   l1 = Math.max(l, (i2 - c1.getTime()));
                }else {
                   oj901 = b;
                   l1 = l;
                }
                int i3 = -1;
                if ((k = oj90.k) != i3) {
                   str2 = str;
                   l1 = Math.max(l1, TimeUnit.SECONDS.toMillis((long)k));
                }else {
                   str2 = str;
                }
                j90 h = oj90.h;
                l1 = (l1 + (i2 - h)) + (w37.a.invoke().longValue() - i2);
                c90 c2 = a1.getValue().c;
                j90 e = oj90.e;
                if (c2 != i3) {
                   l2 = TimeUnit.SECONDS.toMillis((long)c2);
                }else if((g = oj90.g) != null){
                   if (c1 != null) {
                      i2 = c1.getTime();
                   }
                   l2 = g.getTime() - i2;
                   if ((l2) <= 0) {
                   label_010e :
                      l2 = 0;
                   }
                }else if(e != null){
                   if ((g1 = a.a.g) == null) {
                      g1 = 0;
                   }else {
                      StringBuilder str6 = "";
                      gg1.X(g1, str6);
                      String str7 = str6;
                   }
                   if (g1 == null) {
                      if (c1 != null) {
                         l2 = c1.getTime();
                      }
                      l2 = l2 - e.getTime();
                      if ((l2) > 0) {
                         l2 = l2 / (long)10;
                      }else {
                         goto label_010e ;
                      }
                   }else {
                      goto label_010e ;
                   }
                }else {
                   goto label_010e ;
                }
                if ((c2 = uoc90.c) != i3) {
                   str3 = str2;
                   oj902 = c1;
                   l2 = Math.min(l2, TimeUnit.SECONDS.toMillis((long)c2));
                }else {
                   str3 = str2;
                   oj902 = c1;
                }
                if ((c2 = uoc90.i) != i3) {
                   str4 = str1;
                   l3 = TimeUnit.SECONDS.toMillis((long)c2);
                }else {
                   str4 = str1;
                   l3 = 0;
                }
                if (value.g == null && (c2 = uoc90.h) != i3) {
                   str5 = str4;
                   l4 = TimeUnit.SECONDS.toMillis((long)c2);
                }else {
                   str5 = str4;
                   l4 = 0;
                }
                if (value.a == null && ((l1 + l3) - (l2 + l4)) < 0) {
                   return new l90(null, oj901);
                }else {
                   b = oj901;
                   if ((j = oj90.j) != null) {
                      str = str5;
                   }else if(e != null){
                      j = oj90.f;
                      co5.i(j);
                   }else if(oj902 != null){
                      j = oj90.d;
                      co5.i(j);
                   }else {
                      return new l90(a, null);
                   }
                   str = str3;
                   zu5 ozu5 = new zu5(a);
                   ozu5.a(str, j);
                   return new l90(ozu5.b(), b);
                }
             }
          }
          return new l90(a, oi90);
       }
    }
}
