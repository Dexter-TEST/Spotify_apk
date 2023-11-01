package p.j51;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.os.Build$VERSION;
import p.n6;
import p.qs0;
import java.lang.StringBuilder;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.os.Bundle;

public final class j51	// class@001a6a from classes.dex
{
    public final boolean a;

    public void j51(Context p0,String p1){
       boolean booleanx;
       PackageManager packageManag;
       ApplicationInfo applicationI;
       ApplicationInfo metaData;
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 24;
       if (sDK_INT < i) {
       }else if(sDK_INT >= i){
          p0 = qs0.a(p0);
       }else {
          p0 = null;
       }
       try{
          SharedPreferences sharedPrefer = p0.getSharedPreferences("com.google.firebase.common.prefs:"+p1, 0);
          boolean b = true;
          if (sharedPrefer.contains("firebase_data_collection_default_enabled")) {
             booleanx = sharedPrefer.getBoolean("firebase_data_collection_default_enabled", b);
          }else if((packageManag = p0.getPackageManager()) != null && ((applicationI = packageManag.getApplicationInfo(p0.getPackageName(), 128)) != null && ((metaData = applicationI.metaData) != null && metaData.containsKey("firebase_data_collection_default_enabled")))){
             b = applicationI.metaData.getBoolean("firebase_data_collection_default_enabled");
          }
          booleanx = b;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
          this.a = booleanx;
          return;
    }
}
