package p.nb6;
import p.ib6;
import org.json.JSONObject;
import android.content.Context;
import java.lang.String;
import p.sb6;
import p.t50;
import p.ji5;
import java.lang.Throwable;

public final class nb6 extends ib6	// class@001fa7 from classes.dex
{

    public void nb6(JSONObject p0,Context p1){
       super(11, p0, p1);
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
       ib6 tc = this.c;
       try{
          tc.w("bnc_session_id", p0.a().getString("session_id"));
          tc.w("bnc_randomized_bundle_token", p0.a().getString("randomized_bundle_token"));
          tc.w("bnc_user_url", p0.a().getString("link"));
          tc.w("bnc_install_params", "bnc_no_value");
          tc.v("bnc_no_value");
          tc.w("bnc_identity", "bnc_no_value");
          tc.c();
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
       }
       return;
    }
}
