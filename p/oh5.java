package p.oh5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.ll1;
import java.util.ArrayList;
import p.v53;
import p.nh5;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import p.aj0;
import p.xe7;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class oh5	// class@002120 from classes.dex
{
    public final List a;
    public final ArrayList b;

    public void oh5(String p0){
       co5.o(p0, "spotifyId");
       super();
       this.a = ll1.a;
       this.b = new ArrayList();
       this.a(new v53(p0));
    }
    public static LinkedHashMap c(ArrayList p0){
       int i;
       if ((i = xe7.F(aj0.b0(p0))) < 16) {
          i = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          nh5 onh5 = iterator.next();
          String policyId = onh5.getPolicyId();
          linkedHashMa.put(policyId, onh5.b());
       }
       return linkedHashMa;
    }
    public final void a(nh5 p0){
       this.b.add(p0);
    }
    public final TreeMap b(){
       return new TreeMap(oh5.c(this.b));
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof oh5)? co5.c(this.b(), p0.b()): false;
       return b;
    }
    public final int hashCode(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.a()) {
             uArrayList.add(obj);
          }
       }
       return oh5.c(uArrayList).hashCode();
    }
}
