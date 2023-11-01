package p.bv0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Object;
import p.rk2;
import p.id4;
import p.kd4;
import p.gd4;
import android.view.ViewTreeObserver;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import p.xj0;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class bv0 implements ViewTreeObserver$OnPreDrawListener	// class@00113e from classes.dex
{
    public final int a;
    public final Object b;

    public void bv0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean onPreDraw(){
       int i = 0;
       bv0 tb = this.b;
       switch (this.a){
           case 0:
             tb.s(i);
             return true;
           case 1:
             kd4 okd4 = gd4.a(tb.l);
             tb.r = okd4;
             okd4.start();
             tb.t.start();
             tb.b.getViewTreeObserver().removeOnPreDrawListener(this);
             return true;
           default:
             tb.getViewTreeObserver().removeOnPreDrawListener(this);
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[2];
             float[] uofloatArray = new float[true];
             uofloatArray[i] = 0x3f800000;
             propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray);
             uofloatArray = new float[true];
             uofloatArray[i] = 0;
             propertyValu[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray);
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb, propertyValu);
             objectAnimat.setDuration(200);
             objectAnimat.setInterpolator(xj0.w0(tb.a.getContext()));
             objectAnimat.start();
             return true;
       }
    }
}
