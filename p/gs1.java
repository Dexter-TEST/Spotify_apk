package p.gs1;
import p.yf2;
import p.su0;
import java.lang.Object;
import p.fx5;
import java.lang.String;
import java.lang.Character;
import java.io.IOException;
import java.lang.StringBuilder;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.co5;
import p.uj0;
import p.vv7;

public final class gs1 implements yf2, su0	// class@00176a from classes.dex
{
    public static final gs1 a;
    public static final gs1 b;

    static {
       gs1.a = new gs1();
       gs1.b = new gs1();
    }
    public void gs1(){
       super();
    }
    public Object a(Object p0){
       p0 = p0.J();
       if (p0.length() == 1) {
          return Character.valueOf(p0.charAt(0));
       }
       throw new IOException("Expected body of length 1 for Character conversion but was "+p0.length());
    }
    public Object apply(Object p0){
       co5.o(p0, "p0");
       return vv7.g(p0);
    }
}
