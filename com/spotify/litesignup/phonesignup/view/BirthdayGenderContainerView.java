package com.spotify.litesignup.phonesignup.view.BirthdayGenderContainerView;
import p.xo0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p.c02;
import android.animation.Animator$AnimatorListener;
import p.hr0;
import p.ap0;
import p.q10;
import com.spotify.signup.signup.view.BirthdayView;
import com.spotify.signup.signup.view.GenderView;
import p.kz6;
import p.ry7;
import p.ab0;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.gn7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.r10;
import java.lang.Object;
import p.wh7;
import android.widget.Button;

public class BirthdayGenderContainerView extends LinearLayout implements xo0	// class@00096c from classes.dex
{
    public BirthdayView a;
    public GenderView b;
    public Button c;
    public int t;
    public View v;
    public static final int w;

    public void BirthdayGenderContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.t = -1;
    }
    public static void a(View p0,boolean p1,boolean p2){
       float f2;
       float f = 0xbf800000;
       float f1 = 0x3f800000;
       if (p1) {
          if (!p2) {
             f = 0x3f800000;
          }
          f2 = 0;
       }else if(p2){
          f = 0x3f800000;
       }
       f2 = f;
       f = 0;
       p0.setTranslationX(((float)p0.getWidth() * f));
       f = (p1)? 0: 0x3f800000;
       p0.setAlpha(f);
       ViewPropertyAnimator viewProperty = p0.animate().translationX(((float)p0.getWidth() * f2));
       if (!p1) {
          f1 = 0;
       }
       viewProperty.alpha(f1).setDuration(500).setListener(new c02(1, p0, p1)).start();
       return;
    }
    public final ap0 d(hr0 p0){
       r10 p0 = new r10(this, this.a.d(new q10(p0, 0)), this.b.d(new q10(p0, 1)), ry7.e(this.c).map(new ab0(23)).subscribe(new gn7(p0, 2)), 0);
       return p0;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       this.a = wh7.m(this, R.id.birthday);
       this.b = wh7.m(this, R.id.gender);
       this.c = wh7.m(this, R.id.birthday_gender_done_button);
       BirthdayGenderContainerView ta = this.a;
       this.v = ta;
       ta.setVisibility(0);
    }
}
