package p.iq0;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.view.View$MeasureSpec;
import p.wq0;
import p.b00;
import java.lang.Class;
import android.view.View;
import p.en6;
import p.cq0;
import android.view.ViewGroup;
import p.xq0;
import p.xe7;
import android.view.ViewGroup$LayoutParams;
import p.hq0;
import p.ml7;
import p.c62;
import java.lang.Math;

public final class iq0	// class@0019e1 from classes.dex
{
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ConstraintLayout h;

    public void iq0(ConstraintLayout p0,ConstraintLayout p1){
       this.h = p0;
       super();
       this.a = p1;
    }
    public static boolean a(int p0,int p1,int p2){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       p0 = View$MeasureSpec.getMode(p0);
       p1 = View$MeasureSpec.getSize(p1);
       if (View$MeasureSpec.getMode(p1) != 0x40000000 || (p0 != Integer.MIN_VALUE || (!p0 && p2 == p1))) {
          b = false;
       }
       return b;
    }
    public final void b(wq0 p0,b00 p1){
       int i6;
       int i7;
       wq0 u;
       b00 j;
       wq0 u1;
       wq0 v;
       int i8;
       int i9;
       int i10;
       iq0 g;
       b00 j1;
       iq0 oiq0 = this;
       wq0 owq0 = p0;
       b00 uob00 = p1;
       if (!owq0) {
          return;
       }
       int i = 0;
       if (owq0.h0 == 8) {
          uob00.e = i;
          uob00.f = i;
          uob00.g = i;
          return;
       }else if(owq0.U == null){
          return;
       }else {
          iq0 h = oiq0.h;
          h.getClass();
          b00 a = uob00.a;
          b00 b = uob00.b;
          b00 c = uob00.c;
          b00 d = uob00.d;
          int i1 = oiq0.b + oiq0.c;
          iq0 d1 = oiq0.d;
          wq0 g0 = owq0.g0;
          int i2 = en6.A(a);
          int i3 = 2;
          int i4 = 1;
          wq0 k = owq0.K;
          wq0 i5 = owq0.I;
          if (i2) {
             if (i2 != i4) {
                if (i2 != i3) {
                   if (i2 != 3) {
                      i6 = 0;
                   }else {
                      iq0 f1 = oiq0.f;
                      i2 = (i5 != null)? i5.g + 0: 0;
                      if (k != null) {
                         i2 = i2 + k.g;
                      }
                      i6 = ViewGroup.getChildMeasureSpec(f1, (d1 + i2), -1);
                   }
                }else {
                   i6 = ViewGroup.getChildMeasureSpec(oiq0.f, d1, -2);
                   j1 = (owq0.r == i4)? 1: 0;
                   b00 j2 = uob00.j;
                   u1 = 2;
                   if (j2 == i4 || j2 == u1) {
                      j2 = (g0.getMeasuredHeight() == p0.l())? 1: 0;
                      j1 = (uob00.j != u1 && (j1 && (!j1 && (j2 || p0.B()))))? 0: 1;
                      if (j1) {
                         i6 = View$MeasureSpec.makeMeasureSpec(p0.r(), 0x40000000);
                      }
                   }
                   j2 = 0x40000000;
                }
             }else {
                i6 = ViewGroup.getChildMeasureSpec(oiq0.f, d1, -2);
             }
          }else {
             i6 = View$MeasureSpec.makeMeasureSpec(c, 0x40000000);
          }
          if (i7 = en6.A(b)) {
             if (i7 != 1) {
                if (i7 != 2) {
                   if (i7 != 3) {
                      i = 0;
                   }else {
                      g = oiq0.g;
                      i7 = (i5 != null)? owq0.J.g + 0: 0;
                      if (k != null) {
                         i7 = i7 + owq0.L.g;
                      }
                      i = ViewGroup.getChildMeasureSpec(g, (i1 + i7), -1);
                   }
                }else {
                   i = ViewGroup.getChildMeasureSpec(oiq0.g, i1, -2);
                   i1 = 1;
                   g = (owq0.s == i1)? 1: 0;
                   if ((j1 = uob00.j) != i1) {
                      i1 = 2;
                      if (j1 != i1) {
                      label_00ff :
                         j1 = 0x40000000;
                      }
                   }else {
                      i1 = 2;
                   }
                   j1 = (g0.getMeasuredWidth() == p0.r())? 1: 0;
                   g = (uob00.j != i1 && (g && (!g && (j1 || p0.C()))))? 0: 1;
                   if (g) {
                      i = View$MeasureSpec.makeMeasureSpec(p0.l(), 0x40000000);
                   }else {
                      goto label_00ff ;
                   }
                }
             }else {
                i = ViewGroup.getChildMeasureSpec(oiq0.g, i1, -2);
             }
          }else {
             i = View$MeasureSpec.makeMeasureSpec(d, 0x40000000);
          }
          if ((u = owq0.U) != null && (xe7.r(h.z, 256) && (g0.getMeasuredWidth() == p0.r() && (g0.getMeasuredWidth() < u.r() && (g0.getMeasuredHeight() == p0.l() && (g0.getMeasuredHeight() < u.l() && (g0.getBaseline() == owq0.b0 && !p0.A()))))))) {
             u = (iq0.a(owq0.G, i6, p0.r()) && iq0.a(owq0.H, i, p0.l()))? 1: 0;
             if (u) {
                uob00.e = p0.r();
                uob00.f = p0.l();
                uob00.g = owq0.b0;
                return;
             }
          }
          u = 3;
          i7 = (a == u)? 1: 0;
          u = (b == u)? 1: 0;
          i7 = 4;
          i2 = 1;
          b = (b != i7 && b != i2)? 0: 1;
          a = (a != i7 && a != i2)? 0: 1;
          i7 = 0;
          i2 = (i7 && (i7 - owq0.X) > 0)? 1: 0;
          i7 = (u && (i7 - owq0.X) > 0)? 1: 0;
          if (g0 == null) {
             return;
          }else {
             hq0 layoutParams = g0.getLayoutParams();
             if ((j = uob00.j) != 1 && (j != 2 && (i7 && (owq0.r == null && (u && owq0.s == null))))) {
                a = -1;
                i3 = 0;
             }else if(g0 instanceof ml7 && owq0 instanceof c62){
                g0.l(owq0, i6, i);
             }else {
                g0.measure(i6, i);
             }
             owq0.G = i6;
             owq0.H = i;
             owq0.g = false;
             int measuredWidt = g0.getMeasuredWidth();
             i1 = g0.getMeasuredHeight();
             i4 = g0.getBaseline();
             i3 = ((u1 = owq0.u) > null)? Math.max(u1, measuredWidt): measuredWidt;
             if ((v = owq0.v) > null) {
                i3 = Math.min(v, i3);
             }
             if ((v = owq0.x) > null) {
                i8 = Math.max(v, i1);
                i9 = i;
             }else {
                i9 = i;
                i8 = i1;
             }
             if ((k = owq0.y) > null) {
                i8 = Math.min(k, i8);
             }
             if (!xe7.r(h.z, 1)) {
                float f = 0x3f000000;
                if (i2 && b) {
                   i3 = (int)(((float)i8 * owq0.X) + f);
                }else if(i7 && a){
                   i8 = (int)(((float)i3 / owq0.X) + f);
                }
             }
             if (measuredWidt == i3 && i1 == i8) {
                i10 = i8;
                i8 = 0;
             }else if(measuredWidt != i3){
                i10 = 0x40000000;
                i6 = View$MeasureSpec.makeMeasureSpec(i3, i10);
             }else {
                i10 = 0x40000000;
             }
             i = (i1 != i8)? View$MeasureSpec.makeMeasureSpec(i8, i10): i9;
             g0.measure(i6, i);
             owq0.G = i6;
             owq0.H = i;
             owq0.g = false;
             i10 = g0.getMeasuredHeight();
             i4 = g0.getBaseline();
             i3 = g0.getMeasuredWidth();
             a = -1;
             int i11 = (i4 != a)? 1: 0;
             i = (i3 == uob00.c && i10 == uob00.d)? false: true;
             uob00.i = i;
             i2 = (layoutParams.c0 != null)? true: i11;
             if (i2 && (i4 != -1 && owq0.b0 != i4)) {
                uob00.i = true;
             }
             uob00.e = i3;
             uob00.f = i10;
             uob00.h = i2;
             uob00.g = i4;
             return;
          }
       }
    }
}
