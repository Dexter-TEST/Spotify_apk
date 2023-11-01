package p.r43;
import p.t43;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.Object;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.String;
import p.bt7;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class r43 implements t43, IInterface	// class@002473 from classes.dex
{
    public final IBinder a;

    public void r43(IBinder p0){
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final Bundle g(Bundle p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
       int i = 1;
       parcel.writeInt(i);
       p0.writeToParcel(parcel, 0);
       Parcel parcel1 = Parcel.obtain();
       try{
          this.a.transact(i, parcel, parcel1, 0);
          parcel1.readException();
          parcel.recycle();
          Parcelable$Creator cREATOR = Bundle.CREATOR;
          Bundle uBundle = (!parcel1.readInt())? null: cREATOR.createFromParcel(parcel1);
          parcel1.recycle();
          return uBundle;
       }catch(java.lang.RuntimeException e1){
          parcel1.recycle();
          throw e1;
       }
    }
}
