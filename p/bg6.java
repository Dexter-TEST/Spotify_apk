package p.bg6;
import p.uw5;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class bg6 extends uw5	// class@0010be from classes.dex
{
    public final String A;

    public void bg6(String p0){
       super();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof bg6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("ReturnAccessToken{accessToken=", this.A, '}');
    }
}
