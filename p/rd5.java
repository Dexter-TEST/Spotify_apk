package p.rd5;
import p.xo0;
import p.bb0;
import p.t35;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import com.spotify.litesignup.phonesignup.view.OneTimePassView;
import com.spotify.litesignup.phonesignup.view.BirthdayGenderContainerView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import android.view.ViewPropertyAnimator;
import p.c02;
import android.animation.Animator$AnimatorListener;
import p.hr0;
import p.ap0;
import p.qd5;
import android.view.View$OnClickListener;
import p.q10;
import p.r10;
import android.content.res.Resources;
import java.lang.CharSequence;
import java.lang.String;

public final class rd5 implements xo0, bb0, t35	// class@0024c7 from classes.dex
{
    public final PhoneNumberView a;
    public final OneTimePassView b;
    public final BirthdayGenderContainerView c;
    public final GlueToolbar t;
    public final View v;
    public final View w;
    public int x;
    public View y;

    public void rd5(LayoutInflater p0,ViewGroup p1){
       super();
       this.x = -1;
       View view = p0.inflate(R.layout.phone_number_signup, p1, true);
       PhoneNumberView phoneNumberV = view.findViewById(R.id.phone_number_view);
       this.a = phoneNumberV;
       this.b = view.findViewById(R.id.one_time_pass_view);
       this.c = view.findViewById(R.id.birthday_gender_container_view);
       this.w = view.findViewById(R.id.progress_bar);
       GlueToolbarLayout glueToolbarL = view.findViewById(R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       this.t = glueToolbar;
       View view1 = p0.inflate(R.layout.up_button, glueToolbarL, false);
       this.v = view1;
       glueToolbar.addView(ToolbarSide.START, view1, R.id.action_close);
       this.y = phoneNumberV;
       phoneNumberV.setVisibility(false);
       this.f(false);
    }
    public static void e(View p0,boolean p1,boolean p2){
       float f2;
       if (p0 == null) {
          return;
       }
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
       viewProperty.alpha(f1).setDuration(500).setListener(new c02(2, p0, p1)).start();
       return;
    }
    public final void a(){
       this.a.a();
    }
    public final void b(){
       this.b.b();
    }
    public final void c(){
       this.b.c();
    }
    public final ap0 d(hr0 p0){
       r10 p0;
       this.v.setOnClickListener(new qd5(p0, 0));
       p0 = new r10(this, this.a.d(new q10(p0, 2)), this.b.d(new q10(p0, 3)), this.c.d(p0), 1);
       return p0;
    }
    public final void f(boolean p0){
       rd5 tt = this.t;
       Resources resources = tt.getView().getResources();
       if (p0) {
          tt.setTitle(resources.getText(R.string.phone_number_signup_login_title));
       }else {
          tt.setTitle(resources.getText(R.string.signup_create_account_title));
       }
       return;
    }
    public final void setOneTimePass(String p0){
       this.b.setOneTimePass(p0);
    }
    public final void setPhoneNumber(String p0){
       this.a.setPhoneNumber(p0);
    }
}
