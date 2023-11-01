package p.xw7;
import p.ux7;
import android.content.Context;
import p.jd;
import java.lang.String;
import android.content.IntentFilter;
import android.content.Intent;
import java.lang.Object;
import android.os.Bundle;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import java.lang.Integer;
import com.google.android.play.core.install.zza;

public final class xw7 extends ux7	// class@002d02 from classes.dex
{

    public void xw7(Context p0){
       super(new jd("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), p0);
    }
    public final void a(Context p0,Intent p1){
       Object[] objArray;
       int i;
       Intent intent = p1;
       ux7 a = this.a;
       if (!p0.getPackageName().equals(intent.getStringExtra("package.name"))) {
          objArray = new Object[]{intent.getStringExtra("package.name")};
          a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          a.a("List of extras in received intent:", objArray1);
          Iterator iterator = p1.getExtras().keySet().iterator();
          while (true) {
             i = 2;
             if (iterator.hasNext()) {
                String str = iterator.next();
                Object[] objArray2 = new Object[i];
                objArray2[0] = str;
                objArray2[1] = p1.getExtras().get(str);
                a.a("Key: %s; value: %s", objArray2);
             }else {
                break ;
             }
          }
          objArray = new Object[0];
          a.a("List of extras in received intent needed by fromUpdateIntent:", objArray);
          objArray = new Object[i];
          objArray[0] = "install.status";
          objArray[1] = Integer.valueOf(intent.getIntExtra("install.status", 0));
          a.a("Key: %s; value: %s", objArray);
          objArray = new Object[i];
          objArray[0] = "error.code";
          objArray[1] = Integer.valueOf(intent.getIntExtra("error.code", 0));
          a.a("Key: %s; value: %s", objArray);
          zza intent1 = new zza(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getLongExtra("bytes.downloaded", 0), intent.getLongExtra("total.bytes.to.download", 0), intent.getStringExtra("package.name"));
          objArray = new Object[]{intent};
          a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", objArray);
          this.d();
          return;
       }
    }
}
