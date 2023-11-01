package p.ow;
import p.dc3;
import android.content.Context;
import p.sz1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.f22;
import p.h22;
import p.me7;
import java.util.HashMap;
import org.json.JSONObject;
import android.os.Bundle;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.nw;
import java.math.BigDecimal;
import java.util.Currency;
import java.lang.Throwable;
import android.util.Log;
import p.e22;
import p.u83;
import java.lang.Class;
import android.os.BaseBundle;
import java.lang.Double;
import java.util.UUID;
import p.t6;
import p.bj;
import p.ns3;
import p.fs3;
import p.mj7;
import p.zi;
import p.b3;
import p.ni;
import p.bb2;
import p.am0;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public abstract class ow	// class@0021a7 from classes.dex
{
    public static final dc3 a;

    static {
       ow.a = new dc3(sz1.a());
    }
    public static final void a(String p0,String p1,boolean p2){
       JSONObject jSONObject1;
       nw onw;
       dc3 a;
       dc3 a2;
       nw onw1;
       b3 c1;
       String str5;
       String str = "freeTrialPeriod";
       co5.o(p1, "skuDetails");
       f22 uof22 = h22.b(sz1.b());
       int i = 1;
       uof22 = (uof22 != null && (me7.a() && uof22.f != null))? 1: 0;
       if (!uof22) {
          return;
       }else {
          HashMap hashMap = new HashMap();
          try{
             String str1 = "introductoryPriceCycles";
             JSONObject jSONObject = new JSONObject(p0);
             jSONObject1 = new JSONObject(p1);
             Bundle uBundle = new Bundle(i);
             uBundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
             uBundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
             uBundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
             uBundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
             uBundle.putCharSequence("fb_iap_product_title", jSONObject1.optString("title"));
             uBundle.putCharSequence("fb_iap_product_description", jSONObject1.optString("description"));
             String str2 = jSONObject1.optString("type");
             uBundle.putCharSequence("fb_iap_product_type", str2);
             if (co5.c(str2, "subs")) {
                uBundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                uBundle.putCharSequence("fb_iap_subs_period", jSONObject1.optString("subscriptionPeriod"));
                uBundle.putCharSequence("fb_free_trial_period", jSONObject1.optString(str));
                str5 = jSONObject1.optString(str1);
                co5.l(str5, str1);
                a = (!str5.length())? 1: 0;
                if (!a) {
                   uBundle.putCharSequence("fb_intro_price_amount_micros", jSONObject1.optString("introductoryPriceAmountMicros"));
                   uBundle.putCharSequence("fb_intro_price_cycles", str5);
                }
             }
             Iterator iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                str5 = uEntry.getKey();
                uBundle.putCharSequence(str5, uEntry.getValue());
             }
             Currency instance = Currency.getInstance(jSONObject1.getString("price_currency_code"));
             co5.l(instance, "getInstance\(skuDetailsJSON.getString\(\"price_currency_code\"\)\)");
             onw = new nw(new BigDecimal(((double)jSONObject1.getLong("price_amount_micros") / 1000000.00f)), instance, uBundle);
          }catch(org.json.JSONException e13){
             Log.e("p.ow", "Error parsing in-app subscription data.", e13);
             onw = null;
          }
          if (onw == null) {
             return;
          }else if(p2 && e22.b("app_events_if_auto_log_subs", sz1.b(), false)){
             jSONObject1 = 1;
          }else {
             c1 = 0;
          }
          String str3 = "fb_currency";
          a = ow.a;
          nw c = onw.c;
          nw b = onw.b;
          onw = onw.a;
          if (jSONObject1) {
             HashMap a1 = u83.a;
             try{
                if ((a1 = new JSONObject(p1).optString(str)) != null) {
                   a1 = (a1.length() > 0)? 1: 0;
                   if (a1) {
                   label_0164 :
                      a1 = (i)? "StartTrial": "Subscribe";
                      String str4 = a1;
                      a.getClass();
                      if (me7.a()) {
                         a2 = a.a;
                         a2.getClass();
                         if (onw != null && b != null) {
                            if (c == null) {
                               c = new Bundle();
                            }
                            onw1 = c;
                            onw1.putString(str3, b.getCurrencyCode());
                            a2.a(str4, Double.valueOf(onw.doubleValue()), onw1, true, t6.a());
                         }
                      }
                   }
                }
             }catch(org.json.JSONException e0){
             }
             i = 0;
             goto label_0164 ;
          }else {
             a.getClass();
             if (me7.a()) {
                a2 = a.a;
                a2.getClass();
                c1 = bj.c;
                p1 = "AppEvents";
                ns3 v = ns3.v;
                if (onw == null) {
                   mj7.j(v, p1, "purchaseAmount cannot be null");
                }else if(b == null){
                   mj7.j(v, p1, "currency cannot be null");
                }else if(c == null){
                   c = new Bundle();
                }
                onw1 = c;
                onw1.putString(str3, b.getCurrencyCode());
                a2.a("fb_mobile_purchase", Double.valueOf(onw.doubleValue()), onw1, true, t6.a());
                if (c1.o() != zi.b) {
                   ni.b.execute(new am0(8, bb2.t));
                }
             }
          }
          return;
       }
    }
}
