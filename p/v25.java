package p.v25;
import p.d35;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class v25 extends d35	// class@00296c from classes.dex
{
    public final String a;

    public void v25(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof v25) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("CodeFromClipboard{text=", this.a, '}');
    }
}
