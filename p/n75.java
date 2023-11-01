package p.n75;
import java.lang.Iterable;
import p.ch3;
import p.ml1;
import java.util.Map;
import java.lang.Object;
import p.co5;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.String;
import p.tp2;
import p.t65;
import java.util.Collection;
import java.util.List;
import java.lang.StringBuilder;

public final class n75 implements Iterable, ch3	// class@001f81 from classes.dex
{
    public final Map a;
    public static final n75 b;

    static {
       n75.b = new n75(ml1.a);
    }
    public void n75(Map p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof n75 || !co5.c(this.a, p0.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final Iterator iterator(){
       n75 ta = this.a;
       ArrayList uArrayList = new ArrayList(ta.size());
       Iterator iterator = ta.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          tp2.v(uEntry.getValue());
          uArrayList.add(new t65(key, null));
       }
       return uArrayList.iterator();
    }
    public final String toString(){
       return "Parameters\(entries="+this.a+')';
    }
}
