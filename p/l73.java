package p.l73;
import java.io.Serializable;
import p.m73;
import java.lang.Object;
import java.util.Map;
import p.at5;
import p.qc7;
import com.google.common.collect.b;
import java.util.Iterator;
import java.util.Map$Entry;
import p.k73;
import com.google.common.collect.d;
import java.util.AbstractCollection;

public class l73 implements Serializable	// class@001cf9 from classes.dex
{
    public final Object[] a;
    public final Object[] b;

    public void l73(m73 p0){
       m73 a;
       super();
       Object[] objArray = new Object[p0.size()];
       Object[] objArray1 = new Object[p0.size()];
       if ((a = p0.a) == null) {
          a = p0.c();
          p0.a = a;
       }
       qc7 oqc7 = a.l();
       int i = 0;
       while (oqc7.hasNext()) {
          Map$Entry uEntry = oqc7.next();
          objArray[i] = uEntry.getKey();
          objArray1[i] = uEntry.getValue();
          i = i + 1;
       }
       this.a = objArray;
       this.b = objArray1;
       return;
    }
    public k73 a(int p0){
       return new k73(p0);
    }
    public final Object readResolve(){
       k73 ok73;
       l73 ta = this.a;
       l73 tb = this.b;
       if (!ta instanceof d) {
          ok73 = this.a(ta.length);
          for (int i = 0; i < ta.length; i = i + 1) {
             ok73.d(ta[i], tb[i]);
          }
          return ok73.c();
       }else {
          ok73 = this.a(ta.size());
          qc7 oqc7 = ta.l();
          qc7 oqc71 = tb.l();
          while (oqc7.hasNext()) {
             ok73.d(oqc7.next(), oqc71.next());
          }
          return ok73.c();
       }
    }
}
