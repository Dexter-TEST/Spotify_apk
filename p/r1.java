package p.r1;
import java.util.Map$Entry;
import java.lang.Object;
import p.io2;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class r1 implements Map$Entry	// class@00245d from classes.dex
{

    public void r1(){
       super();
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (io2.j(this.getKey(), p0.getKey()) && io2.j(this.getValue(), p0.getValue()))) {
          b = true;
       }
       return b;
    }
    public abstract Object getKey();
    public abstract Object getValue();
    public final int hashCode(){
       Object key = this.getKey();
       Object value = this.getValue();
       int i = 0;
       int i1 = (key == null)? 0: key.hashCode();
       if (value != null) {
          i = value.hashCode();
       }
       return (i1 ^ i);
    }
    public final String toString(){
       return this.getKey()+"="+this.getValue();
    }
}
