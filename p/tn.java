package p.tn;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import p.co5;

public final class tn implements IInterface	// class@0027aa from classes.dex
{
    public final IBinder a;

    public void tn(IBinder p0){
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final String g(){
       Parcel parcel = Parcel.obtain();
       co5.l(parcel, "obtain\(\)");
       Parcel parcel1 = Parcel.obtain();
       co5.l(parcel1, "obtain\(\)");
       parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public final boolean k(){
       Parcel parcel = Parcel.obtain();
       co5.l(parcel, "obtain\(\)");
       Parcel parcel1 = Parcel.obtain();
       co5.l(parcel1, "obtain\(\)");
       parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
       int i = 1;
       parcel.writeInt(i);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       if (parcel1.readInt()) {
       }else {
          i = false;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
}
