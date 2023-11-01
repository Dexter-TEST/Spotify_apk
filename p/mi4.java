package p.mi4;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import android.net.ConnectivityManager;
import p.ji4;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.net.Network;
import p.xh4;
import android.net.NetworkCapabilities;
import p.wh4;
import java.lang.Throwable;
import p.qp0;

public abstract class mi4	// class@001ea0 from classes.dex
{
    public static final String a;

    static {
       String str = es3.d("NetworkStateTracker");
       co5.l(str, "tagWithPrefix\(\"NetworkStateTracker\"\)");
       mi4.a = str;
    }
    public static final ji4 a(ConnectivityManager p0){
       boolean b2;
       NetworkCapabilities networkCapab;
       co5.o(p0, "<this>");
       NetworkInfo activeNetwor = p0.getActiveNetworkInfo();
       boolean b = true;
       boolean b1 = (activeNetwor != null && activeNetwor.isConnected())? true: false;
       try{
          if (Build$VERSION.SDK_INT >= 23 && (networkCapab = wh4.a(p0, xh4.a(p0))) != null) {
             b2 = wh4.b(networkCapab, 16);
          label_003b :
             boolean b3 = qp0.a(p0);
             if (activeNetwor == null || activeNetwor.isRoaming()) {
                b = false;
             }
             return new ji4(b1, b2, b3, b);
          }
       }catch(java.lang.SecurityException e4){
          es3.c().b(mi4.a, "Unable to validate active network", e4);
       }
       b2 = false;
       goto label_003b ;
    }
}
