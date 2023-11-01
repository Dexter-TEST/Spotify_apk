package p.dt7;
import android.os.IInterface;
import android.os.Binder;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import p.kt7;
import p.fu7;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.xt7;
import p.iu7;
import p.ut7;
import p.t5;
import java.lang.Object;
import java.lang.Runnable;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p.fp0;
import p.et7;

public abstract class dt7 extends Binder implements IInterface	// class@0013b5 from classes.dex
{

    public void dt7(){
       super();
       this.attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
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
       }else {
          Object obj = this;
          switch (p0){
              case 3:
                fp0 uofp0 = xt7.a(p1, fp0.CREATOR);
                xt7.a(p1, et7.CREATOR);
             label_0071 :
                p2.writeNoException();
                b = true;
                break;
              case 4:
                xt7.a(p1, Status.CREATOR);
                goto label_0071 ;
                break;
              case 6:
                xt7.a(p1, Status.CREATOR);
                goto label_0071 ;
                break;
              case 7:
                Status status = xt7.a(p1, Status.CREATOR);
                xt7.a(p1, GoogleSignInAccount.CREATOR);
                goto label_0071 ;
                break;
              case 8:
                obj.b.post(new t5(obj, 14, xt7.a(p1, iu7.CREATOR)));
                goto label_0071 ;
                break;
              case 9:
                xt7.a(p1, fu7.CREATOR);
                goto label_0071 ;
                break;
              default:
          }
          return b;
       }
    }
}
