package p.fw;
import java.lang.String;
import p.kk5;
import java.lang.Object;
import p.t63;
import android.util.Base64;
import java.util.Arrays;

public final class fw	// class@001653 from classes.dex
{
    public final String a;
    public final byte[] b;
    public final kk5 c;

    public void fw(String p0,byte[] p1,kk5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static t63 a(){
       t63 ot63 = new t63(4);
       ot63.t = kk5.a;
       return ot63;
    }
    public final String b(){
       fw tb;
       Object[] objArray = new Object[3];
       objArray[0] = this.a;
       objArray[1] = this.c;
       int i = 2;
       String str = ((tb = this.b) == null)? "": Base64.encodeToString(tb, i);
       objArray[i] = str;
       return String.format("TransportContext\(%s, %s, %s\)", objArray);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof fw) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!Arrays.equals(this.b, p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ Arrays.hashCode(this.b)) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return this.b();
    }
}
