package p.ma1;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import android.net.nsd.NsdManager$RegistrationListener;
import android.content.Context;
import p.sz1;
import android.net.nsd.NsdManager;
import java.lang.NullPointerException;

public abstract class ma1	// class@001e55 from classes.dex
{
    public static final HashMap a;

    static {
       ma1.a = new HashMap();
    }
    public static final void a(String p0){
       NsdManager$RegistrationListener registration;
       Object systemServic;
       HashMap a = ma1.a;
       if ((registration = a.get(p0)) != null) {
          if ((systemServic = sz1.a().getSystemService("servicediscovery")) != null) {
             try{
                systemServic.unregisterService(registration);
             }catch(java.lang.IllegalArgumentException e0){
                HashSet a1 = sz1.a;
             }
             e0.remove(p0);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
          }
       }
       return;
    }
}
