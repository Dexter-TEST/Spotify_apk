package p.na3;
import com.android.installreferrer.api.InstallReferrerStateListener;
import p.j8;
import java.lang.Object;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import java.lang.Integer;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import p.ia3;
import p.co5;

public final class na3 implements InstallReferrerStateListener	// class@001f9b from classes.dex
{
    public final j8 a;

    public void na3(j8 p0){
       this.a = p0;
       super();
    }
    public final void onInstallReferrerServiceDisconnected(){
       Object[] objArray = new Object[0];
       Logger.b("Install referrer service disconnected", objArray);
    }
    public final void onInstallReferrerSetupFinished(int p0){
       String installRefer;
       Object[] objArray1;
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(p0);
       Logger.e("InstallReferrerClient connected %d", objArray);
       if (!p0) {
          try{
             na3 ta = this.a;
             if (ta.b.isReady()) {
                if ((installRefer = ta.b.getInstallReferrer().getInstallReferrer()) != null && installRefer.length()) {
                   i = 0;
                }
                if (!i) {
                   co5.l(installRefer, "referrer");
                   ta.c.a(installRefer);
                }
                if (ta.b.isReady()) {
                   ta.b.endConnection();
                }
             }
          }catch(android.os.RemoteException e0){
             objArray1 = new Object[0];
             Logger.b("Remote exception while retrieving Install referrer.", objArray1);
          }
       }else {
          objArray1 = new Object[i];
          objArray1[0] = Integer.valueOf(p0);
          Logger.b("Error connecting to install referrer: %d", objArray1);
       }
       return;
    }
}
