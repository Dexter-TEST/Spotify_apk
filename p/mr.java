package p.mr;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import p.en6;
import java.lang.StringBuilder;

public final class mr	// class@001ef2 from classes.dex
{
    public final int a;
    public final long b;

    public void mr(int p0,long p1){
       super();
       if (!p0) {
          throw new NullPointerException("Null status");
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof mr) {
          return false;
       }
       if (!en6.b(this.a, p0.a) || (this.b - p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       mr tb = this.b;
       return (((en6.A(this.a) ^ 0xf4243) * 0xf4243) ^ (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return "BackendResponse{status="+en6.D(this.a)+", nextRequestWaitMillis="+this.b+"}";
    }
}
