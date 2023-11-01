package p.zf6;
import p.uw5;
import p.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class zf6 extends uw5	// class@002ee9 from classes.dex
{
    public final c A;

    public void zf6(c p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zf6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "LoginWithFacebook{facebookCredentials="+this.A+'}';
    }
}
