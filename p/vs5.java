package p.vs5;
import p.w63;
import com.google.common.collect.f;
import java.lang.Object;
import p.ap5;
import p.zt0;
import java.lang.Comparable;
import p.pb1;
import java.lang.Class;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.String;
import p.xe7;
import p.kg4;

public final class vs5 extends w63	// class@002a58 from classes.dex
{
    public final f c;

    public void vs5(f p0){
       this.c = p0;
       super();
    }
    public final Object get(int p0){
       ap5.f(p0, this.size());
       vs5 tc = this.c;
       Comparable uComparable = tc.L();
       long l = (long)p0;
       tc.x.getClass();
       if ((l) < 0) {
          throw new IllegalArgumentException(kg4.k("distance cannot be negative but was: ", l));
       }
       long l1 = uComparable.longValue() + l;
       p0 = (int)l1;
       l = (!((long)p0 - l1))? 1: 0;
       if (l) {
          return Integer.valueOf(p0);
       }else {
          Object[] objArray = new Object[]{Long.valueOf(l1)};
          throw new IllegalArgumentException(xe7.E("Out of range: %s", objArray));
       }
    }
}
