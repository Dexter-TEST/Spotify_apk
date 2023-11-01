package p.sg0;
import p.oh5;
import java.lang.Object;
import p.co5;
import java.lang.String;
import p.tp2;
import java.lang.StringBuilder;

public final class sg0	// class@00261f from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final oh5 d;

    public void sg0(oh5 p0){
       super();
       this.a = "com.spotify.lite";
       this.b = "8.8.80.328";
       this.c = "35ce984288e048b77569527ac392fb22820c4fa8bffb9500d0c8995981d9533e";
       this.d = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof sg0) {
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
       return (this.d.hashCode() + tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31));
    }
    public final String toString(){
       return "ClientData\(clientId="+this.a+", clientVersion="+this.b+", propertySetId="+this.c+", policyInputs="+this.d+')';
    }
}
