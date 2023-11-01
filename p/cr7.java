package p.cr7;
import java.lang.Class;
import java.lang.Object;
import java.util.UUID;
import java.lang.String;
import p.co5;
import p.jr7;
import p.rq7;
import p.h51;
import p.zq0;
import java.util.LinkedHashSet;
import p.xe7;
import java.util.AbstractSet;
import p.uk;
import p.a45;
import p.z35;
import android.os.Build$VERSION;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p.kg4;
import p.es3;
import p.eb3;
import java.lang.System;

public abstract class cr7	// class@001265 from classes.dex
{
    public boolean a;
    public UUID b;
    public jr7 c;
    public final Set d;

    public void cr7(Class p0){
       cr7 uocr7 = this;
       super();
       UUID uUID = UUID.randomUUID();
       co5.l(uUID, "randomUUID\(\)");
       uocr7.b = uUID;
       String str = uocr7.b.toString();
       co5.l(str, "id.toString\(\)");
       jr7 uUID1 = new jr7(str, null, p0.getName(), null, null, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, false, 0, 0, 0xffffa, 0);
       uocr7.c = uUID;
       String[] stringArray = new String[]{p0.getName()};
       LinkedHashSet linkedHashSe = new LinkedHashSet(xe7.F(1));
       uk.s0(linkedHashSe, stringArray);
       uocr7.d = linkedHashSe;
    }
    public final a45 a(){
       int i3;
       int sDK_INT;
       cr7 uocr7 = this;
       cr7 uocr71 = uocr7;
       int i = 23;
       int i1 = 0;
       int i2 = 1;
       jr7 j1 = (uocr71.a != null && (Build$VERSION.SDK_INT >= i && uocr71.c.j.c != null))? 0: 1;
       if (i3) {
          a45 uoa45 = new a45(uocr71);
          jr7 j = uocr7.c.j;
          int i4 = ((sDK_INT = Build$VERSION.SDK_INT) >= 24 && (((j.h.isEmpty() ^ i2)) || (j.d != null || (j.b != null || (sDK_INT >= i && j.c != null)))))? 1: 0;
          cr7 c = uocr7.c;
          if (c.q != null) {
             if ((i4 ^ i2)) {
                if ((c.g) <= 0) {
                   i1 = 1;
                }
                if (!i1) {
                   throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
             }else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
             }
          }
          UUID uUID = UUID.randomUUID();
          co5.l(uUID, "randomUUID\(\)");
          uocr7.b = uUID;
          jr7 ojr7 = c;
          String str = uUID.toString();
          String str1 = str;
          co5.l(str, "id.toString\(\)");
          uocr71 = uocr7.c;
          co5.o(uocr71, "other");
          h51 oh51 = v10;
          h51 oh511 = new h51(uocr71.e);
          oh511 = v11;
          h51 oh512 = new h51(uocr71.f);
          jr7 ojr71 = c;
          zq0 ozq0 = v18;
          j1 = uocr71.j;
          co5.o(j1, "other");
          jr7 ojr72 = ojr7;
          String str2 = str1;
          h51 oh513 = oh511;
          zq0 ozq01 = new zq0(j1.a, j1.b, j1.c, j1.d, j1.e, j1.f, j1.g, j1.h);
          ojr72 = new jr7(str2, uocr71.b, uocr71.c, uocr71.d, oh51, oh513, uocr71.g, uocr71.h, uocr71.i, ozq0, uocr71.k, uocr71.l, uocr71.m, uocr71.n, uocr71.o, uocr71.p, uocr71.q, uocr71.r, uocr71.s, 0x80000, 0);
          this.c = ojr71;
          return uoa45;
       }else {
          throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
       }
    }
    public final z35 b(TimeUnit p0){
       kg4.t(1, "backoffPolicy");
       co5.o(p0, "timeUnit");
       this.a = true;
       cr7 tc = this.c;
       tc.l = 1;
       long l = p0.toMillis(5);
       if ((l - 0x112a880) > 0) {
          es3.c().getClass();
       }
       if ((l - 0x2710) < 0) {
          es3.c().getClass();
       }
       tc.m = eb3.e(l, 0x2710, 0x112a880);
       return this;
    }
    public final z35 c(long p0,TimeUnit p1){
       co5.o(p1, "timeUnit");
       this.c.g = p1.toMillis(p0);
       int i = (((Long.MAX_VALUE - System.currentTimeMillis()) - this.c.g) > 0)? 1: 0;
       if (i) {
          return this;
       }else {
          throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
       }
    }
}
