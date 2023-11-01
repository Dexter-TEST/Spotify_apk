package p.jg1;
import java.lang.Runnable;
import java.lang.Object;
import p.wz3;
import p.j83;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import p.km3;
import p.ti3;
import p.lu3;
import java.lang.Class;
import p.a3;
import p.i3;
import p.az5;
import p.yp;
import p.ml5;
import p.vl5;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import p.gv3;
import com.spotify.liteui.login.LoginActivity;
import p.hm6;
import p.eq2;
import android.os.Build$VERSION;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import android.app.PendingIntent;
import p.dl2;
import p.kb3;
import android.content.IntentSender;
import p.co5;
import p.lb3;
import p.h7;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.an5;
import p.jl;
import p.wn6;
import p.ut6;
import p.t00;
import p.bt6;
import java.lang.Boolean;
import p.s01;
import p.vo;
import p.fl2;
import p.w51;
import p.iv7;
import p.pt7;
import p.jv7;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.a28;
import p.oi;
import p.ng1;
import p.wd5;
import io.reactivex.rxjava3.disposables.Disposable;

public final class jg1 implements Runnable	// class@001acc from classes.dex
{
    public final int a;
    public final Object b;

    public void jg1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       hm6 a;
       hm6 a3;
       jg1 ojg1 = this;
       int i = 0;
       int i1 = 1;
       jg1 b = ojg1.b;
       switch (ojg1.a){
           case 0:
             try{
                b.getClass();
                b.G.d(b.K);
                return;
             }catch(java.util.NoSuchElementException e0){
             }
             break;
           case 1:
             if ((a = b.a) != null) {
                dl2 a1 = a.a;
                a1.getClass();
                vo.c.getClass();
                fl2 h = a1.h;
                w51.l(h, "client must not be null");
                iv7 oiv7 = new iv7(h);
                h.b.d(i1, oiv7);
                co5.l(oi.m(oiv7), "client.disableAutoSignIn\(\)");
             }
             return;
             break;
           case 2:
             b.t.onNext(Boolean.TRUE);
             return;
           case 3:
             b.x.onNext(new Object());
             return;
           case 4:
             b.f();
             return;
           case 5:
             LoginActivity r = b.R;
             eq2 a2 = eq2.a;
             hm6 f = r.f;
             if ((a3 = r.a) != null && Build$VERSION.SDK_INT < 34) {
                CredentialPickerConfig v14 = new CredentialPickerConfig(2, 1, false, true, false);
                String[] stringArray = new String[i];
                HintRequest hintRequest = v8;
                CredentialPickerConfig uCredentialP = v14;
                String[] stringArray1 = stringArray;
                try{
                   hintRequest = new HintRequest(2, uCredentialP, true, false, stringArray1, false, null, null);
                   IntentSender intentSender = a3.b(v8).getIntentSender();
                   co5.l(intentSender, "pendingIntent.intentSender");
                   r.j.a(new kb3(intentSender).d());
                }catch(android.content.IntentSender$SendIntentException e0){
                   jl.f("Could not start email picker Intent", e0);
                   f.onNext(a2);
                }catch(android.content.ActivityNotFoundException e0){
                   jl.f("Could not start email picker Intent", e0);
                   f.onNext(a2);
                }catch(java.lang.IllegalStateException e0){
                   Object[] objArray = new Object[i];
                   Logger.c(e0, "Could not start email picker Intent launcher is unregistered", objArray);
                   f.onNext(a2);
                }
             }else {
                f.onNext(a2);
             }
             return;
             break;
           case 6:
             lu3 olu3 = b.b.get();
             olu3.getClass();
             i3.f.F().c(null, i1);
             az5.U(null);
             vl5.d.G().a(null, i1);
             SharedPreferences$Editor uEditor = olu3.a.edit();
             uEditor.putBoolean("express_login_allowed", i);
             uEditor.apply();
             return;
           case 7:
             b.removeAllViews();
             return;
           case 8:
             ViewGroup$LayoutParams layoutParams = b.i.getLayoutParams();
             layoutParams.height = -2;
             b.i.setLayoutParams(layoutParams);
             return;
           case 9:
             b.f();
             return;
           default:
             b.dispose();
             return;
       }
    }
}
