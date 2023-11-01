package p.bv7;
import p.xu7;
import java.lang.String;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.zu7;
import java.lang.UnsupportedOperationException;
import p.ev7;
import p.fv7;
import p.cv7;
import com.google.android.gms.auth.api.credentials.Credential;
import p.wx5;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.jv7;

public abstract class bv7 extends xu7	// class@001145 from classes.dex
{

    public void bv7(){
       super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks", 0);
    }
    public final boolean g(int p0,Parcel p1,Parcel p2){
       Status status;
       int i = 1;
       if (p0 != i) {
          if (p0 != 2) {
             if (p0 != 3) {
                i = false;
             label_0073 :
                return i;
             }else {
                status = zu7.a(p1, Status.CREATOR);
                p1.readString();
                throw new UnsupportedOperationException();
             }
          }else {
             status = zu7.a(p1, Status.CREATOR);
             ev7 uoev7 = this;
             uoev7 = uoev7.c;
             switch (uoev7.b){
                 case 0:
                   uoev7.G(new cv7(status, null));
                   break;
                 default:
                   switch (uoev7.w){
                       case 0:
                         uoev7.G(status);
                         break;
                       default:
                         uoev7.G(status);
                   }
             }
          }
       }else {
          status = zu7.a(p1, Status.CREATOR);
          Credential uCredential = zu7.a(p1, Credential.CREATOR);
          ev7 uoev71 = this;
          switch (uoev71.b){
              case 0:
                break;
              default:
                throw new UnsupportedOperationException();
          }
          uoev71.c.G(new cv7(status, uCredential));
       }
       p2.writeNoException();
       goto label_0073 ;
    }
}
