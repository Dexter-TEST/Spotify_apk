package p.tl1;
import p.xl1;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class tl1	// class@002791 from classes.dex
{
    public final xl1 a;
    public final byte[] b;

    public void tl1(xl1 p0,byte[] p1){
       super();
       if (p0 == null) {
          throw new NullPointerException("encoding is null");
       }
       if (p1 == null) {
          throw new NullPointerException("bytes is null");
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof tl1) {
          return false;
       }
       if (!this.a.equals(p0.a)) {
          return false;
       }
       return Arrays.equals(this.b, p0.b);
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ Arrays.hashCode(this.b));
    }
    public final String toString(){
       return "EncodedPayload{encoding="+this.a+", bytes=[...]}";
    }
}
