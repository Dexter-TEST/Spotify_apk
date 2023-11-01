package p.iy1;
import p.l01;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class iy1 implements l01	// class@001a28 from classes.dex
{
    public final String a;
    public final String b;

    public void iy1(String p0,String p1){
       co5.o(p0, "facebookUserId");
       co5.o(p1, "facebookAccessToken");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return "facebook";
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof iy1) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return hr7.a("FacebookCredentials\(facebookUserId="+this.a+", facebookAccessToken=", this.b, ')');
    }
}
