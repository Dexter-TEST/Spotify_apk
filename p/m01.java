package p.m01;
import p.fl2;
import android.content.Context;
import p.o01;
import p.dt3;
import p.vo;
import p.ko1;
import p.re;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import com.google.android.gms.auth.api.credentials.HintRequest;
import android.app.PendingIntent;
import p.uo;
import java.lang.Object;
import java.lang.String;
import p.w51;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.vu7;
import java.util.Random;
import android.util.Base64;
import android.content.Intent;
import android.os.Parcel;
import p.wu7;

public final class m01 extends fl2	// class@001df9 from classes.dex
{

    public void m01(Context p0,o01 p1){
       super(p0, vo.a, p1, new dt3(16));
    }
    public void m01(PhoneNumberSignupActivity p0,o01 p1){
       super(p0, vo.a, p1, new dt3(16));
    }
    public final PendingIntent e(HintRequest p0){
       uo b = this.d.b;
       fl2 ta = this.a;
       w51.l(ta, "context must not be null");
       if (TextUtils.isEmpty(b)) {
          byte[] uobyteArray = new byte[16];
          vu7.a.nextBytes(uobyteArray);
          b = Base64.encodeToString(uobyteArray, 11);
       }else {
          w51.k(b);
       }
       Intent intent = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
       intent.putExtra("logSessionId", b);
       Parcel parcel = Parcel.obtain();
       p0.writeToParcel(parcel, 0);
       byte[] uobyteArray1 = parcel.marshall();
       parcel.recycle();
       intent.putExtra("com.google.android.gms.credentials.HintRequest", uobyteArray1);
       return PendingIntent.getActivity(ta, 2000, intent, (wu7.a | 0x8000000));
    }
}
