package p.h81;
import android.view.animation.Animation$AnimationListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.v;
import java.lang.Object;
import android.view.animation.Animation;
import p.g81;
import java.lang.Runnable;
import androidx.fragment.app.o;
import java.lang.String;
import java.util.Objects;

public final class h81 implements Animation$AnimationListener	// class@0017fc from classes.dex
{
    public final v a;
    public final ViewGroup b;
    public final View c;
    public final c d;

    public void h81(View p0,ViewGroup p1,c p2,v p3){
       this.a = p3;
       this.b = p1;
       this.c = p0;
       this.d = p2;
       super();
    }
    public final void onAnimationEnd(Animation p0){
       this.b.post(new g81(0, this));
       if (o.I(2)) {
          Objects.toString(this.a);
       }
       return;
    }
    public final void onAnimationRepeat(Animation p0){
    }
    public final void onAnimationStart(Animation p0){
       if (o.I(2)) {
          Objects.toString(this.a);
       }
       return;
    }
}
