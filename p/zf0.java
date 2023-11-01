package p.zf0;
import java.lang.Object;
import java.util.HashMap;
import p.yf0;
import p.kj3;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.reflect.Method;
import p.xf0;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.g25;
import java.lang.annotation.Annotation;
import p.ek3;
import java.lang.Boolean;
import java.lang.Throwable;

public final class zf0	// class@002ee3 from classes.dex
{
    public final HashMap a;
    public final HashMap b;
    public static final zf0 c;

    static {
       zf0.c = new zf0();
    }
    public void zf0(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public static void c(HashMap p0,yf0 p1,kj3 p2,Class p3){
       kj3 okj3;
       if ((okj3 = p0.get(p1)) != null && p2 != okj3) {
          throw new IllegalArgumentException("Method "+p1.b.getName()+" in "+p3.getName()+" already declared with different @OnLifecycleEvent value: previous value "+okj3+", new value "+p2);
       }
       if (okj3 == null) {
          p0.put(p1, p2);
       }
       return;
    }
    public final xf0 a(Class p0,Method[] p1){
       g25 annotation;
       int i1;
       Class superclass = p0.getSuperclass();
       HashMap hashMap = new HashMap();
       if (superclass != null) {
          hashMap.putAll(this.b(superclass).b);
       }
       Class[] interfaces = p0.getInterfaces();
       int len = interfaces.length;
       boolean i = 0;
       while (i < len) {
          Iterator iterator = this.b(interfaces[i]).b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             yf0 key = uEntry.getKey();
             zf0.c(hashMap, key, uEntry.getValue(), p0);
          }
          i = i + 1;
       }
       try{
          if (p1 == null) {
             p1 = p0.getDeclaredMethods();
          }
          int len1 = p1.length;
          len = 0;
          i = false;
          while (true) {
             if (len < len1) {
                object oobject = p1[len];
                if ((annotation = oobject.getAnnotation(g25.class)) != null) {
                   Class[] parameterTyp = oobject.getParameterTypes();
                   if (parameterTyp.length > 0) {
                      if (ek3.class.isAssignableFrom(parameterTyp[0])) {
                         i1 = 1;
                      }else {
                         throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                      }
                   }else {
                      i1 = 0;
                   }
                   kj3 okj3 = annotation.value();
                   if (parameterTyp.length > 1) {
                      if (kj3.class.isAssignableFrom(parameterTyp[1])) {
                         if (okj3 == kj3.ON_ANY) {
                            i1 = 2;
                         }else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                         }
                      }else {
                         throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                      }
                   }
                   if (parameterTyp.length <= 2) {
                      zf0.c(hashMap, new yf0(i1, oobject), okj3, p0);
                      i = true;
                   }else {
                      break ;
                   }
                }
                len = len + 1;
             }else {
                xf0 oxf0 = new xf0(hashMap);
                this.a.put(p0, oxf0);
                this.b.put(p0, Boolean.valueOf(i));
                return oxf0;
             }
          }
          throw new IllegalArgumentException("cannot have more than 2 params");
       }catch(java.lang.NoClassDefFoundError e12){
          throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e12);
       }
    }
    public final xf0 b(Class p0){
       xf0 oxf0;
       if ((oxf0 = this.a.get(p0)) != null) {
          return oxf0;
       }
       return this.a(p0, null);
    }
}
