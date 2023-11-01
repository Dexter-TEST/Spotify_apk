package p.fu6;
import p.ox7;
import android.content.Context;
import p.t50;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient$Builder;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import p.du6;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import java.util.Timer;
import p.au6;
import java.util.TimerTask;
import java.lang.String;
import java.lang.Throwable;

public abstract class fu6 extends ox7	// class@00163f from classes.dex
{
    public static eu6 F;
    public static boolean G;

    public static void V(Context p0,t50 p1){
       fu6.F = p1;
       fu6.G = true;
       try{
          InstallReferrerClient.newBuilder(p0).build().startConnection(new du6());
          new Timer().schedule(new au6(true), 1500);
       }catch(java.lang.Exception e3){
          e3.getMessage();
          e3.printStackTrace();
       }
       return;
    }
}
