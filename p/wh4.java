package p.wh4;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.net.ConnectivityManager$NetworkCallback;

public abstract class wh4	// class@002b39 from classes.dex
{

    public static final NetworkCapabilities a(ConnectivityManager p0,Network p1){
       co5.o(p0, "<this>");
       return p0.getNetworkCapabilities(p1);
    }
    public static final boolean b(NetworkCapabilities p0,int p1){
       co5.o(p0, "<this>");
       return p0.hasCapability(p1);
    }
    public static final void c(ConnectivityManager p0,ConnectivityManager$NetworkCallback p1){
       co5.o(p0, "<this>");
       co5.o(p1, "networkCallback");
       p0.unregisterNetworkCallback(p1);
    }
}
