package p.pb6;
import p.ib6;
import android.content.Context;
import org.json.JSONObject;
import java.lang.String;
import p.ji5;
import java.lang.Object;
import p.c60;
import java.lang.Throwable;
import p.sb6;
import p.t50;

public final class pb6 extends ib6	// class@00222e from classes.dex
{

    public void pb6(Context p0){
       String str = "bnc_link_click_id";
       super(p0, 5);
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("randomized_device_token", this.c.k());
          jSONObject.put("randomized_bundle_token", this.c.j());
          jSONObject.put("session_id", this.c.o());
          if (!this.c.p(str).equals("bnc_no_value")) {
             jSONObject.put("link_click_id", this.c.p(str));
          }
          if (c60.c() != null) {
             jSONObject.put("app_version", c60.c().a());
          }
          this.l(jSONObject);
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
          this.g = true;
       }
       return;
    }
    public void pb6(JSONObject p0,Context p1){
       super(5, p0, p1);
    }
    public final void b(){
    }
    public final void f(int p0,String p1){
    }
    public final void g(){
    }
    public final boolean h(){
       return false;
    }
    public final void j(sb6 p0,t50 p1){
       this.c.v("bnc_no_value");
    }
}
