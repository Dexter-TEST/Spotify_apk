package p.wh7;
import java.util.concurrent.atomic.AtomicInteger;
import p.yg7;
import p.ah7;
import android.view.View;
import p.fk7;
import java.util.WeakHashMap;
import java.lang.Object;
import android.view.KeyEvent;
import android.os.Build$VERSION;
import p.vh7;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import java.lang.Boolean;
import android.view.ViewParent;
import android.util.SparseArray;
import android.view.View$AccessibilityDelegate;
import p.qh7;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import android.graphics.Rect;
import java.lang.ThreadLocal;
import p.sh7;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import p.zg7;
import p.bh7;
import java.lang.CharSequence;
import p.gh7;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;
import java.lang.Throwable;
import android.util.Log;
import p.dh7;
import p.wr0;
import java.util.Objects;
import p.k25;
import p.h37;
import p.l25;
import p.w3;
import p.l4;
import p.l3;
import p.n3;
import p.ph7;
import java.lang.IllegalArgumentException;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.res.ColorStateList;
import p.jh7;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;

public abstract class wh7	// class@002b3c from classes.dex
{
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static ThreadLocal d;
    public static final int[] e;
    public static final yg7 f;
    public static final ah7 g;

    static {
       AtomicInteger uAtomicInteg = new AtomicInteger(1);
       wh7.a = null;
       wh7.c = false;
       wh7.e = new int[32]{0x7f0a0013,0x7f0a0014,0x7f0a001f,0x7f0a002a,0x7f0a002d,0x7f0a002e,0x7f0a002f,0x7f0a0030,0x7f0a0031,0x7f0a0032,0x7f0a0015,0x7f0a0016,0x7f0a0017,0x7f0a0018,0x7f0a0019,0x7f0a001a,0x7f0a001b,0x7f0a001c,0x7f0a001d,0x7f0a001e,0x7f0a0020,0x7f0a0021,0x7f0a0022,0x7f0a0023,0x7f0a0024,0x7f0a0025,0x7f0a0026,0x7f0a0027,0x7f0a0028,0x7f0a0029,0x7f0a002b,0x7f0a002c};
       wh7.f = new yg7();
       wh7.g = new ah7();
    }
    public static fk7 a(View p0){
       fk7 uofk7;
       if (wh7.a == null) {
          wh7.a = new WeakHashMap();
       }
       if ((uofk7 = wh7.a.get(p0)) == null) {
          uofk7 = new fk7(p0);
          wh7.a.put(p0, uofk7);
       }
       return uofk7;
    }
    public static boolean b(View p0,KeyEvent p1){
       vh7 tag;
       vh7 a;
       View view;
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 28) {
          return b;
       }
       int i = 0x7f0a0608;
       if ((tag = p0.getTag(i)) == null) {
          tag = new vh7();
          p0.setTag(i, tag);
       }
       if (!p1.getAction()) {
          if ((a = tag.a) != null) {
             a.clear();
          }
          ArrayList d = vh7.d;
          if (!d.isEmpty()) {
             _monitor_enter(d);
             if (tag.a == null) {
                tag.a = new WeakHashMap();
             }
             int i1 = d.size();
             while ((i1 = i1 - 1) >= 0) {
                ArrayList d1 = vh7.d;
                if ((view = d1.get(i1).get()) == null) {
                   d1.remove(i1);
                }else {
                   tag.a.put(view, Boolean.TRUE);
                   ViewParent parent = view.getParent();
                   while (parent instanceof View) {
                      tag.a.put(parent, Boolean.TRUE);
                      parent = parent.getParent();
                   }
                }
             }
             _monitor_exit(d);
          }
       }
       p0 = tag.a(p0);
       if (!p1.getAction()) {
          int keyCode = p1.getKeyCode();
          if (p0 != null && !KeyEvent.isModifierKey(keyCode)) {
             if (tag.b == null) {
                tag.b = new SparseArray();
             }
             tag.b.put(keyCode, new WeakReference(p0));
          }
       }
       if (p0 != null) {
          b = true;
       }
       return b;
    }
    public static View$AccessibilityDelegate c(View p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return qh7.a(p0);
       }
       View$AccessibilityDelegate uAccessibili = null;
       if (!wh7.c) {
          if (wh7.b == null) {
             Field declaredFiel = View.class.getDeclaredField("mAccessibilityDelegate");
             wh7.b = declaredFiel;
             declaredFiel.setAccessible(true);
          }
          p0 = wh7.b.get(p0);
          if (p0 instanceof View$AccessibilityDelegate) {
             uAccessibili = p0;
          }
       }
       return uAccessibili;
    }
    public static ArrayList d(View p0){
       ArrayList tag;
       if ((tag = p0.getTag(R.id.tag_accessibility_actions)) == null) {
          tag = new ArrayList();
          p0.setTag(R.id.tag_accessibility_actions, tag);
       }
       return tag;
    }
    public static Rect e(){
       Rect rect;
       if (wh7.d == null) {
          wh7.d = new ThreadLocal();
       }
       if ((rect = wh7.d.get()) == null) {
          rect = new Rect();
          wh7.d.set(rect);
       }
       rect.setEmpty();
       return rect;
    }
    public static String[] f(View p0){
       if (Build$VERSION.SDK_INT >= 31) {
          return sh7.a(p0);
       }
       return p0.getTag(R.id.tag_on_receive_content_mime_types);
    }
    public static void g(View p0,int p1){
       AccessibilityManager systemServic = p0.getContext().getSystemService("accessibility");
       if (!systemServic.isEnabled()) {
          return;
       }
       int i = 0x7f0a0600;
       int i1 = (new zg7(i, 8, 28, 1).b(p0) != null && (p0.isShown() && !p0.getWindowVisibility()))? 1: 0;
       int i2 = 32;
       if (!gh7.a(p0) && !i1) {
          if (p1 == i2) {
             AccessibilityEvent uAccessibili1 = AccessibilityEvent.obtain();
             p0.onInitializeAccessibilityEvent(uAccessibili1);
             uAccessibili1.setEventType(i2);
             gh7.g(uAccessibili1, p1);
             uAccessibili1.setSource(p0);
             p0.onPopulateAccessibilityEvent(uAccessibili1);
             uAccessibili1.getText().add(new zg7(i, 8, 28, 1).b(p0));
             systemServic.sendAccessibilityEvent(uAccessibili1);
          }else if(p0.getParent() != null){
             ViewParent parent1 = p0.getParent();
             try{
                gh7.e(parent1, p0, p0, p1);
             }catch(java.lang.AbstractMethodError e9){
                Log.e("ViewCompat", p0.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e9);
             }
          }
       }else {
          AccessibilityEvent uAccessibili = AccessibilityEvent.obtain();
          if (!i1) {
             i2 = 2048;
          }
          uAccessibili.setEventType(i2);
          gh7.g(uAccessibili, p1);
          if (i1) {
             uAccessibili.getText().add(new zg7(i, 8, 28, 1).b(p0));
             if (!dh7.c(p0)) {
                dh7.s(p0, 1);
             }
             ViewParent parent = p0.getParent();
             while (parent instanceof View) {
                if (dh7.c(parent) == 4) {
                   dh7.s(p0, 2);
                   break ;
                }
                parent = parent.getParent();
             }
          }
          p0.sendAccessibilityEventUnchecked(uAccessibili);
       }
       return;
    }
    public static void h(View p0,int p1){
       int i;
       if (Build$VERSION.SDK_INT >= 23) {
          p0.offsetLeftAndRight(p1);
       }else {
          Rect rect = wh7.e();
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             ViewParent viewParent = parent;
             int left = viewParent.getLeft();
             int top = viewParent.getTop();
             int right = viewParent.getRight();
             rect.set(left, top, right, viewParent.getBottom());
             i = rect.intersects(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom()) ^ 0x01;
          }else {
             i = 0;
          }
          p0.offsetLeftAndRight(p1);
          if (!p0.getVisibility()) {
             wh7.r(p0);
             ViewParent parent1 = p0.getParent();
             if (parent1 instanceof View) {
                wh7.r(parent1);
             }
          }
          if (i && rect.intersect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom())) {
             parent.invalidate(rect);
          }
       }
       return;
    }
    public static void i(View p0,int p1){
       int i;
       if (Build$VERSION.SDK_INT >= 23) {
          p0.offsetTopAndBottom(p1);
       }else {
          Rect rect = wh7.e();
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             ViewParent viewParent = parent;
             int left = viewParent.getLeft();
             int top = viewParent.getTop();
             int right = viewParent.getRight();
             rect.set(left, top, right, viewParent.getBottom());
             i = rect.intersects(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom()) ^ 0x01;
          }else {
             i = 0;
          }
          p0.offsetTopAndBottom(p1);
          if (!p0.getVisibility()) {
             wh7.r(p0);
             ViewParent parent1 = p0.getParent();
             if (parent1 instanceof View) {
                wh7.r(parent1);
             }
          }
          if (i && rect.intersect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom())) {
             parent.invalidate(rect);
          }
       }
       return;
    }
    public static wr0 j(View p0,wr0 p1){
       wr0 owr0;
       if (Log.isLoggable("ViewCompat", 3)) {
          Objects.toString(p1);
          p0.getClass();
          p0.getId();
       }
       if (Build$VERSION.SDK_INT >= 31) {
          return sh7.b(p0, p1);
       }else {
          k25 tag = p0.getTag(R.id.tag_on_receive_content_listener);
          yg7 f = wh7.f;
          if (tag != null) {
             if ((p1 = tag.a(p0, p1)) == null) {
                owr0 = null;
             }else if(p0 instanceof l25){
                f = p0;
             }
             owr0 = f.a(p1);
             return owr0;
          }else if(p0 instanceof l25){
             f = p0;
          }
          return f.a(p1);
       }
    }
    public static void k(View p0,int p1){
       ArrayList uArrayList = wh7.d(p0);
       int i = 0;
       while (i < uArrayList.size()) {
          if (uArrayList.get(i).a() == p1) {
             uArrayList.remove(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public static void l(View p0,w3 p1,l4 p2){
       View$AccessibilityDelegate uAccessibili;
       n3 on3;
       if (p2 == null) {
          wh7.k(p0, p1.a());
          wh7.g(p0, 0);
       }else {
          w3 v7 = new w3(null, p1.b, null, p2, p1.c);
          if ((uAccessibili = wh7.c(p0)) == null) {
             on3 = null;
          }else if(uAccessibili instanceof l3){
             on3 = uAccessibili.a;
          }else {
             on3 = new n3(uAccessibili);
          }
          if (on3 == null) {
             on3 = new n3();
          }
          wh7.o(p0, on3);
          wh7.k(p0, v7.a());
          wh7.d(p0).add(v7);
          wh7.g(p0, 0);
       }
       return;
    }
    public static View m(View p0,int p1){
       if (Build$VERSION.SDK_INT >= 28) {
          return ph7.f(p0, p1);
       }
       if ((p0 = p0.findViewById(p1)) != null) {
          return p0;
       }
       throw new IllegalArgumentException("ID does not reference a View inside this View");
    }
    public static void n(View p0,Context p1,int[] p2,AttributeSet p3,TypedArray p4,int p5){
       if (Build$VERSION.SDK_INT >= 29) {
          qh7.c(p0, p1, p2, p3, p4, p5, 0);
       }
       return;
    }
    public static void o(View p0,n3 p1){
       if (p1 == null && wh7.c(p0) instanceof l3) {
          p1 = new n3();
       }
       View$AccessibilityDelegate uAccessibili = (p1 == null)? null: p1.b;
       p0.setAccessibilityDelegate(uAccessibili);
       return;
    }
    public static void p(View p0,CharSequence p1){
       int i = 1;
       new zg7(R.id.tag_accessibility_pane_title, 8, 28, i).c(p0, p1);
       ah7 g = wh7.g;
       if (p1 != null) {
          ah7 a = g.a;
          if (!p0.isShown() || p0.getWindowVisibility()) {
             i = false;
          }
          a.put(p0, Boolean.valueOf(i));
          p0.addOnAttachStateChangeListener(g);
          if (gh7.b(p0)) {
             p0.getViewTreeObserver().addOnGlobalLayoutListener(g);
          }
       }else {
          g.a.remove(p0);
          p0.removeOnAttachStateChangeListener(g);
          dh7.o(p0.getViewTreeObserver(), g);
       }
       return;
    }
    public static void q(View p0,ColorStateList p1){
       jh7.q(p0, p1);
       if (Build$VERSION.SDK_INT == 21) {
          Drawable background = p0.getBackground();
          int i = (jh7.g(p0) == null && jh7.h(p0) == null)? 0: 1;
          if (background != null && i) {
             if (background.isStateful()) {
                background.setState(p0.getDrawableState());
             }
             dh7.q(p0, background);
          }
       }
       return;
    }
    public static void r(View p0){
       float translationY = p0.getTranslationY();
       p0.setTranslationY((0x3f800000 + translationY));
       p0.setTranslationY(translationY);
    }
}
