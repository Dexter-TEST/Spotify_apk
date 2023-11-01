package p.rb6;
import p.mb6;
import android.content.Context;
import p.r50;
import org.json.JSONObject;
import p.ib6;
import java.lang.String;
import p.ji5;
import java.lang.Object;
import java.lang.Throwable;
import p.t50;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Boolean;
import p.r8;
import p.en6;
import p.sb6;
import p.c60;

public final class rb6 extends mb6	// class@0024b6 from classes.dex
{

    public void rb6(Context p0,r50 p1,boolean p2){
       super(p0, 6, p2);
       this.k = p1;
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("randomized_device_token", this.c.k());
          jSONObject.put("randomized_bundle_token", this.c.j());
          this.l(jSONObject);
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
          this.g = true;
       }
       return;
    }
    public void rb6(JSONObject p0,Context p1,boolean p2){
       super(6, p0, p1, p2);
    }
    public final void b(){
       this.k = null;
    }
    public final void f(int p0,String p1){
       JSONObject jSONObject;
       if (this.k != null && !Boolean.parseBoolean(t50.i().m.get("instant_dl_session"))) {
          try{
             jSONObject = new JSONObject();
             jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
          }
          this.k.a(jSONObject, new r8(en6.n("Trouble initializing Branch. ", p1), p0));
       }
       return;
    }
    public final void g(){
    }
    public final void i(){
       mb6 tk;
       super.i();
       if (t50.i().t != null) {
          if ((tk = this.k) != null) {
             tk.a(t50.i().j(), null);
          }
          t50.i().a("instant_dl_session", "true");
          t50.i().t = false;
       }
       return;
    }
    public final void j(sb6 p0,t50 p1){
       String str = "data";
       String str1 = "link_click_id";
       try{
          super.j(p0, p1);
          ib6 tc = this.c;
          if (p0.a().has(str1)) {
             tc.w("bnc_link_click_id", p0.a().getString(str1));
          }else {
             tc.w("bnc_link_click_id", "bnc_no_value");
          }
          if (p0.a().has(str)) {
             tc.v(p0.a().getString(str));
          }else {
             tc.v("bnc_no_value");
          }
          if (this.k != null && !Boolean.parseBoolean(t50.i().m.get("instant_dl_session"))) {
             this.k.a(p1.j(), null);
          }
          tc.w("bnc_app_version", c60.c().a());
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       mb6.s(p1);
       return;
    }
    public final boolean m(){
       return true;
    }
    public final String q(){
       return "open";
    }
}
