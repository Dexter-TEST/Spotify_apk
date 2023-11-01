package p.ig0;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;
import p.g86;
import java.lang.Object;
import p.i86;
import p.eg0;
import p.fg0;
import android.widget.EditText;
import android.view.View;
import android.text.Editable;
import java.lang.CharSequence;
import android.content.res.Resources;
import p.k8;
import android.view.View$OnClickListener;
import java.util.AbstractCollection;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import p.hg0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import p.gg0;
import android.animation.Animator$AnimatorListener;

public final class ig0 extends im1	// class@001987 from classes.dex
{
    public final g86 e;
    public final i86 f;
    public final eg0 g;
    public final fg0 h;
    public AnimatorSet i;
    public ValueAnimator j;

    public void ig0(TextInputLayout p0,int p1){
       super(p0, p1);
       this.e = new g86(1, this);
       this.f = new i86(1, this);
       this.g = new eg0(this, 0);
       this.h = new fg0(this, 0);
    }
    public static boolean d(ig0 p0){
       EditText editText;
       boolean b = ((editText = p0.a.getEditText()) != null && (editText.hasFocus() && (!p0.c.hasFocus() || editText.getText().length() <= 0)))? true: false;
       return b;
    }
    public final void a(){
       im1 td;
       if ((td = this.d) == null) {
          td = 0x7f0705c7;
       }
       im1 ta = this.a;
       ta.setEndIconDrawable(td);
       ta.setEndIconContentDescription(ta.getResources().getText(R.string.clear_text_end_icon_content_description));
       ta.setEndIconOnClickListener(new k8(4, this));
       ig0 tg = this.g;
       ta.w0.add(tg);
       if (ta.v != null) {
          tg.a(ta);
       }
       ta.A0.add(this.h);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f4ccccd,0x3f800000});
       valueAnimato.setInterpolator(je.d);
       valueAnimato.setDuration(150);
       valueAnimato.addUpdateListener(new hg0(this, 1));
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       LinearInterpolator a = je.a;
       valueAnimato1.setInterpolator(a);
       valueAnimato1.setDuration(100);
       valueAnimato1.addUpdateListener(new hg0(this, 0));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.i = uAnimatorSet;
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
       uAnimatorSet.playTogether(uAnimatorArr);
       this.i.addListener(new gg0(this, 0));
       ValueAnimator valueAnimato2 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       valueAnimato2.setInterpolator(a);
       valueAnimato2.setDuration(100);
       valueAnimato2.addUpdateListener(new hg0(this, 0));
       this.j = valueAnimato2;
       valueAnimato2.addListener(new gg0(this, 1));
       return;
    }
    public final void c(boolean p0){
       if (this.a.getSuffixText() == null) {
          return;
       }
       this.e(p0);
       return;
    }
    public final void e(boolean p0){
       int i = (this.a.g() == p0)? 1: 0;
       if (p0 && !this.i.isRunning()) {
          this.j.cancel();
          this.i.start();
          if (i) {
             this.i.end();
          }
       }else if(!p0){
          this.i.cancel();
          this.j.start();
          if (i) {
             this.j.end();
          }
       }
       return;
    }
}
