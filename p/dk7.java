package p.dk7;
import android.animation.AnimatorListenerAdapter;
import java.lang.Object;
import android.animation.Animator;
import p.ik7;
import android.view.View;
import com.spotify.signup.signup.view.GenderView;
import java.util.concurrent.atomic.AtomicBoolean;
import p.hr0;
import p.ei2;
import p.di2;

public final class dk7 extends AnimatorListenerAdapter	// class@001366 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public void dk7(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationCancel(Animator p0){
       switch (this.a){
           case 0:
           default:
             super.onAnimationCancel(p0);
             return;
       }
       this.b.b(this.c);
       return;
    }
    public final void onAnimationEnd(Animator p0){
       dk7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (!this.d.y.get()) {
                tb.accept(new di2(this.c));
             }
             return;
       }
       tb.a();
       return;
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 0:
           default:
             super.onAnimationStart(p0);
             return;
       }
       this.b.c();
       return;
    }
}
