package p.oa3;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.InstallReferrerClient;
import p.az5;
import java.lang.Object;
import com.android.installreferrer.api.ReferrerDetails;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import p.av6;
import java.lang.Class;
import p.bj;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

public final class oa3 implements InstallReferrerStateListener	// class@0020df from classes.dex
{
    public final InstallReferrerClient a;
    public final az5 b;

    public void oa3(InstallReferrerClient p0,az5 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onInstallReferrerServiceDisconnected(){
    }
    public final void onInstallReferrerSetupFinished(int p0){
       String installRefer1;
       if (p0) {
       label_004d :
          return;
       }else {
          try{
             ReferrerDetails installRefer = this.a.getInstallReferrer();
             co5.l(installRefer, "{\n                      referrerClient.installReferrer\n                    }");
             if ((installRefer1 = installRefer.getInstallReferrer()) != null && (av6.f0(installRefer1, "fb") && !av6.f0(installRefer1, "facebook"))) {
                this.b.getClass();
                sz1.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installRefer1).apply();
             }
             az5.s();
             goto label_004d ;
          }catch(android.os.RemoteException e0){
          }
       }
    }
}
