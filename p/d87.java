package p.d87;
import android.animation.AnimatorListenerAdapter;
import java.lang.Object;
import android.animation.Animator;
import p.pk;
import p.wh6;
import p.h87;
import java.util.ArrayList;
import p.ke;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import p.vf;
import java.util.LinkedList;

public final class d87 extends AnimatorListenerAdapter	// class@0012fd from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void d87(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       d87 tc = this.c;
       d87 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.b.removeListener(this);
             if (tb.c != null) {
                tb.a.setVisibility(8);
             }
             tc.b.remove();
             if (tc.b.size() >= 1) {
                tc.v();
             }
             return;
       }
       tb.remove(p0);
       tc.D.remove(p0);
       return;
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 0:
           default:
             super.onAnimationStart(p0);
             return;
       }
       this.c.D.add(p0);
       return;
    }
}
