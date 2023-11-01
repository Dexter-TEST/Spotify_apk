package p.uu7;
import p.xu7;
import java.lang.String;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.zu7;
import p.gv7;
import p.hv7;
import p.wx5;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.UnsupportedOperationException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public abstract class uu7 extends xu7	// class@002925 from classes.dex
{

    public void uu7(){
       super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
    }
    public final boolean g(int p0,Parcel p1,Parcel p2){
       Status status;
       gv7 ogv7;
       boolean b;
       switch (p0){
           case 'e':
             GoogleSignInAccount googleSignIn = zu7.a(p1, GoogleSignInAccount.CREATOR);
             status = zu7.a(p1, Status.CREATOR);
             throw new UnsupportedOperationException();
           case 'f':
             status = zu7.a(p1, Status.CREATOR);
             ogv7 = this;
             switch (ogv7.b){
                 case 0:
                   break;
                 default:
                   throw new UnsupportedOperationException();
             }
             ogv7.c.G(status);
          label_003c :
             p2.writeNoException();
             b = true;
          label_005d :
             return b;
             break;
           case 'g':
             status = zu7.a(p1, Status.CREATOR);
             ogv7 = this;
             switch (ogv7.b){
                 case 1:
                   break;
                 default:
                   throw new UnsupportedOperationException();
             }
             ogv7.c.G(status);
             goto label_003c ;
             break;
           default:
             b = false;
             goto label_005d ;
       }
    }
}
