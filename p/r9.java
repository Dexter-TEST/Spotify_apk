package p.r9;
import p.yf2;
import p.v9;
import p.y8;
import java.util.List;
import java.lang.Object;
import p.ux5;
import java.lang.String;
import p.co5;
import java.lang.Throwable;
import p.nr0;
import p.e55;
import p.qb;
import p.f55;
import java.lang.Iterable;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import java.util.Iterator;
import p.d55;
import p.ll1;

public final class r9 implements yf2	// class@0024a5 from classes.dex
{
    public final v9 a;
    public final y8 b;
    public final List c;

    public void r9(v9 p0,y8 p1,List p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList;
       co5.l(p0, "result");
       p0 = p0.a;
       r9 ta = this.a;
       r9 tb = this.b;
       if (ux5.a(p0) == null) {
          ta.f.b(tb.a.a(), e55.b);
          ta = this.c;
          co5.l(ta, "list");
          uArrayList = new ArrayList();
          p0 = dj0.u0(p0, ta).iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             if (!tb.c.contains(obj.a())) {
                uArrayList.add(obj);
             }
          }
       }else {
          ta.f.b(tb.a.a(), d55.b);
          uArrayList = ll1.a;
       }
       return uArrayList;
    }
}
