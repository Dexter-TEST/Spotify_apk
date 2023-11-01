package p.ed4;
import p.su0;
import p.j80;
import java.lang.String;
import p.ir2;
import com.squareup.moshi.JsonAdapter;
import java.lang.Object;
import p.fx5;
import p.g70;
import com.squareup.moshi.b;
import com.squareup.moshi.b$c;
import p.hf3;

public final class ed4 implements su0	// class@0001d4 from classes2.dex
{
    public final JsonAdapter a;
    public static final j80 b;

    static {
       ed4.b = ir2.r("EFBBBF");
    }
    public void ed4(JsonAdapter p0){
       super();
       this.a = p0;
    }
    public final Object a(Object p0){
       g70 og70 = p0.y();
       j80 b = ed4.b;
       if (og70.l(0, b)) {
          og70.skip((long)b.a.length);
       }
       b uob = b.p0(og70);
       Object obj = this.a.fromJson(uob);
       if (uob.q0() == b$c.A) {
          p0.close();
          return obj;
       }else {
          throw new hf3("JSON document was not fully consumed.");
       }
    }
}
