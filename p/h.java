package p.h;
import android.os.Parcelable;
import p.i80;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import com.google.protobuf.c;
import java.lang.StringBuilder;

public abstract class h implements Parcelable	// class@00180d from classes.dex
{
    public final i80 a;
    public final Challenges b;
    public final PhoneNumber c;

    public void h(i80 p0,Challenges p1,PhoneNumber p2){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null loginContext");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null challenges");
       }
       this.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null phoneNumber");
       }
       this.c = p2;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "PhoneNumberLoginContext{loginContext="+this.a+", challenges="+this.b+", phoneNumber="+this.c+"}";
    }
}
