package p.wu3;
import p.a3;
import p.yp;
import java.util.Set;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class wu3	// class@002baa from classes.dex
{
    public final a3 a;
    public final yp b;
    public final Set c;
    public final Set d;

    public void wu3(a3 p0,yp p1,Set p2,Set p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof wu3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       wu3 tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (this.d.hashCode() + ((this.c.hashCode() + ((i + i1) * 31)) * 31));
    }
    public final String toString(){
       return "LoginResult\(accessToken="+this.a+", authenticationToken="+this.b+", recentlyGrantedPermissions="+this.c+", recentlyDeniedPermissions="+this.d+')';
    }
}
