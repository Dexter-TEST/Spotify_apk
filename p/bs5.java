package p.bs5;
import p.n3;
import androidx.recyclerview.widget.RecyclerView;
import p.as5;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p.o7;
import p.hr5;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import p.pr5;
import p.vr5;
import android.os.Bundle;

public final class bs5 extends n3	// class@001128 from classes.dex
{
    public final RecyclerView d;
    public final as5 e;

    public void bs5(RecyclerView p0){
       bs5 te;
       super();
       this.d = p0;
       this.e = ((te = this.e) != null)? te: new as5(this);
       return;
    }
    public final void c(View p0,AccessibilityEvent p1){
       super.c(p0, p1);
       if (p0 instanceof RecyclerView) {
          bs5 td = this.d;
          td = (td.L != null && (td.U == null && !td.v.g()))? 0: 1;
          if (!td && p0.getLayoutManager() != null) {
             p0.getLayoutManager().g0(p1);
          }
       }
       return;
    }
    public final void d(View p0,y3 p1){
       int i;
       this.a.onInitializeAccessibilityNodeInfo(p0, p1.a);
       bs5 td = this.d;
       hr5 b = (td.L != null && (td.U == null && !td.v.g()))? 0: 1;
       if (!i && td.getLayoutManager() != null) {
          hr5 layoutManage = td.getLayoutManager();
          b = layoutManage.b;
          layoutManage.h0(b.c, b.y0, p1);
       }
       return;
    }
    public final boolean g(View p0,int p1,Bundle p2){
       boolean b = true;
       if (super.g(p0, p1, p2)) {
          return b;
       }
       bs5 td = this.d;
       if (td.L != null && (td.U == null && !td.v.g())) {
          b = false;
       }
       if (!b && td.getLayoutManager() != null) {
          hr5 layoutManage = td.getLayoutManager();
          hr5 b1 = layoutManage.b;
          return layoutManage.v0(b1.c, b1.y0, p1, p2);
       }else {
          return false;
       }
    }
}
