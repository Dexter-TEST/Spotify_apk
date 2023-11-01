package p.xx5;
import p.l53;
import android.os.Binder;
import p.zx5;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcelable$Creator;
import java.lang.Class;

public final class xx5 extends Binder implements l53	// class@002d09 from classes.dex
{
    public final zx5 a;
    public static final int b;

    public void xx5(zx5 p0){
       this.a = p0;
       super();
       this.attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 >= 1 && p0 <= 0xffffff) {
          p1.enforceInterface("android.support.v4.os.IResultReceiver");
       }
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p0 = p1.readInt();
             Parcelable$Creator cREATOR = Bundle.CREATOR;
             Bundle uBundle = (p1.readInt())? cREATOR.createFromParcel(p1): null;
             xx5 ta = this.a;
             ta.getClass();
             ta.a(p0, uBundle);
             return 1;
          }
       }else {
          p2.writeString("android.support.v4.os.IResultReceiver");
          return 1;
       }
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       return this.g(p0, p1, p2, p3);
    }
}
