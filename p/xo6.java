package p.xo6;
import p.wf2;
import p.gi3;
import p.ap6;
import java.lang.Object;
import java.lang.Class;
import p.x50;
import java.util.HashMap;
import p.mi5;
import p.tn6;
import p.rn6;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Throwable;
import p.t50;
import p.ji5;
import android.content.Context;
import java.util.LinkedList;
import p.jc7;

public final class xo6 extends gi3 implements wf2	// class@002cbb from classes.dex
{
    public final ap6 a;

    public void xo6(ap6 p0){
       this.a = p0;
       super(0);
    }
    public final Object invoke(){
       t50 ot50;
       xo6 ta = this.a;
       ta.a.getClass();
       x50 ox50 = new x50();
       ta.b.getClass();
       x50 c = ox50.c;
       String str = "customer_event_alias";
       if (!c.containsKey(str)) {
          c.put(str, "Spotify Lite Registration");
       }else {
          c.remove(str);
       }
       ap6 c1 = ta.c;
       String str1 = "";
       if ((str = c1.b().g(mi5.h, str1)) != null) {
          str1 = str;
       }
       int i = 0;
       str = (str1.length() > 0)? 1: 0;
       x50 e = ox50.e;
       if (str) {
          str = "android_install_referrer";
          try{
             e.put(str, str1);
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
       }
       String str2 = c1.a();
       if (str2.length() > 0) {
          i = 1;
       }
       if (i) {
          str = "android_app_referrer";
          try{
             e.put(str, str2);
          }catch(org.json.JSONException e2){
             e2.printStackTrace();
          }
       }
       ta.a.getClass();
       if ((ot50 = t50.i()) != null) {
          if ((ot50.b.p("bnc_identity").equals("bnc_no_value") ^ 1)) {
             ta.d.getClass();
             ox50.a(ot50.d);
          }else {
             ta.e.add(ox50);
          }
       }
       return jc7.a;
    }
}
