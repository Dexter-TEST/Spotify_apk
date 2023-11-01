package p.o43;
import p.q43;
import android.os.IBinder;
import java.lang.Object;
import p.n43;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.String;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.List;
import p.j11;

public final class o43 implements q43	// class@0020a8 from classes.dex
{
    public final IBinder a;

    public void o43(IBinder p0){
       super();
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final boolean g(n43 p0,Uri p1,Bundle p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
       parcel.writeStrongInterface(p0);
       int i = 1;
       parcel.writeInt(i);
       p1.writeToParcel(parcel, 0);
       parcel.writeInt(i);
       p2.writeToParcel(parcel, 0);
       parcel.writeTypedList(null);
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       if (parcel1.readInt()) {
       }else {
          i = false;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public final boolean k(j11 p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
       parcel.writeStrongInterface(p0);
       int i = 0;
       this.a.transact(3, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public final boolean n(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
       parcel.writeLong(0);
       int i = 0;
       this.a.transact(2, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
}
