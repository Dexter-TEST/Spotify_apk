package p.e33;
import p.uu2;
import java.lang.Object;
import java.util.IdentityHashMap;
import p.ju2;
import p.m33;
import java.lang.Class;
import p.i33;
import p.ru2;

public final class e33	// class@00140e from classes.dex
{
    public final uu2 a;
    public final IdentityHashMap b;
    public final IdentityHashMap c;

    public void e33(uu2 p0){
       super();
       this.a = p0;
       this.b = new IdentityHashMap();
       this.c = new IdentityHashMap();
    }
    public final m33 a(ju2 p0){
       m33 om33;
       e33 tb = this.b;
       p0.getClass();
       if ((om33 = tb.get(p0)) == null) {
          e33 ta = this.a;
          ju2 oju2 = ta.g.a(p0);
          m33 om331 = new m33(oju2, ta.h.e(oju2));
          tb.put(p0, om331);
          this.c.put(oju2, p0);
          om33 = om331;
       }
       return om33;
    }
}
