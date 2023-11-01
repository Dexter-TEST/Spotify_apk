package p.vl5;
import p.az5;
import p.wq3;
import p.nl5;
import java.lang.Object;
import p.ml5;
import java.lang.Class;
import org.json.JSONObject;
import java.lang.String;
import android.net.Uri;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import p.ej4;
import android.content.Intent;
import android.os.Parcelable;

public final class vl5	// class@002a1b from classes.dex
{
    public final wq3 a;
    public final nl5 b;
    public ml5 c;
    public static final az5 d;
    public static vl5 e;

    static {
       vl5.d = new az5();
    }
    public void vl5(wq3 p0,nl5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(ml5 p0,boolean p1){
       JSONObject jSONObject;
       ml5 w;
       vl5 tc = this.c;
       this.c = p0;
       if (p1) {
          String str = "com.facebook.ProfileManager.CachedProfile";
          vl5 tb = this.b;
          if (p0 != null) {
             tb.getClass();
             try{
                jSONObject = new JSONObject();
                jSONObject.put("id", p0.a);
                jSONObject.put("first_name", p0.b);
                jSONObject.put("middle_name", p0.c);
                jSONObject.put("last_name", p0.t);
                jSONObject.put("name", p0.v);
                if ((w = p0.w) != null) {
                   jSONObject.put("link_uri", w.toString());
                label_0044 :
                   if ((w = p0.x) != null) {
                      jSONObject.put("picture_uri", w.toString());
                   }
                }else {
                   goto label_0044 ;
                }
             }catch(org.json.JSONException e0){
                jSONObject = null;
             }
             if (jSONObject) {
                tb.a.edit().putString(str, jSONObject.toString()).apply();
             }
          }else {
             tb.a.edit().remove(str).apply();
          }
       }
       if (!ej4.c(e0, p0)) {
          Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
          intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", e0);
          intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", p0);
          this.a.c(intent);
       }
       return;
    }
}
