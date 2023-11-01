package p.zr;
import p.ry0;
import java.lang.String;
import java.lang.Object;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class zr extends ry0	// class@002f54 from classes.dex
{
    public final String a;
    public final byte[] b;

    public void zr(String p0,byte[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ry0) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          if (p0 instanceof zr) {
          }else {
          }
          if (Arrays.equals(this.b, p0.b)) {
          label_002d :
             return b;
          }
       }
       b = false;
       goto label_002d ;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ Arrays.hashCode(this.b));
    }
    public final String toString(){
       return "File{filename="+this.a+", contents="+Arrays.toString(this.b)+"}";
    }
}
