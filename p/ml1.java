package p.ml1;
import java.util.Map;
import java.io.Serializable;
import p.ch3;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Void;
import p.co5;
import java.util.Set;
import p.pl1;
import java.util.Collection;
import p.ll1;

public final class ml1 implements Map, Serializable, ch3	// class@001eb8 from classes.dex
{
    public static final ml1 a;

    static {
       ml1.a = new ml1();
    }
    public void ml1(){
       super();
    }
    private final Object readResolve(){
       return ml1.a;
    }
    public final void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean containsKey(Object p0){
       return false;
    }
    public final boolean containsValue(Object p0){
       if (!p0 instanceof Void) {
          return false;
       }
       co5.o(p0, "value");
       return false;
    }
    public final Set entrySet(){
       return pl1.a;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof Map && p0.isEmpty())? true: false;
       return b;
    }
    public final Object get(Object p0){
       return null;
    }
    public final int hashCode(){
       return 0;
    }
    public final boolean isEmpty(){
       return true;
    }
    public final Set keySet(){
       return pl1.a;
    }
    public final Object put(Object p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final void putAll(Map p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final Object remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return 0;
    }
    public final String toString(){
       return "{}";
    }
    public final Collection values(){
       return ll1.a;
    }
}
