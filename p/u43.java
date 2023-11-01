package p.u43;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.Object;
import p.hy;
import p.aj2;
import android.os.Parcel;
import java.lang.String;

public final class u43 implements IInterface	// class@00283d from classes.dex
{
    public final IBinder a;

    public void u43(IBinder p0){
       super();
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final void g(hy p0,aj2 p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
       parcel.writeStrongBinder(p0);
       parcel.writeInt(1);
       p1.writeToParcel(parcel, 0);
       this.a.transact(46, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
}
