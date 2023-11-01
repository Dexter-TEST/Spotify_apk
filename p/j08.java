package p.j08;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.jl2;
import p.kl2;
import p.dp0;
import p.t15;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.String;
import p.xz7;

public final class j08 extends bl2	// class@001a41 from classes.dex
{

    public void j08(Context p0,Looper p1,yg0 p2,jl2 p3,kl2 p4){
       super(p0, p1, 126, p2, p3, p4);
    }
    public final int a(){
       return 0xbdfcb8;
    }
    public final IInterface c(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
       if (iInterface instanceof xz7) {
          return iInterface;
       }
       return new xz7(p0);
    }
    public final String j(){
       return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }
    public final String k(){
       return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
