package p.x45;
import java.lang.Object;
import p.hr5;
import android.graphics.Rect;
import p.w45;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.net.InetAddress;
import android.os.Build;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.app.UiModeManager;
import p.hl2;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Integer;
import android.view.View;
import p.ty6;
import p.ji5;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import p.t50;
import p.uh2;
import java.lang.Void;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

public abstract class x45	// class@002c08 from classes.dex
{
    public int a;
    public Object b;
    public Object c;

    public void x45(){
       super();
       this.b = null;
       this.a = 0;
    }
    public void x45(hr5 p0){
       super();
       this.a = Integer.MIN_VALUE;
       this.c = new Rect();
       this.b = p0;
    }
    public static w45 a(hr5 p0){
       return new w45(p0, 0);
    }
    public static w45 b(hr5 p0,int p1){
       if (!p1) {
          return x45.a(p0);
       }
       if (p1 == 1) {
          return x45.c(p0);
       }
       throw new IllegalArgumentException("invalid orientation");
    }
    public static w45 c(hr5 p0){
       return new w45(p0, 1);
    }
    public static String d(Context p0){
       ConnectivityManager systemServic;
       NetworkInfo activeNetwor;
       if (p0 == null || (p0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") || ((systemServic = p0.getSystemService("connectivity")) == null || ((activeNetwor = systemServic.getActiveNetworkInfo()) == null || !activeNetwor.isConnected())))) {
          return null;
       }
       if (activeNetwor.getType() == 1) {
          return "wifi";
       }
       return "mobile";
    }
    public static String j(){
       String str = "";
       try{
          Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = Collections.list(iterator.next().getInetAddresses()).iterator();
             while (iterator1.hasNext()) {
                InetAddress inetAddress = iterator1.next();
                if (!inetAddress.isLoopbackAddress()) {
                   String hostAddress = inetAddress.getHostAddress();
                   int i = (hostAddress.indexOf(58) < 0)? 1: 0;
                   if (i) {
                      str = hostAddress;
                   }
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String l(Context p0){
       if (!Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
          return "Android";
       }
       String str = "AMAZON_FIRE_TV";
       if (p0 == null) {
          if (!Build.MODEL.contains("AFT")) {
             str = "AMAZON_FIRE";
          }
          return str;
       }else if(p0.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")){
          return str;
       }else {
          return "AMAZON_FIRE";
       }
    }
    public static DisplayMetrics m(Context p0){
       DisplayManager systemServic;
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       Display uDisplay = null;
       if (p0 != null && (systemServic = p0.getSystemService("display")) != null) {
          uDisplay = systemServic.getDisplay(0);
       }
       if (uDisplay != null) {
          uDisplay.getMetrics(uDisplayMetr);
       }
       return uDisplayMetr;
    }
    public static String s(Context p0){
       String str1;
       try{
          String str = "UI_MODE_TYPE_UNDEFINED";
          UiModeManager systemServic = (p0 != null)? p0.getSystemService("uimode"): null;
          if (systemServic != null) {
             switch (systemServic.getCurrentModeType()){
                 case 1:
                   str1 = "UI_MODE_TYPE_NORMAL";
                label_0029 :
                   str = str1;
                   break;
                 case 2:
                   str1 = "UI_MODE_TYPE_DESK";
                   goto label_0029 ;
                   break;
                 case 3:
                   str1 = "UI_MODE_TYPE_CAR";
                   goto label_0029 ;
                   break;
                 case 4:
                   str1 = "UI_MODE_TYPE_TELEVISION";
                   goto label_0029 ;
                   break;
                 case 5:
                   str1 = "UI_MODE_TYPE_APPLIANCE";
                   goto label_0029 ;
                   break;
                 case 6:
                   str1 = "UI_MODE_TYPE_WATCH";
                   goto label_0029 ;
                   break;
                 default:
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean t(Context p0){
       int i2;
       int i = 0;
       if (Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
          int i1 = 1;
          try{
             Class[] uClassArray = new Class[i];
             Object[] objArray = new Object[i];
             Class[] uClassArray1 = new Class[i1];
             uClassArray1[i] = Context.class;
             objArray = new Object[i1];
             objArray[i] = p0;
             p0 = hl2.class.getDeclaredMethod("isGooglePlayServicesAvailable", uClassArray1).invoke(hl2.class.getDeclaredMethod("getInstance", uClassArray).invoke(null, objArray), objArray);
             i2 = (p0 instanceof Integer && !p0.intValue())? 1: 0;
          }catch(java.lang.Exception e0){
          }
          if (!i2) {
             i = true;
          }
       }
       return i;
    }
    public abstract int e(View p0);
    public abstract int f(View p0);
    public abstract int g(View p0);
    public abstract int h();
    public abstract int i();
    public abstract int k();
    public abstract int n();
    public abstract int o();
    public final int p(){
       int i = (Integer.MIN_VALUE == this.a)? 0: this.o() - this.a;
       return i;
    }
    public abstract int q(View p0);
    public abstract int r(View p0);
    public abstract void u(int p0);
    public final boolean v(Context p0,ty6 p1){
       uh2 ouh2;
       Void[] voidArray;
       this.c = ji5.g(p0).o();
       boolean b = false;
       if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
          if (p0 != null) {
             try{
                ContentResolver contentResol = p0.getContentResolver();
                this.a = Settings$Secure.getInt(contentResol, "limit_ad_tracking");
                String str = Settings$Secure.getString(contentResol, "advertising_id");
                this.b = str;
                if (TextUtils.isEmpty(str) || (this.b.equals("00000000-0000-0000-0000-000000000000") || this.a == 1)) {
                   this.b = null;
                }
             }catch(android.provider.Settings$SettingNotFoundException e0){
             }
          }
          if (p1 != null) {
             p1.m();
          }
       }else if(x45.t(p0)){
          ouh2 = new uh2(p0, p1, 1);
          try{
             voidArray = new Void[b];
             ouh2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
          }catch(java.lang.Exception e0){
             e0.execute(voidArray);
          }
       }else {
          ouh2 = new uh2(p0, p1, b);
          try{
             voidArray = new Void[b];
             ouh2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
          }catch(java.lang.Exception e0){
             e0.execute(voidArray);
          }
       }
       b = true;
       return b;
    }
}
