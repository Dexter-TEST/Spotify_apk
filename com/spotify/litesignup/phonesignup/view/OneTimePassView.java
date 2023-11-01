package com.spotify.litesignup.phonesignup.view.OneTimePassView;
import p.xo0;
import p.t35;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import java.lang.String;
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
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;
import p.kz6;
import p.ry7;
import p.ab0;
import p.yf2;
import p.vc5;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import android.os.Parcelable;
import p.w35;
import android.view.AbsSavedState;
import java.lang.Class;
import p.co5;
import android.os.BaseBundle;
import android.os.Bundle;

public class OneTimePassView extends FrameLayout implements xo0, t35	// class@00096e from classes.dex
{
    public OtpInputView a;
    public View b;
    public TextView c;
    public TextView t;
    public Observable v;
    public static final int w;

    public void OneTimePassView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public final void b(){
       OneTimePassView ta;
       if ((ta = this.a) != null) {
          OtpInputView y = ta.y;
          for (int i = 0; i < y; i = i + 1) {
             ta.e(i, " ");
          }
          ta.a(-1);
          this.a.b();
       }
       return;
    }
    public final void c(){
       OneTimePassView ta;
       if ((ta = this.a) != null) {
          ta.b();
       }
       return;
    }
    public final ap0 d(hr0 p0){
       return new in7(this, 3, this.v.subscribe(new gn7(p0, 3)));
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       this.a = wh7.m(this, R.id.otp_input);
       this.b = wh7.m(this, R.id.validate_otp_button);
       this.c = wh7.m(this, R.id.otp_mismatch);
       this.t = wh7.m(this, R.id.otp_description);
       View view = wh7.m(this, R.id.resend_sms);
       View view1 = wh7.m(this, R.id.edit_phone_number);
       mj5 omj5 = oj5.a(view);
       View[] viewArray = new View[]{view};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       omj5 = oj5.a(view1);
       viewArray = new View[]{view1};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       Observable[] observableAr = new Observable[4];
       observableAr[0] = ry7.e(view).map(new ab0(24));
       kz6 okz6 = ry7.e(view1);
       observableAr[1] = okz6.map(new ab0(25));
       observableAr[2] = ry7.e(this.b).map(new ab0(26));
       observableAr[3] = this.a.getObservable().map(new vc5(3, this)).distinctUntilChanged().map(new ab0(27));
       this.v = Observable.merge(Arrays.asList(observableAr));
    }
    public final void onRestoreInstanceState(Parcelable p0){
       w35 a;
       super.onRestoreInstanceState(p0.getSuperState());
       if ((a = p0.a) != null) {
          OneTimePassView ta = this.a;
          ta.getClass();
          co5.o(a, "savedState");
          String str = "key-otp";
          if (a.containsKey(str)) {
             int intx = a.getInt("num-digits");
             String[] stringArray = a.getStringArray(str);
             ta.setNumDigits(intx);
             for (int i = 0; i < intx; i = i + 1) {
                object oobject = (stringArray != null)? stringArray[i]: null;
                ta.e(i, oobject);
             }
          }
       }
       return;
    }
    public final Parcelable onSaveInstanceState(){
       OtpInputView y;
       w35 ow35 = new w35(super.onSaveInstanceState());
       Bundle uBundle = new Bundle();
       ow35.a = uBundle;
       OneTimePassView ta = this.a;
       ta.getClass();
       if ((y = ta.y) <= null) {
       }else {
          String[] stringArray = new String[y];
          for (int i = 0; i < y; i = i + 1) {
             stringArray[i] = ta.c(i);
          }
          uBundle.putStringArray("key-otp", stringArray);
          uBundle.putInt("num-digits", ta.y);
       }
       return ow35;
    }
    public void setOneTimePass(String p0){
       OneTimePassView ta;
       if ((ta = this.a) != null) {
          ta.setOtp(p0);
          this.a.b();
       }
       return;
    }
}
