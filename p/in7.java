package p.in7;
import p.ap0;
import java.lang.Object;
import p.xn5;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.BlockingQueue;
import java.util.Queue;
import p.ws;
import com.spotify.signup.signup.view.EmailView;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import android.widget.TextView;
import java.lang.Class;
import p.qi1;
import p.ri1;
import p.pi1;
import p.i40;
import p.yi1;
import p.pp;
import p.vi1;
import p.nh6;
import p.b;
import com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.Locale;
import android.view.View;
import java.util.List;
import p.sp6;
import p.co5;
import android.content.Context;
import p.lp6;
import android.content.res.Resources;
import p.n6;
import android.graphics.drawable.Drawable;
import p.v27;
import p.g;
import com.spotify.litesignup.phonesignup.view.OneTimePassView;
import p.na5;
import java.lang.StringBuilder;
import p.jl;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import java.lang.Integer;
import p.nd5;
import io.reactivex.rxjava3.core.ObservableEmitter;
import p.j;
import com.spotify.lite.welcome.WelcomeActivity;
import p.dr6;
import p.p25;
import android.widget.Button;
import p.hu;
import com.spotify.signup.signup.view.PasswordView;
import p.f85;
import p.g85;
import p.e85;
import p.w40;
import p.m85;
import p.k85;
import android.text.TextWatcher;
import android.view.View$OnFocusChangeListener;
import com.spotify.signup.signup.SignupActivity;
import p.k10;
import p.o17;
import p.ay6;
import p.i17;
import java.util.Collection;
import io.reactivex.rxjava3.disposables.Disposable;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.gb0;

public final class in7 implements ap0	// class@0019cd from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void in7(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public void in7(xn5 p0){
       this.a = 5;
       this.c = p0;
       super();
       this.b = new LinkedBlockingQueue();
    }
    public void in7(xn5 p0,int p1){
       this.a = 5;
       super(p0);
    }
    public final void a(){
       ap0 uoap0;
       Object obj;
       in7 tc = this.c;
       if ((uoap0 = tc.b.get()) == tc.a) {
          return;
       }
       while ((obj = this.b.poll()) != null) {
          uoap0.accept(obj);
       }
       return;
    }
    public final void accept(Object p0){
       int i4;
       g c1;
       na5 d;
       g v;
       PhoneNumberView w;
       ws b4;
       in7 oin7 = this;
       j oj = p0;
       int i = 3;
       CharSequence uCharSequenc = null;
       in7 b = oin7.b;
       int i1 = 2;
       in7 c = oin7.c;
       int i2 = 0;
       int i3 = 1;
       switch (oin7.a){
           case 0:
             c.getClass();
             oj = oj.a;
             oj.getClass();
             i4 = oj instanceof dr6 ^ i3;
             c.Z.c.setEnabled(i4);
             c.Z.b.setEnabled(i4);
             return;
           case 1:
             c.onNext(oj);
             return;
           case 2:
             b.accept(oj);
             return;
           case 3:
             c.getClass();
             if ((c1 = oj.c) != null) {
                if ((d = c1.d) == null) {
                   jl.d("Invalid code length, \""+oj+'"');
                }else {
                   c.a.setNumDigits(d);
                   boolean b1 = ((v = oj.v) != null && v.equals(oj.a))? true: false;
                   c.a.setOtpMismatch(b1);
                   OneTimePassView c2 = c.c;
                   if (b1) {
                      uCharSequenc = c.getResources().getString(R.string.otp_mismatch);
                   }
                   c2.setText(uCharSequenc);
                   Object[] objArray = new Object[i1];
                   objArray[i2] = Integer.valueOf(d);
                   objArray[i3] = c1.b;
                   c.t.setText(c.getResources().getQuantityString(R.plurals.otp_description, d, objArray));
                   OneTimePassView c3 = c.c;
                   int i5 = (b1)? 0: 8;
                   c3.setVisibility(i5);
                   c3 = c.t;
                   if (b1) {
                      i2 = 8;
                   }
                   c3.setVisibility(i2);
                   c.b.setEnabled(oj.b());
                }
             }
             return;
             break;
           case 4:
             c.getClass();
             b b2 = oj.b;
             PhoneNumberView b3 = c.b;
             CharSequence uCharSequenc1 = (b2 == null)? uCharSequenc: b2.getCallingCode();
             b3.setText(uCharSequenc1);
             b3 = c.a;
             CharSequence uCharSequenc2 = (b2 == null)? uCharSequenc: new Locale("", b2.getCountryCode()).getDisplayCountry();
             b3.setText(uCharSequenc2);
             c.t.setEnabled(oj.b());
             i4 = oj.c.size();
             if ((w = c.w) == null && i4 > i3) {
                w = c.a;
                co5.o(w, "view");
                Context context = w.getContext();
                co5.l(context, "view.context");
                lp6 olp6 = new lp6(context, sp6.G, context.getResources().getDimension(R.dimen.text_view_icon_size));
                olp6.b(n6.b(context, R.color.white));
                v27.g(w, uCharSequenc, uCharSequenc, olp6, uCharSequenc);
             }else if(w > i3 && i4 < i1){
                v27.g(c.a, uCharSequenc, uCharSequenc, uCharSequenc, uCharSequenc);
             }
             c.w = i4;
             return;
             break;
           case 5:
             b.add(oj);
             this.a();
             return;
           case 6:
             b.accept(oj);
             return;
           case 7:
             if (TextUtils.isEmpty(c.a.getText()) && !oj.a.isEmpty()) {
                c.a.setText(oj.a);
             }
             w = (oj.c == null && !oj.a.isEmpty())? 1: 0;
             b4 = oj.b;
             b4.getClass();
             if (b4 instanceof qi1 && (!w || (b4 instanceof ri1 && b4.a == null))) {
                b4 = new pi1();
             }
             ws ows = b4;
             new i40(i3).a = ows;
             if (ows != c.v) {
                c.v = ows;
                ows.a(new yi1(c, i2), new yi1(c, i3), new pp(13), new yi1(c, i1), new pp(14), new yi1(c, i));
             }
             return;
             break;
           default:
             hu b5 = oj.b;
             if (oj.c != null || oj.a.isEmpty()) {
                b5.getClass();
                if (!b5 instanceof f85) {
                   b4 = 0;
                label_0200 :
                   b5.getClass();
                   if (b5 instanceof g85 && (!b4 || (b5 instanceof f85 && b5.a == null))) {
                      b5 = new e85();
                   }
                   hu ohu = b5;
                   new w40().a = ohu;
                   c.getClass();
                   if (ohu != c.v) {
                      c.v = ohu;
                      ohu.a(new m85(c, i2), new m85(c, i3), new pp(15), new m85(c, i1), new pp(16), new m85(c, i));
                   }
                   return;
                }
             }
             b4 = 1;
             goto label_0200 ;
       }
    }
    public final void dispose(){
       j10 oj10 = null;
       in7 tc = this.c;
       in7 tb = this.b;
       switch (this.a){
           case 0:
             tb.dispose();
             return;
           case 1:
             tb.dispose();
             return;
           case 2:
             tc.d0.J = oj10;
             tc.c0.M = oj10;
             PhoneNumberSignupActivity e0 = tc.e0;
             e0.getClass();
             e0.d = o17.e.getValue();
             tb.dispose();
             tc.C();
             return;
           case 3:
             tb.dispose();
             return;
           case 4:
             tb.dispose();
             return;
           case 5:
             tb.clear();
             return;
           case 6:
             tc.U.J = oj10;
             SignupActivity v = tc.V;
             v.getClass();
             v.d = o17.e.getValue();
             tb.dispose();
             return;
           case 7:
             tc.a.removeTextChangedListener(tb);
             tc.a.setOnFocusChangeListener(oj10);
             return;
           default:
             tc.a.removeTextChangedListener(tb);
             tc.a.setOnFocusChangeListener(oj10);
             return;
       }
    }
}
