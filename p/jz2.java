package p.jz2;
import p.c03;
import java.lang.String;
import p.ju2;
import p.hu2;
import p.au2;
import p.a03;

public final class jz2 extends c03	// class@001b73 from classes.dex
{

    public void jz2(){
       super("NAVIGATION", 3, "glue:navigationRow");
    }
    public final int e(ju2 p0){
       int i = 1;
       if (p0.u().d() == null) {
          int i1 = (p0.b().m("calendar") != null)? 1: 0;
          if (!i1) {
             i = 0;
          }
       }
       vz2 v = (i)? a03.v: a03.w;
       return v.a;
    }
}
