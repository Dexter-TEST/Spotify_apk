package p.bq5;
import p.fi4;
import android.net.ConnectivityManager;
import p.ei4;
import java.lang.Object;
import p.ki4;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.Network;
import p.co5;
import android.net.NetworkCapabilities;
import p.gy6;
import java.lang.ref.Reference;
import p.wp5;
import p.jc7;

public final class bq5 implements fi4	// class@001117 from classes.dex
{
    public final ConnectivityManager a;
    public final ei4 b;
    public final ki4 c;

    public void bq5(ConnectivityManager p0,ei4 p1){
       super();
       this.a = p0;
       this.b = p1;
       ki4 oki4 = new ki4(1, this);
       this.c = oki4;
       p0.registerNetworkCallback(new NetworkRequest$Builder().addCapability(12).build(), oki4);
    }
    public static final void a(bq5 p0,Network p1,boolean p2){
       jc7 a;
       NetworkCapabilities networkCapab;
       Network[] allNetworks = p0.a.getAllNetworks();
       int len = allNetworks.length;
       boolean b = false;
       int i = 0;
       while (i < len) {
          object oobject = allNetworks[i];
          if (co5.c(oobject, p1)) {
             int i1 = p2;
          }else if((networkCapab = p0.a.getNetworkCapabilities(oobject)) != null && networkCapab.hasCapability(12)){
             networkCapab = 1;
          }else {
             networkCapab = 0;
          }
          if (i1) {
             b = true;
             break ;
          }
          i = i + 1;
       }
       p0 = p0.b;
       if (p0.b.get() != null) {
          p0.t = b;
          a = jc7.a;
       }else {
          a = null;
       }
       if (a == null) {
          p0.a();
       }
       return;
    }
    public final boolean l(){
       bq5 ta = this.a;
       Network[] allNetworks = ta.getAllNetworks();
       int len = allNetworks.length;
       boolean b = false;
       int i = 0;
       while (i < len) {
          NetworkCapabilities networkCapab = ((networkCapab = ta.getNetworkCapabilities(allNetworks[i])) != null && networkCapab.hasCapability(12))? 1: 0;
          if (networkCapab) {
             b = true;
             break ;
          }
          i = i + 1;
       }
       return b;
    }
    public final void shutdown(){
       this.a.unregisterNetworkCallback(this.c);
    }
}
