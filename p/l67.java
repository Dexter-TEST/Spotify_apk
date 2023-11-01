package p.l67;
import com.spotify.search.view.ToolbarSearchFieldView;
import p.p56;
import android.widget.Button;
import android.view.View;
import java.lang.Object;
import android.util.Property;
import android.animation.ObjectAnimator;
import java.lang.String;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import p.k67;
import android.animation.Animator$AnimatorListener;
import p.lp5;
import p.i70;
import p.mw1;
import p.lw1;
import p.co5;
import p.np5;
import java.io.IOException;
import java.lang.Class;
import p.ax5;
import android.text.Editable;
import p.pg;
import p.ou6;
import p.mo1;
import p.gp0;
import p.g15;
import p.mz5;

public final class l67	// class@001cf4 from classes.dex
{
    public boolean a;
    public final Cloneable b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public void l67(ToolbarSearchFieldView p0,p56 p1,Button p2,View p3){
       l67 ol67 = this;
       ToolbarSearchFieldView obj = p0;
       ObjectAnimator obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       ol67.f = obj;
       super();
       yw6 h = p56.h;
       int[] ointArray = new int[]{255};
       ObjectAnimator objectAnimat = ObjectAnimator.ofInt(obj1, h, ointArray);
       objectAnimat.setDuration(200);
       ol67.d = objectAnimat;
       ointArray = new int[]{0};
       obj1 = ObjectAnimator.ofInt(obj1, h, ointArray);
       obj1.setDuration(200);
       ol67.e = obj1;
       float[] uofloatArray = new float[]{0};
       obj1 = ObjectAnimator.ofFloat(obj3, View.ALPHA, uofloatArray);
       float[] uofloatArray1 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(obj2, View.ALPHA, uofloatArray1);
       float[] uofloatArray2 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(obj.v, "scaleX", uofloatArray2);
       uofloatArray2 = new float[]{0x3f800000};
       obj = obj.v;
       ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(obj, "scaleY", uofloatArray2);
       obj1.setDuration(200);
       objectAnimat1.setDuration(200);
       objectAnimat2.setDuration(200);
       objectAnimat3.setDuration(200);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.play(obj1).with(objectAnimat2).with(objectAnimat3).before(objectAnimat1);
       uAnimatorSet.addListener(new k67(ol67, obj2, obj3, 0));
       ol67.b = uAnimatorSet;
       uofloatArray = new float[]{0};
       obj1 = ObjectAnimator.ofFloat(obj2, View.ALPHA, uofloatArray);
       float[] uofloatArray3 = new float[]{0x3f800000};
       objectAnimat1 = ObjectAnimator.ofFloat(obj3, View.ALPHA, uofloatArray3);
       uofloatArray3 = new float[]{0x3f99999a};
       objectAnimat = ObjectAnimator.ofFloat(obj, "scaleX", uofloatArray3);
       float[] uofloatArray4 = new float[]{0x3f99999a};
       ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(obj, "scaleY", uofloatArray4);
       obj1.setDuration(200);
       objectAnimat1.setDuration(200);
       objectAnimat.setDuration(200);
       objectAnimat4.setDuration(200);
       AnimatorSet uAnimatorSet1 = new AnimatorSet();
       uAnimatorSet1.play(obj1).with(objectAnimat).with(objectAnimat4).before(objectAnimat1);
       uAnimatorSet1.addListener(new k67(ol67, obj3, obj2, 1));
       ol67.c = uAnimatorSet1;
    }
    public void l67(lp5 p0,i70 p1,mw1 p2,lw1 p3){
       co5.o(p1, "eventListener");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p3.h();
    }
    public final IOException a(boolean p0,boolean p1,IOException p2){
       if (p2 != null) {
          this.f(p2);
       }
       l67 tc = this.c;
       l67 tb = this.b;
       if (p1) {
          if (p2 != null) {
             tc.getClass();
             co5.o(tb, "call");
          }else {
             tc.getClass();
             co5.o(tb, "call");
          }
       }
       if (p0) {
          if (p2 != null) {
             tc.getClass();
             co5.o(tb, "call");
          }else {
             tc.getClass();
             co5.o(tb, "call");
          }
       }
       return tb.i(this, p1, p0, p2);
    }
    public final void b(Animator[] p0){
       int len = p0.length;
       Animator[] uAnimatorArr = new Animator[len];
       int i = 0;
       while (i < p0.length) {
          Animator uAnimator = p0[i].clone();
          uAnimatorArr[i] = uAnimator;
          if (this.a != null) {
             uAnimator.setDuration(0);
          }
          i = i + 1;
       }
       if (len == 1) {
          uAnimatorArr[0].start();
       }else {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
       }
       return;
    }
    public final ax5 c(boolean p0){
       ax5 uoax5;
       try{
          if ((uoax5 = this.e.g(p0)) == null) {
          }else {
             uoax5.m = this;
          }
          return uoax5;
       }catch(java.io.IOException e3){
          this.c.getClass();
          co5.o(this.b, "call");
          this.f(e3);
          throw e3;
       }
    }
    public final void d(){
       this.c.getClass();
       co5.o(this.b, "call");
    }
    public final void e(){
       l67 tf = this.f;
       if (!tf.x.getVisibility()) {
          Editable text = tf.t.getText();
          text.getClass();
          text.clear();
       }else {
          Animator[] uAnimatorArr = new Animator[]{this.e,this.b};
          this.b(uAnimatorArr);
       }
       return;
    }
    public final void f(IOException p0){
       int i1;
       this.d.c(p0);
       np5 onp5 = this.e.h();
       l67 tb = this.b;
       _monitor_enter(onp5);
       co5.o(tb, "call");
       if (p0 instanceof ou6) {
          if (p0.a == mo1.w) {
             int i = onp5.n + 1;
             onp5.n = i;
             if (i > 1) {
                onp5.j = true;
                onp5.l = onp5.l + 1;
             }
          }else if(p0.a == mo1.x && tb.G != null){
             onp5.j = true;
             onp5.l = onp5.l + 1;
          }
       }else if(onp5.g != null){
          i1 = 1;
       }else {
          i1 = 0;
       }
       if (!i1 || p0 instanceof gp0) {
          onp5.j = true;
          if (onp5.m == null) {
             np5.d(tb.a, onp5.b, p0);
             onp5.l = onp5.l + 1;
          }
       }
       _monitor_exit(onp5);
       return;
    }
}
