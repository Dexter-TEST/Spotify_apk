package p.fp6;
import p.e60;
import p.az5;
import p.to6;
import p.bp3;
import p.in3;
import p.cp6;
import p.mb1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e63;
import p.ay6;
import p.wf2;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.t65;
import android.content.Intent;
import java.lang.Class;
import com.spotify.base.java.logging.Logger;
import org.json.JSONObject;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import android.os.Bundle;
import p.ap3;
import p.ir2;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.ObservableSource;
import p.tp6;
import p.v84;
import p.yk3;
import p.dq6;
import java.util.EnumMap;
import p.zp6;
import java.util.List;
import p.dj0;
import p.r8;
import com.spotify.messaging.premiummessaging.clientoptinproxy.ClientOptInProxyService;
import android.content.ComponentName;
import p.ye7;
import android.app.Activity;
import p.ap6;
import p.t50;
import p.ep6;
import p.wo6;

public final class fp6 implements e60	// class@001613 from classes.dex
{
    public final to6 a;
    public final bp3 b;
    public final in3 c;
    public final cp6 d;
    public final mb1 e;
    public final Context f;
    public final ay6 g;
    public boolean h;

    static {
       az5 uoaz5 = new az5();
    }
    public void fp6(to6 p0,bp3 p1,in3 p2,cp6 p3,mb1 p4,Context p5){
       co5.o(p0, "spotifyBranch");
       co5.o(p1, "navigator");
       co5.o(p2, "deeplinkErrorTranslation");
       co5.o(p3, "branchLinkValidator");
       co5.o(p4, "propertyChecker");
       co5.o(p5, "context");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = new ay6(e63.c);
    }
    public static void a(Uri$Builder p0,Uri p1,String p2){
       String obj;
       Set queryParamet = p1.getQueryParameterNames();
       co5.l(queryParamet, "fromUri.queryParameterNames");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = queryParamet.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (!co5.c(obj, p2)) {
             uArrayList.add(obj);
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          t65 ot65 = ((obj = p1.getQueryParameter(str)) != null)? new t65(str, obj): null;
          if (ot65 != null) {
             uArrayList1.add(ot65);
          }
       }
       Iterator iterator1 = uArrayList1.iterator();
       while (iterator1.hasNext()) {
          t65 ot651 = iterator1.next();
          p0.appendQueryParameter(ot651.a, ot651.b);
       }
       return;
    }
    public final void b(Intent p0,boolean p1,String p2){
       if (p1) {
          this.c.getClass();
          co5.o(p0, "intent");
          co5.o(p2, "error");
          Object[] objArray = new Object[0];
          Logger.b(p2, objArray);
       }
       return;
    }
    public final void c(JSONObject p0,String p1,Intent p2){
       Uri$Builder uBuilder1;
       zp6 ozp6;
       Uri uri2;
       Uri$Builder uBuilder2;
       Uri uri = Uri.parse(p1);
       Uri$Builder uBuilder = null;
       if (uri.isHierarchical()) {
       }else {
          uBuilder1 = uBuilder;
       }
       String str = "gift";
       String queryParamet = (uri != null)? uri.getQueryParameter(str): uBuilder;
       int i = 0;
       int i1 = 1;
       int i2 = (queryParamet != null && queryParamet.length())? 0: 1;
       fp6 tb = this.b;
       if ((i2 ^ i1)) {
          uBuilder1 = Uri.parse(p1).buildUpon().clearQuery();
          co5.l(uBuilder1, "uriWithoutGiftParam");
          Uri uri1 = Uri.parse(p1);
          co5.l(uri1, "parse\(uriToRoute\)");
          fp6.a(uBuilder1, uri1, str);
          uri1 = uBuilder1.toString();
          uri1 = "spotify:internal:gift-share:"+URLEncoder.encode(uri1, "utf-8");
          az5.o(p0, p2);
          tb.getClass();
          co5.o(uri1, "uri");
          tb.a.a(uri1);
       }else {
          tp6 obj = this.e.a.map(ir2.F).switchIfEmpty(Observable.just(Boolean.FALSE)).blockingFirst();
          co5.l(obj, "propertyObservable.map {…        \).blockingFirst\(\)");
          if (obj.booleanValue()) {
             obj = v84.a(p1);
             if (p0.optBoolean("+is_first_session")) {
                str = ((obj = obj.a) != null)? obj.getQueryParameter("si"): uBuilder;
                int i3 = (str != null && str.length())? 0: 1;
                if ((i3 ^ i1)) {
                   if (obj != null && obj.isHierarchical() == i1) {
                      i = 1;
                   }
                   if (i && co5.c(obj.getQueryParameter("dd"), "1")) {
                      String str1 = ((ozp6 = dq6.a.get(yk3.i4)) != null && (ozp6 = ozp6.c) != null)? dj0.l0(ozp6): uBuilder;
                      if ((uri2 = Uri.parse("https://open.spotify.com/"+v84.a(str1).a)) != null) {
                         uBuilder = uri2.buildUpon();
                      }
                      if (uBuilder != null) {
                         fp6.a(uBuilder, obj, "dd");
                         p1 = uBuilder.appendQueryParameter("dd", p1).toString();
                         co5.l(p1, "{\n            val homeUr…url\).toString\(\)\n        }");
                      }
                   }
                }
             }
          }
          az5.o(p0, p2);
          tb.getClass();
          co5.o(p1, "uri");
          tb.a.a(p1);
       }
       return;
    }
    public final boolean d(Intent p0,boolean p1,JSONObject p2,r8 p3){
       String str2;
       boolean b = false;
       if (p3 != null) {
          p3.toString();
          this.b(p0, p1, "Branch error: "+p3);
       }else if(this.h == null){
          String str = "\n                    ";
          if (p2 != null) {
             int i = (p2.optBoolean("+clicked_branch_link"))? 1: 0;
             if (i) {
                String str1 = "$full_url";
                if (p2.has(str1)) {
                   str2 = p2.optString(str1);
                   co5.l(str2, "uriToRoute");
                   this.c(p2, str2, p0);
                }else {
                   str1 = "$canonical_url";
                   if (p2.has(str1)) {
                      str2 = p2.optString(str1);
                      co5.l(str2, "uriToRoute");
                      this.c(p2, str2, p0);
                   }else {
                      str1 = "$android_deeplink_path";
                      if (p2.has(str1)) {
                         str2 = p2.optString(str1);
                         co5.l(str2, "linkProperties.optString….AndroidDeepLinkPath.key\)");
                         this.c(p2, az5.v(str2), p0);
                      }else {
                         str1 = "$deeplink_path";
                         if (p2.has(str1)) {
                            str2 = p2.optString(str1);
                            co5.l(str2, "linkProperties.optString…Jsonkey.DeepLinkPath.key\)");
                            this.c(p2, az5.v(str2), p0);
                         }else if(p2.optString("opt_in").equals("price_increase")){
                            fp6 tf = this.f;
                            co5.o(tf, "context");
                            p0 = new Intent(tf, ClientOptInProxyService.class);
                            p0.putExtra("uri", "PRICE_INCREASE");
                            tf.startService(p0);
                         }else {
                            this.b(p0, p1, ye7.Y("Branch link opened the app but no deep link parameter was attached to the link.\n                       |Link properties:\n                       |"+p2+str));
                         }
                      }
                   }
                }
                b = true;
             }
          }
          this.b(p0, p1, ye7.Y("LinkProperties object doesn\'t contain +clicked_branch_link param or it\'s not true.\n                        |Link Properties:\n                        |"+p2+str));
       }
       return b;
    }
    public final boolean e(Activity p0,Intent p1,wf2 p2,boolean p3){
       t50 ot50;
       t50 ot501;
       JSONObject jSONObject1;
       int i;
       co5.o(p0, "activity");
       this.h = p3;
       p3 = false;
       if (p1 != null) {
          fp6 td = this.d;
          if (p1.getData() == null || td.a(p1.getDataString())) {
             boolean b = td.a(p1.getDataString());
             boolean booleanExtra = p1.getBooleanExtra("forwarded_by_login_flow", p3);
             boolean booleanExtra1 = p1.getBooleanExtra("branch_used", p3);
             fp6 ta = this.a;
             ta.a.getClass();
             JSONObject jSONObject = ((ot50 = t50.i()) != null)? ot50.j(): null;
             if (booleanExtra1 || booleanExtra) {
                booleanExtra = (jSONObject != null && jSONObject.optBoolean("+clicked_branch_link"))? 1: 0;
                if (booleanExtra) {
                   booleanExtra = 1;
                label_005f :
                   if (booleanExtra) {
                      ta.a.getClass();
                      jSONObject1 = ((ot501 = t50.i()) != null)? ot501.j(): null;
                      booleanExtra = this.d(p1, (b ^ 0x01), jSONObject1, null);
                   }else {
                      booleanExtra = false;
                   }
                   if (!booleanExtra) {
                      if (b) {
                         ta.getClass();
                         p1.removeExtra("branch_used");
                         p1.putExtra("branch_force_new_session", true);
                         ta.a(new wo6(ta, p0, new ep6(this, p1, p2), p1));
                         i = 1;
                      }else {
                         i = 0;
                      }
                      if (!i) {
                      label_009c :
                         return p3;
                      }
                   }
                   p3 = true;
                   goto label_009c ;
                }
             }
             jSONObject1 = 0;
             goto label_005f ;
          }
       }else {
          goto label_009c ;
       }
    }
}
