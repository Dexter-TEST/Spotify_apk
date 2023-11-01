package p.cj0;
import p.bj0;
import java.lang.Iterable;
import java.util.AbstractCollection;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p.uk;

public abstract class cj0 extends bj0	// class@001217 from classes.dex
{

    public static final void c0(Iterable p0,AbstractCollection p1){
       co5.o(p1, "<this>");
       co5.o(p0, "elements");
       if (p0 instanceof Collection) {
          p1.addAll(p0);
          return;
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             p1.add(iterator.next());
          }
          return;
       }
    }
    public static final void d0(AbstractCollection p0,Object[] p1){
       co5.o(p0, "<this>");
       co5.o(p1, "elements");
       p0.addAll(uk.h0(p1));
    }
}
