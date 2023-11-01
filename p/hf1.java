package p.hf1;
import p.sv1;
import com.google.gson.a;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;
import p.co5;
import p.gf1;
import p.ma7;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import p.tv1;
import p.pv1;
import p.ef1;

public final class hf1 implements sv1	// class@00183c from classes.dex
{
    public final a a;

    public void hf1(a p0){
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
             ma7 b = new gf1().b;
             co5.l(b, "object : TypeToken<Mutab…String, Long>>>\(\) {}.type");
             p0 = this.a.b(p0, b);
             co5.l(p0, "gson.fromJson\(from, fromType\)");
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                Iterator iterator1 = iterator.next().getValue().entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   String key = uEntry.getKey();
                   long l = uEntry.getValue().longValue();
                   if ((otv1 = linkedHashMa.get(key)) == null) {
                      otv1 = new tv1();
                      linkedHashMa.put(key, otv1);
                   }
                   otv1 = otv1.a;
                   int i1 = 2;
                   object oobject = otv1[i1];
                   oobject.c(new ef1(l, 0));
                   otv1[i1] = oobject;
                }
             }
          }catch(p.pg3 e0){
             linkedHashMa = new LinkedHashMap();
          }
          return linkedHashMa;
       }
    }
}
