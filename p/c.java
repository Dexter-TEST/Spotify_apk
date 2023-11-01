package p.c;
import android.os.Parcelable;
import p.r45;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public abstract class c implements Parcelable	// class@0011c6 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final r45 t;

    public void c(r45 p0,String p1,String p2,String p3){
       super();
       if (p1 == null) {
          throw new NullPointerException("Null userId");
       }
       this.a = p1;
       if (p2 == null) {
          throw new NullPointerException("Null token");
       }
       this.b = p2;
       if (p3 == null) {
          throw new NullPointerException("Null userName");
       }
       this.c = p3;
       if (p0 == null) {
          throw new NullPointerException("Null email");
       }
       this.t = p0;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof c) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.t.equals(p0.t)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.t.hashCode());
    }
    public final String toString(){
       return "FacebookCredentials{userId="+this.a+", token="+this.b+", userName="+this.c+", email="+this.t+"}";
    }
}
