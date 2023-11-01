package p.s52;
import p.n52;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import p.p52;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Iterator;
import p.r52;
import p.q52;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import p.o52;
import android.graphics.drawable.Drawable;
import p.w51;
import java.lang.Integer;
import java.lang.Math;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.tp2;
import android.view.ViewGroup$MarginLayoutParams;
import p.r14;

public final class s52	// class@0025bf from classes.dex
{
    public final n52 a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public void s52(n52 p0){
       super();
       this.a = p0;
    }
    public static ArrayList e(List p0,int p1,int p2){
       ArrayList uArrayList = new ArrayList();
       p52 op52 = new p52();
       op52.g = (p1 - p2) / 2;
       p1 = p0.size();
       int i = 0;
       while (i < p1) {
          if (!i) {
             uArrayList.add(op52);
          }
          uArrayList.add(p0.get(i));
          int i1 = p0.size() - 1;
          if (i == i1) {
             uArrayList.add(op52);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static int[] r(int p0,ArrayList p1,SparseIntArray p2){
       Collections.sort(p1);
       p2.clear();
       int[] ointArray = new int[p0];
       Iterator iterator = p1.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          r52 or52 = iterator.next();
          r52 a = or52.a;
          ointArray[i] = a;
          p2.append(a, or52.b);
          i = i + 1;
       }
       return ointArray;
    }
    public final void a(List p0,p52 p1,int p2,int p3){
       p1.m = p3;
       this.a.e(p1);
       p1.p = p2;
       p0.add(p1);
    }
    public final void b(q52 p0,int p1,int p2,int p3,int p4,int p5,List p6){
       View view;
       int i10;
       ArrayList uArrayList1;
       int i11;
       ArrayList uArrayList2;
       int i12;
       Drawable uDrawable;
       int i13;
       o52 layoutParams1;
       int i14;
       int i15;
       s52 c;
       s52 os52 = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p5;
       s52 a = os52.a;
       boolean b = a.i();
       int mode = View$MeasureSpec.getMode(p1);
       int size = View$MeasureSpec.getSize(p1);
       ArrayList uArrayList = (p6 == null)? new ArrayList(): p6;
       i.a = uArrayList;
       int i4 = (i3 == -1)? 1: 0;
       int paddingStart = (b)? a.getPaddingStart(): a.getPaddingTop();
       int paddingEnd = (b)? a.getPaddingEnd(): a.getPaddingBottom();
       int paddingTop = (b)? a.getPaddingTop(): a.getPaddingStart();
       int paddingBotto = (b)? a.getPaddingBottom(): a.getPaddingEnd();
       p52 op52 = new p52();
       int i5 = p4;
       op52.o = i5;
       paddingStart = paddingStart + paddingEnd;
       op52.e = paddingStart;
       paddingEnd = a.getFlexItemCount();
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = Integer.MIN_VALUE;
       while (true) {
          if (i5 < paddingEnd) {
             if ((view = a.f(i5)) == null) {
                i = paddingEnd - 1;
                if (i5 == i) {
                   p4 = i4;
                   if (i = op52.h - op52.i) {
                      view = 1;
                   label_0089 :
                      if (view) {
                         os52.a(uArrayList, op52, i5, i6);
                      }
                   }
                }else {
                   p4 = i4;
                }
                view = 0;
                goto label_0089 ;
             }else {
                p4 = i4;
                if (view.getVisibility() == 8) {
                   i = op52.i + 1;
                   op52.i = i;
                   i4 = op52.h + 1;
                   op52.h = i4;
                   i3 = paddingEnd - 1;
                   view = (i5 == i3 && (i4 = i4 - i))? 1: 0;
                   if (view) {
                      os52.a(uArrayList, op52, i5, i6);
                   }
                }else if(view instanceof CompoundButton){
                   View view1 = view;
                   o52 layoutParams = view1.getLayoutParams();
                   i11 = paddingEnd;
                   paddingEnd = layoutParams.t();
                   uArrayList2 = uArrayList;
                   i12 = layoutParams.s();
                   i13 = ((uDrawable = w51.u(view1)) == null)? 0: uDrawable.getMinimumWidth();
                   if (uDrawable == null) {
                      uDrawable = -1;
                      i10 = 0;
                   }else {
                      i10 = uDrawable.getMinimumHeight();
                      layoutParams1 = -1;
                   }
                   if (paddingEnd == uDrawable) {
                      paddingEnd = i13;
                   }
                   layoutParams.A(paddingEnd);
                   if (i12 == uDrawable) {
                      i12 = i10;
                   }
                   layoutParams.g(i12);
                }else {
                   uArrayList2 = uArrayList;
                   i11 = paddingEnd;
                }
                layoutParams1 = view.getLayoutParams();
                if (layoutParams1.n() == 4) {
                   op52.n.add(Integer.valueOf(i5));
                }
                i12 = (b)? layoutParams1.x(): layoutParams1.k();
                if ((0xbf800000 - layoutParams1.l()) && mode == 0x40000000) {
                   float f = layoutParams1.l() * (float)size;
                   i12 = Math.round(f);
                }
                if (b) {
                   i4 = layoutParams1.E() + paddingStart;
                   paddingEnd = layoutParams1.r() + i4;
                   i12 = a.h(i1, paddingEnd, i12);
                   i4 = paddingTop + paddingBotto;
                   paddingEnd = layoutParams1.K() + i4;
                   i4 = layoutParams1.B() + paddingEnd;
                   i4 = i4 + i6;
                   i4 = a.c(i2, i4, layoutParams1.k());
                   view.measure(i12, i4);
                   os52.v(view, i5, i12, i4);
                }else {
                   i4 = paddingTop + paddingBotto;
                   paddingEnd = layoutParams1.E() + i4;
                   i4 = layoutParams1.r() + paddingEnd;
                   i4 = i4 + i6;
                   i4 = a.h(i2, i4, layoutParams1.x());
                   paddingEnd = layoutParams1.K() + paddingStart;
                   paddingEnd = layoutParams1.B() + paddingEnd;
                   i12 = a.c(i1, paddingEnd, i12);
                   view.measure(i4, i12);
                   os52.v(view, i5, i4, i12);
                }
                a.g(view, i5);
                os52.c(view, i5);
                i7 = View.combineMeasuredStates(i7, view.getMeasuredState());
                p52 e = op52.e;
                paddingEnd = (b)? view.getMeasuredWidth(): view.getMeasuredHeight();
                i13 = (b)? layoutParams1.E(): layoutParams1.K();
                i13 = i13 + paddingEnd;
                paddingEnd = (b)? layoutParams1.r(): layoutParams1.B();
                paddingEnd = paddingEnd + i13;
                i13 = uArrayList2.size();
                if (a.getFlexWrap()) {
                   if (layoutParams1.w()) {
                      i10 = mode;
                      i14 = paddingStart;
                      i1 = i8;
                   }else if(!mode){
                      i1 = a.getMaxLine();
                      i10 = mode;
                      i14 = paddingStart;
                      if (i1 != -1) {
                         paddingStart = i13 + 1;
                         if (i1 <= paddingStart) {
                         label_01ec :
                            i1 = i8;
                            uArrayList1 = 0;
                         label_020e :
                            if (uArrayList1) {
                               if ((i1 = op52.h - op52.i) > 0) {
                                  if (i5 > 0) {
                                     i1 = i5 - 1;
                                     uArrayList1 = uArrayList2;
                                  }else {
                                     uArrayList1 = uArrayList2;
                                     i1 = 0;
                                  }
                                  os52.a(uArrayList1, op52, i1, i6);
                                  i6 = i6 + op52.g;
                               }else {
                                  uArrayList1 = uArrayList2;
                               }
                               if (b) {
                                  if (layoutParams1.k() == -1) {
                                     i15 = a.getPaddingBottom() + a.getPaddingTop();
                                     i1 = layoutParams1.K() + i15;
                                     i15 = layoutParams1.B() + i1;
                                     i15 = i15 + i6;
                                     view.measure(i12, a.c(i2, i15, layoutParams1.k()));
                                     os52.c(view, i5);
                                  }
                               }else if(layoutParams1.x() == -1){
                                  i15 = a.getPaddingRight() + a.getPaddingLeft();
                                  i1 = layoutParams1.E() + i15;
                                  i15 = layoutParams1.r() + i1;
                                  i15 = i15 + i6;
                                  view.measure(a.h(i2, i15, layoutParams1.x()), i12);
                                  os52.c(view, i5);
                               }
                               op52 = new p52();
                               op52.h = 1;
                               paddingStart = i14;
                               op52.e = paddingStart;
                               op52.o = i5;
                               i1 = 0;
                               i4 = Integer.MIN_VALUE;
                            }else {
                               uArrayList1 = uArrayList2;
                               paddingStart = i14;
                               i4 = op52.h + 1;
                               op52.h = i4;
                               i8 = i1 + 1;
                               i1 = i8;
                               i4 = i9;
                            }
                            p52 q = op52.q;
                            int i16 = 0;
                            i8 = (i16 - layoutParams1.i())? 1: 0;
                            paddingEnd = q | i8;
                            op52.q = paddingEnd;
                            q = op52.r;
                            i8 = (i16 - layoutParams1.o())? 1: 0;
                            paddingEnd = q | i8;
                            op52.r = paddingEnd;
                            if ((c = os52.c) != null) {
                               c[i5] = uArrayList1.size();
                            }
                            q = op52.e;
                            i8 = (b)? view.getMeasuredWidth(): view.getMeasuredHeight();
                            i16 = (b)? layoutParams1.E(): layoutParams1.K();
                            i16 = i16 + i8;
                            i8 = (b)? layoutParams1.r(): layoutParams1.B();
                            i8 = i8 + i16;
                            paddingEnd = i8 + q;
                            op52.e = paddingEnd;
                            float f1 = layoutParams1.i() + op52.j;
                            op52.j = f1;
                            f1 = layoutParams1.o() + op52.k;
                            op52.k = f1;
                            a.j(view, i5, i1, op52);
                            paddingEnd = (b)? view.getMeasuredHeight(): view.getMeasuredWidth();
                            i8 = (b)? layoutParams1.K(): layoutParams1.E();
                            i8 = i8 + paddingEnd;
                            paddingEnd = (b)? layoutParams1.B(): layoutParams1.r();
                            paddingEnd = paddingEnd + i8;
                            paddingEnd = a.k(view) + paddingEnd;
                            i4 = Math.max(i4, paddingEnd);
                            op52.g = Math.max(op52.g, i4);
                            if (b) {
                               if (a.getFlexWrap() != 2) {
                                  i3 = layoutParams1.K() + view.getBaseline();
                                  op52.l = Math.max(op52.l, i3);
                               }else {
                                  paddingEnd = view.getMeasuredHeight() - view.getBaseline();
                                  i = layoutParams1.B() + paddingEnd;
                                  op52.l = Math.max(op52.l, i);
                               }
                            }
                            paddingEnd = i11 - 1;
                            layoutParams1 = (i5 == paddingEnd && (i = op52.h - op52.i))? 1: 0;
                            if (layoutParams1) {
                               os52.a(uArrayList1, op52, i5, i6);
                               i6 = i6 + op52.g;
                            }
                            i = p5;
                            i3 = -1;
                            if (i != i3 && (uArrayList1.size() > 0 && ((i12 = uArrayList1.size() + i3) >= i && (i5 >= i && !p4)))) {
                               i12 = - op52.g;
                               paddingEnd = p3;
                               i6 = i12;
                               i12 = 1;
                            }else {
                               paddingEnd = p3;
                               i12 = p4;
                            }
                            if (i6 > paddingEnd && i12) {
                               i = p0;
                               paddingEnd = i7;
                               break ;
                            }else {
                               i8 = i1;
                               i9 = i4;
                               i4 = i12;
                            label_03cb :
                               i5 = i5 + 1;
                               i1 = p1;
                               uArrayList = uArrayList1;
                               paddingEnd = i11;
                               mode = i10;
                               i3 = p0;
                            }
                         }
                      }
                      i1 = i8;
                      if ((mode = a.b(view, i5, i1)) > 0) {
                         paddingEnd = paddingEnd + mode;
                      }
                      i4 = e + paddingEnd;
                      if (size >= i4) {
                      }
                   }
                   uArrayList1 = 1;
                   goto label_020e ;
                }
                i10 = mode;
                i14 = paddingStart;
                goto label_01ec ;
             }
             i4 = p4;
             i = p5;
             i10 = mode;
             uArrayList1 = uArrayList;
             i11 = paddingEnd;
             paddingEnd = p3;
             goto label_03cb ;
          }else {
             paddingEnd = i7;
             i = p0;
             break ;
          }
       }
       i.b = paddingEnd;
       return;
    }
    public final void c(View p0,int p1){
       int i1;
       o52 layoutParams = p0.getLayoutParams();
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       int i = 1;
       if (measuredWidt < layoutParams.t()) {
          measuredWidt = layoutParams.t();
       }else if(measuredWidt > layoutParams.I()){
          measuredWidt = layoutParams.I();
       }else {
          i1 = 0;
       label_0027 :
          if (measuredHeig < layoutParams.s()) {
             measuredHeig = layoutParams.s();
          }else if(measuredHeig > layoutParams.z()){
             measuredHeig = layoutParams.z();
          }else {
             i = i1;
          }
          if (i) {
             measuredWidt = View$MeasureSpec.makeMeasureSpec(measuredWidt, 0x40000000);
             int i2 = View$MeasureSpec.makeMeasureSpec(measuredHeig, 0x40000000);
             p0.measure(measuredWidt, i2);
             this.v(p0, p1, measuredWidt, i2);
             this.a.g(p0, p1);
          }
          return;
       }
       i1 = 1;
       goto label_0027 ;
    }
    public final void d(int p0,List p1){
       int i = this.c[p0];
       int i1 = -1;
       if (i == i1) {
          i = 0;
       }
       for (int i2 = p1.size() - 1; i2 >= i; i2 = i2 - 1) {
          p1.remove(i2);
       }
       s52 tc = this.c;
       i = tc.length - 1;
       if (p0 > i) {
          Arrays.fill(tc, i1);
       }else {
          Arrays.fill(tc, p0, i, i1);
       }
       tc = this.d;
       i = tc.length - 1;
       if (p0 > i) {
          Arrays.fill(tc, 0);
       }else {
          Arrays.fill(tc, p0, i, 0);
       }
       return;
    }
    public final ArrayList f(int p0){
       ArrayList uArrayList = new ArrayList(p0);
       for (int i = 0; i < p0; i = i + 1) {
          r52 or52 = new r52();
          or52.b = this.a.a(i).getLayoutParams().getOrder();
          or52.a = i;
          uArrayList.add(or52);
       }
       return uArrayList;
    }
    public final void g(int p0,int p1,int p2){
       float f;
       float f2;
       ArrayList uArrayList;
       s52 ta = this.a;
       int flexDirectio = ta.getFlexDirection();
       int i = 3;
       int i1 = 2;
       if (flexDirectio && flexDirectio != 1) {
          if (flexDirectio != i1 && flexDirectio != i) {
             throw new IllegalArgumentException(tp2.k("Invalid flex direction: ", flexDirectio));
          }else {
             p1 = View$MeasureSpec.getMode(p0);
             p0 = View$MeasureSpec.getSize(p0);
          }
       }else {
          p1 = View$MeasureSpec.getMode(p1);
          p0 = View$MeasureSpec.getSize(p1);
       }
       List flexLinesInt = ta.getFlexLinesInternal();
       if (p1 == 0x40000000) {
          p1 = ta.getSumOfCrossSize() + p2;
          int i2 = 0;
          if (flexLinesInt.size() == 1) {
             p1.g = p0 - p2;
          }else if(flexLinesInt.size() >= i1){
             if ((p2 = ta.getAlignContent()) != 1) {
                if (p2 != i1) {
                   if (p2 != i) {
                      if (p2 != 4) {
                         if (p2 == 5 && p1 < p0) {
                            f = (float)(p0 - p1) / (float)flexLinesInt.size();
                            p1 = flexLinesInt.size();
                            float f1 = 0;
                            for (; i2 < p1; i2 = i2 + 1) {
                               p52 op52 = flexLinesInt.get(i2);
                               f2 = (float)op52.g + f;
                               i1 = flexLinesInt.size() - 1;
                               if (i2 == i1) {
                                  f2 = f2 + f1;
                                  f1 = 0;
                               }
                               i1 = Math.round(f2);
                               f2 = f2 - (float)i1;
                               f2 = f2 + f1;
                               if ((0x3f800000 - f2) > 0) {
                                  i1 = i1 + 1;
                                  f2 = f2 - 0x3f800000;
                               }else if((f2 - 0xbf800000) < 0){
                                  i1 = i1 - 1;
                                  f2 = f2 + 0x3f800000;
                               }
                               f1 = f2;
                               op52.g = i1;
                            }
                         }
                      }else if(p1 >= p0){
                         ta.setFlexLines(s52.e(flexLinesInt, p0, p1));
                      }else {
                         uArrayList = new ArrayList();
                         p52 op521 = new p52();
                         op521.g = (p0 - p1) / (flexLinesInt.size() * 2);
                         Iterator iterator = flexLinesInt.iterator();
                         while (iterator.hasNext()) {
                            uArrayList.add(op521);
                            uArrayList.add(iterator.next());
                            uArrayList.add(op521);
                         }
                         ta.setFlexLines(uArrayList);
                      }
                   }else if(p1 >= p0){
                      f = (float)(p0 - p1) / (float)(flexLinesInt.size() - 1);
                      uArrayList = new ArrayList();
                      p2 = flexLinesInt.size();
                      f2 = 0;
                      while (i2 < p2) {
                         uArrayList.add(flexLinesInt.get(i2));
                         int i3 = flexLinesInt.size() - 1;
                         if (i2 != i3) {
                            p52 op522 = new p52();
                            int i4 = flexLinesInt.size() - i1;
                            if (i2 == i4) {
                               f2 = f2 + f;
                               op522.g = Math.round(f2);
                               f2 = 0;
                            }else {
                               op522.g = Math.round(f);
                            }
                            p52 g = op522.g;
                            float f3 = f - (float)g;
                            f3 = f3 + f2;
                            if ((0x3f800000 - f3) > 0) {
                               i4 = g + 1;
                               op522.g = i4;
                               f3 = f3 - 0x3f800000;
                            }else if((f3 - 0xbf800000) < 0){
                               i4 = g - 1;
                               op522.g = i4;
                               f3 = f3 + 0x3f800000;
                            }
                            uArrayList.add(op522);
                            f2 = f3;
                         }
                         i2 = i2 + 1;
                      }
                      ta.setFlexLines(uArrayList);
                   }
                }else {
                   ta.setFlexLines(s52.e(flexLinesInt, p0, p1));
                }
             }else {
                p52 op523 = new p52();
                op523.g = p0 - p1;
                flexLinesInt.add(i2, op523);
             }
          }
       }
       return;
    }
    public final void h(int p0,int p1,int p2){
       boolean[] uobooleanArr;
       int flexDirectio;
       s52 tc;
       p52 e;
       s52 ta = this.a;
       int flexItemCoun = ta.getFlexItemCount();
       s52 tb = this.b;
       int i = 2;
       int i1 = 0;
       if (tb == null) {
          if (flexItemCoun < 10) {
             flexItemCoun = 10;
          }
          uobooleanArr = new boolean[flexItemCoun];
          this.b = uobooleanArr;
       }else if(tb.length < flexItemCoun){
          if ((flexDirectio = tb.length * 2) >= flexItemCoun) {
             flexItemCoun = flexDirectio;
          }
          uobooleanArr = new boolean[flexItemCoun];
          this.b = uobooleanArr;
       }else {
          Arrays.fill(tb, i1);
       }
       if (p2 >= ta.getFlexItemCount()) {
          return;
       }else {
          flexItemCoun = ta.getFlexDirection();
          flexDirectio = ta.getFlexDirection();
          int i2 = 0x40000000;
          if (flexDirectio && flexDirectio != 1) {
             if (flexDirectio != i && flexDirectio != 3) {
                throw new IllegalArgumentException(tp2.k("Invalid flex direction: ", flexItemCoun));
             }else {
                flexDirectio = View$MeasureSpec.getSize(p1);
                if (View$MeasureSpec.getMode(p1) != i2) {
                   flexDirectio = ta.getLargestMainSize();
                }
                flexItemCoun = ta.getPaddingTop();
                i = ta.getPaddingBottom();
             }
          }else {
             flexDirectio = View$MeasureSpec.getSize(p0);
             i = ta.getLargestMainSize();
             if (View$MeasureSpec.getMode(p0) != i2 && i <= flexDirectio) {
                flexDirectio = i;
             }
             flexItemCoun = ta.getPaddingLeft();
             i = ta.getPaddingRight();
          }
          i = i + flexItemCoun;
          if ((tc = this.c) != null) {
             i1 = tc[p2];
          }
          List flexLinesInt = ta.getFlexLinesInternal();
          int i3 = flexLinesInt.size();
          while (i1 < i3) {
             Object obj = flexLinesInt.get(i1);
             if ((e = obj.e) < flexDirectio && obj.q != null) {
                this.l(p0, p1, obj, flexDirectio, i, false);
             }else if(e > flexDirectio && obj.r != null){
                this.q(p0, p1, obj, flexDirectio, i, false);
             }
             i1 = i1 + 1;
          }
          return;
       }
    }
    public final void i(int p0){
       s52 tc;
       int i;
       if ((tc = this.c) == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          int[] ointArray = new int[p0];
          this.c = ointArray;
       }else if(tc.length < p0){
          if ((i = tc.length * 2) >= p0) {
             p0 = i;
          }
          this.c = Arrays.copyOf(tc, p0);
       }
       return;
    }
    public final void j(int p0){
       s52 td;
       int i;
       if ((td = this.d) == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          long[] olongArray = new long[p0];
          this.d = olongArray;
       }else if(td.length < p0){
          if ((i = td.length * 2) >= p0) {
             p0 = i;
          }
          this.d = Arrays.copyOf(td, p0);
       }
       return;
    }
    public final void k(int p0){
       s52 te;
       int i;
       if ((te = this.e) == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          long[] olongArray = new long[p0];
          this.e = olongArray;
       }else if(te.length < p0){
          if ((i = te.length * 2) >= p0) {
             p0 = i;
          }
          this.e = Arrays.copyOf(te, p0);
       }
       return;
    }
    public final void l(int p0,int p1,p52 p2,int p3,int p4,boolean p5){
       View view;
       p52 op521;
       float f2;
       int i5;
       int i6;
       s52 os521;
       View view1;
       s52 e1;
       s52 e2;
       s52 os522;
       p52 op522;
       int i10;
       s52 os52 = this;
       p52 op52 = p2;
       int i = p3;
       p52 j = op52.j;
       if ((j) > 0) {
          p52 e = op52.e;
          if (i >= e) {
             float f = (float)(i - e) / j;
             op52.e = p4 + op52.f;
             if (!p5) {
                op52.g = Integer.MIN_VALUE;
             }
             int i1 = 0;
             int i2 = 0;
             int i3 = 0;
             float f1 = 0;
             while (i1 < op52.h) {
                int i4 = op52.o + i1;
                s52 a = os52.a;
                if ((view = a.f(i4)) != null && view.getVisibility() != 8) {
                   o52 layoutParams = view.getLayoutParams();
                   int flexDirectio = a.getFlexDirection();
                   int i7 = 1;
                   int i8 = 0xbff0000000000000;
                   long l = 32;
                   if (flexDirectio && flexDirectio != i7) {
                      flexDirectio = view.getMeasuredHeight();
                      if ((e1 = os52.e) != null) {
                         long l2 = e1[i4] >> l;
                         flexDirectio = (int)l2;
                      }
                      i7 = view.getMeasuredWidth();
                      os521 = os52.e;
                      s52 os523 = a;
                      View view2 = view;
                      if (os521 != null) {
                         i7 = (int)os521[i4];
                      }
                      if (!os52.b[i4] && (0 - layoutParams.i()) > 0) {
                         float f4 = layoutParams.i() * f;
                         f4 = f4 + (float)flexDirectio;
                         int i9 = 1;
                         i6 = op52.h - i9;
                         if (i1 == i6) {
                            f4 = f4 + f1;
                            f1 = 0;
                         }
                         if ((i6 = Math.round(f4)) > layoutParams.z()) {
                            i6 = layoutParams.z();
                            os52.b[i4] = i9;
                            float f5 = op52.j - layoutParams.i();
                            op52.j = f5;
                            f5 = 1;
                         }else {
                            f4 = f4 - (float)i6;
                            f4 = f4 + f1;
                            double d1 = (double)f4;
                            if ((0x3ff0000000000000 - d1) > 0) {
                               i6 = i6 + 1;
                               d1 = d1 - 0x3ff0000000000000;
                            }else if((d1 - i8) < 0){
                               i6 = i6 - 1;
                               d1 = d1 + 0x3ff0000000000000;
                            }else {
                               f1 = f4;
                            }
                            f1 = (float)d1;
                         }
                         i10 = os52.n(p0, layoutParams, op52.m);
                         i6 = View$MeasureSpec.makeMeasureSpec(i6, 0x40000000);
                         View view3 = view2;
                         view3.measure(i10, i6);
                         i7 = view3.getMeasuredWidth();
                         os52.v(view3, i4, i10, i6);
                         os521 = os523;
                         os521.g(view3, i4);
                         view1 = view3;
                         flexDirectio = view3.getMeasuredHeight();
                      }else {
                         os521 = os523;
                         view1 = view2;
                      }
                      i4 = layoutParams.E() + i7;
                      i7 = layoutParams.r() + i4;
                      i6 = os521.k(view1) + i7;
                      i6 = Math.max(i3, i6);
                      i4 = layoutParams.K() + flexDirectio;
                      i10 = layoutParams.B() + i4;
                      i10 = i10 + op52.e;
                      op52.e = i10;
                      op521 = e;
                      f2 = f;
                      i5 = p1;
                   }else {
                      os521 = a;
                      view1 = view;
                      flexDirectio = view1.getMeasuredWidth();
                      if ((e1 = os52.e) != null) {
                         flexDirectio = (int)e1[i4];
                      }
                      i7 = view1.getMeasuredHeight();
                      if ((e2 = os52.e) != null) {
                         os522 = os521;
                         op522 = e;
                         long l1 = e2[i4] >> l;
                         i7 = (int)l1;
                      }else {
                         os522 = os521;
                         op522 = e;
                      }
                      if (!os52.b[i4] && (0 - layoutParams.i()) > 0) {
                         float f3 = layoutParams.i() * f;
                         f3 = f3 + (float)flexDirectio;
                         i7 = 1;
                         i6 = op52.h - i7;
                         if (i1 == i6) {
                            f3 = f3 + f1;
                            f1 = 0;
                         }
                         if ((i6 = Math.round(f3)) > layoutParams.I()) {
                            i6 = layoutParams.I();
                            os52.b[i4] = i7;
                            f2 = op52.j - layoutParams.i();
                            op52.j = f2;
                            op521 = op522;
                            f2 = f;
                            i2 = 1;
                         }else {
                            f3 = f3 - (float)i6;
                            f3 = f3 + f1;
                            op521 = op522;
                            f2 = f;
                            double d = (double)f3;
                            if ((0x3ff0000000000000 - d) > 0) {
                               i6 = i6 + 1;
                               d = d - 0x3ff0000000000000;
                            }else if((d - i8) < 0){
                               i6 = i6 - 1;
                               d = d + 0x3ff0000000000000;
                            }else {
                               f1 = f3;
                            }
                            f1 = (float)d;
                         }
                         i = os52.m(p1, layoutParams, op52.m);
                         i6 = View$MeasureSpec.makeMeasureSpec(i6, 0x40000000);
                         view1.measure(i6, i);
                         flexDirectio = view1.getMeasuredWidth();
                         i7 = view1.getMeasuredHeight();
                         os52.v(view1, i4, i6, i);
                         os521 = os522;
                         os521.g(view1, i4);
                      }else {
                         op521 = op522;
                         f2 = f;
                         os521 = os522;
                         i5 = p1;
                      }
                      i = layoutParams.K() + i7;
                      i4 = layoutParams.B() + i;
                      i6 = os521.k(view1) + i4;
                      i6 = Math.max(i3, i6);
                      i3 = layoutParams.E() + flexDirectio;
                      i4 = layoutParams.r() + i3;
                      i4 = i4 + op52.e;
                      op52.e = i4;
                   }
                   op52.g = Math.max(op52.g, i6);
                   i3 = i6;
                }else {
                   op521 = e;
                   f2 = f;
                   i5 = p1;
                }
                i1 = i1 + 1;
                f = f2;
                e = op521;
                i6 = 0;
             }
             op521 = e;
             if (i2 && op521 != op52.e) {
                this.l(p0, p1, p2, p3, p4, true);
             }
          }
       }
       return;
    }
    public final int m(int p0,o52 p1,int p2){
       s52 ta = this.a;
       p0 = ta.c(p0, ((p1.B() + (p1.K() + (ta.getPaddingBottom() + ta.getPaddingTop()))) + p2), p1.k());
       if ((p2 = View$MeasureSpec.getSize(p0)) > p1.z()) {
          p0 = View$MeasureSpec.makeMeasureSpec(p1.z(), View$MeasureSpec.getMode(p0));
       }else if(p2 < p1.s()){
          p0 = View$MeasureSpec.makeMeasureSpec(p1.s(), View$MeasureSpec.getMode(p0));
       }
       return p0;
    }
    public final int n(int p0,o52 p1,int p2){
       s52 ta = this.a;
       p0 = ta.h(p0, ((p1.r() + (p1.E() + (ta.getPaddingRight() + ta.getPaddingLeft()))) + p2), p1.x());
       if ((p2 = View$MeasureSpec.getSize(p0)) > p1.I()) {
          p0 = View$MeasureSpec.makeMeasureSpec(p1.I(), View$MeasureSpec.getMode(p0));
       }else if(p2 < p1.t()){
          p0 = View$MeasureSpec.makeMeasureSpec(p1.t(), View$MeasureSpec.getMode(p0));
       }
       return p0;
    }
    public final void o(View p0,p52 p1,int p2,int p3,int p4,int p5){
       int i;
       o52 layoutParams = p0.getLayoutParams();
       s52 ta = this.a;
       int alignItems = ta.getAlignItems();
       if (layoutParams.n() != -1) {
          alignItems = layoutParams.n();
       }
       p52 g = p1.g;
       if (alignItems) {
          if (alignItems != 1) {
             if (alignItems != 2) {
                if (alignItems != 3) {
                   if (alignItems == 4) {
                   label_00bf :
                      if (ta.getFlexWrap() != 2) {
                         p0.layout(p2, (layoutParams.K() + p3), p4, (layoutParams.K() + p5));
                      }else {
                         p0.layout(p2, (p3 - layoutParams.B()), p4, (p5 - layoutParams.B()));
                      }
                   }
                }else if(ta.getFlexWrap() != 2){
                   i = Math.max((p1.l - p0.getBaseline()), layoutParams.K());
                   p0.layout(p2, (p3 + i), p4, (p5 + i));
                }else {
                   i = Math.max((p0.getBaseline() + (p1.l - p0.getMeasuredHeight())), layoutParams.B());
                   p0.layout(p2, (p3 - i), p4, (p5 - i));
                }
             }else {
                i = ((layoutParams.K() + (g - p0.getMeasuredHeight())) - layoutParams.B()) / 2;
                if (ta.getFlexWrap() != 2) {
                   p3 = p3 + i;
                   p0.layout(p2, p3, p4, (p0.getMeasuredHeight() + p3));
                }else {
                   p3 = p3 - i;
                   p0.layout(p2, p3, p4, (p0.getMeasuredHeight() + p3));
                }
             }
          }else if(ta.getFlexWrap() != 2){
             p3 = p3 + g;
             p0.layout(p2, ((p3 - p0.getMeasuredHeight()) - layoutParams.B()), p4, (p3 - layoutParams.B()));
          }else {
             p0.layout(p2, (layoutParams.K() + (p0.getMeasuredHeight() + (p3 - g))), p4, (layoutParams.K() + (p0.getMeasuredHeight() + (p5 - g))));
          }
       }else {
          goto label_00bf ;
       }
       return;
    }
    public final void p(View p0,p52 p1,boolean p2,int p3,int p4,int p5,int p6){
       o52 layoutParams = p0.getLayoutParams();
       int alignItems = this.a.getAlignItems();
       if (layoutParams.n() != -1) {
          alignItems = layoutParams.n();
       }
       p1 = p1.g;
       if (alignItems) {
          if (alignItems != 1) {
             if (alignItems != 2) {
                if (alignItems == 3 || alignItems == 4) {
                label_0083 :
                   if (!p2) {
                      p0.layout((layoutParams.E() + p3), p4, (layoutParams.E() + p5), p6);
                   }else {
                      p0.layout((p3 - layoutParams.r()), p4, (p5 - layoutParams.r()), p6);
                   }
                }
             }else {
                ViewGroup$MarginLayoutParams layoutParams1 = p0.getLayoutParams();
                alignItems = ((r14.c(layoutParams1) + (p1 - p0.getMeasuredWidth())) - r14.b(layoutParams1)) / 2;
                if (!p2) {
                   p0.layout((p3 + alignItems), p4, (p5 + alignItems), p6);
                }else {
                   p0.layout((p3 - alignItems), p4, (p5 - alignItems), p6);
                }
             }
          }else if(!p2){
             p0.layout((((p3 + p1) - p0.getMeasuredWidth()) - layoutParams.r()), p4, (((p5 + p1) - p0.getMeasuredWidth()) - layoutParams.r()), p6);
          }else {
             p0.layout((layoutParams.E() + (p0.getMeasuredWidth() + (p3 - p1))), p4, (layoutParams.E() + (p0.getMeasuredWidth() + (p5 - p1))), p6);
          }
       }else {
          goto label_0083 ;
       }
       return;
    }
    public final void q(int p0,int p1,p52 p2,int p3,int p4,boolean p5){
       View view;
       float f2;
       int i5;
       s52 os521;
       View view1;
       s52 e1;
       s52 e2;
       View view2;
       float f4;
       int i8;
       int i9;
       int i11;
       s52 os52 = this;
       p52 op52 = p2;
       int i = p3;
       p52 e = op52.e;
       p52 k = op52.k;
       if ((k) > 0 && i <= e) {
          float f = (float)(e - i) / k;
          op52.e = p4 + op52.f;
          if (!p5) {
             op52.g = Integer.MIN_VALUE;
          }
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          float f1 = 0;
          while (i1 < op52.h) {
             int i4 = op52.o + i1;
             s52 a = os52.a;
             if ((view = a.f(i4)) != null && view.getVisibility() != 8) {
                o52 layoutParams = view.getLayoutParams();
                int flexDirectio = a.getFlexDirection();
                int i6 = 1;
                int i7 = 0xbff0000000000000;
                long l = 32;
                if (flexDirectio && flexDirectio != i6) {
                   flexDirectio = view.getMeasuredHeight();
                   if ((e1 = os52.e) != null) {
                      long l2 = e1[i4] >> l;
                      flexDirectio = (int)l2;
                   }
                   i6 = view.getMeasuredWidth();
                   os521 = os52.e;
                   s52 os522 = a;
                   View view3 = view;
                   if (os521 != null) {
                      i6 = (int)os521[i4];
                   }
                   if (!os52.b[i4] && (0 - layoutParams.o()) > 0) {
                      f4 = layoutParams.o() * f;
                      float f5 = (float)flexDirectio - f4;
                      int i10 = 1;
                      i11 = op52.h - i10;
                      if (i1 == i11) {
                         f5 = f5 + f1;
                         f1 = 0;
                      }
                      if ((i11 = Math.round(f5)) < layoutParams.s()) {
                         i5 = layoutParams.s();
                         os52.b[i4] = i10;
                         float f6 = op52.k - layoutParams.o();
                         op52.k = f6;
                         f6 = 1;
                      }else {
                         f5 = f5 - (float)i11;
                         f5 = f5 + f1;
                         double d1 = (double)f5;
                         if ((0x3ff0000000000000 - d1) > 0) {
                            i11 = i11 + 1;
                            f5 = f5 - 0x3f800000;
                         }else if((d1 - i7) < 0){
                            i11 = i11 - 1;
                            f5 = f5 + 0x3f800000;
                         }
                         f1 = f5;
                         i5 = i11;
                      }
                      i11 = os52.n(p0, layoutParams, op52.m);
                      i5 = View$MeasureSpec.makeMeasureSpec(i5, 0x40000000);
                      View view4 = view3;
                      view4.measure(i11, i5);
                      i6 = view4.getMeasuredWidth();
                      os52.v(view4, i4, i11, i5);
                      os521 = os522;
                      os521.g(view4, i4);
                      view1 = view4;
                      flexDirectio = view4.getMeasuredHeight();
                   }else {
                      os521 = os522;
                      view1 = view3;
                   }
                   i4 = layoutParams.E() + i6;
                   i6 = layoutParams.r() + i4;
                   i5 = os521.k(view1) + i6;
                   i5 = Math.max(i3, i5);
                   i4 = layoutParams.K() + flexDirectio;
                   i11 = layoutParams.B() + i4;
                   i11 = i11 + op52.e;
                   op52.e = i11;
                   f2 = f;
                }else {
                   os521 = a;
                   view1 = view;
                   flexDirectio = view1.getMeasuredWidth();
                   if ((e1 = os52.e) != null) {
                      flexDirectio = (int)e1[i4];
                   }
                   i6 = view1.getMeasuredHeight();
                   if ((e2 = os52.e) != null) {
                      view2 = view1;
                      long l1 = e2[i4] >> l;
                      i6 = (int)l1;
                   }else {
                      view2 = view1;
                   }
                   if (!os52.b[i4] && (0 - layoutParams.o()) > 0) {
                      float f3 = layoutParams.o() * f;
                      f4 = (float)flexDirectio - f3;
                      i6 = 1;
                      flexDirectio = op52.h - i6;
                      if (i1 == flexDirectio) {
                         f4 = f4 + f1;
                         f1 = 0;
                      }
                      if ((flexDirectio = Math.round(f4)) < layoutParams.t()) {
                         i2 = layoutParams.t();
                         os52.b[i4] = i6;
                         f4 = op52.k - layoutParams.o();
                         op52.k = f4;
                         f2 = f;
                      }else {
                         f4 = f4 - (float)flexDirectio;
                         f4 = f4 + f1;
                         f2 = f;
                         i9 = i2;
                         double d = (double)f4;
                         if ((0x3ff0000000000000 - d) > 0) {
                            flexDirectio = flexDirectio + 1;
                            f4 = f4 - 0x3f800000;
                         }else if((d - i7) < 0){
                            flexDirectio = flexDirectio - 1;
                            f4 = f4 + 0x3f800000;
                         }
                         f1 = f4;
                         i2 = flexDirectio;
                         i6 = i9;
                      }
                      i8 = os52.m(p1, layoutParams, op52.m);
                      i2 = View$MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                      view2.measure(i2, i8);
                      flexDirectio = view2.getMeasuredWidth();
                      os52.v(view2, i4, i2, i8);
                      os521.g(view2, i4);
                      i2 = i6;
                      i6 = view2.getMeasuredHeight();
                   }else {
                      f2 = f;
                      i9 = i2;
                   }
                   i8 = layoutParams.K() + i6;
                   i4 = layoutParams.B() + i8;
                   i5 = os521.k(view2) + i4;
                   i5 = Math.max(i3, i5);
                   i8 = layoutParams.E() + flexDirectio;
                   i3 = layoutParams.r() + i8;
                   i3 = i3 + op52.e;
                   op52.e = i3;
                }
                op52.g = Math.max(op52.g, i5);
                i3 = i5;
             }else {
                f2 = f;
                i2 = i2;
             }
             i1 = i1 + 1;
             f = f2;
             i5 = 0;
          }
          if (i2 && e != op52.e) {
             this.q(p0, p1, p2, p3, p4, true);
          }
       }
       return;
    }
    public final void s(View p0,int p1,int p2){
       s52 te;
       o52 layoutParams = p0.getLayoutParams();
       s52 ta = this.a;
       p1 = Math.min(Math.max((((p1 - layoutParams.E()) - layoutParams.r()) - ta.k(p0)), layoutParams.t()), layoutParams.I());
       int i = ((te = this.e) != null)? (int)(te[p2] >> 32): p0.getMeasuredHeight();
       i = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
       p1 = View$MeasureSpec.makeMeasureSpec(p1, 0x40000000);
       p0.measure(p1, i);
       this.v(p0, p2, p1, i);
       ta.g(p0, p2);
       return;
    }
    public final void t(View p0,int p1,int p2){
       s52 te;
       o52 layoutParams = p0.getLayoutParams();
       s52 ta = this.a;
       p1 = Math.min(Math.max((((p1 - layoutParams.K()) - layoutParams.B()) - ta.k(p0)), layoutParams.s()), layoutParams.z());
       int i = ((te = this.e) != null)? (int)te[p2]: p0.getMeasuredWidth();
       i = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
       p1 = View$MeasureSpec.makeMeasureSpec(p1, 0x40000000);
       p0.measure(i, p1);
       this.v(p0, p2, i, p1);
       ta.g(p0, p2);
       return;
    }
    public final void u(int p0){
       s52 tc;
       p52 h;
       View view;
       s52 ta = this.a;
       if (p0 >= ta.getFlexItemCount()) {
          return;
       }
       int flexDirectio = ta.getFlexDirection();
       int i = 4;
       if (ta.getAlignItems() == i) {
          p0 = ((tc = this.c) != null)? tc[p0]: 0;
          List flexLinesInt = ta.getFlexLinesInternal();
          int i1 = flexLinesInt.size();
          while (p0 < i1) {
             p52 op52 = flexLinesInt.get(p0);
             h = op52.h;
             int i2 = 0;
             while (true) {
                if (i2 < h) {
                   int i3 = op52.o + i2;
                   if (i2 < ta.getFlexItemCount() && ((view = ta.f(i3)) != null && view.getVisibility() != 8)) {
                      o52 layoutParams = view.getLayoutParams();
                      if (layoutParams.n() == -1 || layoutParams.n() == i) {
                         if (flexDirectio && flexDirectio != 1) {
                            if (flexDirectio != 2 && flexDirectio != 3) {
                               throw new IllegalArgumentException(tp2.k("Invalid flex direction: ", flexDirectio));
                            }else {
                               this.s(view, op52.g, i3);
                            }
                         }else {
                            this.t(view, op52.g, i3);
                         }
                      }
                   }
                   i2 = i2 + 1;
                }else {
                   p0++;
                }
             }
          }
       }else {
          Iterator iterator = ta.getFlexLinesInternal().iterator();
          while (iterator.hasNext()) {
             p52 op521 = iterator.next();
             Iterator iterator1 = op521.n.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Integer integer = iterator1.next();
                   View view1 = ta.f(integer.intValue());
                   h = 1;
                   if (flexDirectio && flexDirectio != h) {
                      h = 3;
                      if (flexDirectio != 2 && flexDirectio != h) {
                         throw new IllegalArgumentException(tp2.k("Invalid flex direction: ", flexDirectio));
                      }else {
                         this.s(view1, op521.g, integer.intValue());
                      }
                   }else {
                      this.t(view1, op521.g, integer.intValue());
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public final void v(View p0,int p1,int p2,int p3){
       s52 te;
       s52 td = this.d;
       long l = 32;
       if (td != null) {
          td[p1] = ((long)p2 & 0xffffffff) | ((long)p3 << l);
       }
       if ((te = this.e) != null) {
          te[p1] = ((long)p0.getMeasuredWidth() & 0xffffffff) | ((long)p0.getMeasuredHeight() << l);
       }
       return;
    }
}
