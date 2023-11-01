package p.n93;
import p.aj7;
import p.xi7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.vi7;
import java.lang.UnsupportedOperationException;
import p.me4;
import p.zf2;
import java.lang.IllegalArgumentException;

public final class n93 implements aj7	// class@001f91 from classes.dex
{
    public final xi7[] a;

    public void n93(xi7[] p0){
       co5.o(p0, "initializers");
       super();
       this.a = p0;
    }
    public final vi7 a(Class p0){
       throw new UnsupportedOperationException("Factory.create\(String\) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
    public final vi7 b(Class p0,me4 p1){
       n93 ta = this.a;
       int len = ta.length;
       int i = 0;
       vi7 ovi7 = null;
       while (i < len) {
          object oobject = ta[i];
          if (co5.c(oobject.a, p0)) {
             ovi7 = oobject.b.invoke(p1);
             if (ovi7 instanceof vi7) {
             }else {
                ovi7 = null;
             }
          }
          i = i + 1;
       }
       if (ovi7 != null) {
          return ovi7;
       }
       throw new IllegalArgumentException("No initializer set for given class ".concat(p0.getName()));
    }
}
