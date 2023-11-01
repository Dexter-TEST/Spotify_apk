package p.l02;
import java.lang.Runnable;
import java.lang.Object;
import p.md3;
import java.lang.System;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Rect;
import p.zr5;
import android.view.View;
import p.kd3;
import p.wh7;
import p.dh7;
import p.o02;
import android.animation.ValueAnimator;
import java.lang.Float;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class l02 implements Runnable	// class@001cb8 from classes.dex
{
    public final int a;
    public final Object b;

    public void l02(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       float[] uofloatArray;
       int i5;
       int i6;
       md3 c;
       long l1;
       l02 ol02 = this;
       int i = 0;
       int i1 = 1;
       l02 b = ol02.b;
       int i2 = 0;
       switch (ol02.a){
           case 0:
             o02 a = b.A;
             o02 z = b.z;
             if (a != i1) {
                if (a == 2) {
                }
             }else {
                z.cancel();
             }
             break;
           case 1:
             if (b.c != null) {
                long l = System.currentTimeMillis();
                md3 b1 = b.B;
                b1 = (!(b1 - Long.MIN_VALUE))? 0: l - b1;
                hr5 layoutManage = b.q.getLayoutManager();
                if (b.A == null) {
                   b.A = new Rect();
                }
                layoutManage.o(b.c.a, b.A);
                if (layoutManage.p()) {
                   int i3 = (int)(b.j + b.h);
                   int i4 = (i3 - b.A.left) - b.q.getPaddingLeft();
                   md3 h = b.h;
                   if ((h - i) < 0 && (i4 < 0 || ((i - h) > 0 && (i4 = ((b.c.a.getWidth() + i3) + b.A.right) - (b.q.getWidth() - b.q.getPaddingRight())) > 0))) {
                      i5 = i4;
                   label_0086 :
                      if (layoutManage.q()) {
                         i6 = (int)(b.k + b.i);
                         i3 = (i6 - b.A.top) - b.q.getPaddingTop();
                         md3 i7 = b.i;
                         if ((i7 - i) < 0 && (i3 < 0 || ((i - i7) > 0 && (i3 = ((b.c.a.getHeight() + i6) + b.A.bottom) - (b.q.getHeight() - b.q.getPaddingBottom())) > 0))) {
                            i6 = i3;
                         label_00ce :
                            if (i5) {
                               b.q.getWidth();
                               i5 = b.m.d(b.q, b.c.a.getWidth(), i5, b1);
                            }
                            i4 = i5;
                            if (i6) {
                               b.q.getHeight();
                               i6 = b.m.d(b.q, b.c.a.getHeight(), i6, b1);
                            }
                            if (!i4 && !i6) {
                               b.B = Long.MIN_VALUE;
                               i1 = 0;
                            }else if(!(b.B - Long.MIN_VALUE)){
                               b.B = l;
                            }
                            b.q.scrollBy(i4, i6);
                            if (i1) {
                               if ((c = b.c) != null) {
                                  b.o(c);
                               }
                               b.q.removeCallbacks(b.r);
                               dh7.m(b.q, ol02);
                            }
                         }
                      }
                      i6 = 0;
                      goto label_00ce ;
                   }
                }
                i5 = 0;
                goto label_0086 ;
             }
             return;
             break;
           default:
             b.R0();
             return;
       }
       return;
    }
}
