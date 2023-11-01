package p.so1;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import org.json.JSONObject;
import p.b17;
import java.lang.Long;
import java.lang.System;
import java.lang.StringBuffer;
import java.lang.NullPointerException;

public final class so1	// class@002668 from classes.dex
{
    public final String a;
    public final String b;
    public final Long c;

    public void so1(File p0){
       JSONObject jSONObject;
       co5.o(p0, "file");
       super();
       String name = p0.getName();
       co5.l(name, "file.name");
       this.a = name;
       if ((jSONObject = b17.v(name)) != null) {
          this.c = Long.valueOf(jSONObject.optLong("timestamp", 0));
          this.b = jSONObject.optString("error_message", null);
       }
       return;
    }
    public void so1(String p0){
       super();
       Long longx = Long.valueOf((System.currentTimeMillis() / (long)1000));
       this.c = longx;
       this.b = p0;
       p0 = "error_log_";
       if (longx == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
       }
       p0 = p0+longx.longValue()+".json";
       co5.l(p0, "StringBuffer\(\)\n            .append\(InstrumentUtility.ERROR_REPORT_PREFIX\)\n            .append\(timestamp as Long\)\n            .append\(\".json\"\)\n            .toString\(\)");
       this.a = p0;
       return;
    }
    public final String toString(){
       JSONObject jSONObject;
       so1 tc;
       try{
          jSONObject = new JSONObject();
          if ((tc = this.c) != null) {
             jSONObject.put("timestamp", tc);
          }
          jSONObject.put("error_message", this.b);
       }catch(org.json.JSONException e0){
          jSONObject = null;
       }
       if (!jSONObject) {
          return super.toString();
       }else {
          String str = jSONObject.toString();
          co5.l(str, "params.toString\(\)");
          return str;
       }
    }
}
