package p.md3;
import p.jr5;
import p.er5;
import p.og1;
import java.util.ArrayList;
import p.l02;
import java.lang.Object;
import p.id3;
import android.view.View;
import p.zr5;
import androidx.recyclerview.widget.RecyclerView;
import p.kd3;
import android.graphics.Rect;
import p.vr5;
import android.graphics.Canvas;
import java.lang.Class;
import java.util.List;
import p.jd3;
import p.et0;
import android.view.VelocityTracker;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import p.xe0;
import p.hr5;
import java.lang.Integer;
import p.q65;
import java.util.Collection;
import p.yq5;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.String;
import p.w45;
import java.lang.IllegalArgumentException;
import android.view.ViewParent;
import p.wh7;
import p.eh7;
import p.dr5;

public final class md3 extends er5 implements jr5	// class@001e72 from classes.dex
{
    public Rect A;
    public long B;
    public final ArrayList a;
    public final float[] b;
    public zr5 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public final kd3 m;
    public int n;
    public int o;
    public final ArrayList p;
    public RecyclerView q;
    public final l02 r;
    public VelocityTracker s;
    public ArrayList t;
    public ArrayList u;
    public View v;
    public int w;
    public b7 x;
    public ld3 y;
    public final id3 z;

    public void md3(og1 p0){
       super();
       this.a = new ArrayList();
       float[] uofloatArray = new float[2];
       this.b = uofloatArray;
       this.c = null;
       this.l = -1;
       this.n = 0;
       this.p = new ArrayList();
       this.r = new l02(1, this);
       this.v = null;
       this.w = -1;
       this.z = new id3(this);
       this.m = p0;
    }
    public static boolean n(View p0,float p1,float p2,float p3,float p4){
       boolean b = ((p3 - p1) >= 0 && ((p1 - (p3 + (float)p0.getWidth())) <= 0 && ((p4 - p2) >= 0 && (p2 - (p4 + (float)p0.getHeight())) <= 0)))? true: false;
       return b;
    }
    public final void a(View p0){
    }
    public final void d(View p0){
       zr5 ozr5;
       this.p(p0);
       if ((ozr5 = this.q.L(p0)) == null) {
          return;
       }
       md3 tc = this.c;
       int i = 0;
       if (tc != null && ozr5 == tc) {
          this.q(null, i);
       }else {
          this.k(ozr5, i);
          if (this.a.remove(ozr5.a)) {
             this.m.a(ozr5);
          }
       }
       return;
    }
    public final void f(Rect p0,View p1,RecyclerView p2,vr5 p3){
       p0.setEmpty();
    }
    public final void g(Canvas p0,RecyclerView p1){
       md3 b;
       int i1;
       int i2;
       md3 omd3 = this;
       Canvas uCanvas = p0;
       omd3.w = -1;
       int i = 0;
       if (omd3.c != null) {
          b = omd3.b;
          omd3.m(b);
          i1 = b[1];
          i2 = b[i];
       }else {
          i2 = 0;
          i1 = 0;
       }
       md3 c = omd3.c;
       b = omd3.p;
       md3 m = omd3.m;
       m.getClass();
       int i3 = b.size();
       while (i < i3) {
          jd3 ojd3 = b.get(i);
          jd3 e = ojd3.e;
          jd3 a = ojd3.a;
          jd3 c1 = ojd3.c;
          ojd3.i = (!(c1 - a))? e.a.getTranslationX(): et0.l(c1, a, ojd3.m, a);
          a = ojd3.b;
          c1 = ojd3.d;
          ojd3.j = (!(c1 - a))? e.a.getTranslationY(): et0.l(c1, a, ojd3.m, a);
          m.e(p1, ojd3.e, ojd3.i, ojd3.j, 0);
          uCanvas.restoreToCount(p0.save());
          i = i + 1;
          int i4 = this;
       }
       if (c != null) {
          m.e(p1, c, i2, i1, true);
          uCanvas.restoreToCount(p0.save());
       }
       return;
    }
    public final void h(Canvas p0,RecyclerView p1){
       md3 tb;
       jd3 l;
       int i = 0;
       if (this.c != null) {
          tb = this.b;
          this.m(tb);
          int i1 = tb[1];
       }
       tb = this.c;
       md3 tp = this.p;
       this.m.getClass();
       int i2 = tp.size();
       for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
          p0.restoreToCount(p0.save());
       }
       if (tb != null) {
          p0.restoreToCount(p0.save());
       }
       i2 = i2 - 1;
       while (i2 >= 0) {
          jd3 ojd3 = tp.get(i2);
          if ((l = ojd3.l) != null && ojd3.h == null) {
             tp.remove(i2);
          }else if(l == null){
             i = 1;
          }
          i2 = i2 - 1;
       }
       if (i) {
          p1.invalidate();
       }
       return;
    }
    public final int i(int p0){
       if ((p0 & 0x0c)) {
          int i = 4;
          int i1 = 0;
          int i2 = ((i1 - this.h) > 0)? 8: 4;
          md3 ts = this.s;
          md3 tm = this.m;
          if (ts != null && this.l > -1) {
             tm.getClass();
             ts.computeCurrentVelocity(1000, this.g);
             float xVelocity = this.s.getXVelocity(this.l);
             float yVelocity = this.s.getYVelocity(this.l);
             if ((i1 - xVelocity) > 0) {
                i = 8;
             }
             float f = Math.abs(xVelocity);
             if (((i & p0)) && (i2 == i && ((this.f - f) >= 0 && (Math.abs(yVelocity) - f) > 0))) {
                return i;
             }
          }
          tm.getClass();
          float f1 = (float)this.q.getWidth() * 0x3f000000;
          if (((p0 & i2)) && (f1 - Math.abs(this.h)) > 0) {
             return i2;
          }
       }
       return 0;
    }
    public final int j(int p0){
       if ((p0 & 0x03)) {
          int i = 1;
          int i1 = 0;
          int i2 = ((i1 - this.i) > 0)? 2: 1;
          md3 ts = this.s;
          md3 tm = this.m;
          if (ts != null && this.l > -1) {
             tm.getClass();
             ts.computeCurrentVelocity(1000, this.g);
             float xVelocity = this.s.getXVelocity(this.l);
             float yVelocity = this.s.getYVelocity(this.l);
             if ((i1 - yVelocity) > 0) {
                i = 2;
             }
             float f = Math.abs(yVelocity);
             if (((i & p0)) && (i == i2 && ((this.f - f) >= 0 && (Math.abs(xVelocity) - f) > 0))) {
                return i;
             }
          }
          tm.getClass();
          float f1 = (float)this.q.getHeight() * 0x3f000000;
          if (((p0 & i2)) && (f1 - Math.abs(this.i)) > 0) {
             return i2;
          }
       }
       return 0;
    }
    public final void k(zr5 p0,boolean p1){
       md3 tp = this.p;
       int i = tp.size();
       while ((i = i - 1) >= 0) {
          jd3 ojd3 = tp.get(i);
          if (ojd3.e == p0) {
             ojd3.k = ojd3.k | p1;
             if (ojd3.l == null) {
                ojd3.g.cancel();
             }
             tp.remove(i);
             break ;
          }
       }
       return;
    }
    public final View l(MotionEvent p0){
       md3 tc;
       View view;
       float translationX;
       float translationY;
       float f;
       float x = p0.getX();
       float y = p0.getY();
       if ((tc = this.c) != null) {
          zr5 a = tc.a;
          if (md3.n(a, x, y, (this.j + this.h), (this.k + this.i))) {
             return a;
          }
       }
       tc = this.p;
       int i = tc.size();
       while (true) {
          if ((i = i - 1) >= 0) {
             jd3 ojd3 = tc.get(i);
             zr5 a1 = ojd3.e.a;
             if (md3.n(a1, x, y, ojd3.i, ojd3.j)) {
                return a1;
             }
             continue ;
          }else {
             tc = this.q;
             i = tc.w.e();
             do {
                if ((i = i - 1) >= 0) {
                   view = tc.w.d(i);
                   translationX = view.getTranslationX();
                   translationY = view.getTranslationY();
                   if (((f = (float)view.getLeft() + translationX)) >= 0) {
                      f = (float)view.getRight() + translationX;
                      if ((x - f) > 0 || (((translationX = (float)view.getTop() + translationY)) < 0 || ((translationX = (float)view.getBottom() + translationY)) > 0)) {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }else {
                   view = null;
                   break ;
                }
                break ;
             } while ((x - f) <= 0 && (((translationX = (float)view.getTop() + translationY)) >= 0 && ((translationX = (float)view.getBottom() + translationY)) <= 0));
             return view;
          }
       }
    }
    public final void m(float[] p0){
       int i = 0;
       p0[i] = ((this.o & 0x0c))? (this.j + this.h) - (float)this.c.a.getLeft(): this.c.a.getTranslationX();
       p0[1] = ((this.o & 0x03))? (this.k + this.i) - (float)this.c.a.getTop(): this.c.a.getTranslationY();
       return;
    }
    public final void o(zr5 p0){
       md3 t;
       View view;
       int i11;
       int i12;
       int i13;
       md3 omd31;
       int i16;
       int i17;
       md3 omd3 = this;
       zr5 ozr5 = p0;
       if (omd3.q.isLayoutRequested()) {
          return;
       }
       int i = 2;
       if (omd3.n != i) {
          return;
       }
       md3 m = omd3.m;
       m.getClass();
       int i1 = (int)(omd3.j + omd3.h);
       int i2 = (int)(omd3.k + omd3.i);
       zr5 a = ozr5.a;
       float f = 0x3f000000;
       if (((float)Math.abs((i2 - ozr5.a.getTop())) - ((float)a.getHeight() * f)) < 0 && ((float)Math.abs((i1 - a.getLeft())) - ((float)a.getWidth() * f)) < 0) {
          return;
       }
       if ((t = omd3.t) == null) {
          omd3.t = new ArrayList();
          omd3.u = new ArrayList();
       }else {
          t.clear();
          omd3.u.clear();
       }
       int i3 = 0;
       int i4 = Math.round((omd3.j + omd3.h)) - i3;
       int i5 = Math.round((omd3.k + omd3.i)) - i3;
       int i6 = (a.getWidth() + i4) + i3;
       int i7 = (a.getHeight() + i5) + i3;
       int i8 = (i4 + i6) / i;
       int i9 = (i5 + i7) / i;
       hr5 layoutManage = omd3.q.getLayoutManager();
       int i10 = layoutManage.I();
       while (i3 < i10) {
          if ((view = layoutManage.H(i3)) == a || (view.getBottom() < i5 || (view.getTop() > i7 || (view.getRight() < i4 || view.getLeft() > i6)))) {
             i11 = i4;
             i12 = i5;
             i13 = i6;
             int i14 = 2;
          }else {
             ozr5 = omd3.q.L(view);
             i = (Math.abs((i9 - ((view.getBottom() + view.getTop()) / 2))) * Math.abs((i9 - ((view.getBottom() + view.getTop()) / 2)))) + (Math.abs((i8 - ((view.getRight() + view.getLeft()) / 2))) * Math.abs((i8 - ((view.getRight() + view.getLeft()) / 2))));
             i11 = i4;
             i4 = omd3.t.size();
             i12 = i5;
             i13 = i6;
             i6 = 0;
             for (i5 = 0; i5 < i4; i4 = i15) {
                int i15 = i4;
                if (i > omd3.u.get(i5).intValue()) {
                   i6 = i6 + 1;
                   i5 = i5 + 1;
                }else {
                   break ;
                }
             }
             omd3.t.add(i6, ozr5);
             omd3.u.add(i6, Integer.valueOf(i));
          }
          i3 = i3 + 1;
          i4 = i11;
          i5 = i12;
          i6 = i13;
          view = 2;
       }
       md3 t1 = omd3.t;
       if (!t1.size()) {
          return;
       }else {
          i = a.getWidth() + i1;
          i4 = a.getHeight() + i2;
          i3 = i1 - a.getLeft();
          i5 = i2 - a.getTop();
          i6 = t1.size();
          zr5 ozr51 = null;
          i8 = 0;
          layoutManage = -1;
          while (i8 < i6) {
             zr5 ozr52 = t1.get(i8);
             if (i3 > 0 && (i7 = ozr52.a.getRight() - i) < 0) {
                omd31 = t1;
                i11 = i;
                if (ozr52.a.getRight() > a.getRight() && (i16 = Math.abs(i7)) > layoutManage) {
                   i17 = i16;
                   ozr51 = ozr52;
                }
             }else {
                omd31 = t1;
                i11 = i;
             }
             if (i3 < 0 && ((i16 = ozr52.a.getLeft() - i1) > 0 && (ozr52.a.getLeft() < a.getLeft() && (i16 = Math.abs(i16)) > i17))) {
                i17 = i16;
                ozr51 = ozr52;
             }
             if (i5 < 0 && ((i16 = ozr52.a.getTop() - i2) > 0 && (ozr52.a.getTop() < a.getTop() && (i16 = Math.abs(i16)) > i17))) {
                i17 = i16;
                ozr51 = ozr52;
             }
             if (i5 > 0 && ((i16 = ozr52.a.getBottom() - i4) < 0 && (ozr52.a.getBottom() > a.getBottom() && (i16 = Math.abs(i16)) > i17))) {
                i17 = i16;
                ozr51 = ozr52;
             }
             i8 = i8 + 1;
             t1 = omd31;
             i = i11;
          }
          if (ozr51 == null) {
             omd3.t.clear();
             omd3.u.clear();
             return;
          }else {
             i16 = ozr51.c();
             p0.c();
             m.e = ozr51.d();
             i = p0.d();
             i1 = ozr51.d();
             og1 h = m.h;
             if (h.x != null && i != i1) {
                i2 = -1;
                if (i != i2 && i1 != i2) {
                   ArrayList uArrayList = new ArrayList(h.x);
                   Object obj = uArrayList.get(i);
                   if (i < i1) {
                      uArrayList.add((i1 + 1), obj);
                      uArrayList.remove(i);
                   }else {
                      uArrayList.remove(i);
                      uArrayList.add(i1, obj);
                   }
                   h.x = uArrayList;
                   h.i(i, i1);
                }
             }
             m = omd3.q;
             hr5 layoutManage1 = m.getLayoutManager();
             zr5 a1 = ozr51.a;
             if (layoutManage1 instanceof LinearLayoutManager) {
                layoutManage1.n("Cannot drop a view during a scroll or layout calculation");
                layoutManage1.W0();
                layoutManage1.p1();
                int i18 = hr5.R(a1);
                i1 = 1;
                i16 = (hr5.R(a) < i18)? 1: -1;
                if (layoutManage1.M != null) {
                   if (i16 == i1) {
                      layoutManage1.r1(i18, (layoutManage1.J.i() - (layoutManage1.J.f(a) + layoutManage1.J.g(a1))));
                   }else {
                      layoutManage1.r1(i18, (layoutManage1.J.i() - layoutManage1.J.e(a1)));
                   }
                }else if(i16 == -1){
                   layoutManage1.r1(i18, layoutManage1.J.g(a1));
                }else {
                   layoutManage1.r1(i18, (layoutManage1.J.e(a1) - layoutManage1.J.f(a)));
                }
             }else if(layoutManage1.p()){
                if (((a1.getLeft() - hr5.Q(a1))) <= m.getPaddingLeft()) {
                   m.g0(i16);
                }
                if (((hr5.T(a1) + a1.getRight())) >= (m.getWidth() - m.getPaddingRight())) {
                   m.g0(i16);
                }
             }
             if (layoutManage1.q()) {
                if (((a1.getTop() - hr5.V(a1))) <= m.getPaddingTop()) {
                   m.g0(i16);
                }
                if (((hr5.G(a1) + a1.getBottom())) >= (m.getHeight() - m.getPaddingBottom())) {
                   m.g0(i16);
                }
             }
             return;
          }
       }
    }
    public final void p(View p0){
       if (p0 == this.v) {
          this.v = null;
       }
       return;
    }
    public final void q(zr5 p0,int p1){
       zr5 a;
       int i5;
       md3 s;
       int i6;
       float f;
       int i7;
       md3 omd32;
       dr5 itemAnimator;
       long l;
       jd3 g;
       boolean b1;
       zr5 ozr51;
       md3 ozr51;
       int ozr511;
       ViewParent ozr512;
       md3 omd3 = this;
       zr5 ozr5 = p0;
       int i = p1;
       if (ozr5 == omd3.c && i == omd3.n) {
          return;
       }
       omd3.B = Long.MIN_VALUE;
       md3 n = omd3.n;
       boolean b = true;
       omd3.k(ozr5, b);
       omd3.n = i;
       int i1 = 2;
       if (i == i1) {
          if (ozr5 != null) {
             omd3.v = ozr5.a;
          }else {
             throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
          }
       }
       int i2 = (b << ((i * 8) + 8)) - 1;
       md3 c = omd3.c;
       int i3 = 0x30003;
       int i4 = 0;
       md3 m = omd3.m;
       if (c != null) {
          a = c.a;
          VelocityTracker velocityTrac = null;
          if (a.getParent() != null) {
             if (n == i1) {
                i5 = 0;
             }else if(omd3.n == i1){
             label_00f5 :
                g = 0;
             }else {
                s = omd3.q;
                ozr511 = (m.f != null)? 0x30003: 0;
                int i8 = eh7.d(s);
                if (!(i6 = ozr511 & 0x303030)) {
                   i8 = ozr511;
                }else {
                   i5 = (~ i6) & ozr511;
                   if (!i8) {
                      i8 = i6 >> 2;
                   }else {
                      i8 = i6 >> 1;
                      i5 = i5 | (i8 & -3158065);
                      i8 = (i8 & 0x303030) >> i1;
                   }
                   i8 = i8 | i5;
                }
                i6 = 0xff00;
                if (!(i8 = (i8 & i6) >> 8)) {
                   goto label_00f5 ;
                }else {
                   ozr511 = (ozr511 & i6) >> 8;
                   int i9 = -789517;
                   int i10 = 0xc0c0c;
                   if ((Math.abs(omd3.i) - Math.abs(omd3.h)) > 0) {
                      if ((i6 = omd3.i(i8)) > 0) {
                         if (!((ozr511 & i6))) {
                            i8 = eh7.d(omd3.q);
                            if (ozr511 = i6 & i10) {
                               i6 = i6 & (~ ozr511);
                               if (!i8) {
                               label_00bf :
                                  i8 = ozr511 << 2;
                               label_00ca :
                                  i6 = i8 | i6;
                               }
                            }
                         }
                      }else if((i6 = omd3.j(i8)) > 0){
                      }
                   }else if((i6 = omd3.j(i8)) > 0){
                      if ((i6 = omd3.i(i8)) > 0) {
                         if (!((ozr511 & i6))) {
                            i8 = eh7.d(omd3.q);
                            if (ozr511 = i6 & i10) {
                               i6 = i6 & (~ ozr511);
                               if (!i8) {
                                  goto label_00bf ;
                               }
                            }
                         }
                      }else {
                         goto label_00f5 ;
                      }
                   }
                   i8 = ozr511 << 1;
                   i6 = i6 | (i8 & i9);
                   i8 = (i8 & i10) << i1;
                   goto label_00ca ;
                }
             }
             i5 = g;
             if ((s = omd3.s) != null) {
                s.recycle();
                omd3.s = velocityTrac;
             }
             s = 4;
             if (i5 != b && i5 != i1) {
                i6 = (i5 != s && (i5 != 8 && (i5 != 16 && i5 != 32)))? 0: Math.signum(omd3.h) * (float)omd3.q.getWidth();
                f = i6;
                i7 = 0;
             }else {
                i7 = Math.signum(omd3.i) * (float)omd3.q.getHeight();
                omd32 = 0;
             }
             if (n == i1) {
                i6 = 8;
             }else if(i5 > 0){
                g = 2;
             }else {
                g = 4;
             }
             s = omd3.b;
             omd3.m(s);
             jd3 ojd3 = v1;
             jd3 ojd31 = v1;
             i1 = i6;
             md3 omd31 = m;
             omd32 = c;
             ojd3 = new jd3(this, c, n, s[i4], s[b], f, i7, i5, omd32);
             omd31.getClass();
             if ((itemAnimator = omd3.q.getItemAnimator()) == null) {
                l = (i1 == 8)? 200: 250;
             }else if(i1 == 8){
                l = itemAnimator.e;
             }else {
                l = itemAnimator.d;
             }
             g = ojd31.g;
             g.setDuration(l);
             omd3.p.add(ojd31);
             b1 = false;
             omd32.p(b1);
             g.start();
             s = omd31;
             ozr51 = null;
             i7 = 1;
          }else {
             b1 = 0;
             omd3.p(a);
             s = m;
             s.a(c);
             ozr51 = null;
             i4 = 0;
          }
          omd3.c = ozr51;
       }else {
          s = m;
          b1 = 0;
          i4 = 0;
       }
       if (ozr5 != null) {
          ozr51 = omd3.q;
          s.getClass();
          if (s.f == null) {
             i3 = 0;
          }
          ozr511 = eh7.d(ozr51);
          if (i6 = i3 & 0x303030) {
             i5 = i3 & (~ i6);
             if (!ozr511) {
                ozr511 = 2;
             }else {
                ozr511 = 2;
                i6 = i6 >> 1;
                i5 = i5 | (i6 & -3158065);
                i6 = i6 & 0x303030;
             }
             i3 = i5 | (i6 >> ozr511);
          }
          omd3.o = (i3 & i2) >> (omd3.n * 8);
          ozr51 = ozr5.a;
          omd3.j = (float)ozr51.getLeft();
          omd3.k = (float)ozr51.getTop();
          omd3.c = ozr5;
          if (i == 2) {
             ozr51.performHapticFeedback(b1);
          }
       }
       if ((ozr512 = omd3.q.getParent()) != null) {
          if (omd3.c != null) {
             b1 = true;
          }
          ozr512.requestDisallowInterceptTouchEvent(b1);
       }
       if (!i7) {
          ozr512.w = true;
       }
       ozr51 = omd3.c;
       m = s;
       if (ozr51 != null) {
          m.e = -1;
          m.d = ozr51.d();
          ozr51.a.setBackgroundResource(R.color.gray_layer);
       }else {
          m.getClass();
       }
       omd3.q.invalidate();
       return;
    }
    public final void r(int p0,int p1,MotionEvent p2){
       float f = p2.getX(p1) - this.d;
       this.h = f;
       this.i = p2.getY(p1) - this.e;
       if (!((p0 & 0x04))) {
          this.h = Math.max(0, f);
       }
       if (!((p0 & 0x08))) {
          this.h = Math.min(0, this.h);
       }
       if (!((p0 & 0x01))) {
          this.i = Math.max(0, this.i);
       }
       if (!((p0 & 0x02))) {
          this.i = Math.min(0, this.i);
       }
       return;
    }
}
