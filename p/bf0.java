package p.bf0;
import p.n3;
import android.graphics.Rect;
import p.gg1;
import com.google.android.material.chip.Chip;
import android.content.Context;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import p.wh7;
import p.dh7;
import java.lang.IllegalArgumentException;
import p.u44;
import p.tx1;
import android.view.accessibility.AccessibilityEvent;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import p.ef0;
import java.lang.CharSequence;
import android.widget.TextView;
import android.os.Build$VERSION;
import java.lang.RuntimeException;
import android.view.ViewParent;
import java.util.ArrayList;
import java.lang.Integer;
import p.jo6;
import java.lang.Class;
import p.lv1;
import p.eh7;
import p.db2;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import android.text.TextUtils;
import p.w3;
import android.view.accessibility.AccessibilityRecord;
import p.d4;

public final class bf0 extends n3	// class@0010af from classes.dex
{
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final AccessibilityManager h;
    public final View i;
    public tx1 j;
    public int k;
    public int l;
    public int m;
    public final Chip n;
    public static final Rect o;
    public static final gg1 p;
    public static final gg1 q;

    static {
       bf0.o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
       bf0.p = new gg1(6);
       bf0.q = new gg1(7);
    }
    public void bf0(Chip p0,Chip p1){
       this.n = p0;
       super();
       this.d = new Rect();
       this.e = new Rect();
       this.f = new Rect();
       int[] ointArray = new int[2];
       this.g = ointArray;
       int i = Integer.MIN_VALUE;
       this.k = i;
       this.l = i;
       this.m = i;
       if (p1 == null) {
          throw new IllegalArgumentException("View may not be null");
       }
       this.i = p1;
       this.h = p1.getContext().getSystemService("accessibility");
       p1.setFocusable(true);
       if (!dh7.c(p1)) {
          dh7.s(p1, true);
       }
       return;
    }
    public final u44 b(View p0){
       if (this.j == null) {
          this.j = new tx1(this);
       }
       return this.j;
    }
    public final void c(View p0,AccessibilityEvent p1){
       super.c(p0, p1);
    }
    public final void d(View p0,y3 p1){
       Chip v;
       y3 a = p1.a;
       this.a.onInitializeAccessibilityNodeInfo(p0, a);
       bf0 tn = this.n;
       boolean b = ((v = tn.v) != null && v.h0 != null)? true: false;
       a.setCheckable(b);
       a.setClickable(tn.isClickable());
       a.setClassName(tn.getAccessibilityClassName());
       CharSequence text = tn.getText();
       if (Build$VERSION.SDK_INT >= 23) {
          p1.i(text);
       }else {
          a.setContentDescription(text);
       }
       return;
    }
    public final boolean j(int p0){
       boolean b = false;
       if (this.l != p0) {
       }else {
          this.l = Integer.MIN_VALUE;
          if (p0 == 1) {
             bf0 tn = this.n;
             tn.D = b;
             tn.refreshDrawableState();
          }
          this.q(p0, 8);
          b = true;
       }
       return b;
    }
    public final y3 k(int p0){
       y3 a;
       ViewParent parent;
       AccessibilityNodeInfo uAccessibili = AccessibilityNodeInfo.obtain();
       y3 oy3 = new y3(uAccessibili);
       uAccessibili.setEnabled(true);
       uAccessibili.setFocusable(true);
       uAccessibili.setClassName("android.view.View");
       Rect o = bf0.o;
       uAccessibili.setBoundsInParent(o);
       uAccessibili.setBoundsInScreen(o);
       int i = -1;
       oy3.b = i;
       bf0 ti = this.i;
       uAccessibili.setParent(ti);
       this.o(p0, oy3);
       if (oy3.e() == null && uAccessibili.getContentDescription() == null) {
          throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId\(\)");
       }
       bf0 te = this.e;
       oy3.d(te);
       if (te.equals(o)) {
          throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId\(\)");
       }
       int actions = uAccessibili.getActions();
       if ((actions & 0x40)) {
          throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId\(\)");
       }
       int i1 = 128;
       if ((actions & i1)) {
          throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId\(\)");
       }
       uAccessibili.setPackageName(ti.getContext().getPackageName());
       oy3.c = p0;
       uAccessibili.setSource(ti, p0);
       int i2 = 0;
       if (this.k == p0) {
          uAccessibili.setAccessibilityFocused(true);
          oy3.a(i1);
       }else {
          uAccessibili.setAccessibilityFocused(i2);
          oy3.a(64);
       }
       boolean b = (this.l == p0)? true: false;
       if (b) {
          oy3.a(2);
       }else if(uAccessibili.isFocusable()){
          oy3.a(true);
       }
       uAccessibili.setFocused(b);
       bf0 tg = this.g;
       ti.getLocationOnScreen(tg);
       bf0 td = this.d;
       uAccessibili.getBoundsInScreen(td);
       if (td.equals(o)) {
          oy3.d(td);
          if (oy3.b != i) {
             y3 oy31 = new y3(AccessibilityNodeInfo.obtain());
             y3 b1 = oy3.b;
             while (true) {
                a = oy31.a;
                if (b1 != i) {
                   oy31.b = i;
                   a.setParent(ti, i);
                   a.setBoundsInParent(o);
                   this.o(b1, oy31);
                   oy31.d(te);
                   td.offset(te.left, te.top);
                   b1 = oy31.b;
                }else {
                   break ;
                }
             }
             a.recycle();
          }
          td.offset((tg[i2] - ti.getScrollX()), (tg[1] - ti.getScrollY()));
       }
       bf0 tf = this.f;
       if (ti.getLocalVisibleRect(tf)) {
          tf.offset((tg[i2] - ti.getScrollX()), (tg[1] - ti.getScrollY()));
          if (td.intersect(tf)) {
             oy3.a.setBoundsInScreen(td);
             if (!td.isEmpty() && !ti.getWindowVisibility()) {
                parent = ti.getParent();
                while (true) {
                   if (parent instanceof View) {
                      if ((parent.getAlpha()) > 0 && !parent.getVisibility()) {
                         parent = parent.getParent();
                      }
                   }else if(parent != null){
                      i2 = 1;
                   }
                }
             }
             if (i2) {
                uAccessibili.setVisibleToUser(true);
             }
          }
       }
       return oy3;
    }
    public final void l(ArrayList p0){
       Chip v;
       int i = 0;
       p0.add(Integer.valueOf(i));
       bf0 tn = this.n;
       if (tn.c()) {
          if ((v = tn.v) != null && v.b0 != null) {
             i = 1;
          }
          if (i && tn.y != null) {
             p0.add(Integer.valueOf(1));
          }
       }
       return;
    }
    public final boolean m(int p0,Rect p1){
       int i6;
       boolean i7;
       y3 oy31;
       y3 oy32;
       Object obj;
       bf0 uobf0 = this;
       int i = p0;
       Rect rect = p1;
       ArrayList uArrayList = new ArrayList();
       uobf0.l(uArrayList);
       jo6 ojo6 = new jo6();
       for (int i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
          ojo6.f(uArrayList.get(i1).intValue(), uobf0.k(uArrayList.get(i1).intValue()));
       }
       bf0 l = uobf0.l;
       i1 = Integer.MIN_VALUE;
       Integer integer = null;
       y3 oy3 = (l == i1)? integer: ojo6.e(l, integer);
       gg1 p = bf0.p;
       gg1 q = bf0.q;
       bf0 i2 = uobf0.i;
       int i3 = 2;
       if (i != 1 && i != i3) {
          i3 = 130;
          int i4 = 66;
          int i5 = 33;
          integer = 17;
          if (i != integer && (i != i5 && (i != i4 && i != i3))) {
             throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          }else {
             Rect rect1 = new Rect();
             bf0 l1 = uobf0.l;
             String str = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.";
             if (l1 != i1) {
                uobf0.n(l1).d(rect1);
             }else if(rect){
                rect1.set(rect);
             }else {
                int width = i2.getWidth();
                i7 = i2.getHeight();
                if (i != integer) {
                   if (i != i5) {
                      if (i != i4) {
                         if (i == i3) {
                            rect1.set(0, -1, width, -1);
                         }else {
                            throw new IllegalArgumentException(str);
                         }
                      }else {
                         rect1.set(-1, 0, -1, i7);
                      label_00a7 :
                         i6 = 0;
                      label_00b2 :
                         rect = new Rect(rect1);
                         if (i != integer) {
                            if (i != i5) {
                               if (i != i4) {
                                  if (i == i3) {
                                     rect.offset(i6, (- (rect1.height() + 1)));
                                  }else {
                                     throw new IllegalArgumentException(str);
                                  }
                               }else {
                                  rect.offset((- (rect1.width() + 1)), i6);
                               }
                            }else {
                               rect.offset(i6, (rect1.height() + 1));
                            }
                         }else {
                            rect.offset((rect1.width() + 1), i6);
                         }
                         q.getClass();
                         i7 = ojo6.g();
                         Rect rect2 = new Rect();
                         int i8 = 0;
                         int i9 = 0;
                         while (i8 < i7) {
                            if ((oy31 = ojo6.h(i8)) != oy3) {
                               p.getClass();
                               oy31.d(rect2);
                               if (lv1.x(i, rect1, rect2)) {
                                  if (lv1.x(i, rect1, rect) && !lv1.c(i, rect1, rect2, rect)) {
                                     if (!lv1.c(i, rect1, rect, rect2)) {
                                        i3 = lv1.B(i, rect1, rect2);
                                        i5 = i3 * 13;
                                        i5 = i5 * i3;
                                        i4 = lv1.D(i, rect1, rect2) * lv1.D(i, rect1, rect2);
                                        i4 = i4 + i5;
                                        i3 = lv1.B(i, rect1, rect);
                                        int i10 = i3 * 13;
                                        i10 = i10 * i3;
                                        i5 = lv1.D(i, rect1, rect) * lv1.D(i, rect1, rect);
                                        i5 = i5 + i10;
                                        if (i4 >= i5) {
                                           i3 = 0;
                                        label_014e :
                                           if (i3) {
                                              rect.set(rect2);
                                              i9 = oy31;
                                           }
                                        }
                                     }
                                  }
                                  i3 = 1;
                                  goto label_014e ;
                               }
                            }
                            i8 = i8 + 1;
                         }
                         oy32 = i9;
                         oy3 = -1;
                      }
                   }else {
                      i6 = 0;
                      rect1.set(i6, i7, width, i7);
                      goto label_00b2 ;
                   }
                }else {
                   i6 = 0;
                   rect1.set(width, i6, width, i7);
                   goto label_00b2 ;
                }
             }
             rect = 0;
             goto label_00a7 ;
          }
       }else if(eh7.d(i2) == 1){
          i7 = true;
       }else {
          i7 = false;
       }
       q.getClass();
       int i12 = ojo6.g();
       ArrayList uArrayList1 = new ArrayList(i12);
       for (int i11 = 0; i11 < i12; i11 = i11 + 1) {
          uArrayList1.add(ojo6.h(i11));
       }
       Collections.sort(uArrayList1, new db2(i7, p));
       i7 = 1;
       if (i != i7) {
          if (i == i3) {
             i = uArrayList1.size();
             i6 = (oy3 == null)? -1: uArrayList1.lastIndexOf(oy3);
             if ((i6 = i6 + i7) < i) {
                obj = uArrayList1.get(i6);
                oy3 = -1;
             }else {
                oy3 = -1;
             label_01c6 :
                obj = 0;
             }
          }else {
             throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
          }
       }else {
          i = uArrayList1.size();
          if (oy3 != null) {
             i = uArrayList1.indexOf(oy3);
          }
          if ((i = i - 1) >= 0) {
             obj = uArrayList1.get(i);
          }else {
             goto label_01c6 ;
          }
       }
       oy32 = obj;
       if (oy32 != null) {
          if (ojo6.a != null) {
             ojo6.d();
          }
          i7 = 0;
          while (true) {
             if (i7 < ojo6.t) {
                if (ojo6.c[i7] == oy32) {
                   i11 = i7;
                label_01e8 :
                   if (ojo6.a != null) {
                      ojo6.d();
                   }
                   i1 = ojo6.b[i11];
                   break ;
                }else {
                   i7 = i7 + 1;
                }
             }else {
                i11 = -1;
                goto label_01e8 ;
             }
          }
       }
       return uobf0.p(i1);
    }
    public final y3 n(int p0){
       y3 oy3;
       if (p0 == -1) {
          bf0 ti = this.i;
          AccessibilityNodeInfo uAccessibili = AccessibilityNodeInfo.obtain(ti);
          oy3 = new y3(uAccessibili);
          ti.onInitializeAccessibilityNodeInfo(uAccessibili);
          ArrayList uArrayList = new ArrayList();
          this.l(uArrayList);
          if (uAccessibili.getChildCount() > 0 && uArrayList.size() > 0) {
             throw new RuntimeException("Views cannot have both real and virtual children");
          }else {
             int i = uArrayList.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                oy3.a.addChild(ti, uArrayList.get(i1).intValue());
             }
          }
       }else {
          oy3 = this.k(p0);
       }
       return oy3;
    }
    public final void o(int p0,y3 p1){
       CharSequence closeIconCon;
       y3 a = p1.a;
       String str = "";
       int i = 1;
       if (p0 == i) {
          bf0 tn = this.n;
          if ((closeIconCon = tn.getCloseIconContentDescription()) != null) {
             a.setContentDescription(closeIconCon);
          }else {
             closeIconCon = tn.getText();
             Context context = tn.getContext();
             Object[] objArray = new Object[i];
             if (!TextUtils.isEmpty(closeIconCon)) {
                str = closeIconCon;
             }
             objArray[0] = str;
             a.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArray).trim());
          }
          a.setBoundsInParent(Chip.a(tn));
          p1.b(w3.e);
          a.setEnabled(tn.isEnabled());
       }else {
          a.setContentDescription(str);
          a.setBoundsInParent(Chip.M);
       }
       return;
    }
    public final boolean p(int p0){
       boolean b;
       bf0 ti = this.i;
       if (ti.isFocused() || (ti.requestFocus() && (ti = this.l) != p0)) {
          int i = Integer.MIN_VALUE;
          if (ti != i) {
             this.j(ti);
          }
          if (p0 != i) {
             this.l = p0;
             if (p0 == 1) {
                bf0 tn = this.n;
                tn.D = true;
                tn.refreshDrawableState();
             }
             this.q(p0, 8);
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public final void q(int p0,int p1){
       ViewParent parent;
       AccessibilityEvent uAccessibili;
       if (p0 != Integer.MIN_VALUE && this.h.isEnabled()) {
          bf0 ti = this.i;
          if ((parent = ti.getParent()) != null) {
             if (p0 != -1) {
                uAccessibili = AccessibilityEvent.obtain(p1);
                y3 oy3 = this.n(p0);
                uAccessibili.getText().add(oy3.e());
                oy3 = oy3.a;
                uAccessibili.setContentDescription(oy3.getContentDescription());
                uAccessibili.setScrollable(oy3.isScrollable());
                uAccessibili.setPassword(oy3.isPassword());
                uAccessibili.setEnabled(oy3.isEnabled());
                uAccessibili.setChecked(oy3.isChecked());
                if (uAccessibili.getText().isEmpty() && uAccessibili.getContentDescription() == null) {
                   throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId\(\)");
                }else {
                   uAccessibili.setClassName(oy3.getClassName());
                   d4.a(uAccessibili, ti, p0);
                   uAccessibili.setPackageName(ti.getContext().getPackageName());
                }
             }else {
                uAccessibili = AccessibilityEvent.obtain(p1);
                ti.onInitializeAccessibilityEvent(uAccessibili);
             }
             parent.requestSendAccessibilityEvent(ti, uAccessibili);
          }
       }
       return;
    }
}
