package p.g75;
import p.lv1;
import java.lang.String;
import p.i70;
import java.lang.Object;
import java.util.Objects;
import p.gv5;
import p.su0;

public final class g75 extends lv1	// class@000208 from classes2.dex
{
    public final String P;
    public final su0 Q;

    public void g75(String p0){
       super();
       Objects.requireNonNull(p0, "name == null");
       this.P = p0;
       this.Q = i70.a;
    }
    public final void a(gv5 p0,Object p1){
       if (p1 == null) {
          return;
       }
       if ((p1 = this.Q.a(p1)) == null) {
          return;
       }
       p0.b(this.P, p1);
       return;
    }
}
