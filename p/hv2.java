package p.hv2;
import p.qv2;
import java.lang.String;
import p.ju2;
import java.lang.Class;
import java.lang.Object;
import p.au2;
import p.tu2;
import p.io2;
import p.pv2;

public final class hv2 extends qv2	// class@0018cb from classes.dex
{

    public void hv2(){
       super("REGULAR", 1, "glue2:card");
    }
    public final int e(ju2 p0){
       lv2 c;
       p0.getClass();
       String str = p0.b().q("titleStyle");
       if (p0.y().m() != null) {
          if (!io2.j(str, "gone") && p0.y().d() != null) {
             c = (io2.j(p0.b().b("subtitleStyle", ""), "metadata"))? pv2.v: pv2.w;
          }else {
             c = pv2.c;
          }
       }else if(io2.j("description", str)){
          c = pv2.b;
       }else {
          c = pv2.t;
       }
       return c.a;
    }
}
