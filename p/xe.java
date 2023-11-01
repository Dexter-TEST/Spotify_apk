package p.xe;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import p.q24;
import android.animation.ValueAnimator;
import java.lang.Float;
import p.ef;
import java.util.Iterator;
import java.util.ArrayList;
import p.tp2;

public final class xe implements ValueAnimator$AnimatorUpdateListener	// class@002c63 from classes.dex
{
    public final Object a;
    public final Object b;

    public void xe(Object p0,q24 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       float f = p0.getAnimatedValue().floatValue();
       this.a.j(f);
       xe tb = this.b;
       ef i = tb.I;
       if (i instanceof q24) {
          i.j(f);
       }
       Iterator iterator = tb.G.iterator();
       if (!iterator.hasNext()) {
          return;
       }else {
          tp2.v(iterator.next());
          throw null;
       }
    }
}
