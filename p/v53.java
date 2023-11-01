package p.v53;
import p.nh5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class v53 implements nh5	// class@002985 from classes.dex
{
    public final String a;
    public final boolean b;
    public final String c;

    public void v53(String p0){
       co5.o(p0, "policyValue");
       super();
       this.a = "/client/spotify-id";
       this.b = true;
       this.c = p0;
    }
    public final boolean a(){
       return this.b;
    }
    public final String b(){
       return this.c;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof v53) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final String getPolicyId(){
       return this.a;
    }
    public final int hashCode(){
       return this.c.hashCode();
    }
    public final String toString(){
       return hr7.a("SpotifyIdIdentifier\(policyValue=", this.c, ')');
    }
}
