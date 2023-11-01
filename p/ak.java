package p.ak;
import p.cu1;
import android.content.Context;
import p.hs3;
import java.lang.Object;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import p.u65;
import p.et0;
import com.google.protobuf.c;
import p.zj;
import com.spotify.contexts.ApplicationAndroid;
import com.google.protobuf.b;

public final class ak implements cu1	// class@000fa1 from classes.dex
{
    public final hs3 a;
    public final int b;
    public final String c;

    public void ak(Context p0,hs3 p1){
       PackageInfo packageInfo;
       super();
       this.b = 0;
       this.c = "";
       try{
          this.a = p1;
          packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
       }catch(android.content.pm.PackageManager$NameNotFoundException e3){
          this.a.c("Error in retrieving package information.", e3);
          packageInfo = null;
       }
       if (packageInfo != null) {
          this.b = packageInfo.versionCode;
          if ((packageInfo = packageInfo.versionName) == null) {
             ak tc = this.c;
          }
          this.c = packageInfo;
       }
       return;
    }
    public final String a(){
       return "context_application_android";
    }
    public final u65 b(){
       return et0.a(this);
    }
    public final c c(){
       zj ozj = ApplicationAndroid.h();
       ozj.c((long)this.b);
       ozj.d(this.c);
       return ozj.build();
    }
}
