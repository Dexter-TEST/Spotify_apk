package p.f3;
import p.om2;
import java.lang.Object;
import p.xm2;
import p.ya3;
import java.lang.String;
import p.co5;
import org.json.JSONObject;
import java.lang.Boolean;
import p.b17;
import p.tp2;
import p.ur0;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.so1;

public final class f3 implements om2	// class@001553 from classes.dex
{
    public final int a;
    public final Object b;

    public void f3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(xm2 p0){
       xm2 c = p0.c;
       p0 = p0.d;
       String str = null;
       f3 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, "$refreshResult");
             if (p0 != null) {
                tb.b = p0.optString("access_token");
                tb.c = p0.optInt("expires_at");
                tb.t = p0.optInt("expires_in");
                tb.v = Long.valueOf(p0.optLong("data_access_expiration_time"));
                tb.w = p0.optString("graph_domain", str);
             }
             break;
           case 2:
             tp2.v(tb);
             return;
           case 3:
             try{
                co5.o(tb, "$instrumentData");
                if (c == null) {
                   if (p0 != null) {
                      str = Boolean.valueOf(p0.getBoolean("success"));
                   }
                   if (co5.c(str, Boolean.TRUE)) {
                      b17.j(tb.a);
                   }
                }
                return;
             }catch(org.json.JSONException e0){
             }
             break;
           default:
             co5.o(tb, "$validReports");
             if (c == null) {
                try{
                   if (p0 != null) {
                      str = Boolean.valueOf(p0.getBoolean("success"));
                   }
                   if (co5.c(str, Boolean.TRUE)) {
                      Iterator iterator = tb.iterator();
                      while (iterator.hasNext()) {
                         b17.j(iterator.next().a);
                      }
                   }
                }catch(org.json.JSONException e0){
                }
             }
             return;
       }
       return;
    }
}
