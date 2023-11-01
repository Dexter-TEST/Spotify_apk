package p.e66;
import p.ty0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class e66 extends ty0	// class@00142b from classes.dex
{
    public final String m;

    public void e66(String p0){
       super();
       p0.getClass();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof e66) {
          return false;
       }
       return p0.m.equals(this.m);
    }
    public final int hashCode(){
       return (this.m.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("SendSearchRequest{query=", this.m, '}');
    }
}
