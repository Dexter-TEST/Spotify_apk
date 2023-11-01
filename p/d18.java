package p.d18;
import p.z08;
import p.uv7;
import java.lang.String;
import android.os.Parcel;
import p.oy7;
import p.uo4;
import java.lang.Object;
import p.py7;
import android.os.IBinder;

public abstract class d18 extends uv7 implements z08	// class@0012bf from classes.dex
{

    public void d18(){
       super("com.google.android.gms.common.internal.ICertData");
    }
    public final boolean g(int p0,Parcel p1,Parcel p2){
       if (p0 != 1) {
          if (p0 != 2) {
             return false;
          }else {
             p2.writeNoException();
             p2.writeInt(this.a);
          }
       }else {
          p2.writeNoException();
          p2.writeStrongBinder(new uo4(this.k()));
       }
       return 1;
    }
}
