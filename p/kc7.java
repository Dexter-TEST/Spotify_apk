package p.kc7;
import p.v50;
import android.content.Context;
import p.ji5;
import java.lang.Object;
import java.lang.Void;
import android.net.TrafficStats;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.net.URL;
import p.c60;
import java.lang.Integer;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import android.os.AsyncTask;

public final class kc7 extends v50	// class@001bec from classes.dex
{
    public final ji5 a;

    public void kc7(Context p0){
       super();
       this.a = ji5.g(p0);
    }
    public final Object doInBackground(Object[] p0){
       TrafficStats.setThreadStatsTag(0);
       JSONObject jSONObject = new JSONObject();
       try{
          int i = 0;
          String str = "%sdk/uriskiplist_v#.json";
          String str1 = "%";
          CharSequence uCharSequenc = (!TextUtils.isEmpty(i))? i: "https://cdn.branch.io/";
          HttpsURLConnection httpsURLConn = new URL(str.replace(str1, uCharSequenc).replace("#", Integer.toString((c60.c.optInt("version") + 1)))).openConnection();
          try{
             i = 1500;
             httpsURLConn.setConnectTimeout(i);
             httpsURLConn.setReadTimeout(i);
             if (httpsURLConn.getResponseCode() == 200 && httpsURLConn.getInputStream() != null) {
                jSONObject = new JSONObject(new BufferedReader(new InputStreamReader(httpsURLConn.getInputStream())).readLine());
             label_006b :
                httpsURLConn.disconnect();
             }else {
                goto label_006b ;
             }
             return jSONObject;
          }catch(java.lang.Exception e0){
             HttpURLConnection httpURLConne = httpsURLConn;
          }
          if (e0) {
             e0.disconnect();
          }else {
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final void onPostExecute(Object p0){
       super.onPostExecute(p0);
       if (p0.optInt("version") > c60.c.optInt("version")) {
          c60.c = p0;
          this.a.w("skip_url_format_key", p0.toString());
       }
       return;
    }
}
