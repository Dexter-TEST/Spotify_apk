package p.f81;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.v;
import androidx.fragment.app.c;
import android.animation.Animator;
import p.mo6;
import androidx.fragment.app.d;
import androidx.fragment.app.o;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class f81 extends AnimatorListenerAdapter	// class@001578 from classes.dex
{
    public final ViewGroup a;
    public final View b;
    public final boolean c;
    public final v d;
    public final c e;

    public void f81(ViewGroup p0,View p1,boolean p2,v p3,c p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       f81 tb = this.b;
       this.a.endViewTransition(tb);
       f81 td = this.d;
       if (this.c != null) {
          td.a.a(tb);
       }
       this.e.a();
       if (o.I(2)) {
          Objects.toString(td);
       }
       return;
    }
}
