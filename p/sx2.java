package p.sx2;
import p.ay2;
import java.lang.String;
import p.ju2;
import java.lang.Class;
import java.lang.Object;
import p.eo5;
import p.tu2;
import p.au2;
import p.io2;
import p.xx2;

public final class sx2 extends ay2	// class@0026b8 from classes.dex
{

    public void sx2(){
       super("NORMAL", 1, "glue:card");
    }
    public final int e(ju2 p0){
       wx2 v;
       p0.getClass();
       if (eo5.p(p0)) {
          v = (p0.y().m() != null && (!io2.j(p0.b().b("glue:subtitleStyle", ""), "metadata") || p0.y().e() != null))? xx2.v: xx2.t;
       }else if(p0.y().d() != null){
          v = xx2.c;
       }else {
          v = xx2.b;
       }
       return v.a;
    }
}
