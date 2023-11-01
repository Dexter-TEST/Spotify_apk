package p.e7;
import p.c7;
import androidx.activity.a;
import java.lang.Object;
import android.content.Intent;
import p.lb3;
import java.lang.String;
import android.os.Bundle;
import p.kb3;
import android.content.IntentSender;
import android.os.Parcelable;
import androidx.fragment.app.o;
import p.co5;
import java.lang.Integer;
import com.spotify.lite.welcome.SelectLoginActivity;
import android.content.Context;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.xj0;
import p.b7;
import p.n6;
import java.lang.Boolean;
import p.y6;
import p.mo7;
import p.ko7;

public final class e7 extends c7	// class@001435 from classes.dex
{
    public final int a;

    public void e7(int p0){
       this.a = p0;
       super();
    }
    public final Intent a(a p0,Object p1){
       Intent intent;
       lb3 b;
       Bundle bundleExtra;
       int i2;
       int i = 0;
       int i1 = 1;
       switch (this.a){
           case 0:
           case 1:
             intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
             if ((b = p1.b) != null) {
                String str = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
                if ((bundleExtra = b.getBundleExtra(str)) != null) {
                   intent.putExtra(str, bundleExtra);
                   b.removeExtra(str);
                   if (b.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", i)) {
                      kb3 okb3 = new kb3(p1.a);
                      okb3.d = null;
                      okb3.b = p1.t;
                      okb3.a = p1.c;
                      p1 = okb3.d();
                   }
                }
             }
             intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", p1);
             if (o.I(2)) {
                intent.toString();
             }
             return intent;
             break;
           default:
             if ((i2 = p1.intValue()) != i1) {
                if (i2 == 4) {
                   intent = new Intent(p0, SelectLoginActivity.class).setPackage(p0.getPackageName());
                }else {
                   throw new IllegalStateException("Unexpected value: "+p1);
                }
             }else {
                intent = xj0.z0(p0, "spotify.intent.action.LOGIN");
             }
             return intent;
       }
       co5.o(p0, "context");
       co5.o(p1, "input");
       String[] stringArray = new String[i1];
       stringArray[i] = p1;
       intent = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray);
       co5.l(intent, "Intent\(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input\)");
       return intent;
    }
    public final b7 b(a p0,Object p1){
       b7 uob7 = null;
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, "context");
             return uob7;
       }
       co5.o(p0, "context");
       co5.o(p1, "input");
       int i = (!n6.a(p0, p1))? 1: 0;
       if (i) {
          uob7 = new b7(0, Boolean.TRUE);
       }
       return uob7;
    }
    public final Object c(Intent p0,int p1){
       Boolean fALSE;
       int[] intArrayExtr;
       mo7 omo7;
       int i = -1;
       boolean b = false;
       switch (this.a){
           case 0:
             if (p0 != null && p1 == i) {
                if ((intArrayExtr = p0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null) {
                   p1 = intArrayExtr.length;
                   int i1 = 0;
                   while (true) {
                      if (i1 < p1) {
                         i = (!intArrayExtr[i1])? 1: 0;
                         if (i) {
                            intArrayExtr = 1;
                         label_002f :
                            if (intArrayExtr == 1) {
                               b = true;
                            }
                         }else {
                            i1 = i1 + 1;
                         }
                      }else {
                         intArrayExtr = 0;
                         goto label_002f ;
                      }
                   }
                }
                fALSE = Boolean.valueOf(b);
             }else {
                fALSE = Boolean.FALSE;
             }
             return fALSE;
             break;
           case 1:
           default:
             if (p1 != i) {
                omo7 = null;
             }else if(p0 == null){
                p1 = 1;
             }else {
                p1 = p0.getIntExtra("SELECTED_METHOD", 1);
             }
             if (p0 != null && p0.getBooleanExtra("RESULT_FROM_SIGNUP", b)) {
                b = true;
             }
             if (b) {
                omo7 = new mo7(p1);
             }else {
                omo7 = new ko7(p1);
             }
             return omo7;
       }
       return new y6(p0, p1);
    }
}
