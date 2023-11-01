package p.m43;
import p.n43;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import java.lang.Object;
import p.do5;
import android.net.Uri;

public abstract class m43 extends Binder implements n43	// class@001e21 from classes.dex
{

    public void m43(){
       super();
       this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 >= 1 && p0 <= 0xffffff) {
          p1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
       }
       if (p0 != 0x5f4e5446) {
          switch (p0){
              case 2:
                p1.readInt();
                do5.a(p1, Bundle.CREATOR);
                break;
              case 3:
                p1.readString();
                do5.a(p1, Bundle.CREATOR);
                break;
              case 4:
                do5.a(p1, Bundle.CREATOR);
                p2.writeNoException();
                break;
              case 5:
                p1.readString();
                do5.a(p1, Bundle.CREATOR);
                p2.writeNoException();
                break;
              case 6:
                p1.readInt();
                Uri uri = do5.a(p1, Uri.CREATOR);
                p1.readInt();
                do5.a(p1, Bundle.CREATOR);
                break;
              case 7:
                p1.readString();
                Bundle uBundle = do5.a(p1, Bundle.CREATOR);
                p2.writeNoException();
                p2.writeInt(0);
                break;
              case 8:
                p1.readInt();
                p1.readInt();
                do5.a(p1, Bundle.CREATOR);
                break;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
          return 1;
       }else {
          p2.writeString("android.support.customtabs.ICustomTabsCallback");
          return 1;
       }
    }
}
