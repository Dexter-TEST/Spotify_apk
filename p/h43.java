package p.h43;
import p.i43;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.Object;
import android.accounts.Account;
import android.os.Parcel;
import java.lang.String;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.py7;

public final class h43 implements i43, IInterface	// class@0017db from classes.dex
{
    public final IBinder a;

    public void h43(IBinder p0){
       super();
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final Account g(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
       Parcel parcel1 = Parcel.obtain();
       try{
          this.a.transact(2, parcel, parcel1, 0);
          parcel1.readException();
          parcel.recycle();
          parcel1.recycle();
          return py7.a(parcel1, Account.CREATOR);
       }catch(java.lang.RuntimeException e2){
          parcel1.recycle();
          throw e2;
       }
    }
}
