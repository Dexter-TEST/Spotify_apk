package p.l95;
import java.util.HashMap;
import p.k95;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.util.Map;
import java.util.Collections;

public abstract class l95	// class@001d0d from classes.dex
{
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       HashMap hashMap2 = new HashMap();
       k95[] b = k95.b;
       int len = b.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = b[i];
          hashMap2.put(oobject.a, oobject);
          k95 a = oobject.a;
          hashMap.put(a.getSimpleName(), oobject);
          hashMap1.put(a.getName(), oobject);
       }
       l95.c = Collections.unmodifiableMap(hashMap2);
       l95.b = Collections.unmodifiableMap(hashMap1);
       l95.a = Collections.unmodifiableMap(hashMap);
    }
}
