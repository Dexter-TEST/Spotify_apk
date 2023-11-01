package p.jx0;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class jx0	// class@001b5f from classes.dex
{
    public final Request a;
    public final ResolveCallback b;

    public void jx0(Request p0,ResolveCallback p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof jx0) {
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
       return "QueuedRequest\(request="+this.a+", callback="+this.b+')';
    }
}
