package p.qb6;
import p.mb6;
import android.content.Context;
import p.r50;
import org.json.JSONObject;
import java.lang.Throwable;
import p.ib6;
import java.lang.String;
import java.lang.Object;
import p.r8;
import p.en6;
import p.ji5;
import p.ox7;
import p.sb6;
import p.t50;
import p.c60;

public final class qb6 extends mb6	// class@00236e from classes.dex
{

    public void qb6(Context p0,r50 p1,boolean p2){
       super(p0, 4, p2);
       try{
          this.k = p1;
          this.l(new JSONObject());
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
          this.g = true;
       }
       return;
    }
    public void qb6(JSONObject p0,Context p1,boolean p2){
       super(4, p0, p1, p2);
    }
    public final void b(){
       this.k = null;
    }
    public final void f(int p0,String p1){
       JSONObject jSONObject;
       if (this.k != null) {
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
       try{
          super.i();
          ib6 tc = this.c;
          long l = tc.i("bnc_referrer_click_ts");
          long l1 = tc.i("bnc_install_begin_ts");
          if ((l) > 0) {
             this.a.put("clicked_referrer_ts", l);
          }
          if ((l1) > 0) {
             this.a.put("install_begin_ts", l1);
          }
          if (!ox7.b.equals("bnc_no_value")) {
             this.a.put("link_click_id", ox7.b);
          }
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public final void j(sb6 p0,t50 p1){
       mb6 tk;
       String str = "bnc_install_params";
       String str1 = "+clicked_branch_link";
       ib6 tc = this.c;
       try{
          super.j(p0, p1);
          tc.w("bnc_user_url", p0.a().getString("link"));
          if (p0.a().has("data")) {
             JSONObject jSONObject = new JSONObject(p0.a().getString("data"));
             if (jSONObject.has(str1) && (jSONObject.getBoolean(str1) && tc.p(str).equals("bnc_no_value"))) {
                tc.w(str, p0.a().getString("data"));
             }
          }
          str1 = "bnc_link_click_id";
          if (p0.a().has("link_click_id")) {
             tc.w(str1, p0.a().getString("link_click_id"));
          }else {
             tc.w(str1, "bnc_no_value");
          }
          if (p0.a().has("data")) {
             tc.v(p0.a().getString("data"));
          }else {
             tc.v("bnc_no_value");
          }
          if ((tk = this.k) != null) {
             tk.a(p1.j(), null);
          }
          tc.w("bnc_app_version", c60.c().a());
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       mb6.s(p1);
       return;
    }
    public final boolean m(){
       return true;
    }
    public final String q(){
       return "install";
    }
}
