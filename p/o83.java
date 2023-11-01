package p.o83;
import android.content.ServiceConnection;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import p.co5;
import p.q83;
import p.u83;
import android.content.Context;
import p.sz1;

public final class o83 implements ServiceConnection	// class@0020cc from classes.dex
{

    public void o83(){
       super();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       co5.o(p0, "name");
       co5.o(p1, "service");
       Object[] objArray = new Object[]{p1};
       q83.g = u83.e(sz1.a(), "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, objArray);
    }
    public final void onServiceDisconnected(ComponentName p0){
       co5.o(p0, "name");
    }
}
