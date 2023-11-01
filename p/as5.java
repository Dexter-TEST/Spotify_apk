package p.as5;
import p.n3;
import p.bs5;
import java.util.WeakHashMap;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.Object;
import p.u44;
import p.y3;
import androidx.recyclerview.widget.RecyclerView;
import p.o7;
import p.hr5;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import android.view.ViewGroup;
import android.os.Bundle;

public final class as5 extends n3	// class@000fe4 from classes.dex
{
    public final bs5 d;
    public final WeakHashMap e;

    public void as5(bs5 p0){
       super();
       this.e = new WeakHashMap();
       this.d = p0;
    }
    public final boolean a(View p0,AccessibilityEvent p1){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          return on3.a(p0, p1);
       }
       return super.a(p0, p1);
    }
    public final u44 b(View p0){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          return on3.b(p0);
       }
       return super.b(p0);
    }
    public final void c(View p0,AccessibilityEvent p1){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          on3.c(p0, p1);
       }else {
          super.c(p0, p1);
       }
       return;
    }
    public final void d(View p0,y3 p1){
       n3 on3;
       as5 td = this.d;
       bs5 d = td.d;
       d = (d.L != null && (d.U == null && !d.v.g()))? 0: 1;
       y3 a = p1.a;
       n3 ta = this.a;
       if (!d) {
          bs5 d1 = td.d;
          if (d1.getLayoutManager() != null) {
             d1.getLayoutManager().i0(p0, p1);
             if ((on3 = this.e.get(p0)) != null) {
                on3.d(p0, p1);
             }else {
                ta.onInitializeAccessibilityNodeInfo(p0, a);
             }
          }else {
          label_003f :
             ta.onInitializeAccessibilityNodeInfo(p0, a);
          }
       }else {
          goto label_003f ;
       }
       return;
    }
    public final void e(View p0,AccessibilityEvent p1){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          on3.e(p0, p1);
       }else {
          super.e(p0, p1);
       }
       return;
    }
    public final boolean f(ViewGroup p0,View p1,AccessibilityEvent p2){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          return on3.f(p0, p1, p2);
       }
       return super.f(p0, p1, p2);
    }
    public final boolean g(View p0,int p1,Bundle p2){
       as5 td = this.d;
       bs5 d = td.d;
       n3 on3 = (d.L != null && (d.U == null && !d.v.g()))? 0: 1;
       if (!d) {
          bs5 d1 = td.d;
          if (d1.getLayoutManager() != null) {
             if ((on3 = this.e.get(p0)) != null) {
                if (on3.g(p0, p1, p2)) {
                   return true;
                }
             }else if(super.g(p0, p1, p2)){
                return true;
             }
             return false;
          }
       }
       return super.g(p0, p1, p2);
    }
    public final void h(View p0,int p1){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          on3.h(p0, p1);
       }else {
          super.h(p0, p1);
       }
       return;
    }
    public final void i(View p0,AccessibilityEvent p1){
       n3 on3;
       if ((on3 = this.e.get(p0)) != null) {
          on3.i(p0, p1);
       }else {
          super.i(p0, p1);
       }
       return;
    }
}
