package p.h93;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.EditText;
import p.ry7;
import p.wh7;
import p.eh7;
import android.animation.Animator;
import java.util.ArrayList;
import android.util.Property;
import android.animation.ObjectAnimator;
import p.je;
import android.animation.TimeInterpolator;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.gh7;
import android.animation.AnimatorSet;
import p.eb3;
import p.g93;
import android.animation.Animator$AnimatorListener;

public final class h93	// class@001807 from classes.dex
{
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public AppCompatTextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public void h93(TextInputLayout p0){
       super();
       Context context = p0.getContext();
       this.a = context;
       this.b = p0;
       Resources resources = context.getResources();
       this.g = (float)resources.getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }
    public final void a(TextView p0,int p1){
       int i = -2;
       if (this.c == null && this.e == null) {
          h93 ta = this.a;
          LinearLayout linearLayout = new LinearLayout(ta);
          this.c = linearLayout;
          linearLayout.setOrientation(0);
          h93 tb = this.b;
          tb.addView(this.c, -1, i);
          this.e = new FrameLayout(ta);
          this.c.addView(this.e, new LinearLayout$LayoutParams(0, i, 0x3f800000));
          if (tb.getEditText() != null) {
             this.b();
          }
       }
       p1 = (p1 && p1 != 1)? 0: 1;
       if (p1) {
          this.e.setVisibility(0);
          this.e.addView(p0);
       }else {
          this.c.addView(p0, new LinearLayout$LayoutParams(i, i));
       }
       this.c.setVisibility(0);
       this.d = this.d + 1;
       return;
    }
    public final void b(){
       h93 tb = this.b;
       int i = (this.c != null && tb.getEditText() != null)? 1: 0;
       if (i) {
          EditText editText = tb.getEditText();
          tb = this.a;
          boolean b = ry7.L(tb);
          h93 tc = this.c;
          int i1 = eh7.f(editText);
          if (b) {
             i1 = tb.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
          }
          int dimensionPix = tb.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
          if (b) {
             dimensionPix = tb.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
          }
          i = eh7.e(editText);
          if (b) {
             i = tb.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
          }
          eh7.k(tc, i1, dimensionPix, i, 0);
       }
       return;
    }
    public final void c(){
       h93 tf;
       if ((tf = this.f) != null) {
          tf.cancel();
       }
       return;
    }
    public final void d(ArrayList p0,boolean p1,TextView p2,int p3,int p4,int p5){
       if (p2 != null && (p1 && (p3 == p5 && p3 != p4))) {
          int i = 0;
          int i1 = (p5 == p3)? 1: 0;
          i1 = (i1)? 0x3f800000: 0;
          float[] uofloatArray = new float[]{i1};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p2, View.ALPHA, uofloatArray);
          objectAnimat.setDuration(167);
          objectAnimat.setInterpolator(je.a);
          p0.add(objectAnimat);
          if (p5 == p3) {
             float[] uofloatArray1 = new float[]{- this.g,0};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p2, View.TRANSLATION_Y, uofloatArray1);
             objectAnimat1.setDuration(217);
             objectAnimat1.setInterpolator(je.d);
             p0.add(objectAnimat1);
          }
       }
       return;
    }
    public final boolean e(){
       boolean b = true;
       if (this.i != b || (this.l == null || TextUtils.isEmpty(this.j))) {
          b = false;
       }
       return b;
    }
    public final TextView f(int p0){
       if (p0 == 1) {
          return this.l;
       }
       if (p0 != 2) {
          return null;
       }
       return this.r;
    }
    public final int g(){
       h93 tl;
       int currentTextC = ((tl = this.l) != null)? tl.getCurrentTextColor(): -1;
       return currentTextC;
    }
    public final void h(){
       CharSequence uCharSequenc = null;
       this.j = uCharSequenc;
       this.c();
       if (this.h == 1) {
          this.i = (this.q != null && !TextUtils.isEmpty(this.p))? 2: 0;
       }
       this.k(this.h, this.j(this.l, uCharSequenc), this.i);
       return;
    }
    public final void i(TextView p0,int p1){
       h93 tc;
       h93 te;
       if ((tc = this.c) == null) {
          return;
       }
       int i = 1;
       if (p1 && p1 != i) {
          i = 0;
       }
       if (i && (te = this.e) != null) {
          te.removeView(p0);
       }else {
          tc.removeView(p0);
       }
       int i1 = this.d - 1;
       this.d = i1;
       te = this.c;
       if (!i1) {
          te.setVisibility(8);
       }
       return;
    }
    public final boolean j(TextView p0,CharSequence p1){
       h93 tb = this.b;
       boolean b = (gh7.c(tb) && (tb.isEnabled() && (this.i != this.h && (p0 != null && TextUtils.equals(p0.getText(), p1)))))? true: false;
       return b;
    }
    public final void k(int p0,boolean p1,int p2){
       h93 oh931;
       TextView textView;
       h93 oh93 = this;
       int i = p0;
       boolean b = p1;
       int i1 = p2;
       if (i == i1) {
          return;
       }
       if (b) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          oh93.f = uAnimatorSet;
          ArrayList uArrayList = new ArrayList();
          oh931 = this;
          ArrayList uArrayList1 = uArrayList;
          int i2 = p0;
          g93 int i3 = p2;
          oh931.d(uArrayList1, oh93.q, oh93.r, 2, i2, i3);
          oh931.d(uArrayList1, oh93.k, oh93.l, 1, i2, i3);
          eb3.t(uAnimatorSet, uArrayList);
          i3 = new g93(this, p2, this.f(p0), p0, this.f(i1));
          uAnimatorSet.addListener(i3);
          uAnimatorSet.start();
       }else if(i == i1){
          if (i1 && (textView = this.f(i1)) != null) {
             textView.setVisibility(false);
             textView.setAlpha(0x3f800000);
          }
          if (i && (textView = this.f(p0)) != null) {
             textView.setVisibility(4);
             if (i == 1) {
                textView.setText(null);
             }
          }
          oh93.h = i1;
       }
       oh931 = oh93.b;
       oh931.q();
       oh931.s(b, false);
       oh931.z();
       return;
    }
}
