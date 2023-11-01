package p.ei1;
import p.fi1;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class ei1 extends fi1	// class@00148f from classes.dex
{
    public final String a;

    public void ei1(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ei1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("ValidateEmail{email=", this.a, '}');
    }
}
