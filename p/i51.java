package p.i51;
import p.b52;
import java.lang.Object;
import p.m07;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.Context;
import java.lang.Boolean;
import p.m95;
import java.lang.Long;
import p.ml1;
import java.util.Map;
import p.co5;
import p.q14;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.Iterable;
import p.zf2;
import p.dj0;

public final class i51	// class@001927 from classes.dex
{
    public final int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public Object i;

    public void i51(b52 p0){
       Boolean uBoolean;
       this.a = 0;
       super();
       Object obj = new Object();
       this.f = obj;
       this.g = new m07();
       this.b = false;
       this.c = false;
       this.h = new m07();
       p0.a();
       b52 a = p0.a;
       this.e = p0;
       SharedPreferences sharedPrefer = a.getSharedPreferences("com.google.firebase.crashlytics", 0);
       this.d = sharedPrefer;
       if (sharedPrefer.contains("firebase_crashlytics_collection_enabled")) {
          this.c = false;
          uBoolean = Boolean.valueOf(sharedPrefer.getBoolean("firebase_crashlytics_collection_enabled", true));
       }else {
          uBoolean = null;
       }
       if (uBoolean == null) {
          uBoolean = this.a(a);
       }
       this.i = uBoolean;
       _monitor_enter(obj);
       if (this.b()) {
          this.g.b(null);
          this.b = true;
       }
       _monitor_exit(obj);
       return;
    }
    public void i51(boolean p0,boolean p1,m95 p2,Long p3,Long p4,Long p5,Long p6){
       this.a = 1;
       super(p0, p1, p2, p3, p4, p5, p6, ml1.a);
    }
    public void i51(boolean p0,boolean p1,m95 p2,Long p3,Long p4,Long p5,Long p6,Map p7){
       this.a = 1;
       co5.o(p7, "extras");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = q14.r0(p7);
    }
    public final Boolean a(Context p0){
       PackageManager packageManag;
       Boolean uBoolean1;
       ApplicationInfo applicationI;
       ApplicationInfo metaData;
       String str = "firebase_crashlytics_collection_enabled";
       Boolean uBoolean = null;
       try{
          if ((packageManag = p0.getPackageManager()) != null && ((applicationI = packageManag.getApplicationInfo(p0.getPackageName(), 128)) != null && ((metaData = applicationI.metaData) != null && metaData.containsKey(str)))) {
             uBoolean1 = Boolean.valueOf(applicationI.metaData.getBoolean(str));
          label_0031 :
             if (uBoolean1 == null) {
                this.c = false;
                return uBoolean;
             }else {
                this.c = true;
                return Boolean.valueOf(Boolean.TRUE.equals(uBoolean1));
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          Log.isLoggable("FirebaseCrashlytics", 3);
       }
       uBoolean1 = uBoolean;
       goto label_0031 ;
    }
    public synchronized final boolean b(){
       i51 ti = this.i;
       boolean b = (ti != null)? ti.booleanValue(): this.e.f();
       this.c(b);
       return b;
    }
    public final void c(boolean p0){
       String str1;
       String str = (p0)? "ENABLED": "DISABLED";
       if (this.i == null) {
          str1 = "global Firebase setting";
       }else if(this.c != null){
          str1 = "firebase_crashlytics_collection_enabled manifest flag";
       }else {
          str1 = "API";
       }
       Object[] objArray = new Object[]{str,str1};
       String.format("Crashlytics automatic data collection %s by %s.", objArray);
       Log.isLoggable("FirebaseCrashlytics", 3);
       return;
    }
    public final String toString(){
       ArrayList uArrayList;
       i51 te;
       switch (this.a){
           case 1:
             uArrayList = new ArrayList();
             if (this.b != null) {
                uArrayList.add("isRegularFile");
             }
             if (this.c != null) {
                uArrayList.add("isDirectory");
             }
             if ((te = this.e) != null) {
                uArrayList.add("byteCount="+te);
             }
             if ((te = this.f) != null) {
                uArrayList.add("createdAt="+te);
             }
             if (this.g != null) {
                uArrayList.add("lastModifiedAt="+this.g);
             }
             if ((te = this.h) != null) {
                uArrayList.add("lastAccessedAt="+te);
             }
             if ((this.i.isEmpty() ^ 0x01)) {
                uArrayList.add("extras="+this.i);
             }
             break;
           default:
             return super.toString();
       }
       return dj0.q0(uArrayList, ", ", "FileMetadata\(", "\)", null, 56);
    }
}
