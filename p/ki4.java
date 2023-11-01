package p.ki4;
import android.net.ConnectivityManager$NetworkCallback;
import java.lang.Object;
import android.net.Network;
import p.bq5;
import android.net.NetworkCapabilities;
import java.lang.String;
import p.co5;
import p.es3;
import p.mi4;
import java.lang.Class;
import p.li4;
import android.net.ConnectivityManager;
import p.ji4;
import p.tq0;

public final class ki4 extends ConnectivityManager$NetworkCallback	// class@001c1c from classes.dex
{
    public final int a;
    public final Object b;

    public void ki4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAvailable(Network p0){
       switch (this.a){
           case 1:
           default:
             super.onAvailable(p0);
             return;
       }
       bq5.a(this.b, p0, true);
       return;
    }
    public final void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       switch (this.a){
           case 0:
           default:
             super.onCapabilitiesChanged(p0, p1);
             return;
       }
       co5.o(p0, "network");
       co5.o(p1, "capabilities");
       p1.toString();
       es3.c().getClass();
       ki4 tb = this.b;
       tb.c(mi4.a(tb.f));
       return;
    }
    public final void onLost(Network p0){
       ki4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             bq5.a(tb, p0, false);
             return;
       }
       co5.o(p0, "network");
       es3.c().getClass();
       tb.c(mi4.a(tb.f));
       return;
    }
}
