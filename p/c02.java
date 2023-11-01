package p.c02;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p.o02;
import android.animation.Animator;
import p.al7;
import p.cl7;
import android.graphics.Paint;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import p.wh7;
import p.dh7;

public final class c02 extends AnimatorListenerAdapter	// class@00116c from classes.dex
{
    public final int a;
    public boolean b;
    public final Object c;

    public void c02(int p0,View p1,boolean p2){
       this.a = p0;
       this.b = p2;
       this.c = p1;
       super();
    }
    public void c02(View p0){
       this.a = 0;
       super();
       this.b = false;
       this.c = p0;
    }
    public void c02(o02 p0){
       this.a = 4;
       this.c = p0;
       super();
       this.b = false;
    }
    public final void onAnimationCancel(Animator p0){
       switch (this.a){
           case 4:
           default:
             super.onAnimationCancel(p0);
             return;
       }
       this.b = true;
       return;
    }
    public final void onAnimationEnd(Animator p0){
       int i = 8;
       c02 tc = this.c;
       switch (this.a){
           case 0:
             al7.a.h(tc, 0x3f800000);
             if (this.b != null) {
                tc.setLayerType(0, null);
             }
             break;
           case 1:
             if (this.b == null) {
                tc.setVisibility(i);
             }
             return;
             break;
           case 2:
             if (this.b == null) {
                tc.setVisibility(4);
             }
             return;
             break;
           case 3:
             if (this.b == null) {
                tc.setVisibility(i);
             }
             return;
             break;
           default:
             if (this.b != null) {
                this.b = false;
             }else if(!(0 - tc.z.getAnimatedValue().floatValue())){
                tc.A = 0;
                tc.k(0);
             }else {
                tc.A = 2;
                tc.s.invalidate();
             }
             return;
       }
       return;
    }
    public final void onAnimationStart(Animator p0){
       c02 tc = this.c;
       switch (this.a){
           case 0:
             if (dh7.h(tc) && !tc.getLayerType()) {
                this.b = true;
                tc.setLayerType(2, null);
             }
             break;
           case 1:
             if (this.b != null) {
                tc.setVisibility(0);
             }
             return;
             break;
           case 2:
             if (this.b != null) {
                tc.setVisibility(0);
             }
             return;
             break;
           case 3:
             if (this.b != null) {
                tc.setVisibility(0);
             }
             return;
             break;
           default:
             super.onAnimationStart(p0);
             return;
       }
       return;
    }
}
