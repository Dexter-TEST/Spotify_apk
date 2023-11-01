package p.tt7;
import p.wh6;
import android.content.Context;
import java.lang.String;
import android.content.res.Resources;
import java.lang.StringBuilder;
import android.util.Log;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.util.Locale;
import java.lang.Object;
import p.pl2;
import android.content.pm.PackageManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.a70;
import p.bs7;
import android.content.pm.ApplicationInfo;
import p.ye7;

public abstract class tt7	// class@0027de from classes.dex
{
    public static final wh6 a;
    public static Locale b;

    static {
       tt7.a = new wh6();
    }
    public static String a(Context p0,int p1){
       Resources resources = p0.getResources();
       switch (p1){
           case 1:
             return resources.getString(R.string.common_google_play_services_install_title);
           case 2:
             return resources.getString(R.string.common_google_play_services_update_title);
           case 3:
             return resources.getString(R.string.common_google_play_services_enable_title);
           case 4:
           case 6:
           case 18:
             return null;
           case 5:
             Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
             return tt7.b(p0, "common_google_play_services_invalid_account_title");
           case 7:
             Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
             return tt7.b(p0, "common_google_play_services_network_error_title");
           case 8:
             Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
             return null;
           case 9:
             Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
             return null;
           case 10:
             Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
             return null;
           case 11:
             Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
             return null;
           case 16:
             Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
             return null;
           case 17:
             Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
             return tt7.b(p0, "common_google_play_services_sign_in_failed_title");
           case 20:
             Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
             return tt7.b(p0, "common_google_play_services_restricted_profile_title");
           default:
             Log.e("GoogleApiAvailability", new StringBuilder(33)+"Unexpected error code "+p1);
             return null;
       }
    }
    public static String b(Context p0,String p1){
       String orDefault;
       Resources resourcesFor;
       wh6 a = tt7.a;
       _monitor_enter(a);
       Locale locale = is7.p(p0.getResources().getConfiguration()).c(0);
       if (!locale.equals(tt7.b)) {
          a.clear();
          tt7.b = locale;
       }
       Object obj = null;
       if ((orDefault = a.getOrDefault(p1, obj)) != null) {
          _monitor_exit(a);
          return orDefault;
       }else {
          int e = pl2.e;
          try{
             resourcesFor = p0.getPackageManager().getResourcesForApplication("com.google.android.gms");
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             resourcesFor = obj;
          }
          if (resourcesFor == null) {
             _monitor_exit(e0);
             return obj;
          }else if(!(e = resourcesFor.getIdentifier(p1, "string", "com.google.android.gms"))){
             if (p1.length()) {
                "Missing resource: ".concat(p1);
             }
             _monitor_exit(e0);
             return obj;
          }else {
             String str = resourcesFor.getString(e);
             if (TextUtils.isEmpty(str)) {
                if (p1.length()) {
                   "Got empty resource: ".concat(p1);
                }
                _monitor_exit(e0);
                return obj;
             }else {
                tt7.a.put(p1, str);
                _monitor_exit(e0);
                return str;
             }
          }
       }
    }
    public static String c(Context p0,String p1,String p2){
       String str;
       Resources resources = p0.getResources();
       if ((str = tt7.b(p0, p1)) == null) {
          str = resources.getString(R.string.common_google_play_services_unknown_issue);
       }
       Object[] objArray = new Object[]{p2};
       return String.format(resources.getConfiguration().locale, str, objArray);
    }
    public static String d(Context p0){
       String packageName = p0.getPackageName();
       try{
          a70 uoa70 = bs7.a(p0);
          return uoa70.a.getPackageManager().getApplicationLabel(uoa70.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          ApplicationInfo name = p0.getApplicationInfo().name;
          if (TextUtils.isEmpty(name)) {
             return e0;
          }
          return name;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static String e(Context p0,int p1){
       Object[] objArray;
       Resources resources = p0.getResources();
       String str = tt7.d(p0);
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 == 5) {
                   return tt7.c(p0, "common_google_play_services_invalid_account_text", str);
                }
                if (p1 == 7) {
                   return tt7.c(p0, "common_google_play_services_network_error_text", str);
                }
                if (p1 != 9) {
                   if (p1 == 20) {
                      return tt7.c(p0, "common_google_play_services_restricted_profile_text", str);
                   }
                   switch (p1){
                       case 16:
                         return tt7.c(p0, "common_google_play_services_api_unavailable_text", str);
                       case 17:
                         return tt7.c(p0, "common_google_play_services_sign_in_failed_text", str);
                       case 18:
                         objArray = new Object[]{str};
                         return resources.getString(R.string.common_google_play_services_updating_text, objArray);
                       default:
                         objArray = new Object[]{str};
                         return resources.getString(R.string.common_google_play_services_unknown_issue, objArray);
                   }
                }else {
                   objArray = new Object[]{str};
                   return resources.getString(R.string.common_google_play_services_unsupported_text, objArray);
                }
             }else {
                objArray = new Object[]{str};
                return resources.getString(R.string.common_google_play_services_enable_text, objArray);
             }
          }else if(ye7.H(p0)){
             return resources.getString(R.string.common_google_play_services_wear_update_text);
          }else {
             objArray = new Object[]{str};
             return resources.getString(R.string.common_google_play_services_update_text, objArray);
          }
       }else {
          objArray = new Object[]{str};
          return resources.getString(R.string.common_google_play_services_install_text, objArray);
       }
    }
}
