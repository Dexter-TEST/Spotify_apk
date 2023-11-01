package p.tm2;
import p.az5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import java.security.SecureRandom;
import java.util.Random;
import java.util.regex.Pattern;
import p.a3;
import android.os.Bundle;
import p.fs2;
import p.om2;
import p.sz1;
import p.eo5;
import p.ny1;
import java.lang.CharSequence;
import p.av6;
import android.os.BaseBundle;
import p.ns3;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.util.Locale;
import java.lang.Class;
import java.util.Arrays;
import p.xm2;
import java.util.List;
import p.uk;
import p.wm2;
import java.util.ArrayList;
import p.um2;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.lang.Void;
import android.os.AsyncTask;
import p.fs3;
import p.mj7;
import p.kg4;
import java.util.regex.Matcher;

public final class tm2	// class@00279b from classes.dex
{
    public final a3 a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public Object e;
    public final String f;
    public om2 g;
    public fs2 h;
    public boolean i;
    public static final String j;
    public static final Pattern k;
    public static String l;

    static {
       int i;
       az5 uoaz5 = new az5();
       char[] uocharArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
       co5.l(uocharArray, "\(this as java.lang.String\).toCharArray\(\)");
       StringBuilder str = "";
       SecureRandom secureRandom = new SecureRandom();
       if ((i = secureRandom.nextInt(11) + 30) > 0) {
          int i1 = 0;
          do {
             i1 = i1 + 1;
             str = str.append(uocharArray[secureRandom.nextInt(uocharArray.length)]);
          } while (i1 >= i);
       }
       String str1 = str;
       co5.l(str1, "buffer.toString\(\)");
       tm2.j = str1;
       tm2.k = Pattern.compile("^/?v\\d+\\.\\d+/\(.*\)");
    }
    public void tm2(a3 p0,String p1,Bundle p2,fs2 p3,om2 p4,int p5){
       if ((p5 & 0x01)) {
          p0 = null;
       }
       if ((p5 & 0x02)) {
          p1 = null;
       }
       if ((p5 & 0x04)) {
          p2 = null;
       }
       if ((p5 & 0x08)) {
          p3 = null;
       }
       if ((p5 & 0x10)) {
          p4 = null;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.f = null;
       this.j(p4);
       this.k(p3);
       this.d = (p2 != null)? new Bundle(p2): new Bundle();
       this.f = sz1.d();
       return;
    }
    public static String f(){
       String e;
       String str = sz1.b();
       eo5.Q();
       if ((e = sz1.e) == null) {
          throw new ny1("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
       }
       int i = 0;
       int i1 = (str.length() > 0)? 1: 0;
       if (i1) {
          if (e.length() > 0) {
             i = 1;
          }
          if (i) {
             str = str+'|'+e;
          label_0037 :
             return str;
          }
       }
       str = null;
       goto label_0037 ;
    }
    public final void a(){
       String str1;
       int i1;
       tm2 td = this.d;
       String str = this.e();
       boolean b = false;
       int i = (str == null)? 0: av6.f0(str, "|");
       str = (str != null && (av6.D0(str, "IG", b) && !i))? 1: 0;
       if (!str || !this.i()) {
          str = (!co5.c(sz1.e(), "instagram.com"))? 1: this.i() ^ 1;
          if (str || i) {
          label_0042 :
             str = "access_token";
             if (b) {
                td.putString(str, tm2.f());
             }else if((str1 = this.e()) != null){
                td.putString(str, str1);
             }
             if (!td.containsKey(str)) {
                eo5.Q();
                if (sz1.e == null) {
                   throw new ny1("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                }
             }
             td.putString("sdk", "android");
             td.putString("format", "json");
             sz1.i(ns3.x);
             sz1.i(ns3.w);
             return;
          }
       }
       b = true;
       goto label_0042 ;
    }
    public final String b(String p0,boolean p1){
       String str1;
       if (!p1 && this.h == fs2.b) {
          return p0;
       }
       Uri$Builder uBuilder = Uri.parse(p0).buildUpon();
       Iterator iterator = this.d.keySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             String str = iterator.next();
             if ((str1 = this.d.get(str)) == null) {
                str1 = "";
             }
             if (az5.L(str1)) {
                uBuilder.appendQueryParameter(str, az5.r(str1).toString());
             }else if(this.h == fs2.a){
                continue ;
             }else {
                break ;
             }
          }else {
             uBuilder = uBuilder.toString();
             co5.l(uBuilder, "uriBuilder.toString\(\)");
             return uBuilder;
          }
       }
       Object[] objArray = new Object[]{str1.getClass().getSimpleName()};
       String str2 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(objArray, 1));
       co5.l(str2, "java.lang.String.format\(locale, format, *args\)");
       throw new IllegalArgumentException(str2);
    }
    public final xm2 c(){
       int i = 1;
       tm2[] otm2Array = new tm2[i];
       otm2Array[0] = this;
       ArrayList uArrayList = az5.B(new wm2(uk.t0(otm2Array)));
       if (uArrayList.size() == i) {
          return uArrayList.get(0);
       }
       throw new ny1("invalid state: expected a single response");
    }
    public final um2 d(){
       tm2[] otm2Array = new tm2[]{this};
       wm2 owm2 = new wm2(uk.t0(otm2Array));
       eo5.B(owm2);
       um2 oum2 = new um2(owm2);
       Void[] voidArray = new Void[0];
       oum2.executeOnExecutor(sz1.c(), voidArray);
       return oum2;
    }
    public final String e(){
       tm2 ta;
       String str = "access_token";
       if ((ta = this.a) != null) {
          if (!this.d.containsKey(str)) {
             mj7 d = fs3.d;
             a3 v = ta.v;
             _monitor_enter(d);
             co5.o(v, "accessToken");
             sz1.i(ns3.b);
             d.o(v);
             _monitor_exit(d);
             return v;
          }
       }else if(!this.d.containsKey(str)){
          return tm2.f();
       }
       return this.d.getString(str);
    }
    public final String g(){
       tm2 tb;
       String str;
       if (this.h == fs2.b && ((tb = this.b) != null && av6.g0(tb, "/videos", false))) {
          Object[] objArray = new Object[]{sz1.e()};
          str = kg4.q(objArray, 1, "https://graph-video.%s", "java.lang.String.format\(format, *args\)");
       }else {
          str = sz1.e();
          co5.o(str, "subdomain");
          Object[] objArray1 = new Object[]{str};
          str = kg4.q(objArray1, 1, "https://graph.%s", "java.lang.String.format\(format, *args\)");
       }
       this.a();
       return this.b(this.h(str), false);
    }
    public final String h(String p0){
       Object[] objArray;
       int i = (!co5.c(sz1.e(), "instagram.com"))? 1: this.i() ^ 1;
       if (!i) {
          objArray = new Object[]{sz1.p};
          objArray = kg4.q(objArray, 1, "https://graph.%s", "java.lang.String.format\(format, *args\)");
       }
       Object[] objArray1 = new Object[2];
       objArray1[0] = objArray;
       tm2 tb = this.b;
       if (!tm2.k.matcher(tb).matches()) {
          objArray = new Object[]{this.f,tb};
          tb = kg4.q(objArray, 2, "%s/%s", "java.lang.String.format\(format, *args\)");
       }
       objArray1[1] = tb;
       return kg4.q(objArray1, 2, "%s/%s", "java.lang.String.format\(format, *args\)");
    }
    public final boolean i(){
       tm2 tb;
       boolean b = false;
       if ((tb = this.b) == null) {
          return b;
       }
       String str = "^/?"+sz1.b()+"/?.*";
       if (this.i != null || (Pattern.matches(str, tb) || Pattern.matches("^/?app/?.*", tb))) {
          b = true;
       }
       return b;
    }
    public final void j(om2 p0){
       sz1.i(ns3.x);
       sz1.i(ns3.w);
       this.g = p0;
    }
    public final void k(fs2 p0){
       if (p0 == null) {
          p0 = fs2.a;
       }
       this.h = p0;
       return;
    }
    public final String toString(){
       tm2 ta;
       String str = "{Request:  accessToken: ";
       if ((ta = this.a) == null) {
          ta = "null";
       }
       str = str+ta+", graphPath: "+this.b+", graphObject: "+this.c+", httpMethod: "+this.h+", parameters: "+this.d+"}";
       co5.l(str, "StringBuilder\(\)\n        .append\(\"{Request: \"\)\n        .append\(\" accessToken: \"\)\n        .append\(if \(accessToken == null\) \"null\" else accessToken\)\n        .append\(\", graphPath: \"\)\n        .append\(graphPath\)\n        .append\(\", graphObject: \"\)\n        .append\(graphObject\)\n        .append\(\", httpMethod: \"\)\n        .append\(httpMethod\)\n        .append\(\", parameters: \"\)\n        .append\(parameters\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str;
    }
}
