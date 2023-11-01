package p.hu3;
import p.dt3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.dc3;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.BaseBundle;

public final class hu3	// class@0018c3 from classes.dex
{
    public final String a;
    public final dc3 b;
    public final String c;
    public static final ScheduledExecutorService d;

    static {
       dt3 uodt3 = new dt3(4, 0);
       hu3.d = Executors.newSingleThreadScheduledExecutor();
    }
    public void hu3(Context p0,String p1){
       PackageManager packageManag;
       PackageInfo packageInfo;
       co5.o(p1, "applicationId");
       super();
       this.a = p1;
       dc3 uodc3 = new dc3(p0, p1);
       try{
          this.b = uodc3;
          if ((packageManag = p0.getPackageManager()) != null && (packageInfo = packageManag.getPackageInfo("com.facebook.katana", 0)) != null) {
             this.c = packageInfo.versionName;
          }
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public final void a(String p0,String p1){
       Bundle uBundle = dt3.f("");
       uBundle.putString("2_result", "error");
       uBundle.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
       uBundle.putString("3_method", p1);
       this.b.a(uBundle, p0);
    }
}
