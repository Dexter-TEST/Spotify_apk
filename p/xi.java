package p.xi;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class xi	// class@002c87 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;

    public void xi(String p0,String p1,String p2){
       co5.o(p1, "cloudBridgeURL");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xi) {
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
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + tp2.g(this.b, (this.a.hashCode() * 31), 31));
    }
    public final String toString(){
       return hr7.a("CloudBridgeCredentials\(datasetID="+this.a+", cloudBridgeURL="+this.b+", accessKey=", this.c, ')');
    }
}
