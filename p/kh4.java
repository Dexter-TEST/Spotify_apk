package p.kh4;
import p.qh4;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import p.jh4;
import android.view.View;
import p.wh7;
import p.jh7;
import p.av0;
import p.xu0;
import p.rh4;
import android.view.ViewParent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

public class kh4 extends CoordinatorLayout implements qh4	// class@001c13 from classes.dex
{
    public final ay6 P;
    public final jh4 Q;
    public final View R;
    public final av0 S;

    public void kh4(Context p0,AttributeSet p1,int p2){
       co5.o(p0, "context");
       super(p0, p1, p2);
       this.P = new ay6(new o26(26, this));
       jh4 ojh4 = new jh4();
       this.Q = ojh4;
       View view = new View(this.getContext());
       jh7.s(view, jh7.i(view));
       this.R = view;
       av0 uoav0 = new av0(0, 0);
       uoav0.b(ojh4);
       this.S = uoav0;
    }
    public static final View B(kh4 p0){
       return p0.getNestedTarget();
    }
    private final rh4 getHelper(){
       return this.P.getValue();
    }
    private final View getNestedTarget(){
       View view;
       jh4 h = this.Q.h;
       kh4 okh4 = null;
       if (h != null) {
          if (h instanceof kh4) {
             okh4 = h;
          }
          if (okh4 != null && (view = kh4.B(okh4)) != null) {
             h = view;
          }
          okh4 = h;
       }
       return okh4;
    }
    public final boolean dispatchNestedFling(float p0,float p1,boolean p2){
       boolean b = (this.getHelper().a(p0, p1, p2) && this.isNestedScrollingEnabled())? true: false;
       return b;
    }
    public final boolean dispatchNestedPreFling(float p0,float p1){
       boolean b = (this.getHelper().b(p0, p1) && this.isNestedScrollingEnabled())? true: false;
       return b;
    }
    public final boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       boolean b = (this.getHelper().c(p0, p1, p2, p3, 0) && this.isNestedScrollingEnabled())? true: false;
       return b;
    }
    public final boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       boolean b = (this.getHelper().e(p0, p1, p2, p3, p4, 0, null) && this.isNestedScrollingEnabled())? true: false;
       return b;
    }
    public final boolean hasNestedScrollingParent(){
       int i = 0;
       int i1 = (this.getHelper().f(i) != null)? 1: 0;
       if (i1 && this.isNestedScrollingEnabled()) {
          i = true;
       }
       return i;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          kh4 tS = this.S;
          tS.width = p3 - p1;
          tS.height = p4 - p2;
          kh4 tR = this.R;
          this.removeViewInLayout(tR);
          this.addViewInLayout(tR, -1, tS);
       }
       return;
    }
    public final boolean startNestedScroll(int p0){
       int i = 0;
       if (this.getHelper().g(p0, i) && this.isNestedScrollingEnabled()) {
          i = true;
       }
       return i;
    }
    public final void stopNestedScroll(){
       this.getHelper().h(0);
    }
}
