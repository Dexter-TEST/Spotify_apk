package p.yu7;
import java.lang.Runnable;
import p.dm5;
import java.lang.String;
import java.lang.Object;
import p.w51;
import p.as6;
import p.pt7;
import com.google.android.gms.common.api.Status;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import android.util.Log;
import java.lang.StringBuilder;
import p.wx5;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class yu7 implements Runnable	// class@002e2f from classes.dex
{
    public final String a;
    public final as6 b;
    public static final dm5 c;

    static {
       String[] stringArray = new String[0];
       yu7.c = new dm5("RevokeAccessOperation", stringArray);
    }
    public void yu7(String p0){
       super();
       w51.i(p0);
       this.a = p0;
       this.b = new as6(null);
    }
    public final void run(){
       String str2;
       int responseCode;
       dm5 c = yu7.c;
       Status y = Status.y;
       try{
          String str = "https://accounts.google.com/o/oauth2/revoke?token=";
          String str1 = String.valueOf(this.a);
          if (str1.length()) {
             str = str.concat(str1);
          label_001f :
             HttpURLConnection httpURLConne = new URL(str).openConnection();
             httpURLConne.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             if ((responseCode = httpURLConne.getResponseCode()) == 200) {
                y = Status.w;
             }else {
                Log.e(c.c, c.d.concat("Unable to revoke access!"));
             }
             str2 = new StringBuilder(26)+"Response Code: "+responseCode;
             str = (c.b <= 3)? 1: 0;
             if (str) {
                c.d.concat(str2);
             }
          }else {
             str1 = str;
             goto label_001f ;
          }
       }catch(java.io.IOException e2){
          str2 = String.valueOf(e2.toString());
          str2 = (str2.length())? "IOException when revoking access: ".concat(str2): "IOException when revoking access: ";
          Log.e(c.c, c.d.concat(str2));
       }catch(java.lang.Exception e2){
          str2 = String.valueOf(e2.toString());
          str2 = (str2.length())? "Exception when revoking access: ".concat(str2): "Exception when revoking access: ";
          Log.e(c.c, c.d.concat(str2));
       }
       this.b.G(y);
       return;
    }
}
