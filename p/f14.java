package p.f14;
import p.s1;
import java.util.Map;
import java.util.Collections;
import java.lang.Object;
import p.ta3;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tm5;

public final class f14 extends s1	// class@00153b from classes.dex
{
    public static final int b;

    static {
       ta3.a(Collections.emptyMap());
    }
    public void f14(LinkedHashMap p0){
       super(p0);
    }
    public final Object get(){
       int i;
       s1 ta = this.a;
       if ((i = ta.size()) < 3) {
          i = i + 1;
       }else if(i < 0x40000000){
          i = (int)(((float)i / 0x3f400000) + 0x3f800000);
       }else {
          i = Integer.MAX_VALUE;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       Iterator iterator = ta.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          linkedHashMa.put(key, uEntry.getValue().get());
       }
       return Collections.unmodifiableMap(linkedHashMa);
    }
}
