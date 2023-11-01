package p.a30;
import p.jg2;
import java.lang.Object;
import p.og2;
import java.lang.IllegalStateException;
import java.lang.String;
import p.rt;
import p.qs3;
import p.co5;

public final class a30 implements jg2	// class@000f03 from classes.dex
{
    public final int a;
    public final Object b;

    public void a30(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       a30 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             co5.l(p0, "it");
             return tb.a(p0);
       }
       String str = "Required value was null.";
       if (p0 == null) {
          throw new IllegalStateException(str.toString());
       }
       if (tb != null) {
          return p0.apply(tb);
       }
       throw new IllegalStateException(str.toString());
    }
}
