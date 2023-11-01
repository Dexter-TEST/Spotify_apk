package p.gu;
import java.lang.Class;
import p.p65;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class gu	// class@001783 from classes.dex
{
    public final Class a;
    public final p65 b;

    public void gu(Class p0,p65 p1){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null itemBinder");
       }
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gu) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "BinderEntry{itemClass="+this.a+", itemBinder="+this.b+"}";
    }
}
