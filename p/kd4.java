package p.kd4;
import android.animation.ValueAnimator;
import p.id4;
import p.af6;
import java.lang.Object;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class kd4 extends ValueAnimator	// class@001bf1 from classes.dex
{
    public final id4 a;

    public void kd4(id4 p0){
       super();
       af6 uoaf6 = new af6(6, this);
       this.a = p0;
       this.addUpdateListener(uoaf6);
    }
    public final void start(){
       this.a.b();
       super.start();
    }
}
