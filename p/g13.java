package p.g13;
import p.jg2;
import java.lang.String;
import java.lang.Object;
import p.ju2;
import p.h13;
import p.iu2;
import java.io.Serializable;
import p.k23;

public final class g13 implements jg2	// class@00167c from classes.dex
{
    public final String a;
    public final boolean b;
    public final String c;

    public void g13(String p0,String p1,boolean p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
    }
    public final Object apply(Object p0){
       g13 og13 = null;
       if (p0 == null) {
       }else {
          g13 ta = this.a;
          boolean b = h13.a(p0, ta, og13);
          if (this.b != null || b) {
             og13 = this.c;
          }
          if (h13.a(p0, ta, og13)) {
             p0 = p0.a().b("hubs:glue:highlight", "1").g();
          }
          og13 = p0;
       }
       return og13;
    }
}
