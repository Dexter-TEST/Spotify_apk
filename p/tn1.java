package p.tn1;
import p.jg2;
import p.o05;
import p.s05;
import java.util.HashMap;
import java.lang.Object;
import p.ju2;
import p.fu2;
import java.lang.String;
import p.iu2;
import java.io.Serializable;
import java.lang.Integer;
import p.st2;
import p.ty0;
import p.r05;
import p.k23;
import p.au2;
import java.util.Map;
import p.c03;

public final class tn1 implements jg2	// class@0027a3 from classes.dex
{
    public final o05 a;
    public final int b;
    public final s05 c;
    public final Map t;

    public void tn1(o05 p0,int p1,s05 p2,HashMap p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final Object apply(Object p0){
       o05 oo05;
       if (p0 == null) {
          p0 = null;
       }else {
          String str = p0.q().c();
          String str1 = "uri";
          if ("lite:downloadToggle".equals(str)) {
             p0 = p0.a().b("availability", this.a).b("progress", Integer.valueOf(this.b)).d("click", ty0.j().d("download").a(str1, this.c.m.m)).g();
          }else if((oo05 = this.t.get(p0.d().q(str1))) != null && oo05 != o05.z){
             if (c03.b.a.equals(str)) {
                p0 = p0.a().j("entity:trackRow", p0.q().d()).b("availability", oo05).g();
             }else if(!"podcast:card".equals(str) && !"podcast:cardImage".equals(str)){
                p0 = p0.a().b("availability", oo05).g();
             }
          }
       }
       return p0;
    }
}
