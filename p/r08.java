package p.r08;
import p.l07;
import p.bl2;
import p.m07;
import p.j08;
import android.os.IInterface;
import p.xz7;
import p.u08;
import android.os.Parcel;
import java.lang.String;
import p.rx7;
import android.os.IBinder;

public final class r08 extends l07	// class@002452 from classes.dex
{
    public m07 d;

    public void r08(){
       super();
    }
    public final void a(bl2 p0,m07 p1){
       this.d = p1;
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
       parcel.writeStrongBinder(new u08(this));
       Parcel parcel1 = Parcel.obtain();
       p0.i().a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel.recycle();
       parcel1.recycle();
    }
}
