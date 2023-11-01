package p.b51;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import java.lang.String;
import android.view.KeyEvent;
import android.os.Parcelable;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.Object;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;

public abstract class b51 extends BroadcastReceiver	// class@001056 from classes.dex
{

    public void b51(){
       super();
    }
    public static PendingIntent a(Context p0,long p1){
       int i1;
       ComponentName uComponentNa = b51.b(p0);
       PendingIntent pendingInten = null;
       if (uComponentNa == null) {
          return pendingInten;
       }
       int i = 0;
       if (!(p1 - 4)) {
          i1 = 126;
       }else if(!(p1 - 2)){
          i1 = 127;
       }else if(!(p1 - 32)){
          i1 = 87;
       }else if(!(p1 - 16)){
          i1 = 88;
       }else if(!(p1 - 1)){
          i1 = 86;
       }else if(!(p1 - 64)){
          i1 = 90;
       }else if(!(p1 - 8)){
          i1 = 89;
       }else if(!(p1 - 512)){
          i1 = 85;
       }else {
          i1 = 0;
       }
       if (i1) {
          Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
          intent.setComponent(uComponentNa);
          intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(i, i1));
          intent.addFlags(0x10000000);
          if (Build$VERSION.SDK_INT >= 31) {
             i = 0x2000000;
          }
          pendingInten = PendingIntent.getBroadcast(p0, i1, intent, i);
       }
       return pendingInten;
    }
    public static ComponentName b(Context p0){
       Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
       intent.setPackage(p0.getPackageName());
       int i = 0;
       List list = p0.getPackageManager().queryBroadcastReceivers(intent, i);
       if (list.size() == 1) {
          ResolveInfo activityInfo = list.get(i).activityInfo;
          return new ComponentName(activityInfo.packageName, activityInfo.name);
       }else {
          list.size();
          return null;
       }
    }
}
