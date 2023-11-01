package p.wt7;
import p.l07;
import p.k07;
import p.q12;
import p.bl2;
import p.m07;
import p.u44;
import p.gt7;
import p.lu7;
import android.os.IInterface;
import p.hu7;
import android.os.Parcel;
import p.tu7;
import java.lang.String;
import p.xt7;
import android.os.Parcelable;
import android.os.IBinder;
import java.lang.Object;
import p.a28;

public final class wt7 extends l07	// class@002ba5 from classes.dex
{
    public final k07 d;

    public void wt7(k07 p0,q12[] p1,boolean p2,int p3){
       this.d = p0;
       super(p1, p2, p3);
    }
    public final void a(bl2 p0,m07 p1){
       u44 b = this.d.d.b;
       hu7 ohu7 = p0.i();
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken(ohu7.b);
       if (b == null) {
          parcel.writeInt(0);
       }else {
          parcel.writeInt(1);
          b.writeToParcel(parcel, 0);
       }
       ohu7.a.transact(1, parcel, null, 1);
       parcel.recycle();
       p1.a.k(null);
       return;
    }
}
