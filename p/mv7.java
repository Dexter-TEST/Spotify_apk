package p.mv7;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.uo;
import p.jl2;
import p.kl2;
import p.dp0;
import p.t15;
import p.li5;
import p.vu7;
import java.util.Random;
import java.lang.String;
import android.util.Base64;
import android.os.IBinder;
import android.os.IInterface;
import p.pv7;
import android.os.Bundle;
import java.lang.Class;
import java.lang.Object;
import android.os.BaseBundle;

public final class mv7 extends bl2	// class@001f15 from classes.dex
{
    public final uo A;

    public void mv7(Context p0,Looper p1,yg0 p2,uo p3,jl2 p4,kl2 p5){
       super(p0, p1, 68, p2, p4, p5);
       if (p3 == null) {
          p3 = uo.c;
       }
       li5 oli5 = new li5(p3);
       byte[] uobyteArray = new byte[16];
       vu7.a.nextBytes(uobyteArray);
       oli5.c = Base64.encodeToString(uobyteArray, 11);
       this.A = new uo(oli5);
       return;
    }
    public final int a(){
       return 0xc35000;
    }
    public final IInterface c(IBinder p0){
       IInterface iInterface;
       if (p0 == null) {
          iInterface = null;
       }else {
          IInterface iInterface1 = p0.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
          iInterface = (iInterface1 instanceof pv7)? iInterface1: new pv7(p0);
       }
       return iInterface;
    }
    public final Bundle g(){
       mv7 tA = this.A;
       tA.getClass();
       Bundle uBundle = new Bundle();
       uBundle.putString("consumer_package", null);
       uBundle.putBoolean("force_save_dialog", tA.a);
       uBundle.putString("log_session_id", tA.b);
       return uBundle;
    }
    public final String j(){
       return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
    public final String k(){
       return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
