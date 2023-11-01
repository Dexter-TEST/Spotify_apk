package p.l26;
import p.ne4;
import p.m26;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import p.mr6;

public final class l26 extends ne4	// class@001cd0 from classes.dex
{
    public final String l;
    public m26 m;

    public void l26(m26 p0,String p1){
       super();
       this.l = p1;
       this.m = p0;
    }
    public void l26(m26 p0,String p1,Object p2){
       super(p2);
       this.l = p1;
       this.m = p0;
    }
    public final void k(Object p0){
       l26 tm;
       mr6 omr6;
       if ((tm = this.m) != null) {
          l26 tl = this.l;
          tm.a.put(tl, p0);
          if ((omr6 = tm.d.get(tl)) != null) {
             omr6.E(p0);
          }
       }
       super.k(p0);
       return;
    }
}
