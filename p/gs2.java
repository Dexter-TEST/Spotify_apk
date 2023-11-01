package p.gs2;
import p.g15;
import p.f15;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.we7;
import java.util.Map;
import java.util.HashMap;
import p.xl0;
import p.zu5;
import p.c90;
import p.os2;
import p.ps2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.je4;
import p.he4;
import p.tp2;
import p.fv5;
import p.bv5;
import p.t90;
import p.lp5;
import p.cx5;
import p.fx5;
import p.mp2;
import p.u54;
import java.lang.Class;
import p.ev5;
import p.gg1;
import p.ie4;
import java.util.ArrayList;
import java.io.File;
import p.dv5;

public final class gs2	// class@00176b from classes.dex
{
    public final int a;
    public final String b;
    public final Map c;
    public final HashMap d;
    public he4 e;
    public static final g15 f;

    static {
       f15 uof15 = new f15(new g15());
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       co5.o(mILLISECONDS, "unit");
       uof15.x = we7.b(0x2710, mILLISECONDS);
       gs2.f = new g15(uof15);
    }
    public void gs2(int p0,String p1,Map p2){
       super();
       this.e = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new HashMap();
    }
    public final xl0 a(){
       ps2 ops2;
       cx5 x;
       zu5 ozu5 = new zu5();
       c90 uoc90 = v15;
       String c90 uoc901 = v15;
       uoc90 = new c90(true, false, -1, -1, false, false, false, -1, -1, false, false, false, 0);
       ozu5.c(uoc901);
       gs2 ogs2 = this;
       gs2 b = ogs2.b;
       co5.o(b, "<this>");
       try{
          uoc901 = 0;
          os2 oos2 = new os2();
          oos2.f(uoc901, b);
          ops2 = oos2.b();
       }catch(java.lang.IllegalArgumentException e0){
          ops2 = e0;
       }
       os2 oos21 = ops2.f();
       Iterator iterator = ogs2.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          oos21.a(key, uEntry.getValue());
       }
       ozu5.a = oos21.b();
       Iterator iterator1 = ogs2.d.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          String key1 = uEntry1.getKey();
          ozu5.d(key1, uEntry1.getValue());
       }
       fv5 uofv5 = ((b = ogs2.e) == null)? e0: b.a();
       ozu5.e(tp2.w(ogs2.a), uofv5);
       cx5 uocx5 = gs2.f.a(ozu5.b()).f();
       if ((x = uocx5.x) != null) {
          uoc901 = x.J();
       }
       return new xl0(uocx5.t, e0, uocx5.w);
    }
    public final void b(String p0,String p1){
       this.d.put(p0, p1);
    }
    public final void c(String p0,String p1){
       if (this.e == null) {
          he4 ohe4 = new he4();
          ohe4.b(je4.f);
          this.e = ohe4;
       }
       gs2 te = this.e;
       te.getClass();
       co5.o(p1, "value");
       te.c.add(gg1.u(p0, null, gg1.r(p1, null)));
       this.e = te;
       return;
    }
    public final void d(String p0,String p1,File p2){
       co5.o(p2, "file");
       dv5 uodv5 = new dv5(gg1.P("application/octet-stream"), p2, 0);
       if (this.e == null) {
          he4 ohe4 = new he4();
          ohe4.b(je4.f);
          this.e = ohe4;
       }
       gs2 te = this.e;
       te.getClass();
       co5.o(p0, "name");
       te.c.add(gg1.u(p0, p1, uodv5));
       this.e = te;
       return;
    }
}
