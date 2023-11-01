package p.il2;
import p.ql2;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.q08;
import android.net.Uri;
import p.ye7;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.a70;
import p.bs7;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.net.Uri$Builder;
import android.content.res.Resources;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p.w18;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.lang.Boolean;
import p.vl2;
import p.w51;
import android.content.pm.Signature;
import java.lang.IllegalArgumentException;

public abstract class il2	// class@0019b6 from classes.dex
{
    public static final int a;

    static {
       il2.a = 0xbdfcb8;
    }
    public void il2(){
       super();
    }
    public Intent a(int p0,Context p1,String p2){
       Intent intent;
       Intent intent1;
       if (p0 != 1 && p0 != 2) {
          intent = null;
          if (p0 != 3) {
             return intent;
          }else {
             intent1 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
             intent1.setData(Uri.fromParts("package", "com.google.android.gms", intent));
             return intent1;
          }
       }else if(p1 != null && ye7.H(p1)){
          Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
          intent2.setPackage("com.google.android.wearable.app");
          return intent2;
       }else {
          String str = "-";
          String str1 = "gcore_"+il2.a+str;
          if (!TextUtils.isEmpty(p2)) {
             str1 = str1+p2;
          }
          str1 = str1+str;
          if (p1 != null) {
             str1 = str1+p1.getPackageName();
          }
          str1 = str1+str;
          if (p1 != null) {
             try{
                str1 = str1+bs7.a(p1).a.getPackageManager().getPackageInfo(p1.getPackageName(), 0).versionCode;
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             }
          }
          str1 = str1;
          intent1 = new Intent("android.intent.action.VIEW");
          Uri$Builder uBuilder = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
          if (!TextUtils.isEmpty(str1)) {
             uBuilder.appendQueryParameter("pcampaignid", str1);
          }
          intent1.setData(uBuilder.build());
          intent1.setPackage("com.android.vending");
          intent1.addFlags(0x80000);
          return intent1;
       }
    }
    public int b(Context p0,int p1){
       PackageInfo a;
       boolean c;
       PackageInfo packageInfo;
       StringBuilder c1;
       PackageInfo applicationI;
       ApplicationInfo metaData;
       p0.getResources().getString(R.string.common_google_play_services_unknown_issue);
       boolean b = true;
       if (!"com.google.android.gms".equals(p0.getPackageName()) && !ql2.d.get()) {
          a = w18.a;
          _monitor_enter(a);
          if (w18.b) {
             _monitor_exit(a);
          }else {
             w18.b = b;
             String packageName1 = p0.getPackageName();
             a70 uoa70 = bs7.a(p0);
             try{
                if ((metaData = uoa70.a.getPackageManager().getApplicationInfo(packageName1, 128).metaData) == null) {
                   _monitor_exit(a);
                }else {
                   metaData.getString("com.google.app.id");
                   w18.c = metaData.getInt("com.google.android.gms.version");
                   _monitor_exit(e0);
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             }
          }
          if (c = w18.c) {
             if (c != 0xbdfcb8) {
                throw new GooglePlayServicesIncorrectManifestValueException(c);
             }
          }else {
             throw new GooglePlayServicesMissingManifestValueException();
          }
       }
       if (!ye7.H(p0)) {
          if (ye7.d == null) {
             c = (!p0.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !p0.getPackageManager().hasSystemFeature("android.hardware.type.embedded"))? false: true;
             ye7.d = Boolean.valueOf(c);
          }
          if (!ye7.d.booleanValue()) {
             c = 1;
          label_00af :
             int i = (p1 >= 0)? 1: 0;
             if (i) {
                String packageName = p0.getPackageName();
                PackageManager packageManag = p0.getPackageManager();
                if (c) {
                   try{
                      packageInfo = packageManag.getPackageInfo("com.android.vending", 8256);
                   label_00d6 :
                      int i1 = 64;
                      try{
                         PackageInfo packageInfo1 = packageManag.getPackageInfo("com.google.android.gms", i1);
                         vl2.a(p0);
                         if (!vl2.c(packageInfo1, b)) {
                            String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                         }else if(c){
                            w51.k(packageInfo);
                            if (!vl2.c(packageInfo, b) || !packageInfo.signatures[0].equals(packageInfo1.signatures[0])) {
                               String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                            }
                         }
                         a = packageInfo1.versionCode;
                         int i2 = -1;
                         c = (a == i2)? -1: a / 1000;
                         if (p1 != i2) {
                            i2 = p1 / 1000;
                         }
                         if (c < i2) {
                            c1 = new StringBuilder((String.valueOf(packageName).length() + 82));
                            p1 = 2;
                         }else if((applicationI = packageInfo1.applicationInfo) == null){
                            applicationI = packageManag.getApplicationInfo("com.google.android.gms", 0);
                         }
                         if (applicationI.enabled == null) {
                            applicationI = 3;
                         }else {
                            applicationI = 0;
                         }
                      }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                         String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
                         p1 = 1;
                      }
                   }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                      String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                   }
                }else {
                   packageInfo = null;
                   goto label_00d6 ;
                }
                if (p1 != 18) {
                   b = (p1 == b)? ql2.a(p0): false;
                }
                if (b) {
                   p1 = 18;
                }
                return p1;
             }else {
                throw new IllegalArgumentException();
             }
          }
       }
       c1 = 0;
       goto label_00af ;
    }
}
