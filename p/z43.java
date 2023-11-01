package p.z43;
import p.a53;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public final class z43 implements a53	// class@002e85 from classes.dex
{
    public final IBinder a;

    public void z43(IBinder p0){
       super();
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final void j(String[] p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
       parcel.writeStringArray(p0);
       this.a.transact(1, parcel, null, 1);
       parcel.recycle();
    }
}
