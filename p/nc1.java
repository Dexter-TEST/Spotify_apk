package p.nc1;
import p.sc;
import p.m73;
import p.dt5;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.common.collect.d;
import java.util.Iterator;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Class;
import java.lang.String;
import java.util.Collections;
import p.tm5;
import p.rc;
import p.co5;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import p.cd2;
import java.lang.Throwable;

public final class nc1 implements sc	// class@001fab from classes.dex
{
    public final Map a;

    public void nc1(m73 p0){
       int i;
       dt5 x = dt5.x;
       super();
       if (p0.isEmpty()) {
       }else if((i = p0.size() + 0) < 3){
          i = i + 1;
       }else if(i < 0x40000000){
          i = (int)(((float)i / 0x3f400000) + 0x3f800000);
       }else {
          i = Integer.MAX_VALUE;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       linkedHashMa.putAll(x);
       Iterator iterator = p0.f().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          linkedHashMa.put(uEntry.getKey().getName(), uEntry.getValue());
       }
       x = Collections.unmodifiableMap(linkedHashMa);
       this.a = x;
       return;
    }
    public final void a(Object p0){
       tm5 otm5;
       Object[] objArray;
       nc1 ta = this.a;
       if ((otm5 = ta.get(p0.getClass().getName())) == null) {
          otm5 = 0;
       }else {
          rc orc = otm5.get();
          try{
             sc osc = orc.a(p0);
             co5.k(osc, orc.getClass(), "%s.create\(I\) should not return null.");
             osc.a(p0);
             orc = 1;
          }catch(java.lang.ClassCastException e1){
             Object[] objArray1 = new Object[]{orc.getClass().getCanonicalName(),p0.getClass().getCanonicalName()};
             throw new cd2(7, String.format("%s does not implement AndroidInjector.Factory<%s>", objArray1), e1);
          }
       }
       if (!otm5) {
          ArrayList uArrayList = new ArrayList();
          for (Class class = p0.getClass(); class != null; class = class.getSuperclass()) {
             if (ta.containsKey(class.getCanonicalName())) {
                uArrayList.add(class.getCanonicalName());
             }
          }
          if (uArrayList.isEmpty()) {
             objArray = new Object[]{p0.getClass().getCanonicalName()};
             p0 = String.format("No injector factory bound for Class<%s>", objArray);
          }else {
             objArray = new Object[]{p0.getClass().getCanonicalName(),uArrayList};
             p0 = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", objArray);
          }
          throw new IllegalArgumentException(p0);
       }else {
          return;
       }
    }
}
