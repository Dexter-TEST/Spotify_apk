package p.zx5;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import android.os.IBinder;
import p.xx5;
import java.lang.String;
import android.os.IInterface;
import p.l53;
import p.k53;
import android.os.Bundle;

public class zx5 implements Parcelable	// class@002f86 from classes.dex
{
    public l53 a;
    public static final Parcelable$Creator CREATOR;

    static {
       zx5.CREATOR = new g44(4);
    }
    public void zx5(Parcel p0){
       IBinder iBinder;
       l53 ol53;
       IInterface iInterface;
       super();
       if ((iBinder = p0.readStrongBinder()) == null) {
          ol53 = null;
       }else if((iInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver")) != null && iInterface instanceof l53){
          ol53 = iInterface;
       }else {
          ol53 = new k53(iBinder);
       }
       this.a = ol53;
       return;
    }
    public void a(int p0,Bundle p1){
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       _monitor_enter(this);
       if (this.a == null) {
          this.a = new xx5(this);
       }
       p0.writeStrongBinder(this.a.asBinder());
       _monitor_exit(this);
       return;
    }
}
