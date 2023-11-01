package p.rv1;
import p.sv1;
import com.google.gson.a;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;
import p.co5;
import p.qv1;
import p.ma7;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.ef1;
import p.tv1;
import p.pv1;

public final class rv1 implements sv1	// class@002564 from classes.dex
{
    public final a a;

    public void rv1(a p0){
       super();
       this.a = p0;
    }
    public final LinkedHashMap a(String p0){
       LinkedHashMap linkedHashMa;
       tv1 otv1;
       co5.o(p0, "from");
       int i = (!p0.length())? 1: 0;
       if (i) {
          return new LinkedHashMap();
       }else {
          try{
             linkedHashMa = new LinkedHashMap();
             ma7 b = new qv1().b;
             co5.l(b, "object : TypeToken<Mutab…roppedCounts>>>\(\) {}.type");
             p0 = this.a.b(p0, b);
             co5.l(p0, "gson.fromJson\(from, fromType\)");
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                Iterator iterator1 = iterator.next().getValue().entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   String key = uEntry.getKey();
                   ef1 value = uEntry.getValue();
                   if ((otv1 = linkedHashMa.get(key)) == null) {
                      otv1 = new tv1();
                      linkedHashMa.put(key, otv1);
                   }
                   co5.o(value, "count");
                   tv1 a = otv1.a;
                   int i1 = 2;
                   object oobject = a[i1];
                   oobject.c(value);
                   a[i1] = oobject;
                }
             }
          }catch(p.pg3 e0){
             linkedHashMa = new LinkedHashMap();
          }
          return linkedHashMa;
       }
    }
}
