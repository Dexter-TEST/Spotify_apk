package p.h87;
import java.lang.Cloneable;
import p.qf2;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.lang.Class;
import java.lang.String;
import java.util.ArrayList;
import p.oy6;
import android.view.View;
import p.o87;
import p.pk;
import p.wh6;
import android.util.SparseArray;
import p.wh7;
import p.jh7;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.widget.AdapterView;
import p.qv3;
import p.do5;
import java.lang.Long;
import p.dh7;
import java.util.HashMap;
import android.view.ViewGroup;
import android.animation.Animator;
import p.g87;
import java.util.Iterator;
import p.d87;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import p.g5;
import p.xe7;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Integer;
import p.kg4;
import android.util.SparseIntArray;
import p.e87;
import p.al7;
import p.jp7;
import java.util.Set;

public abstract class h87 implements Cloneable	// class@001802 from classes.dex
{
    public final int[] A;
    public ArrayList B;
    public ArrayList C;
    public final ArrayList D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public ArrayList I;
    public xe7 J;
    public qf2 K;
    public final String a;
    public long b;
    public long c;
    public TimeInterpolator t;
    public final ArrayList v;
    public final ArrayList w;
    public oy6 x;
    public oy6 y;
    public m87 z;
    public static final int[] L;
    public static final qf2 M;
    public static final ThreadLocal N;

    static {
       h87.L = new int[4]{2,1,3,4};
       h87.M = new qf2(null);
       h87.N = new ThreadLocal();
    }
    public void h87(){
       super();
       this.a = this.getClass().getName();
       this.b = -1;
       this.c = -1;
       this.t = null;
       this.v = new ArrayList();
       this.w = new ArrayList();
       this.x = new oy6(3);
       this.y = new oy6(3);
       this.z = null;
       this.A = h87.L;
       this.D = new ArrayList();
       this.E = 0;
       this.F = false;
       this.G = false;
       this.H = null;
       this.I = new ArrayList();
       this.K = h87.M;
    }
    public static void d(oy6 p0,View p1,o87 p2){
       int id;
       String str;
       p0.b.put(p1, p2);
       if ((id = p1.getId()) >= 0) {
          if (p0.c.indexOfKey(id) >= 0) {
             p0.c.put(id, null);
          }else {
             p0.c.put(id, p1);
          }
       }
       if ((str = jh7.k(p1)) != null) {
          if (p0.v.containsKey(str)) {
             p0.v.put(str, null);
          }else {
             p0.v.put(str, p1);
          }
       }
       if (p1.getParent() instanceof ListView) {
          ListView parent = p1.getParent();
          if (parent.getAdapter().hasStableIds()) {
             long itemIdAtPosi = parent.getItemIdAtPosition(parent.getPositionForView(p1));
             oy6 t = p0.t;
             if (t.a != null) {
                t.e();
             }
             if (do5.e(t.b, t.t, itemIdAtPosi) >= 0) {
                if ((p1 = p0.t.f(itemIdAtPosi, null)) != null) {
                   dh7.r(p1, false);
                   p0.t.h(itemIdAtPosi, null);
                }
             }else {
                dh7.r(p1, true);
                p0.t.h(itemIdAtPosi, p1);
             }
          }
       }
       return;
    }
    public static pk p(){
       pk opk;
       ThreadLocal n = h87.N;
       if ((opk = n.get()) == null) {
          opk = new pk();
          n.set(opk);
       }
       return opk;
    }
    public static boolean u(o87 p0,o87 p1,String p2){
       boolean b;
       p0 = p0.a.get(p2);
       p1 = p1.a.get(p2);
       if (p0 == null && p1 == null) {
          b = false;
       }else if(p0 != null && p1 != null){
          b = p0.equals(p1) ^ 1;
       }else {
          b = true;
       }
       return b;
    }
    public void A(ViewGroup p0){
       if (this.F != null) {
          if (this.G == null) {
             h87 tD = this.D;
             int i = tD.size();
             while ((i = i - 1) >= 0) {
                tD.get(i).resume();
             }
             if ((tD = this.H) != null && tD.size() > 0) {
                ArrayList uArrayList = this.H.clone();
                i = uArrayList.size();
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   uArrayList.get(i1).c();
                }
             }
          }
          this.F = false;
       }
       return;
    }
    public void B(){
       this.I();
       pk opk = h87.p();
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          Animator uAnimator = iterator.next();
          if (opk.containsKey(uAnimator)) {
             this.I();
             if (uAnimator != null) {
                uAnimator.addListener(new d87(this, 0, opk));
                h87 tc = this.c;
                int i = 0;
                if ((tc - i) >= 0) {
                   uAnimator.setDuration(tc);
                }
                tc = this.b;
                if ((tc - i) >= 0) {
                   long l = uAnimator.getStartDelay() + tc;
                   uAnimator.setStartDelay(l);
                }
                if ((tc = this.t) != null) {
                   uAnimator.setInterpolator(tc);
                }
                uAnimator.addListener(new g5(1, this));
                uAnimator.start();
             }
          }
       }
       this.I.clear();
       this.n();
       return;
    }
    public void C(long p0){
       this.c = p0;
    }
    public void D(xe7 p0){
       this.J = p0;
    }
    public void E(TimeInterpolator p0){
       this.t = p0;
    }
    public void F(qf2 p0){
       this.K = (p0 == null)? h87.M: p0;
       return;
    }
    public void G(){
    }
    public void H(long p0){
       this.b = p0;
    }
    public final void I(){
       h87 tH;
       if (this.E == null) {
          if ((tH = this.H) != null && tH.size() > 0) {
             ArrayList uArrayList = this.H.clone();
             int i = uArrayList.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                uArrayList.get(i1).e(this);
             }
          }
          this.G = false;
       }
       this.E = this.E + 1;
       return;
    }
    public String K(String p0){
       p0 = en6.r(p0)+this.getClass().getSimpleName()+"@"+Integer.toHexString(this.hashCode())+": ";
       String str = "\) ";
       int i = -1;
       if (this.c - i) {
          p0 = en6.s(p0, "dur\(")+this.c+str;
       }
       if (this.b - i) {
          p0 = en6.s(p0, "dly\(")+this.b+str;
       }
       if (this.t != null) {
          p0 = en6.s(p0, "interp\(")+this.t+str;
       }
       h87 tv = this.v;
       h87 tw = this.w;
       if (tv.size() > 0 || tw.size() > 0) {
          p0 = kg4.l(p0, "tgts\(");
          int i1 = 0;
          if (tv.size() > 0) {
             for (int i2 = 0; i2 < tv.size(); i2 = i2 + 1) {
                if (i2 > 0) {
                   p0 = kg4.l(p0, ", ");
                }
                p0 = en6.r(p0).append(tv.get(i2)).toString();
             }
          }
          if (tw.size() > 0) {
             for (; i1 < tw.size(); i1 = i1 + 1) {
                if (i1 > 0) {
                   p0 = kg4.l(p0, ", ");
                }
                p0 = en6.r(p0).append(tw.get(i1)).toString();
             }
          }
          p0 = kg4.l(p0, "\)");
       }
       return p0;
    }
    public void a(g87 p0){
       if (this.H == null) {
          this.H = new ArrayList();
       }
       this.H.add(p0);
       return;
    }
    public void c(View p0){
       this.w.add(p0);
    }
    public void cancel(){
       h87 tD = this.D;
       int i = tD.size();
       while ((i = i - 1) >= 0) {
          tD.get(i).cancel();
       }
       if ((tD = this.H) != null && tD.size() > 0) {
          ArrayList uArrayList = this.H.clone();
          i = uArrayList.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             uArrayList.get(i1).d();
          }
       }
       return;
    }
    public Object clone(){
       return this.k();
    }
    public abstract void e(o87 p0);
    public final void f(View p0,boolean p1){
       if (p0 == null) {
          return;
       }
       p0.getId();
       if (p0.getParent() instanceof ViewGroup) {
          o87 oo87 = new o87(p0);
          if (p1) {
             this.h(oo87);
          }else {
             this.e(oo87);
          }
          oo87.c.add(this);
          this.g(oo87);
          if (p1) {
             h87.d(this.x, p0, oo87);
          }else {
             h87.d(this.y, p0, oo87);
          }
       }
       if (p0 instanceof ViewGroup) {
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             this.f(p0.getChildAt(i), p1);
          }
       }
       return;
    }
    public void g(o87 p0){
    }
    public abstract void h(o87 p0);
    public final void i(ViewGroup p0,boolean p1){
       View view;
       this.j(p1);
       h87 tv = this.v;
       h87 tw = this.w;
       if (tv.size() <= 0 && tw.size() <= 0) {
          this.f(p0, p1);
       }else {
          int i = 0;
          int i1 = 0;
          while (i1 < tv.size()) {
             if ((view = p0.findViewById(tv.get(i1).intValue())) != null) {
                o87 oo87 = new o87(view);
                if (p1) {
                   this.h(oo87);
                }else {
                   this.e(oo87);
                }
                oo87.c.add(this);
                this.g(oo87);
                if (p1) {
                   h87.d(this.x, view, oo87);
                }else {
                   h87.d(this.y, view, oo87);
                }
             }
             i1 = i1 + 1;
          }
          while (i < tw.size()) {
             View view1 = tw.get(i);
             o87 oo871 = new o87(view1);
             if (p1) {
                this.h(oo871);
             }else {
                this.e(oo871);
             }
             oo871.c.add(this);
             this.g(oo871);
             if (p1) {
                h87.d(this.x, view1, oo871);
             }else {
                h87.d(this.y, view1, oo871);
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void j(boolean p0){
       if (p0) {
          this.x.b.clear();
          this.x.c.clear();
          this.x.t.c();
       }else {
          this.y.b.clear();
          this.y.c.clear();
          this.y.t.c();
       }
       return;
    }
    public h87 k(){
       ArrayList uArrayList = null;
       try{
          h87 oh87 = super.clone();
          oh87.I = new ArrayList();
          oh87.x = new oy6(3);
          oh87.y = new oy6(3);
          oh87.B = uArrayList;
          oh87.C = uArrayList;
          return oh87;
       }catch(java.lang.CloneNotSupportedException e0){
          return e0;
       }
    }
    public Animator l(ViewGroup p0,o87 p1,o87 p2){
       return null;
    }
    public void m(ViewGroup p0,oy6 p1,oy6 p2,ArrayList p3,ArrayList p4){
       int i3;
       Animator uAnimator;
       o87 oo872;
       o87 orDefault;
       int i4;
       int i5;
       e87 orDefault1;
       Animator uAnimator2;
       Object obj = this;
       ViewGroup viewGroup = p0;
       pk opk = h87.p();
       SparseIntArray sparseIntArr = new SparseIntArray();
       int i = p3.size();
       int i1 = 0;
       while (i1 < i) {
          o87 oo87 = p3.get(i1);
          o87 oo871 = p4.get(i1);
          Animator obj1 = null;
          if (oo87 != null && !oo87.c.contains(obj)) {
             oo87 = obj1;
          }
          if (oo871 != null && !oo871.c.contains(obj)) {
             oo871 = obj1;
          }
          if (oo87 == null && oo871 == null) {
          label_003f :
             int i2 = p2;
          }else if(oo87 != null && (oo871 != null && !obj.s(oo87, oo871))){
             orDefault1 = 0;
          }else {
             i3 = 1;
          }
          if (i3 && (uAnimator = obj.l(viewGroup, oo87, oo871)) != null) {
             if (oo871 != null) {
                String[] stringArray = this.q();
                oo871 = oo871.b;
                if (stringArray != null && stringArray.length > 0) {
                   oo872 = new o87(oo871);
                   if ((orDefault = p2.b.getOrDefault(oo871, obj1)) != null) {
                      i4 = 0;
                      while (i4 < stringArray.length) {
                         object oobject = stringArray[i4];
                         oo872.a.put(oobject, orDefault.a.get(oobject));
                         i4 = i4 + 1;
                         uAnimator = uAnimator;
                         stringArray = stringArray;
                      }
                   }
                   Animator uAnimator1 = uAnimator;
                   wh6 c = opk.c;
                   i5 = 0;
                   while (true) {
                      if (i5 < c) {
                         orDefault1 = opk.getOrDefault(opk.h(i5), null);
                         if (orDefault1.c != null && (orDefault1.a == oo871 && (orDefault1.b.equals(obj.a) && orDefault1.c.equals(oo872)))) {
                            i5 = 0;
                         }else {
                            i5 = i5 + 1;
                         }
                      }else {
                         obj1 = uAnimator1;
                      }
                   }
                }else {
                   obj1 = uAnimator;
                   oo872 = 0;
                }
                uAnimator2 = i5;
                orDefault = oo872;
             }else {
                oo871 = oo87.b;
                uAnimator2 = uAnimator;
                orDefault = null;
             }
             if (uAnimator2 != null) {
                e87 uoe87 = oo872;
                e87 uoe871 = oo872;
                uoe87 = new e87(oo871, obj.a, this, new jp7(viewGroup), orDefault);
                opk.put(uAnimator2, uoe871);
                obj.I.add(uAnimator2);
             }
          }else {
             goto label_003f ;
          }
          i1 = i1 + 1;
          viewGroup = p0;
       }
       if (sparseIntArr.size()) {
          for (i4 = 0; i4 < sparseIntArr.size(); i4 = i4 + 1) {
             Animator uAnimator3 = obj.I.get(sparseIntArr.keyAt(i4));
             long l = (long)sparseIntArr.valueAt(i4) - Long.MAX_VALUE;
             long l1 = uAnimator3.getStartDelay() + l;
             uAnimator3.setStartDelay(l1);
          }
       }
       return;
    }
    public final void n(){
       h87 tH;
       View view;
       int i = this.E - 1;
       this.E = i;
       if (!i) {
          if ((tH = this.H) != null && tH.size() > 0) {
             ArrayList uArrayList = this.H.clone();
             int i1 = uArrayList.size();
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.get(i2).a(this);
             }
          }
          i = 0;
          while (i < this.x.t.j()) {
             if ((view = this.x.t.k(i)) != null) {
                dh7.r(view, false);
             }
             i = i + 1;
          }
          i = 0;
          while (i < this.y.t.j()) {
             if ((view = this.y.t.k(i)) != null) {
                dh7.r(view, false);
             }
             i = i + 1;
          }
          this.G = true;
       }
       return;
    }
    public final o87 o(View p0,boolean p1){
       h87 tz;
       o87 oo871;
       if ((tz = this.z) != null) {
          return tz.o(p0, p1);
       }
       tz = (p1)? this.B: this.C;
       o87 oo87 = null;
       if (tz == null) {
          return oo87;
       }else {
          int i = tz.size();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if ((oo871 = tz.get(i1)) == null) {
                   return oo87;
                }else if(oo871.b == p0){
                label_002d :
                   if (i1 >= 0) {
                      h87 tC = (p1)? this.C: this.B;
                      oo87 = tC.get(i1);
                      break ;
                   }
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = -1;
                goto label_002d ;
             }
          }
          return oo87;
       }
    }
    public String[] q(){
       return null;
    }
    public final o87 r(View p0,boolean p1){
       h87 tz;
       if ((tz = this.z) != null) {
          return tz.r(p0, p1);
       }
       h87 tx = (p1)? this.x: this.y;
       return tx.b.getOrDefault(p0, null);
    }
    public boolean s(o87 p0,o87 p1){
       String[] stringArray;
       boolean b = false;
       if (p0 != null && p1 != null) {
          if ((stringArray = this.q()) != null) {
             int len = stringArray.length;
             int i = 0;
             while (i < len) {
                if (!h87.u(p0, p1, stringArray[i])) {
                   i = i + 1;
                }
             }
          }else {
             Iterator iterator = p0.a.keySet().iterator();
             while (iterator.hasNext()) {
                if (!h87.u(p0, p1, iterator.next())) {
                }
             }
          }
          b = true;
       }
       return b;
    }
    public final boolean t(View p0){
       int id = p0.getId();
       h87 tv = this.v;
       h87 tw = this.w;
       if (!tv.size() && !tw.size()) {
          return true;
       }
       if (!tv.contains(Integer.valueOf(id)) && !tw.contains(p0)) {
          return false;
       }
       return true;
    }
    public final String toString(){
       return this.K("");
    }
    public void v(View p0){
       if (this.G == null) {
          h87 tD = this.D;
          for (int i = tD.size() - 1; i >= 0; i = i - 1) {
             tD.get(i).pause();
          }
          if ((tD = this.H) != null && tD.size() > 0) {
             ArrayList uArrayList = this.H.clone();
             i = uArrayList.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                uArrayList.get(i1).b();
             }
          }
          this.F = true;
       }
       return;
    }
    public void w(g87 p0){
       h87 tH;
       if ((tH = this.H) == null) {
          return;
       }
       tH.remove(p0);
       if (!this.H.size()) {
          this.H = null;
       }
       return;
    }
    public void z(View p0){
       this.w.remove(p0);
    }
}
