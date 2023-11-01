package p.g93;
import android.animation.AnimatorListenerAdapter;
import p.h93;
import android.widget.TextView;
import android.animation.Animator;
import android.view.View;
import java.lang.CharSequence;

public final class g93 extends AnimatorListenerAdapter	// class@0016c4 from classes.dex
{
    public final int a;
    public final TextView b;
    public final int c;
    public final TextView d;
    public final h93 e;

    public void g93(h93 p0,int p1,TextView p2,int p3,TextView p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       g93 tb;
       h93 l;
       g93 td;
       g93 te = this.e;
       te.h = this.a;
       p0 = null;
       te.f = p0;
       if ((tb = this.b) != null) {
          tb.setVisibility(4);
          if (this.c == 1 && (l = te.l) != null) {
             l.setText(p0);
          }
       }
       if ((td = this.d) != null) {
          td.setTranslationY(0);
          td.setAlpha(0x3f800000);
       }
       return;
    }
    public final void onAnimationStart(Animator p0){
       g93 td;
       if ((td = this.d) != null) {
          td.setVisibility(0);
       }
       return;
    }
}
