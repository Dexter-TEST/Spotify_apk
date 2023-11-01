package p.tu7;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.String;
import java.lang.Object;
import android.os.Parcel;

public abstract class tu7 implements IInterface	// class@0027e7 from classes.dex
{
    public final IBinder a;
    public final String b;

    public void tu7(IBinder p0,String p1,int p2){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final Parcel g(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken(this.b);
       return parcel;
    }
    public final void k(Parcel p0,int p1){
       Parcel parcel = Parcel.obtain();
       this.a.transact(p1, p0, parcel, 0);
       parcel.readException();
       p0.recycle();
       parcel.recycle();
    }
    public final Parcel n(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken(this.b);
       return parcel;
    }
    public final void y(Parcel p0,int p1){
       this.a.transact(p1, p0, null, 1);
       p0.recycle();
    }
}
