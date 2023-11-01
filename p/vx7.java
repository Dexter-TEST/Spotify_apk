package p.vx7;
import p.r87;
import android.content.Context;
import p.ah0;
import java.lang.Object;
import p.gf3;
import p.gg1;
import p.g54;
import java.lang.String;
import android.net.ConnectivityManager;
import p.s80;
import java.net.URL;
import java.lang.IllegalArgumentException;
import p.en6;
import java.lang.Throwable;
import p.dt;
import android.net.NetworkInfo;
import p.i77;
import android.os.Build$VERSION;
import java.util.Map;
import android.os.Build;
import java.util.Calendar;
import java.util.TimeZone;
import p.v18;
import p.u18;
import android.util.SparseArray;

public final class vx7 implements r87	// class@002a87 from classes.dex
{
    public final g54 a;
    public final ConnectivityManager b;
    public final URL c;
    public final ah0 d;
    public final ah0 e;
    public final int f;

    public void vx7(Context p0,ah0 p1,ah0 p2){
       String c;
       super();
       gf3 ogf3 = new gf3();
       gg1.C.m(ogf3);
       ogf3.d = true;
       this.a = new g54(ogf3);
       this.b = p0.getSystemService("connectivity");
       try{
          c = s80.c;
          this.c = new URL(c);
          this.d = p2;
          this.e = p1;
          this.f = 0x9c40;
          return;
       }catch(java.net.MalformedURLException e4){
          throw new IllegalArgumentException(en6.n("Invalid url: ", c), e4);
       }
    }
    public final dt a(dt p0){
       int i2;
       NetworkInfo activeNetwor = this.b.getActiveNetworkInfo();
       i77 oi77 = p0.c();
       oi77.q().put("sdk-version", String.valueOf(Build$VERSION.SDK_INT));
       oi77.e("model", Build.MODEL);
       oi77.e("hardware", Build.HARDWARE);
       oi77.e("device", Build.DEVICE);
       oi77.e("product", Build.PRODUCT);
       oi77.e("os-uild", Build.ID);
       oi77.e("manufacturer", Build.MANUFACTURER);
       oi77.e("fingerprint", Build.FINGERPRINT);
       Calendar.getInstance();
       oi77.q().put("tz-offset", String.valueOf((long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
       int i = -1;
       int i1 = (activeNetwor == null)? -1: activeNetwor.getType();
       oi77.q().put("net-type", String.valueOf(i1));
       if (activeNetwor == null) {
          SparseArray a = u18.a;
          i2 = 0;
       }else if((i2 = activeNetwor.getSubtype()) == i){
          i2 = 100;
       }else if(u18.a.get(i2) != null){
       }
       oi77.q().put("mobile-subtype", String.valueOf(i2));
       return oi77.i();
    }
}
