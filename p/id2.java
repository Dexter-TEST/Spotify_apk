package p.id2;
import java.lang.Runnable;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Transformation;
import p.s25;

public final class id2 extends AnimationSet implements Runnable	// class@00196f from classes.dex
{
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean t;
    public boolean v;

    public void id2(Animation p0,ViewGroup p1,View p2){
       super(false);
       this.v = true;
       this.a = p1;
       this.b = p2;
       this.addAnimation(p0);
       p1.post(this);
    }
    public final boolean getTransformation(long p0,Transformation p1){
       this.v = true;
       if (this.c != null) {
          return (this.t ^ true);
       }
       if (!super.getTransformation(p0, p1)) {
          this.c = true;
          s25.a(this.a, this);
       }
       return true;
    }
    public final boolean getTransformation(long p0,Transformation p1,float p2){
       this.v = true;
       if (this.c != null) {
          return (this.t ^ true);
       }
       if (!super.getTransformation(p0, p1, p2)) {
          this.c = true;
          s25.a(this.a, this);
       }
       return true;
    }
    public final void run(){
       id2 ta = this.a;
       if (this.c == null && this.v != null) {
          this.v = false;
          ta.post(this);
       }else {
          ta.endViewTransition(this.b);
          this.t = true;
       }
       return;
    }
}
