package p.fk0;
import java.util.Comparator;
import p.zf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Comparable;
import p.ej4;

public final class fk0 implements Comparator	// class@0015e0 from classes.dex
{
    public final zf2[] a;

    public void fk0(zf2[] p0){
       this.a = p0;
    }
    public final int compare(Object p0,Object p1){
       int i2;
       fk0 ta = this.a;
       co5.o(ta, "$selectors");
       int len = ta.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          object oobject = ta[i1];
          Comparable uComparable = oobject.invoke(p0);
          if (i2 = ej4.n(uComparable, oobject.invoke(p1))) {
             i = i2;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i;
    }
}
