package p.fk7;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.view.ViewPropertyAnimator;
import p.ik7;
import p.dk7;
import android.animation.Animator$AnimatorListener;

public final class fk7	// class@0015e7 from classes.dex
{
    public final WeakReference a;

    public void fk7(View p0){
       super();
       this.a = new WeakReference(p0);
    }
    public final void a(float p0){
       View view;
       if ((view = this.a.get()) != null) {
          view.animate().alpha(p0);
       }
       return;
    }
    public final void b(){
       View view;
       if ((view = this.a.get()) != null) {
          view.animate().cancel();
       }
       return;
    }
    public final void c(long p0){
       View view;
       if ((view = this.a.get()) != null) {
          view.animate().setDuration(p0);
       }
       return;
    }
    public final void d(ik7 p0){
       View view;
       if ((view = this.a.get()) != null) {
          if (p0 != null) {
             view.animate().setListener(new dk7(this, p0, view, 0));
          }else {
             view.animate().setListener(null);
          }
       }
       return;
    }
    public final void e(float p0){
       View view;
       if ((view = this.a.get()) != null) {
          view.animate().translationY(p0);
       }
       return;
    }
}
