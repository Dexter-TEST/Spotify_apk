package p.g14;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import p.cc3;
import p.tb3;
import java.lang.UnsupportedOperationException;
import java.util.AbstractMap;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Arrays;
import java.lang.Class;

public final class g14 extends LinkedHashMap	// class@00167d from classes.dex
{
    public boolean a;
    public static final g14 b;

    static {
       g14 og14 = new g14();
       g14.b = og14;
       og14.a = false;
    }
    public void g14(){
       super();
       this.a = true;
    }
    public void g14(Map p0){
       super(p0);
       this.a = true;
    }
    public static int a(Object p0){
       if (p0 instanceof byte[]) {
          int len = p0.length;
          int i = len;
          int i1 = 0;
          while (true) {
             int i2 = 0 + len;
             if (i1 < i2) {
                i = i * 31;
                i = i + p0[i1];
                i1 = i1 + 1;
             }else if(!i){
                i = 1;
             }
             return i;
          }
       }else if(!p0 instanceof tb3){
          return p0.hashCode();
       }else {
          throw new UnsupportedOperationException();
       }
    }
    public final void c(){
       if (this.a != null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final void clear(){
       this.c();
       super.clear();
    }
    public final g14 d(){
       g14 og14 = (this.isEmpty())? new g14(): new g14(this);
       return og14;
    }
    public final Set entrySet(){
       Set set = (this.isEmpty())? Collections.emptySet(): super.entrySet();
       return set;
    }
    public final boolean equals(Object p0){
       int i;
       boolean b = false;
       if (p0 instanceof Map) {
          if (this != p0) {
             if (this.size() == p0.size()) {
                Iterator iterator = this.entrySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (p0.containsKey(uEntry.getKey())) {
                         Object value = uEntry.getValue();
                         Object obj = p0.get(uEntry.getKey());
                         boolean b1 = (value instanceof byte[] && obj instanceof byte[])? Arrays.equals(value, obj): value.equals(obj);
                         if (b1) {
                            continue ;
                         }
                      }
                   }
                }
                if (i) {
                   b = true;
                }
             }
             i = 0;
          }
          i = 1;
       }
       return b;
    }
    public final int hashCode(){
       Iterator iterator = this.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = g14.a(uEntry.getValue()) ^ g14.a(uEntry.getKey());
          i = i + i1;
       }
       return i;
    }
    public final Object put(Object p0,Object p1){
       this.c();
       p0.getClass();
       p1.getClass();
       return super.put(p0, p1);
    }
    public final void putAll(Map p0){
       this.c();
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          obj.getClass();
          p0.get(obj).getClass();
       }
       super.putAll(p0);
       return;
    }
    public final Object remove(Object p0){
       this.c();
       return super.remove(p0);
    }
}
