package p.ow2;
import p.ww2;
import p.bu2;
import p.ju2;
import p.au2;
import java.lang.String;
import p.te5;
import p.tu2;
import p.vw2;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import p.en6;

public final class ow2 extends ww2	// class@0021a1 from classes.dex
{

    public void ow2(bu2 p0){
       super(p0);
    }
    public final int e(ju2 p0){
       object oobject;
       String str = p0.b().q("style");
       if (te5.a(str)) {
          if (!te5.a(p0.y().m())) {
             return 0x7f0a0234;
          }
          return 0x7f0a022f;
       }else {
          vw2[] ovw2Array = vw2.values();
          int len = ovw2Array.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                throw new IllegalArgumentException(en6.n("Unknown style: ", str));
             }
             oobject = ovw2Array[i];
             if (oobject.b.equals(str)) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return oobject.a;
       }
    }
}
