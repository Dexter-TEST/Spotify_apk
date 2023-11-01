package p.yd4;
import p.a53;
import android.os.Binder;
import p.ae4;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Object;
import p.co5;
import java.util.concurrent.Executor;
import p.ij;
import java.lang.Runnable;

public final class yd4 extends Binder implements a53	// class@002d97 from classes.dex
{
    public final ae4 a;
    public static final int b;

    public void yd4(ae4 p0){
       this.a = p0;
       super();
       this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 >= 1 && p0 <= 0xffffff) {
          p1.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
       }
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             this.j(p1.createStringArray());
             return 1;
          }
       }else {
          p2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
          return 1;
       }
    }
    public final void j(String[] p0){
       co5.o(p0, "tables");
       yd4 ta = this.a;
       ta.e.execute(new ij(ta, 5, p0));
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       return this.g(p0, p1, p2, p3);
    }
}
