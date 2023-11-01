package p.vz1;
import p.rm7;
import androidx.fragment.app.k;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.os.Bundle;
import android.net.Uri;
import p.ej4;
import android.os.BaseBundle;
import org.json.JSONObject;
import p.q70;
import p.sz1;
import p.df4;
import java.lang.Integer;
import android.view.View;
import android.webkit.WebView;
import android.os.Handler;
import android.os.Looper;
import p.am0;
import java.lang.Runnable;

public final class vz1 extends rm7	// class@002a93 from classes.dex
{
    public boolean E;
    public static final int F;

    public void vz1(k p0,String p1,String p2){
       super(p0, p1);
       this.b = p2;
    }
    public static void g(vz1 p0){
       co5.o(p0, "this$0");
       super.cancel();
    }
    public final Bundle c(String p0){
       HashSet a;
       Bundle uBundle = ej4.B0(Uri.parse(p0).getQuery());
       String str = uBundle.getString("bridge_args");
       uBundle.remove("bridge_args");
       if (!ej4.Z(str)) {
          try{
             uBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", q70.a(new JSONObject(str)));
          }catch(org.json.JSONException e0){
             a = sz1.a;
          }
       }
       str = uBundle.getString("method_results");
       uBundle.remove("method_results");
       if (!ej4.Z(str)) {
          try{
             uBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", q70.a(new JSONObject(str)));
          }catch(org.json.JSONException e0){
             a = sz1.a;
          }
       }
       uBundle.remove("version");
       uBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", df4.c[0].intValue());
       return uBundle;
    }
    public final void cancel(){
       rm7 tt = this.t;
       if (this.B != null && (this.z == null && (tt != null && tt.isShown()))) {
          if (this.E != null) {
             return;
          }
          this.E = true;
          tt.loadUrl(co5.K("\(function\(\) {  var event = document.createEvent\(\'Event\'\);  event.initEvent\(\'fbPlatformDialogMustClose\',true,true\);  document.dispatchEvent\(event\);}\)\(\);", "javascript:"));
          new Handler(Looper.getMainLooper()).postDelayed(new am0(13, this), 1500);
          return;
       }else {
          super.cancel();
          return;
       }
    }
}
