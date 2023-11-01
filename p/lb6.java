package p.lb6;
import p.ib6;
import android.content.Context;
import p.yo6;
import java.lang.String;
import org.json.JSONObject;
import p.ji5;
import java.lang.Object;
import java.lang.Throwable;
import p.r8;
import p.en6;
import p.r50;
import p.sb6;
import p.t50;

public final class lb6 extends ib6	// class@001d21 from classes.dex
{
    public r50 j;

    public void lb6(Context p0,yo6 p1,String p2){
       String str = "bnc_link_click_id";
       super(p0, 10);
       this.j = p1;
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("randomized_bundle_token", this.c.j());
          jSONObject.put("randomized_device_token", this.c.k());
          jSONObject.put("session_id", this.c.o());
          if (!this.c.p(str).equals("bnc_no_value")) {
             jSONObject.put("link_click_id", this.c.p(str));
          }
          jSONObject.put("identity", p2);
          this.l(jSONObject);
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
          this.g = true;
       }
       return;
    }
    public void lb6(JSONObject p0,Context p1){
       super(10, p0, p1);
    }
    public final void b(){
       this.j = null;
    }
    public final void f(int p0,String p1){
       JSONObject jSONObject;
       if (this.j != null) {
          try{
             jSONObject = new JSONObject();
             jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
          }
          this.j.a(jSONObject, new r8(en6.n("Trouble setting the user alias. ", p1), p0));
       }
       return;
    }
    public final void g(){
    }
    public final void j(sb6 p0,t50 p1){
       lb6 tj;
       String str = "referring_data";
       try{
          ib6 ta = this.a;
          ib6 tc = this.c;
          if (ta != null && ta.has("identity")) {
             tc.w("bnc_identity", t50.F);
          label_0017 :
             tc.w("bnc_randomized_bundle_token", p0.a().getString("randomized_bundle_token"));
             tc.w("bnc_user_url", p0.a().getString("link"));
             if (p0.a().has(str)) {
                tc.w("bnc_install_params", p0.a().getString(str));
             }
             if ((tj = this.j) != null) {
                tj.a(t50.g(p1.b.p("bnc_install_params")), null);
             }
          }else {
             goto label_0017 ;
          }
       }catch(org.json.JSONException e5){
          e5.printStackTrace();
       }
       return;
    }
}
