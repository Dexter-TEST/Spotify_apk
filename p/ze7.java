package p.ze7;
import p.om2;
import p.bf7;
import java.lang.String;
import java.lang.Object;
import p.xm2;
import p.co5;
import p.oz1;
import p.ny1;
import p.ol5;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import java.lang.IllegalStateException;

public final class ze7 implements om2	// class@002ee1 from classes.dex
{
    public final bf7 a;
    public final String b;

    public void ze7(bf7 p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(xm2 p0){
       xm2 c;
       ze7 ta = this.a;
       co5.o(ta, "$callback");
       ze7 tb = this.b;
       co5.o(tb, "$accessToken");
       if ((c = p0.c) != null) {
          ta.f(c.z);
       }else if((p0 = p0.d) != null){
          ol5.a.put(tb, p0);
          ta.j(p0);
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
       return;
    }
}
