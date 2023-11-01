package p.b56;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.vl3;
import android.view.View$OnTouchListener;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.hr5;
import android.graphics.Rect;
import java.lang.Math;
import android.view.animation.AccelerateInterpolator;

public final class b56	// class@00105b from classes.dex
{
    public final RecyclerView a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public int e;
    public boolean f;

    public void b56(RecyclerView p0,int p1,boolean p2,boolean p3){
       co5.o(p0, "recyclerView");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       p0.setOnTouchListener(new vl3(2, this));
    }
    public final LinearLayoutManager a(){
       hr5 layoutManage = this.a.getLayoutManager();
       co5.j(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       return layoutManage;
    }
    public final int b(){
       return (((this.a().c1() - this.a().a1()) / 2) + this.a().a1());
    }
    public final void c(int p0){
       b56 td;
       int i = this.b - 1;
       if ((td = this.d) == null && p0 < i) {
          p0++;
       }
       i = (td != null)? 0: this.a.getHeight() / 2;
       this.a().r1(p0, i);
       return;
    }
    public final boolean d(int p0){
       int i = this.b();
       boolean b = true;
       i = (p0 <= this.a().c1() && i <= p0)? 1: 0;
       if (!i) {
          p0 = (((p0 - this.a().c1())) == b)? 1: 0;
          if (!p0) {
             b = false;
          }
       }
       return b;
    }
    public final void e(int p0,boolean p1){
       b56 td;
       View view;
       int i3;
       if (p0 > -1) {
          if (p1) {
             Rect rect = new Rect();
             b56 ta = this.a;
             ta.getGlobalVisibleRect(rect);
             int i = rect.height();
             int i1 = 1;
             if ((td = this.d) != null && (p0 > this.e || (td == null && this.d(p0)))) {
                i = (ta.getHeight() == i)? 1: 0;
                if (i) {
                   i = 1;
                label_0033 :
                   if (i) {
                      if ((view = this.a().C(p0)) == null) {
                         this.c(p0);
                      }else {
                         int[] ointArray = new int[2];
                         view.getLocationOnScreen(ointArray);
                         int measuredHeig = view.getMeasuredHeight();
                         i1 = ointArray[i1] + measuredHeig;
                         int i2 = (ta.getHeight() / 2) + rect.top;
                         if (view.getTop() >= ta.getTop()) {
                            i3 = ta.getHeight() / 2;
                            if (measuredHeig > i3) {
                               i3 = Math.min((measuredHeig - i3), i3);
                            label_0071 :
                               ta.j0(0, (i1 - (i2 + i3)), new AccelerateInterpolator(0x3f000000), 0);
                            }
                         }
                         i3 = 0;
                         goto label_0071 ;
                      }
                   }else {
                      this.c(p0);
                   }
                }
             }
             view = 0;
             goto label_0033 ;
          }else {
             this.c(p0);
          }
       }else if(p0 == -1){
          this.a().D0(0);
       }
       if (p0 == -1) {
          p0 = 0;
       }
       this.e = p0;
       return;
    }
}
