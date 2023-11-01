package p.d65;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class d65 implements Serializable	// class@0012ea from classes.dex
{
    public final String a;

    public void d65(String p0){
       co5.o(p0, "value");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof d65) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return hr7.a("PageViewUri\(value=", this.a, ')');
    }
}
