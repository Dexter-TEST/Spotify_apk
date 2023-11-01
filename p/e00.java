package p.e00;
import java.io.Serializable;
import p.fb6;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import p.z70;
import java.lang.Object;
import p.s57;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Integer;
import p.fo4;
import java.lang.Long;
import java.lang.Byte;
import p.ho4;
import java.lang.Short;
import p.io4;
import java.lang.Double;
import java.lang.Float;
import p.go4;
import java.lang.Boolean;
import p.i30;
import java.math.BigInteger;
import p.do4;
import java.math.BigDecimal;
import java.util.Calendar;
import p.q90;
import java.util.Date;
import p.q51;
import java.net.URL;
import java.net.URI;
import java.util.Currency;
import p.eb7;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p.es6;
import java.util.concurrent.atomic.AtomicInteger;
import p.fs6;
import java.util.concurrent.atomic.AtomicLong;
import p.gs6;
import java.io.File;
import p.a42;
import p.vf0;
import p.tn4;
import java.lang.Void;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map$Entry;
import p.mg3;
import p.u57;
import p.v57;
import p.gb6;
import p.le;
import p.ne;
import p.tu0;
import p.p51;
import p.ia7;
import p.ru0;
import p.ds6;
import p.he3;

public abstract class e00 extends fb6 implements Serializable	// class@0013ed from classes.dex
{

    static {
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       hashMap1.put(String.class.getName(), new z70(2));
       s57 t = s57.t;
       hashMap1.put(StringBuffer.class.getName(), t);
       hashMap1.put(StringBuilder.class.getName(), t);
       hashMap1.put(Character.class.getName(), t);
       hashMap1.put(Character.TYPE.getName(), t);
       hashMap1.put(Integer.class.getName(), new fo4(1, Integer.class));
       Class tYPE = Integer.TYPE;
       hashMap1.put(tYPE.getName(), new fo4(1, tYPE));
       hashMap1.put(Long.class.getName(), new fo4(2, Long.class));
       tYPE = Long.TYPE;
       hashMap1.put(tYPE.getName(), new fo4(2, tYPE));
       ho4 v = ho4.v;
       hashMap1.put(Byte.class.getName(), v);
       hashMap1.put(Byte.TYPE.getName(), v);
       io4 v1 = io4.v;
       hashMap1.put(Short.class.getName(), v1);
       hashMap1.put(Short.TYPE.getName(), v1);
       int i = 0;
       hashMap1.put(Double.class.getName(), new fo4(i, Double.class));
       hashMap1.put(Double.TYPE.getName(), new fo4(i, Double.TYPE));
       go4 v2 = go4.v;
       hashMap1.put(Float.class.getName(), v2);
       hashMap1.put(Float.TYPE.getName(), v2);
       hashMap1.put(Boolean.TYPE.getName(), new i30(1, 1));
       hashMap1.put(Boolean.class.getName(), new i30(1, i));
       hashMap1.put(BigInteger.class.getName(), new do4(BigInteger.class));
       hashMap1.put(BigDecimal.class.getName(), new do4(BigDecimal.class));
       hashMap1.put(Calendar.class.getName(), q90.x);
       hashMap1.put(Date.class.getName(), q51.x);
       HashMap tYPE1 = new HashMap();
       tYPE1.put(URL.class, new s57(URL.class));
       tYPE1.put(URI.class, new s57(URI.class));
       tYPE1.put(Currency.class, new s57(Currency.class));
       tYPE1.put(UUID.class, new eb7(null));
       tYPE1.put(Pattern.class, new s57(Pattern.class));
       tYPE1.put(Locale.class, new s57(Locale.class));
       tYPE1.put(AtomicBoolean.class, es6.class);
       tYPE1.put(AtomicInteger.class, fs6.class);
       tYPE1.put(AtomicLong.class, gs6.class);
       tYPE1.put(File.class, a42.class);
       tYPE1.put(Class.class, vf0.class);
       tn4 c = tn4.c;
       tYPE1.put(Void.class, c);
       tYPE1.put(Void.TYPE, c);
       Iterator iterator = tYPE1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object value = uEntry.getValue();
          if (value instanceof mg3) {
             hashMap1.put(uEntry.getKey().getName(), value);
          }else {
             hashMap.put(uEntry.getKey().getName(), value);
          }
       }
       hashMap.put(u57.class.getName(), v57.class);
    }
    public static mg3 b(gb6 p0,le p1){
       mg3 obj = p0.t().j(p1);
       mg3 omg3 = null;
       if (obj == null) {
          return omg3;
       }
       obj = p0.z(p1, obj);
       if ((p1 = p0.t().i(p1)) != null) {
          omg3 = p0.d(p1);
       }
       if (omg3 != null) {
          p0.f();
          omg3.getClass();
          ds6 uods6 = new ds6(omg3, null, obj);
       }
       return obj;
    }
}
