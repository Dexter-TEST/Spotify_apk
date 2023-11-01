package p.f08;
import android.os.IInterface;
import android.os.Binder;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p.rx7;
import java.lang.Object;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.u08;
import p.r08;
import p.m07;
import p.a28;
import p.ve;
import java.lang.Exception;

public abstract class f08 extends Binder implements IInterface	// class@001535 from classes.dex
{

    public void f08(){
       super().attachInterface(super(), "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2,int p3){
       boolean b1;
       boolean b = false;
       if (p0 > 0xffffff) {
          b1 = super.onTransact(p0, p1, p2, p3);
       }else {
          p1.enforceInterface(this.getInterfaceDescriptor());
          b1 = false;
       }
       if (b1) {
          return true;
       }else if(p0 == 1){
          Parcelable$Creator cREATOR = Status.CREATOR;
          Status status = (!p1.readInt())? null: cREATOR.createFromParcel(p1);
          r08 d = this.a.d;
          if (status.b <= null) {
             b = 1;
          }
          if (b) {
             d.a.k(null);
          }else {
             d.a.j(new ve(status));
          }
          b = true;
       }
       return b;
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       return this.g(p0, p1, p2, p3);
    }
}
