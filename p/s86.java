package p.s86;
import android.view.TouchDelegate;
import android.graphics.Rect;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import android.view.View;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.MotionEvent;

public final class s86 extends TouchDelegate	// class@0025dd from classes.dex
{
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public void s86(Rect p0,Rect p1,SearchView$SearchAutoComplete p2){
       super(p0, p2);
       int scaledTouchS = ViewConfiguration.get(p2.getContext()).getScaledTouchSlop();
       this.e = scaledTouchS;
       Rect rect = new Rect();
       this.b = rect;
       Rect rect1 = new Rect();
       this.d = rect1;
       Rect rect2 = new Rect();
       this.c = rect2;
       rect.set(p0);
       rect1.set(p0);
       rect1.inset((- scaledTouchS), (- scaledTouchS));
       rect2.set(p1);
       this.a = p2;
    }
    public final boolean onTouchEvent(MotionEvent p0){
       s86 ta;
       s86 tf;
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int action = p0.getAction();
       boolean b = false;
       boolean b1 = true;
       if (action) {
          if (action != b1 && action != 2) {
             if (action != 3) {
             label_003d :
                action = 1;
                b1 = null;
             }else {
                tf = this.f;
                this.f = b;
             }
          }else if((tf = this.f) != null && !this.d.contains(i, i1)){
             ta = tf;
             tf = 0;
          }
          ta = tf;
       label_0030 :
          tf = 1;
       }else if(this.b.contains(i, i1)){
          this.f = b1;
          goto label_0030 ;
       }else {
          goto label_003d ;
       }
       if (b1 != null) {
          s86 tc = this.c;
          ta = this.a;
          if (action && !tc.contains(i, i1)) {
             p0.setLocation((float)(ta.getWidth() / 2), (float)(ta.getHeight() / 2));
          }else {
             p0.setLocation((float)(i - tc.left), (float)(i1 - tc.top));
          }
          b = ta.dispatchTouchEvent(p0);
       }
       return b;
    }
}
