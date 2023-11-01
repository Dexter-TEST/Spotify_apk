package p.e14;
import p.a27;
import p.r75;
import com.spotify.login5.v3.proto.Challenges;
import java.lang.Object;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import p.f14;
import java.util.LinkedHashMap;
import java.lang.String;
import p.tm5;
import java.util.AbstractMap;
import java.lang.NullPointerException;

public final class e14 extends a27	// class@0013fb from classes.dex
{

    public void e14(){
       super(0);
    }
    public void e14(int p0){
       if (p0 != 1) {
          super(7, Challenges.parser());
          return;
       }else {
          super(7, PhoneNumber.parser());
          return;
       }
    }
    public f14 j(){
       return new f14(this.b);
    }
    public void k(String p0,tm5 p1){
       a27 tb = this.b;
       if (p1 == null) {
          throw new NullPointerException("provider");
       }
       tb.put(p0, p1);
       return;
    }
}
