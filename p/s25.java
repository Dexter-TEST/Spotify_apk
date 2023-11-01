package p.s25;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import android.view.ViewTreeObserver;
import java.lang.NullPointerException;
import java.lang.String;

public final class s25 implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener	// class@0025a7 from classes.dex
{
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public void s25(View p0,Runnable p1){
       super();
       this.a = p0;
       this.b = p0.getViewTreeObserver();
       this.c = p1;
    }
    public static void a(View p0,Runnable p1){
       if (p0 == null) {
          throw new NullPointerException("view == null");
       }
       if (p1 == null) {
          throw new NullPointerException("runnable == null");
       }
       s25 os25 = new s25(p0, p1);
       p0.getViewTreeObserver().addOnPreDrawListener(os25);
       p0.addOnAttachStateChangeListener(os25);
       return;
    }
    public final boolean onPreDraw(){
       s25 ta = this.a;
       if (this.b.isAlive()) {
          this.b.removeOnPreDrawListener(this);
       }else {
          ta.getViewTreeObserver().removeOnPreDrawListener(this);
       }
       ta.removeOnAttachStateChangeListener(this);
       this.c.run();
       return true;
    }
    public final void onViewAttachedToWindow(View p0){
       this.b = p0.getViewTreeObserver();
    }
    public final void onViewDetachedFromWindow(View p0){
       s25 ta = this.a;
       if (this.b.isAlive()) {
          this.b.removeOnPreDrawListener(this);
       }else {
          ta.getViewTreeObserver().removeOnPreDrawListener(this);
       }
       ta.removeOnAttachStateChangeListener(this);
       return;
    }
}
