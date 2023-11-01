package p.qv7;
import p.xu7;
import android.content.Context;
import java.lang.String;
import android.os.Parcel;
import p.lv7;
import p.qs6;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p.rl2;
import java.lang.Object;
import p.w51;
import p.fl2;
import p.kv7;
import p.dm5;
import p.yu7;
import com.google.android.gms.common.api.Status;
import p.ea5;
import p.wx5;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.Thread;
import java.lang.Runnable;
import p.hv7;
import p.pt7;
import p.jv7;
import p.a28;
import p.oi;
import p.as6;
import android.os.Binder;
import p.a70;
import p.bs7;
import java.lang.Class;
import android.app.AppOpsManager;
import java.lang.NullPointerException;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import p.vl2;
import p.ql2;
import android.os.Build;
import android.util.Log;
import java.lang.SecurityException;
import java.lang.StringBuilder;

public final class qv7 extends xu7	// class@002424 from classes.dex
{
    public final Context b;

    public void qv7(Context p0){
       super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
       this.b = p0;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2){
       dm5 a1;
       String str;
       ea5 uoea5;
       yu7 oyu7;
       as6 uoas6;
       hv7 ohv7;
       int i = 1;
       int i1 = 0;
       qv7 tb = this.b;
       if (p0 != i) {
          if (p0 != 2) {
             i = false;
          }else {
             this.n();
             lv7.a(tb).b();
          }
       }else {
          this.n();
          qs6 oqs6 = qs6.a(tb);
          GoogleSignInAccount googleSignIn = oqs6.b();
          GoogleSignInOptions e = GoogleSignInOptions.E;
          if (googleSignIn != null) {
             e = oqs6.c();
          }
          w51.k(e);
          rl2 orl2 = new rl2(tb, e);
          tb = 3;
          fl2 h = orl2.h;
          fl2 a = orl2.a;
          if (googleSignIn != null) {
             orl2 = (orl2.f() == tb)? 1: 0;
             a1 = kv7.a;
             tb = (a1.b <= tb)? 1: 0;
             if (tb) {
                a1.d.concat("Revoking access");
             }
             str = qs6.a(a).g("refreshToken");
             kv7.a(a);
             if (orl2) {
                if (str == null) {
                   Status status = new Status(4, null, i1);
                   w51.d("Status code must not be SUCCESS", (0 ^ i));
                   uoea5 = new ea5(status);
                   uoea5.G(status);
                }else {
                   oyu7 = new yu7(str);
                   new Thread(oyu7).start();
                   uoea5 = oyu7.b;
                }
             }else {
                uoea5 = new hv7(h, i);
                h.b.d(i, uoea5);
             }
             oi.m(uoea5);
          }else if(orl2.f() == tb){
             oyu7 = 1;
          }else {
             ohv7 = 0;
          }
          a1 = kv7.a;
          str = (a1.b <= tb)? 1: 0;
          if (str) {
             a1.d.concat("Signing out");
          }
          kv7.a(a);
          if (oyu7) {
             uoas6 = new as6(h);
             uoas6.G(Status.w);
          }else {
             ohv7 = new hv7(h, i1);
             h.b.d(i, ohv7);
             uoas6 = ohv7;
          }
          oi.m(uoas6);
       }
       return i;
    }
    public final void n(){
       int i;
       AppOpsManager systemServic;
       vl2 a;
       int callingUid = Binder.getCallingUid();
       String str = "com.google.android.gms";
       qv7 tb = this.b;
       a70 uoa70 = bs7.a(tb);
       uoa70.getClass();
       boolean b = true;
       try{
          i = 0;
          if ((systemServic = uoa70.a.getSystemService("appops")) != null) {
             systemServic.checkPackage(callingUid, str);
             a = 1;
          }else {
             throw new NullPointerException("context.getSystemService\(Context.APP_OPS_SERVICE\) is null");
          }
       }catch(java.lang.SecurityException e0){
          callingUid = 0;
       }
       try{
          if (callingUid) {
             PackageManager packageManag = tb.getPackageManager();
             systemServic = 64;
             PackageInfo packageInfo = packageManag.getPackageInfo(str, systemServic);
             vl2 ovl2 = vl2.a(tb);
             ovl2.getClass();
             if (packageInfo != null) {
                if (vl2.c(packageInfo, i)) {
                label_009a :
                   i = b;
                }else if(vl2.c(packageInfo, b)){
                   a = ovl2.a;
                   if (!ql2.b) {
                      try{
                         PackageInfo packageInfo1 = bs7.a(a).a.getPackageManager().getPackageInfo(str, systemServic);
                         vl2.a(a);
                         ql2.a = (packageInfo1 != null && (!vl2.c(packageInfo1, i) && vl2.c(packageInfo1, b)))? b: i;
                         ql2.b = b;
                      }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                         ql2.b = b;
                      }
                   }
                   a = (!ql2.a && "user".equals(Build.TYPE))? 0: 1;
                   if (a) {
                      goto label_009a ;
                   }
                }
             }
             b = 0;
             goto label_009a ;
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          Log.isLoggable("UidVerifier", 3);
       }
       if (i) {
          return;
       }else {
          throw new SecurityException(new StringBuilder(52)+"Calling UID "+Binder.getCallingUid()+" is not Google Play services.");
       }
    }
}
