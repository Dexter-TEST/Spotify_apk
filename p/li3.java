package p.li3;
import p.b5;
import com.spotify.litenavigation.launcher.LauncherActivity;
import java.lang.Object;
import android.content.Intent;
import android.content.Context;
import p.xj0;
import java.lang.String;
import android.os.Parcelable;
import java.lang.Class;

public final class li3 implements b5	// class@001d5c from classes.dex
{
    public final int a;
    public final LauncherActivity b;

    public void li3(LauncherActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       Intent intent;
       li3 tb = this.b;
       switch (this.a){
           case 0:
             intent = tb.C();
             String str = "spotify.intent.action.WELCOME";
             if (intent == null) {
                tb.startActivity(xj0.z0(tb, str));
             }else {
                tb.startActivity(xj0.z0(tb, str).putExtra("android.intent.extra.INTENT", intent));
             }
             break;
           case 1:
             if ((intent = tb.C()) == null) {
                tb.startActivity(xj0.q(tb));
             }else {
                tb.startActivity(intent);
             }
             return;
             break;
           default:
             tb.getClass();
             tb.startActivity(xj0.z0(tb, "spotify.intent.action.STORAGE_LOCATION_MISSING_SETTINGS"));
             return;
       }
       return;
    }
}
