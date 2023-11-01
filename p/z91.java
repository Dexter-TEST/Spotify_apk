package p.z91;
import p.om2;
import p.ea1;
import java.lang.Object;
import p.xm2;
import java.lang.String;
import p.co5;
import java.util.concurrent.atomic.AtomicBoolean;
import p.oz1;
import p.ma1;
import p.ca1;
import p.et3;
import p.ny1;
import org.json.JSONObject;
import java.lang.Long;
import java.lang.Throwable;
import java.util.Locale;
import java.util.Arrays;

public final class z91 implements om2	// class@002eae from classes.dex
{
    public final int a;
    public final ea1 b;

    public void z91(ea1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(xm2 p0){
       z91 tb;
       xm2 c;
       oz1 c1;
       ea1 o;
       ny1 ony1;
       JSONObject jSONObject;
       String str1;
       int i = 0;
       int i1 = 1;
       String str = "this$0";
       switch (this.a){
           case 0:
             tb = this.b;
             co5.o(tb, str);
             if (!tb.L.get()) {
                try{
                   if ((c = p0.c) != null) {
                      if ((c1 = c.c) == 0x149636 || c1 == 0x149634) {
                         i = 1;
                      }
                      if (i) {
                         tb.J();
                      }else if(c1 == 0x149620){
                         if ((o = tb.O) != null) {
                            ma1.a(o.b);
                         }
                         if ((o = tb.R) != null) {
                            tb.L(o);
                         }else {
                            tb.F();
                         }
                      }else if(c1 == 0x149635){
                         tb.F();
                      }else if(c.z == null){
                         ony1 = new ny1();
                         tb.G(ony1);
                      }
                   }else if((p0 = p0.b) == null){
                      jSONObject = new JSONObject();
                   }
                   str1 = jSONObject.getString("access_token");
                   co5.l(str1, "resultObject.getString\(\"access_token\"\)");
                   tb.H(str1, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                }catch(org.json.JSONException e8){
                   tb.G(new ny1(e8));
                }
             }
             break;
           default:
             tb = this.b;
             co5.o(tb, str);
             if (tb.P == null) {
                if ((c = p0.c) != null) {
                   if ((c1 = c.z) == null) {
                      ony1 = new ny1();
                   }
                   tb.G(ony1);
                }else if((p0 = p0.b) == null){
                   jSONObject = new JSONObject();
                }
                try{
                   ca1 c2 = new ca1();
                   String str2 = jSONObject.getString("user_code");
                   c2.b = str2;
                   Object[] objArray = new Object[i1];
                   objArray[i] = str2;
                   str1 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(objArray, i1));
                   co5.l(str1, "java.lang.String.format\(locale, format, *args\)");
                   c2.a = str1;
                   c2.c = jSONObject.getString("code");
                   c2.t = jSONObject.getLong("interval");
                   tb.K(c2);
                }catch(org.json.JSONException e8){
                   tb.G(new ny1(e8));
                }
             }
             return;
       }
       return;
    }
}
