package p.sv6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.LinkedHashSet;
import java.lang.String;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Object;
import p.co5;
import java.util.Set;
import android.app.Activity;
import p.xj0;
import p.gj7;
import p.b3;

public abstract class sv6	// class@0026aa from classes.dex
{
    public static final AtomicBoolean a;
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;

    static {
       sv6.a = new AtomicBoolean(false);
       sv6.b = new LinkedHashSet();
       sv6.c = new LinkedHashSet();
    }
    public static void a(String p0){
       JSONArray jSONArray;
       int i1;
       int i4;
       String str = "eligible_for_prediction_events";
       String str1 = "production_events";
       try{
          JSONObject jSONObject = new JSONObject(p0);
          int i = 0;
          if (jSONObject.has(str1)) {
             jSONArray = jSONObject.getJSONArray(str1);
             if ((i1 = jSONArray.length()) > 0) {
                int i2 = 0;
                while (true) {
                   int i3 = i2 + 1;
                   String str2 = jSONArray.getString(i2);
                   co5.l(str2, "jsonArray.getString\(i\)");
                   sv6.b.add(str2);
                   if (i3 < i1) {
                      i2 = i3;
                   }
                }
             }
          }
          if (jSONObject.has(str)) {
             jSONArray = jSONObject.getJSONArray(str);
             if ((i4 = jSONArray.length()) > 0) {
                while (true) {
                   i1 = i + 1;
                   String str3 = jSONArray.getString(i);
                   co5.l(str3, "jsonArray.getString\(i\)");
                   sv6.c.add(str3);
                   if (i1 < i4) {
                      i = i1;
                   }
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static final void b(Activity p0){
       String str = "activity";
       try{
          co5.o(p0, str);
          if (sv6.a.get() && (xj0.B && (!sv6.b.isEmpty() && sv6.c.isEmpty()))) {
             gj7.t.v(p0);
          }else {
             b3.w(p0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
