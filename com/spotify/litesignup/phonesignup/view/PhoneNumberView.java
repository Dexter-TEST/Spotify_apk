package com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import p.bb0;
import p.xo0;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import p.xe7;
import p.hr0;
import p.ap0;
import p.gn7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.in7;
import java.lang.Object;
import android.view.View;
import p.wh7;
import android.widget.TextView;
import p.kz6;
import p.ry7;
import p.ab0;
import p.yf2;
import p.sd5;
import p.qj2;
import p.zf2;
import p.f37;
import p.ap5;
import java.lang.String;
import p.co5;
import p.k37;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import java.lang.CharSequence;

public class PhoneNumberView extends FrameLayout implements bb0, xo0	// class@000970 from classes.dex
{
    public TextView a;
    public TextView b;
    public EditText c;
    public View t;
    public Observable v;
    public int w;
    public static final int x;

    public void PhoneNumberView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public final void a(){
       PhoneNumberView tc;
       if ((tc = this.c) != null) {
          xe7.a0(tc);
       }
       return;
    }
    public final ap0 d(hr0 p0){
       return new in7(this, 4, this.v.subscribe(new gn7(p0, 4)));
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       View view = wh7.m(this, R.id.phone_number_root);
       view.setVisibility(0);
       this.a = wh7.m(view, R.id.calling_code_country);
       this.b = wh7.m(view, R.id.calling_code);
       this.c = wh7.m(view, R.id.phone_number);
       this.t = wh7.m(this, R.id.request_otp_button);
       Observable[] observableAr = new Observable[5];
       observableAr[0] = ry7.e(this.a).map(new ab0(28));
       observableAr[1] = ry7.e(this.b).map(new ab0(29));
       observableAr[2] = ry7.e(this.t).map(new sd5(0));
       observableAr[3] = ap5.m(this.c, new qj2(6)).map(new sd5(1));
       PhoneNumberView tc = this.c;
       co5.q(tc, "$this$textChanges");
       k37 ok37 = new k37(tc, 1);
       observableAr[4] = ok37.map(new sd5(2));
       this.v = Observable.merge(Arrays.asList(observableAr));
    }
    public void setPhoneNumber(String p0){
       PhoneNumberView tc;
       if ((tc = this.c) != null) {
          tc.setText(p0);
       }
       return;
    }
}
