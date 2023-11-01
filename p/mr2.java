package p.mr2;
import p.i07;
import java.lang.String;
import p.nr2;
import p.qc6;
import java.lang.Class;
import java.lang.Object;
import p.co5;
import p.ks5;
import p.tr2;
import java.util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import p.zr2;
import java.lang.NullPointerException;
import p.kr2;
import p.r07;
import p.as2;
import java.io.IOException;

public final class mr2 extends i07	// class@0002be from classes2.dex
{
    public final nr2 e;
    public final boolean f;
    public final qc6 g;

    public void mr2(String p0,nr2 p1,qc6 p2){
       this.e = p1;
       this.f = false;
       this.g = p2;
       super(p0, true);
    }
    public final long a(){
       Object[] objArray;
       mr2 te = this.e;
       mr2 tg = this.g;
       te.getClass();
       co5.o(tg, "settings");
       ks5 oks5 = new ks5();
       nr2 b = te.b;
       tr2 p = b.P;
       _monitor_enter(p);
       _monitor_enter(b);
       tr2 j = b.J;
       if (this.f != null) {
       }else {
          qc6 oqc6 = new qc6();
          oqc6.b(j);
          oqc6.b(tg);
          tg = oqc6;
       }
       oks5.a = tg;
       long l = (long)tg.a() - (long)j.a();
       int i = 0;
       long l1 = 0;
       if ((v8 = l - l1) && !b.c.isEmpty()) {
          zr2[] ozr2Array = new zr2[i];
          if ((objArray = b.c.values().toArray(ozr2Array)) != null) {
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
       }else {
          objArray = null;
       }
       ks5 a = oks5.a;
       co5.o(a, "<set-?>");
       b.J = a;
       b.B.c(new kr2(co5.K(" onSettings", b.t), b, oks5, i), l1);
       try{
          _monitor_exit(b);
          b.P.b(oks5.a);
       }catch(java.io.IOException e3){
          b.f(e3);
       }
       _monitor_exit(p);
       if (objArray != null) {
          int len = objArray.length;
          while (i < len) {
             object oobject = objArray[i];
             i = i + 1;
             _monitor_enter(oobject);
             l1 = oobject.f + l;
             oobject.f = l1;
             if (v8 > 0) {
                oobject.notifyAll();
             }
             _monitor_exit(oobject);
          }
       }
       return -1;
    }
}
