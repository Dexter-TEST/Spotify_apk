package p.w16;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.StringBuilder;

public final class w16 implements Map$Entry	// class@002aaa from classes.dex
{
    public final Object a;
    public final Object b;
    public w16 c;
    public w16 t;

    public void w16(Object p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof w16) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final Object getKey(){
       return this.a;
    }
    public final Object getValue(){
       return this.b;
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ this.b.hashCode());
    }
    public final Object setValue(Object p0){
       throw new UnsupportedOperationException("An entry modification is not supported");
    }
    public final String toString(){
       return this.a+"="+this.b;
    }
}
