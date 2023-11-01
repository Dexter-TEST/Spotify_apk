package p.uh6;
import p.xo0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import com.spotify.signup.signup.view.BirthdayView;
import com.spotify.signup.signup.view.GenderView;
import com.spotify.signup.signup.view.EmailView;
import com.spotify.signup.signup.view.PasswordView;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import p.c02;
import android.animation.Animator$AnimatorListener;
import p.hr0;
import p.ap0;
import p.qd5;
import android.view.View$OnClickListener;
import p.sh6;
import java.lang.Runnable;
import p.q10;
import p.th6;
import p.wy3;
import p.in7;

public final class uh6 implements xo0	// class@0028b0 from classes.dex
{
    public final BirthdayView a;
    public final GenderView b;
    public final EmailView c;
    public final PasswordView t;
    public final TextView v;
    public final View w;
    public int x;
    public View y;
    public final View z;

    public void uh6(LayoutInflater p0,ViewGroup p1){
       super();
       this.x = -1;
       View view = p0.inflate(R.layout.feature_signup, p1, true);
       BirthdayView uBirthdayVie = view.findViewById(R.id.birthday);
       this.a = uBirthdayVie;
       GenderView genderView = view.findViewById(R.id.gender);
       this.b = genderView;
       EmailView uEmailView = view.findViewById(R.id.email);
       this.c = uEmailView;
       this.t = view.findViewById(R.id.password);
       this.v = view.findViewById(R.id.sign_up_next_button);
       this.w = view.findViewById(R.id.progress_bar);
       this.z = view.findViewById(R.id.up_button);
       this.y = uEmailView;
       uBirthdayVie.setAlpha(0);
       genderView.setAlpha(0);
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
       viewProperty.alpha(f1).setDuration(500).setListener(new c02(3, p0, p1)).start();
       return;
    }
    public final ap0 d(hr0 p0){
       this.v.setOnClickListener(new qd5(p0, 4));
       uh6 tc = this.c;
       tc.setNextListener(new sh6(p0, 0));
       uh6 tt = this.t;
       tt.setNextListener(new sh6(p0, 1));
       ap0 uoap0 = tc.d(new q10(p0, 4));
       ap0 uoap01 = tt.d(new q10(p0, 5));
       th6 v9 = new th6(this, this.a.d(new q10(p0, 6)), this.b.d(new q10(p0, 7)), uoap0, uoap01);
       return v9;
    }
}
