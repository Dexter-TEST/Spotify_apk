package p.ld0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p.dj0;
import p.ry7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wf2;
import java.util.Iterator;
import java.lang.Iterable;
import p.tp2;

public final class ld0	// class@001d2d from classes.dex
{
    public final Set a;
    public final ry7 b;
    public static final ld0 c;

    static {
       ld0.c = new ld0(dj0.F0(new ArrayList()), null);
    }
    public void ld0(Set p0,ry7 p1){
       co5.o(p0, "pins");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0,wf2 p1){
       co5.o(p0, "hostname");
       Iterator iterator = this.a.iterator();
       if (!iterator.hasNext()) {
          return;
       }
       tp2.v(iterator.next());
       throw null;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ld0 && (co5.c(p0.a, this.a) && co5.c(p0.b, this.b)))? true: false;
       return b;
    }
    public final int hashCode(){
       ld0 tb;
       int i = (this.a.hashCode() + 1517) * 41;
       int i1 = ((tb = this.b) != null)? tb.hashCode(): 0;
       return (i + i1);
    }
}
