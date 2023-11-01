package p.tx1;
import p.u44;
import p.bf0;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.chip.Chip;
import android.view.View$OnClickListener;
import android.view.accessibility.AccessibilityManager;
import p.wh7;
import p.dh7;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;

public final class tx1 extends u44	// class@0027fc from classes.dex
{
    public final bf0 c;

    public void tx1(bf0 p0){
       this.c = p0;
       super(6);
    }
    public final boolean D(int p0,int p1,Bundle p2){
       bf0 n;
       boolean b;
       Chip y;
       tx1 tc = this.c;
       bf0 i = tc.i;
       if (p0 != -1) {
          int i1 = 1;
          if (p1 != i1) {
             if (p1 != 2) {
                int i2 = 0;
                if (p1 != 64) {
                   if (p1 != 128) {
                      if (p1 == 16) {
                         n = tc.n;
                         if (!p0) {
                            b = n.performClick();
                         }else if(p0 == i1){
                            n.playSoundEffect(i2);
                            if ((y = n.y) != null) {
                               y.onClick(n);
                               i2 = 1;
                            }
                            if (n.I != null) {
                               n.H.q(i1, i1);
                            }
                         }
                      }
                      y = i2;
                   }else if(tc.k == p0){
                      tc.k = Integer.MIN_VALUE;
                      i.invalidate();
                      tc.q(p0, 0x10000);
                   }else {
                   label_004d :
                      i1 = 0;
                   }
                }else {
                   n = tc.h;
                   if (n.isEnabled() && (n.isTouchExplorationEnabled() && (n = tc.k) != p0)) {
                      if (n != Integer.MIN_VALUE) {
                         tc.k = Integer.MIN_VALUE;
                         tc.i.invalidate();
                         tc.q(n, 0x10000);
                      }
                      tc.k = p0;
                      i.invalidate();
                      tc.q(p0, 0x8000);
                   }else {
                      goto label_004d ;
                   }
                }
                p0 = i1;
             }else {
                b = tc.j(p0);
             }
          }else {
             b = tc.p(p0);
          }
       }else {
          b = dh7.j(i, p1, p2);
       }
       return b;
    }
    public final y3 v(int p0){
       return new y3(AccessibilityNodeInfo.obtain(this.c.n(p0).a));
    }
    public final y3 w(int p0){
       tx1 tc = this.c;
       bf0 k = (p0 == 2)? tc.k: tc.l;
       if (k == Integer.MIN_VALUE) {
          return null;
       }else {
          return this.v(k);
       }
    }
}
