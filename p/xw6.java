package p.xw6;
import p.ap5;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.view.View;
import p.wh7;
import p.eh7;
import java.lang.Math;
import android.view.ViewParent;
import p.u44;
import p.qm6;
import p.rz;
import p.mz;
import p.om6;
import p.bi7;
import p.ub6;
import java.lang.Runnable;
import p.dh7;

public final class xw6 extends ap5	// class@002d01 from classes.dex
{
    public int G;
    public int H;
    public final SwipeDismissBehavior I;

    public void xw6(SwipeDismissBehavior p0){
       this.I = p0;
       super();
       this.H = -1;
    }
    public final boolean D(View p0,int p1){
       xw6 tH;
       boolean b = ((tH = this.H) != -1 && (tH != p1 || !this.I.u(p0)))? false: true;
       return b;
    }
    public final int k(View p0,int p1){
       SwipeDismissBehavior d;
       xw6 tG;
       xw6 tG1;
       int width;
       int i = 1;
       int i1 = (eh7.d(p0) == i)? 1: 0;
       if ((d = this.I.d) == null) {
          if (i1) {
             i1 = this.G - p0.getWidth();
             tG = this.G;
          }else {
             tG1 = this.G;
             width = p0.getWidth();
          label_002f :
             width = width + tG1;
          }
       }else if(d == i){
          if (i1) {
             tG1 = this.G;
             width = p0.getWidth();
             goto label_002f ;
          }else {
             tG1 = this.G - p0.getWidth();
             tG = this.G;
          }
       }else {
          tG1 = this.G - p0.getWidth();
          width = p0.getWidth() + this.G;
       }
       return Math.min(Math.max(i1, p1), tG);
    }
    public final int l(View p0,int p1){
       return p0.getTop();
    }
    public final int q(View p0){
       return p0.getWidth();
    }
    public final void w(View p0,int p1){
       ViewParent parent;
       this.H = p1;
       this.G = p0.getLeft();
       if ((parent = p0.getParent()) != null) {
          parent.requestDisallowInterceptTouchEvent(true);
       }
       return;
    }
    public final void x(int p0){
       SwipeDismissBehavior b;
       if ((b = this.I.b) != null) {
          u44 b1 = b.b;
          if (p0) {
             if (p0 == 1 || p0 == 2) {
                qm6.b().d(b1.n);
             }
          }else {
             rz orz = qm6.b();
             qm6 a = orz.a;
             _monitor_enter(a);
             if (orz.c(b1.n)) {
                qm6 c = orz.c;
                if (c.c != null) {
                   c.c = false;
                   orz.f(c);
                }
             }
             _monitor_exit(a);
          }
       }
       return;
    }
    public final void y(View p0,int p1,int p2){
       xw6 tI = this.I;
       float f = ((float)p0.getWidth() * tI.f) + (float)this.G;
       float f1 = ((float)p0.getWidth() * tI.g) + (float)this.G;
       float f2 = (float)p1;
       if ((f2 - f) <= 0) {
          p0.setAlpha(0x3f800000);
       }else if((f1 - f2) >= 0){
          p0.setAlpha(0);
       }else {
          p0.setAlpha(Math.min(Math.max(0, (0x3f800000 - ((f2 - f) / (f1 - f)))), 0x3f800000));
       }
       return;
    }
    public final void z(View p0,float p1,float p2){
       SwipeDismissBehavior d;
       int i3;
       SwipeDismissBehavior b1;
       this.H = -1;
       int width = p0.getWidth();
       xw6 tI = this.I;
       boolean b = true;
       int i = 0;
       if (v4 = i - p1) {
          int i1 = (eh7.d(p0) == b)? 1: 0;
          if ((d = tI.d) == 2) {
          label_0053 :
             int i2 = 1;
          label_0056 :
             if (i2) {
                xw6 tG = this.G;
                i3 = (p0.getLeft() < tG)? tG - width: tG + width;
             }else {
                i3 = this.G;
                b = false;
             }
             if (tI.a.q(i3, p0.getTop())) {
                dh7.m(p0, new ub6(tI, p0, b));
             }else if(b && (b1 = tI.b) != null){
                b1.B(p0);
             }
             return;
          }else if(d == null){
             if (i1) {
                if ((p1 - i) < 0) {
                   goto label_0053 ;
                }
             }else if(v4 > 0){
                goto label_0053 ;
             }
          }else if(d == b){
             if (i1) {
                if (v4 > 0) {
                   goto label_0053 ;
                }
             }else if((p1 - i) < 0){
                goto label_0053 ;
             }
          }
       }else if(Math.abs((p0.getLeft() - this.G)) >= Math.round(((float)p0.getWidth() * tI.e))){
          goto label_0053 ;
       }
       b1 = 0;
       goto label_0056 ;
    }
}
