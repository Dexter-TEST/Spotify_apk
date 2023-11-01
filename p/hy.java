package p.hy;
import p.uv7;
import p.bl2;
import java.lang.String;
import android.os.Parcel;
import android.os.IBinder;
import p.qx7;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.py7;
import java.lang.Object;
import p.w51;
import java.lang.Class;
import p.iy;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler;
import java.lang.Exception;

public final class hy extends uv7	// class@0018ec from classes.dex
{
    public bl2 a;
    public final int b;

    public void hy(bl2 p0,int p1){
       super("com.google.android.gms.common.internal.IGmsCallbacks");
       this.a = p0;
       this.b = p1;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2){
       hy ta1;
       bl2 e;
       String str = "onPostInitComplete can be called only once per call to getRemoteService";
       int i = 1;
       if (p0 != i) {
          if (p0 != 2) {
             if (p0 != 3) {
                i = false;
             label_008b :
                return i;
             }else {
                qx7 oqx7 = py7.a(p1, qx7.CREATOR);
                hy ta = this.a;
                w51.l(ta, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                w51.k(oqx7);
                ta.u = oqx7;
                w51.l(this.a, str);
                ta1 = this.a;
                ta1.getClass();
                e = ta1.e;
                e.sendMessage(e.obtainMessage(i, this.b, -1, new iy(ta1, p1.readInt(), p1.readStrongBinder(), oqx7.a)));
                this.a = null;
             }
          }else {
             p1.readInt();
             Bundle uBundle = py7.a(p1, Bundle.CREATOR);
             Exception uException = new Exception();
          }
       }else {
          w51.l(this.a, str);
          ta1 = this.a;
          ta1.getClass();
          e = ta1.e;
          e.sendMessage(e.obtainMessage(i, this.b, -1, new iy(ta1, p1.readInt(), p1.readStrongBinder(), py7.a(p1, Bundle.CREATOR))));
          this.a = null;
       }
       p2.writeNoException();
       goto label_008b ;
    }
}
