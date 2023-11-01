package p.u53;
import p.ga3;
import java.lang.String;
import java.util.regex.Pattern;
import android.content.Context;
import p.g52;
import java.lang.Object;
import p.sa3;
import java.lang.IllegalArgumentException;
import android.content.SharedPreferences;
import java.util.UUID;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.Locale;
import android.util.Log;
import android.content.SharedPreferences$Editor;
import p.f52;
import p.a28;
import p.if7;
import android.content.pm.PackageManager;

public final class u53 implements ga3	// class@002846 from classes.dex
{
    public final sa3 a;
    public final Context b;
    public final String c;
    public final g52 d;
    public String e;
    public static final Pattern f;
    public static final String g;

    static {
       u53.f = Pattern.compile("[^\\p{Alnum}]");
       u53.g = Pattern.quote("/");
    }
    public void u53(Context p0,String p1,g52 p2){
       super();
       if (p1 == null) {
          throw new IllegalArgumentException("appIdentifier must not be null");
       }
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = new sa3();
       return;
    }
    public synchronized final String a(SharedPreferences p0,String p1){
       String str = ((str = UUID.randomUUID().toString()) == null)? null: u53.f.matcher(str).replaceAll("").toLowerCase(Locale.US);
       Log.isLoggable("FirebaseCrashlytics", 3);
       p0.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", p1).apply();
       return str;
    }
    public synchronized final String b(){
       u53 te;
       int i1;
       String str2;
       if ((te = this.e) != null) {
          return te;
       }
       int i = 0;
       SharedPreferences sharedPrefer = this.b.getSharedPreferences("com.google.firebase.crashlytics", i);
       a28 uoa28 = this.d.c();
       String str = null;
       String str1 = sharedPrefer.getString("firebase.installation.id", str);
       try{
          i1 = 3;
          str2 = if7.a(uoa28);
       }catch(java.lang.Exception e0){
          Log.isLoggable("FirebaseCrashlytics", i1);
          if (str1) {
             str2 = str1;
          }else {
             str2 = str;
          }
       }
       if (str1 == null) {
          SharedPreferences sharedPrefer1 = this.b.getSharedPreferences("com.crashlytics.prefs", i);
          str1 = sharedPrefer1.getString("crashlytics.installation.id", str);
          Log.isLoggable("FirebaseCrashlytics", i1);
          if (str1 == null) {
             this.e = this.a(e0, str2);
          }else {
             this.e = str1;
             this.d(str1, str2, e0, sharedPrefer1);
          }
          return this.e;
       }else if(str1.equals(str2)){
          this.e = e0.getString("crashlytics.installation.id", str);
          Log.isLoggable("FirebaseCrashlytics", i1);
          if (this.e == null) {
             this.e = this.a(e0, str2);
          }
       }else {
          this.e = this.a(e0, str2);
       }
       return this.e;
    }
    public final String c(){
       String installerPac;
       sa3 a;
       u53 ta = this.a;
       u53 tb = this.b;
       _monitor_enter(ta);
       if (ta.a == null) {
          if ((installerPac = tb.getPackageManager().getInstallerPackageName(tb.getPackageName())) == null) {
             installerPac = "";
          }
          ta.a = installerPac;
       }
       installerPac = ("".equals(ta.a))? null: ta.a;
       _monitor_exit(ta);
       return installerPac;
    }
    public synchronized final void d(String p0,String p1,SharedPreferences p2,SharedPreferences p3){
       Log.isLoggable("FirebaseCrashlytics", 3);
       p2.edit().putString("crashlytics.installation.id", p0).putString("firebase.installation.id", p1).apply();
       p3.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }
}
