package p.zt6;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.InstallReferrerClient;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.ji5;
import com.android.installreferrer.api.ReferrerDetails;
import p.cu6;
import java.lang.Long;
import java.lang.Throwable;

public final class zt6 implements InstallReferrerStateListener	// class@002f63 from classes.dex
{
    public final InstallReferrerClient a;

    public void zt6(InstallReferrerClient p0,Context p1){
       this.a = p0;
       super();
    }
    public final void onInstallReferrerServiceDisconnected(){
       ji5.a("onInstallReferrerServiceDisconnected\(\)");
    }
    public final void onInstallReferrerSetupFinished(int p0){
       ReferrerDetails installRefer;
       zt6 ta = this.a;
       if (p0 != -1) {
          try{
             if (p0) {
                if (p0 == 1 || (p0 == 2 || p0 == 3)) {
                label_0058 :
                   cu6.H = true;
                   cu6.V();
                }
             }else if((installRefer = ta.getInstallReferrer()) != null){
                cu6.K = installRefer.getInstallReferrer();
                cu6.I = Long.valueOf(installRefer.getReferrerClickTimestampSeconds());
                cu6.J = Long.valueOf(installRefer.getInstallBeginTimestampSeconds());
             }
             ta.endConnection();
             cu6.I.longValue();
             cu6.J.longValue();
             cu6.V();
          }catch(android.os.RemoteException e6){
             e6.getMessage();
             cu6.H = true;
             cu6.V();
          }catch(java.lang.Exception e6){
             e6.getMessage();
             cu6.H = true;
             cu6.V();
          }
       }else {
          goto label_0058 ;
       }
       return;
    }
}
