package p.la1;
import android.net.nsd.NsdManager$RegistrationListener;
import java.lang.String;
import java.lang.Object;
import android.net.nsd.NsdServiceInfo;
import p.co5;
import p.ma1;

public final class la1 implements NsdManager$RegistrationListener	// class@001d13 from classes.dex
{
    public final String a;
    public final String b;

    public void la1(String p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onRegistrationFailed(NsdServiceInfo p0,int p1){
       co5.o(p0, "serviceInfo");
       ma1.a(this.b);
    }
    public final void onServiceRegistered(NsdServiceInfo p0){
       co5.o(p0, "NsdServiceInfo");
       if (!co5.c(this.a, p0.getServiceName())) {
          ma1.a(this.b);
       }
       return;
    }
    public final void onServiceUnregistered(NsdServiceInfo p0){
       co5.o(p0, "serviceInfo");
    }
    public final void onUnregistrationFailed(NsdServiceInfo p0,int p1){
       co5.o(p0, "serviceInfo");
    }
}
