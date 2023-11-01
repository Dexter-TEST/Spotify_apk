package p.u97;
import p.ty0;
import com.google.common.collect.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class u97 extends ty0	// class@00286c from classes.dex
{
    public final c m;

    public void u97(c p0){
       super();
       p0.getClass();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof u97) {
          return false;
       }
       return p0.m.equals(this.m);
    }
    public final int hashCode(){
       return (this.m.hashCode() + 0);
    }
    public final String toString(){
       return "WithData{triggers="+this.m+'}';
    }
}
