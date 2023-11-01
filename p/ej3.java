package p.ej3;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.fj3;
import android.view.View;
import java.lang.Object;
import android.view.ViewTreeObserver;
import java.lang.Class;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Choreographer;
import p.rl5;
import android.view.Choreographer$FrameCallback;

public final class ej3 implements ViewTreeObserver$OnGlobalLayoutListener	// class@00149a from classes.dex
{
    public final int a;
    public final View b;
    public final fj3 c;

    public void ej3(fj3 p0,View p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void onGlobalLayout(){
       View childAt;
       ej3 tc = this.c;
       ej3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getViewTreeObserver().removeOnGlobalLayoutListener(this);
             tc.getClass();
             Choreographer.getInstance().postFrameCallback(new rl5(1, tc));
             return;
       }
       tb.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       tc.getClass();
       if (tb instanceof ViewGroup) {
          while (true) {
             int childCount = tb.getChildCount();
             break ;
          }
          do {
             if ((childCount = childCount - 1) >= 0) {
             }else {
                childCount = tb.getChildCount();
                while (true) {
                   if ((childCount = childCount - 1) >= 0) {
                      childAt = tb.getChildAt(childCount);
                      if (childAt instanceof ViewGroup) {
                         tb = childAt;
                      }else {
                         continue ;
                      }
                   }else {
                      childAt = null;
                   }
                }
             }
             break ;
             childAt = tb.getChildAt(childCount);
          } while (childAt instanceof RecyclerView);
          if (childAt == null) {
             Choreographer.getInstance().postFrameCallback(new rl5(1, tc));
          }else {
             childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ej3(tc, childAt, 1));
          }
       }else {
          Choreographer.getInstance().postFrameCallback(new rl5(1, tc));
       }
       return;
    }
}
