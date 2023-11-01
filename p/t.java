package p.t;
import p.om2;
import java.util.List;
import java.lang.Object;
import p.xm2;
import java.lang.String;
import p.co5;
import org.json.JSONObject;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import p.ya3;
import p.b17;

public final class t implements om2	// class@00272c from classes.dex
{
    public final int a;
    public final List b;

    public void t(int p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(xm2 p0){
       Iterator iterator;
       xm2 d = p0.d;
       p0 = p0.c;
       Boolean uBoolean = null;
       t tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, "$validReports");
             if (p0 == null) {
                try{
                   if (d != null) {
                      uBoolean = Boolean.valueOf(d.getBoolean("success"));
                   }
                   if (co5.c(uBoolean, Boolean.TRUE)) {
                      iterator = tb.iterator();
                      while (iterator.hasNext()) {
                         b17.j(iterator.next().a);
                      }
                   }
                }catch(org.json.JSONException e0){
                }
             }
             break;
           default:
             co5.o(tb, "$validReports");
             if (p0 == null) {
                try{
                   if (d != null) {
                      uBoolean = Boolean.valueOf(d.getBoolean("success"));
                   }
                   if (co5.c(uBoolean, Boolean.TRUE)) {
                      iterator = tb.iterator();
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
