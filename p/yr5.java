package p.yr5;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.widget.OverScroller;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import p.wh7;
import p.dh7;
import java.lang.Math;
import android.os.Build$VERSION;
import android.widget.EdgeEffect;
import p.hr5;
import p.ur5;
import p.vr5;
import java.util.ArrayList;
import p.zh2;
import java.util.Arrays;
import p.bi2;

public final class yr5 implements Runnable	// class@002e13 from classes.dex
{
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator t;
    public boolean v;
    public boolean w;
    public final RecyclerView x;

    public void yr5(RecyclerView p0){
       this.x = p0;
       super();
       ai7 y0 = RecyclerView.Y0;
       this.t = y0;
       this.v = false;
       this.w = false;
       this.c = new OverScroller(p0.getContext(), y0);
    }
    public final void a(int p0,int p1){
       yr5 tx = this.x;
       tx.setScrollState(2);
       this.b = 0;
       this.a = 0;
       ai7 y0 = RecyclerView.Y0;
       if (this.t != y0) {
          this.t = y0;
          this.c = new OverScroller(tx.getContext(), y0);
       }
       this.c.fling(0, 0, p0, p1, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
       this.b();
       return;
    }
    public final void b(){
       if (this.v != null) {
          this.w = true;
       }else {
          yr5 tx = this.x;
          tx.removeCallbacks(this);
          dh7.m(tx, this);
       }
       return;
    }
    public final void c(int p0,int p1,int p2,Interpolator p3){
       ai7 y0;
       yr5 tx = this.x;
       if (p2 == Integer.MIN_VALUE) {
          p2 = Math.abs(p0);
          int i = Math.abs(p1);
          int i1 = (p2 > i)? 1: 0;
          int width = (i1)? tx.getWidth(): tx.getHeight();
          if (!i1) {
             p2 = i;
          }
          p2 = Math.min((int)((((float)p2 / (float)width) + 0x3f800000) * 300.00f), 2000);
       }
       int i2 = p2;
       if (p3 == null) {
          y0 = RecyclerView.Y0;
       }
       if (this.t != y0) {
          this.t = y0;
          this.c = new OverScroller(tx.getContext(), y0);
       }
       this.b = 0;
       this.a = 0;
       tx.setScrollState(2);
       this.c.startScroll(0, 0, p0, p1, i2);
       if (Build$VERSION.SDK_INT < 23) {
          this.c.computeScrollOffset();
       }
       this.b();
       return;
    }
    public final void run(){
       hr5 v;
       int i4;
       int i5;
       int i6;
       RecyclerView x0;
       zh2 d;
       hr5 v2;
       yr5 oyr5 = this;
       yr5 x = oyr5.x;
       if (x.E == null) {
          x.removeCallbacks(oyr5);
          oyr5.c.abortAnimation();
          return;
       }else {
          oyr5.w = false;
          oyr5.v = true;
          x.o();
          yr5 c = oyr5.c;
          if (c.computeScrollOffset()) {
             int currX = c.getCurrX();
             int currY = c.getCurrY();
             int i = currX - oyr5.a;
             int i1 = currY - oyr5.b;
             oyr5.a = currX;
             oyr5.b = currY;
             int i2 = RecyclerView.n(i, x.c0, x.e0, x.getWidth());
             int i3 = RecyclerView.n(i1, x.d0, x.f0, x.getHeight());
             RecyclerView l0 = x.L0;
             l0[0] = false;
             l0[1] = false;
             RecyclerView l01 = x.L0;
             if (x.u(i2, i3, l0, null, 1)) {
                i2 = i2 - l01[0];
                i3 = i3 - l01[1];
             }
             if (x.getOverScrollMode() != 2) {
                x.m(i2, i3);
             }
             if (x.D != null) {
                l01[0] = false;
                l01[1] = false;
                x.f0(i2, i3, l01);
                currX = l01[0];
                currY = l01[1];
                i2 = i2 - currX;
                i3 = i3 - currY;
                if ((v = x.E.v) != null && (v.d == null && v.e != null)) {
                   if (!(i1 = x.y0.b())) {
                      v.d();
                   }else if(v.a >= i1){
                      v.a = i1 - true;
                      v.b(currX, currY);
                   }else {
                      v.b(currX, currY);
                   }
                }
                i4 = currX;
                i5 = i2;
                i6 = i3;
                i3 = currY;
             }else {
                i5 = i2;
                i6 = i3;
                i3 = 0;
                i4 = 0;
             }
             if (!x.G.isEmpty()) {
                x.invalidate();
             }
             RecyclerView l02 = x.L0;
             l02[0] = false;
             l02[1] = false;
             int i7 = i3;
             x.v(i4, i3, i5, i6, null, 1, l02);
             i5 = i5 - l01[0];
             i6 = i6 - l01[1];
             if (i4 || i7) {
                x.w(i4, i7);
             }
             if (!RecyclerView.e(x)) {
                x.invalidate();
             }
             currX = (c.getCurrX() == c.getFinalX())? 1: 0;
             currY = (c.getCurrY() == c.getFinalY())? 1: 0;
             v2 = (!c.isFinished() && (!currX && (!i5 || (!currY && !i6))))? 0: 1;
             hr5 v1 = ((v1 = x.E.v) != null && v1.d != null)? 1: 0;
             if (!v1 && currX) {
                if (x.getOverScrollMode() != 2) {
                   currX = (int)c.getCurrVelocity();
                   if (i5 < 0) {
                      currY = - currX;
                   }else if(i5 > 0){
                      currY = currX;
                   }else {
                      currY = 0;
                   }
                   if (i6 < 0) {
                      currX = - currX;
                   }else if(i6 > 0){
                      currX = 0;
                   }
                   if (currY < 0) {
                      x.y();
                      if (x.c0.isFinished()) {
                         x.c0.onAbsorb((- currY));
                      }
                   }else if(currY > 0){
                      x.z();
                      if (x.e0.isFinished()) {
                         x.e0.onAbsorb(currY);
                      }
                   }
                   if (currX < 0) {
                      x.A();
                      if (x.d0.isFinished()) {
                         x.d0.onAbsorb((- currX));
                      }
                   }else if(currX > 0){
                      x.x();
                      if (x.f0.isFinished()) {
                         x.f0.onAbsorb(currX);
                      }
                   }
                   if (currY || currX) {
                      dh7.k(x);
                   }
                }
                if (RecyclerView.W0) {
                   x0 = x.x0;
                   if ((d = x0.d) != null) {
                      Arrays.fill(d, -1);
                   }
                   x0.c = 0;
                }
             }else {
                this.b();
                if ((x0 = x.w0) != null) {
                   x0.a(x, i4, i7);
                }
             }
          }
          if ((v2 = x.E.v) != null && v2.d != null) {
             v2.b(false, false);
          }
          oyr5.v = false;
          if (oyr5.w != null) {
             x.removeCallbacks(oyr5);
             dh7.m(x, oyr5);
          }else {
             x.setScrollState(false);
             x.d(true);
          }
          return;
       }
    }
}
