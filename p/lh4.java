package p.lh4;
import p.n3;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.widget.NestedScrollView;
import android.widget.ScrollView;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityRecord;
import p.c4;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import p.w3;
import android.os.Build$VERSION;
import p.q3;
import android.os.Bundle;
import android.graphics.Rect;
import android.graphics.Matrix;
import java.lang.Math;

public final class lh4 extends n3	// class@001d54 from classes.dex
{
    public final int d;

    public void lh4(int p0){
       this.d = p0;
       super();
    }
    public final void c(View p0,AccessibilityEvent p1){
       boolean b;
       switch (this.d){
           case 0:
             super.c(p0, p1);
             p1.setClassName(ScrollView.class.getName());
             b = (p0.getScrollRange() > 0)? true: false;
             break;
           default:
             super.c(p0, p1);
             return;
       }
       p1.setScrollable(b);
       p1.setScrollX(p0.getScrollX());
       p1.setScrollY(p0.getScrollY());
       c4.c(p1, p0.getScrollX());
       c4.d(p1, p0.getScrollRange());
       return;
    }
    public final void d(View p0,y3 p1){
       int scrollRange;
       y3 a = p1.a;
       n3 ta = this.a;
       switch (this.d){
           case 0:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             a.setClassName(ScrollView.class.getName());
             if (p0.isEnabled() && (scrollRange = p0.getScrollRange()) > 0) {
                a.setScrollable(true);
                if (p0.getScrollY() > 0) {
                   p1.b(w3.g);
                   p1.b(w3.k);
                }
                if (p0.getScrollY() < scrollRange) {
                   p1.b(w3.f);
                   p1.b(w3.l);
                }
             }
             break;
           default:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             if (Build$VERSION.SDK_INT >= 28) {
                q3.A(a, true);
             }else {
                p1.f(2, true);
             }
             return;
       }
       return;
    }
    public final boolean g(View p0,int p1,Bundle p2){
       boolean b;
       switch (this.d){
           case 0:
             b = true;
             if (!super.g(p0, p1, p2)) {
                int i = 0;
                if (p0.isEnabled()) {
                   int height = p0.getHeight();
                   Rect rect = new Rect();
                   if (p0.getMatrix().isIdentity() && p0.getGlobalVisibleRect(rect)) {
                      height = rect.height();
                   }
                   if (p1 != 4096) {
                      if (p1 != 8192 && p1 != 0x1020038) {
                         if (p1 == 0x102003a) {
                         }
                      }else if((p1 = Math.max((p0.getScrollY() - ((height - p0.getPaddingBottom()) - p0.getPaddingTop())), i)) != p0.getScrollY()){
                         p0.u((i - p0.getScrollX()), (p1 - p0.getScrollY()), b);
                      }
                   }else if((p1 = Math.min((p0.getScrollY() + ((height - p0.getPaddingBottom()) - p0.getPaddingTop())), p0.getScrollRange())) != p0.getScrollY()){
                      p0.u((i - p0.getScrollX()), (p1 - p0.getScrollY()), b);
                   }
                }
                b = false;
             }
             break;
           default:
             return super.g(p0, p1, p2);
       }
       return b;
    }
}
