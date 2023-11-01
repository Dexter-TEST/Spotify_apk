package p.rs0;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.os.Handler;
import android.content.Intent;
import p.n6;
import java.lang.StringBuilder;
import p.eb3;
import java.lang.RuntimeException;
import p.tp2;
import p.p3;
import android.content.ComponentName;

public abstract class rs0	// class@002548 from classes.dex
{

    public static Intent a(Context p0,BroadcastReceiver p1,IntentFilter p2,String p3,Handler p4,int p5){
       if (!((p5 & 0x04)) || p3 != null) {
          return p3.g(p0, p1, p2, p3, p4, (p5 & 0x01));
       }
       p3 = p0.getPackageName()+".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
       if (!eb3.b(p0, p3)) {
          return p0.registerReceiver(p1, p2, p3, p4);
       }
       throw new RuntimeException(tp2.m("Permission ", p3, " is required by your application to receive broadcasts, please add it to your manifest"));
    }
    public static ComponentName b(Context p0,Intent p1){
       return p3.f(p0, p1);
    }
}
