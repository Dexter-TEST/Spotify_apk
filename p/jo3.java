package p.jo3;
import android.content.Context;
import p.zg0;
import p.ix;
import p.wd5;
import p.p77;
import p.id0;
import p.az2;
import p.ac;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import p.vv7;
import p.ru2;
import p.qu2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import p.yt2;
import p.vt2;
import p.j8;
import p.x55;
import p.ry7;
import p.v55;
import p.wk7;
import p.vk7;
import p.zs2;
import p.ou2;
import p.rt2;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.nu2;
import p.ko3;
import p.w53;

public final class jo3	// class@001b16 from classes.dex
{
    public final Context a;
    public final zg0 b;
    public final ix c;
    public final wd5 d;
    public final p77 e;
    public final p77 f;
    public final id0 g;
    public final az2 h;
    public final ac i;
    public final HashMap j;
    public vk7 k;
    public v55 l;
    public ou2 m;
    public ru2 n;

    public void jo3(Context p0,zg0 p1,ix p2,wd5 p3,p77 p4,p77 p5,id0 p6,az2 p7,ac p8,Map p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = new HashMap(2);
       this.m = vv7.t;
       this.n = qu2.dummy();
       Iterator iterator = p9.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          yt2 value = uEntry.getValue();
          this.c(value.a(), key, value);
       }
       return;
    }
    public final j8 a(){
       jo3 ojo3 = this;
       j8 v16 = new j8(ojo3.a, ojo3.b, ojo3.c, ojo3.d, ojo3.e, ojo3.f, ojo3.g, ojo3.h, ojo3.j, ojo3.m, ojo3.n, new zs2(ojo3.i, ry7.r(ojo3.l, x55.i0), ry7.r(ojo3.k, wk7.S)));
       return v16;
    }
    public final void b(String p0,rt2 p1){
       rt2 ort2;
       if ((ort2 = this.j.put(p0, p1)) == null) {
          return;
       }
       throw new IllegalStateException("Duplicated command handler for \""+p0+"\" added, "+ort2+" / "+p1);
    }
    public final void c(int p0,String p1,vt2 p2){
       ou2[] oou2Array = new ou2[]{this.m,new nu2(p0, p2)};
       this.m = vv7.B(oou2Array);
       this.n = qu2.withFallback(ko3.access$100(p1, p0), this.n);
    }
    public final void d(w53 p0){
       this.l = p0.h();
       this.k = p0.b();
    }
}
