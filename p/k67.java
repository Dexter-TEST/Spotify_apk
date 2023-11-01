package p.k67;
import android.animation.AnimatorListenerAdapter;
import p.l67;
import android.view.View;
import android.animation.Animator;
import com.spotify.search.view.ToolbarSearchFieldView;
import java.lang.Class;
import java.lang.Object;
import android.text.Editable;
import p.pg;

public final class k67 extends AnimatorListenerAdapter	// class@001bb7 from classes.dex
{
    public final int a;
    public final View b;
    public final View c;
    public final l67 d;

    public void k67(l67 p0,View p1,View p2,int p3){
       this.a = p3;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       k67 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.setVisibility(4);
             return;
       }
       k67 td = this.d;
       td.f.c.setClickable(true);
       l67 f = td.f;
       f.x.setClickable(true);
       f.getClass();
       tc.setVisibility(4);
       Editable text = f.t.getText();
       text.getClass();
       text.clear();
       return;
    }
    public final void onAnimationStart(Animator p0){
       l67 f;
       l67 ol67;
       k67 tb = this.b;
       k67 td = this.d;
       switch (this.a){
           case 0:
             f = td.f;
             ol67 = f;
             if (ol67.a == null) {
                l67 ol671 = f;
                ol67.a = ol67.c.getWidth() - ol671.b;
                ol671.v.getX();
                ToolbarSearchFieldView b = ol671.b;
             }
             break;
           default:
             ol67 = td.f;
             if (td.f.getWidth()) {
                f = ol67;
                if (f.a == null) {
                   f.a = f.c.getWidth();
                   f.v.getX();
                }
             }
             ol67.c.setClickable(0);
             ol67.x.setClickable(0);
             tb.setVisibility(0);
             return;
       }
       tb.setVisibility(0);
       f.getClass();
       return;
    }
}
