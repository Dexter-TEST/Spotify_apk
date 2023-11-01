package p.lu7;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.dp0;
import p.t15;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.String;
import p.hu7;
import p.q12;
import p.do5;

public final class lu7 extends bl2	// class@001dc9 from classes.dex
{

    public void lu7(Context p0,Looper p1,yg0 p2,dp0 p3,t15 p4){
       super(p0, p1, 270, p2, p3, p4);
    }
    public final int a(){
       return 0xc1f7c30;
    }
    public final IInterface c(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
       if (iInterface instanceof hu7) {
          return iInterface;
       }
       return new hu7(p0);
    }
    public final q12[] f(){
       return do5.E;
    }
    public final String j(){
       return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    public final String k(){
       return "com.google.android.gms.common.telemetry.service.START";
    }
    public final boolean l(){
       return true;
    }
}
