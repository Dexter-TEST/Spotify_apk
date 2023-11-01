package p.e50;
import p.n3;
import java.lang.Object;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import android.view.accessibility.AccessibilityRecord;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.lang.Class;
import com.google.android.material.button.MaterialButton;
import android.view.ViewGroup;
import p.x3;
import p.h50;
import android.os.Bundle;
import p.rz;
import p.mm6;

public final class e50 extends n3	// class@00141c from classes.dex
{
    public final int d;
    public final Object e;

    public void e50(int p0,Object p1){
       this.d = p0;
       this.e = p1;
       super();
    }
    public final void c(View p0,AccessibilityEvent p1){
       switch (this.d){
           case 2:
           default:
             super.c(p0, p1);
             return;
       }
       super.c(p0, p1);
       p1.setChecked(this.e.isChecked());
       return;
    }
    public final void d(View p0,y3 p1){
       int i1;
       y3 a = p1.a;
       int i = 0x100000;
       e50 te = this.e;
       n3 ta = this.a;
       switch (this.d){
           case 0:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             if (te.A != null) {
                p1.a(i);
                a.setDismissable(true);
             }else {
                a.setDismissable(false);
             }
             return;
             break;
           case 1:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             te.getClass();
             if (p0 instanceof MaterialButton) {
                int i2 = 0;
                i1 = 0;
                while (true) {
                   if (i2 < te.getChildCount()) {
                      if (te.getChildAt(i2) == p0) {
                         break ;
                      }else if(te.getChildAt(i2) instanceof MaterialButton && te.d(i2)){
                         i1 = i1 + 1;
                      }
                      i2 = i2 + 1;
                   }
                }
                p1.g(x3.f(false, true, i1, true, p0.isChecked()));
                return;
             }
             i1 = -1;
             break;
           case 2:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             a.setCheckable(te.v);
             a.setChecked(te.isChecked());
             return;
           case 3:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             a.setCheckable(te.O);
             return;
           default:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             p1.a(i);
             a.setDismissable(true);
             return;
       }
    }
    public final boolean g(View p0,int p1,Bundle p2){
       boolean b = true;
       e50 te = this.e;
       switch (this.d){
           case 0:
             if (p1 == 0x100000 && te.A != null) {
                te.cancel();
             }else {
                b = super.g(p0, p1, p2);
             }
             break;
           case 4:
             if (p1 == 0x100000) {
                te.a(3);
             }else {
                b = super.g(p0, p1, p2);
             }
             return b;
             break;
           default:
             return super.g(p0, p1, p2);
       }
       return b;
    }
}
