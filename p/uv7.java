package p.uv7;
import android.os.IInterface;
import android.os.Binder;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;

public abstract class uv7 extends Binder implements IInterface	// class@00292e from classes.dex
{

    public void uv7(String p0){
       super();
       this.attachInterface(this, p0);
    }
    public final IBinder asBinder(){
       return this;
    }
    public boolean g(int p0,Parcel p1,Parcel p2){
       return false;
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       boolean b;
       if (p0 > 0xffffff) {
          b = super.onTransact(p0, p1, p2, p3);
       }else {
          p1.enforceInterface(this.getInterfaceDescriptor());
          b = false;
       }
       if (b) {
          return true;
       }else {
          return this.g(p0, p1, p2);
       }
    }
}
