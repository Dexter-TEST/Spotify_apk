package p.uc5;
import p.b5;
import p.hd5;
import java.lang.Object;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import java.lang.String;
import android.content.Context;
import p.vl2;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.ua5;
import p.kf6;
import java.lang.Class;
import p.z45;
import p.a70;
import p.co5;
import java.lang.Runnable;
import p.i77;
import p.rv;
import p.ym6;
import java.lang.NullPointerException;
import android.content.res.Resources;
import java.lang.Integer;
import p.ta5;
import p.hl2;
import p.hc5;
import p.an5;
import p.m01;
import p.o01;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.content.Intent;
import androidx.activity.a;
import java.lang.Throwable;
import p.jl;
import android.app.Activity;

public final class uc5 implements b5	// class@002885 from classes.dex
{
    public final int a;
    public final hd5 b;

    public void uc5(hd5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       PhoneNumberSignupActivity phoneNumberS;
       z45 b1;
       String str1;
       String str2;
       tj2 otj2;
       kf6 okf6;
       PhoneNumberSignupActivity phoneNumberS1;
       String str3;
       String str4;
       String str5;
       uc5 ouc5 = this;
       String str = "context.getString\(R.string.error_dialog_button_ok\)";
       int i = 0x7f120153;
       int i1 = 2;
       int i2 = 0x7f120102;
       int i3 = 0x7f120104;
       int i4 = 1;
       int i5 = 0;
       uc5 b = ouc5.b;
       switch (ouc5.a){
           case 0:
             b.C();
             phoneNumberS = b.f0;
             phoneNumberS.getClass();
             b1 = phoneNumberS.b;
             str1 = b1.a.getString(R.string.error_dialog_title_invalid_phone_number);
             co5.l(str1, "context.getString\(R.stri…tle_invalid_phone_number\)");
             str2 = b1.a.getString(R.string.error_dialog_body_invalid_phone_number);
             co5.l(str2, "context.getString\(R.stri…ody_invalid_phone_number\)");
             b.h0 = phoneNumberS.a(str1, str2, b1.a(), PhoneNumberSignupActivity.i0);
             return;
           case 1:
             uc5 ouc51 = b;
             ouc51.getClass();
             PhoneNumberSignupActivity y = ouc51.Y;
             if (hl2.c.d(ouc51)) {
                y.onNext(new hc5());
             }else {
                m01 om01 = new m01(ouc51, o01.t);
                boolean b2 = false;
                try{
                   int i6 = 1;
                   CredentialPickerConfig v12 = new CredentialPickerConfig(2, i6, b2, i6, false);
                   String[] stringArray = new String[i5];
                   HintRequest v3 = new HintRequest(2, v12, false, true, stringArray, false, null, null);
                   ouc51.startIntentSenderForResult(om01.e(v3).getIntentSender(), 1234, null, 0, 0, 0);
                }catch(android.content.IntentSender$SendIntentException e0){
                   jl.f("Error requesting hint", e0);
                   y.onNext(new hc5());
                }
             }
             return;
             break;
           case 2:
             b.C();
             otj2 = xe7.k0(b.b0.a, b.getString(i3), "");
             otj2.b = b.getString(i2);
             otj2.d = new ua5(b, i5);
             okf6 = otj2.a();
             b.h0 = okf6;
             okf6.l();
             return;
           case 3:
             b.C();
             phoneNumberS = b.f0;
             phoneNumberS.getClass();
             b1 = phoneNumberS.b;
             str1 = b1.a.getString(R.string.error_dialog_title_timeout);
             co5.l(str1, "context.getString\(R.stri…ror_dialog_title_timeout\)");
             str2 = b1.a.getString(R.string.error_dialog_body_timeout);
             co5.l(str2, "context.getString\(R.stri…rror_dialog_body_timeout\)");
             b.h0 = phoneNumberS.a(str1, str2, b1.a(), new ta5(b, i5));
             return;
           case 4:
             b.C();
             phoneNumberS1 = b.f0;
             phoneNumberS1.getClass();
             z45 b3 = phoneNumberS1.b;
             str3 = b3.a.getString(R.string.error_dialog_title_try_again_later);
             co5.l(str3, "context.getString\(R.stri…og_title_try_again_later\)");
             a70 a = b3.a;
             str4 = a.getString(R.string.error_dialog_body_try_again_later);
             co5.l(str4, "context.getString\(R.stri…log_body_try_again_later\)");
             str5 = a.getString(i);
             co5.l(str5, str);
             b.h0 = phoneNumberS1.a(str3, str4, str5, new ta5(b, i1));
             return;
           case 5:
             b.C();
             phoneNumberS = b.f0;
             phoneNumberS.getClass();
             b1 = phoneNumberS.b;
             str1 = b1.a.getString(R.string.error_dialog_title_too_many_tries);
             co5.l(str1, "context.getString\(R.stri…log_title_too_many_tries\)");
             str2 = b1.a.getString(R.string.error_dialog_body_too_many_tries);
             co5.l(str2, "context.getString\(R.stri…alog_body_too_many_tries\)");
             b.h0 = phoneNumberS.a(str1, str2, b1.a(), PhoneNumberSignupActivity.i0);
             return;
           case 6:
             b.C();
             phoneNumberS = b.f0;
             phoneNumberS.getClass();
             b1 = phoneNumberS.b;
             str1 = b1.a.getString(R.string.error_dialog_title_generic_error);
             co5.l(str1, "context.getString\(R.stri…alog_title_generic_error\)");
             str2 = b1.a.getString(R.string.error_dialog_body_generic_error);
             co5.l(str2, "context.getString\(R.stri…ialog_body_generic_error\)");
             b.h0 = phoneNumberS.a(str1, str2, b1.a(), new ta5(b, i4));
             return;
           case 7:
             b.C();
             phoneNumberS1 = b.f0;
             phoneNumberS1.getClass();
             z45 b4 = phoneNumberS1.b;
             Object[] objArray = new Object[i4];
             objArray[i5] = Integer.valueOf(30);
             str3 = b4.a.getResources().getQuantityString(R.plurals.error_dialog_title_resend_limit, 30, objArray);
             co5.l(str3, "context.resources\n      …imitSeconds\n            \)");
             a70 a1 = b4.a;
             Object[] objArray1 = new Object[i4];
             objArray1[i5] = Integer.valueOf(30);
             str4 = a1.getResources().getQuantityString(R.plurals.error_dialog_body_resend_limit, 30, objArray1);
             co5.l(str4, "context.resources\n      …imitSeconds\n            \)");
             str5 = a1.getString(i);
             co5.l(str5, str);
             b.h0 = phoneNumberS1.a(str3, str4, str5, PhoneNumberSignupActivity.i0);
             return;
           case 8:
             phoneNumberS = b.T;
             str5 = b.getString(R.string.otp_code_resend_success);
             i77 oi77 = new i77(10);
             if (str5 == null) {
                throw new NullPointerException("Null infoText");
             }
             oi77.a = str5;
             phoneNumberS.c(oi77.l());
             return;
             break;
           case 9:
             b.C();
             phoneNumberS = b.f0;
             phoneNumberS.getClass();
             b1 = phoneNumberS.b;
             str1 = b1.a.getString(R.string.error_dialog_title_no_internet_connection);
             co5.l(str1, "context.getString\(R.stri…e_no_internet_connection\)");
             str2 = b1.a.getString(R.string.error_dialog_body_no_internet_connection);
             co5.l(str2, "context.getString\(R.stri…y_no_internet_connection\)");
             b.h0 = phoneNumberS.a(str1, str2, b1.a(), PhoneNumberSignupActivity.i0);
             return;
           case 10:
             b.C();
             otj2 = xe7.k0(b.b0.a, b.getString(i3), b.getString(R.string.create_account_dialog_body));
             otj2.a = b.getString(R.string.create_account_dialog_positive_button);
             otj2.c = new ua5(b, i4);
             otj2.b = b.getString(i2);
             otj2.d = new ua5(b, i1);
             okf6 = otj2.a();
             b.h0 = okf6;
             okf6.l();
             return;
           default:
             b.setResult(i5);
             b.finish();
             return;
       }
    }
}
