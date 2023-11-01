package p.oi;
import p.w54;
import p.c65;
import p.ko1;
import java.lang.Object;
import p.dt3;
import p.dy1;
import p.ry1;
import java.lang.Iterable;
import java.lang.String;
import p.co5;
import com.google.common.collect.c;
import java.util.Collection;
import java.util.Iterator;
import p.ju2;
import p.k23;
import java.util.ArrayList;
import p.dj0;
import p.aj0;
import java.lang.Class;
import p.h23;
import java.util.List;
import p.ys5;
import p.vi7;
import p.t26;
import p.vj3;
import java.util.HashMap;
import androidx.lifecycle.SavedStateHandleController;
import p.au0;
import p.o;
import p.dx0;
import p.jc7;
import p.eb3;
import java.lang.IllegalStateException;
import p.uj3;
import java.lang.Enum;
import p.ks5;
import p.wb0;
import p.ye7;
import coil.util.-Lifecycles$awaitStarted$2$1;
import p.dk3;
import android.os.Bundle;
import p.m26;
import p.gg1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.a56;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p.b7;
import androidx.core.widget.NestedScrollView;
import p.g54;
import p.vv;
import p.jt;
import p.eo5;
import p.ih1;
import java.util.HashSet;
import p.vv7;
import p.aq6;
import p.yp6;
import p.bh1;
import p.r45;
import p.ks0;
import com.google.common.collect.d;
import p.d73;
import p.rr;
import p.td7;
import p.a73;
import p.e73;
import p.d1;
import p.gt0;
import p.tr;
import p.nt0;
import p.ur;
import java.util.Set;
import p.ch1;
import p.dl6;
import p.eh1;
import p.yg1;
import p.zg1;
import p.xt;
import p.ad6;
import p.a23;
import p.au2;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.a28;
import p.m07;
import p.mu7;
import p.da5;
import p.ca5;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;

public abstract class oi implements w54	// class@00212c from classes.dex
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final dy1 F;
    public static final ry1 G;
    public static final c65 a;
    public static final ko1 b;
    public static ko1 c;
    public static final int[] t;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
       oi.a = new c65(20);
       oi.b = new ko1(null, null, null, 15);
       dt3 uodt3 = new dt3(17);
       oi.t = new int[12]{0x10100c4,0x10100eb,0x10100f1,0x7f030261,0x7f030262,0x7f030263,0x7f030264,0x7f030265,0x7f030339,0x7f030541,0x7f0305a4,0x7f0305b3};
       oi.v = new int[124]{0x10100c4,0x10100d0,0x10100dc,0x10100f4,0x10100f5,0x10100f7,0x10100f8,0x10100f9,0x10100fa,0x101011f,0x1010120,0x101013f,0x1010140,0x101031f,0x1010320,0x1010321,0x1010322,0x1010323,0x1010324,0x1010325,0x1010326,0x1010327,0x1010328,0x10103b5,0x10103b6,0x10103fa,0x1010440,0x7f03003b,0x7f03003c,0x7f030085,0x7f030086,0x7f030087,0x7f0300f6,0x7f030176,0x7f030177,0x7f0301dc,0x7f030276,0x7f030277,0x7f030278,0x7f030279,0x7f03027a,0x7f03027b,0x7f03027c,0x7f03027d,0x7f03027e,0x7f03027f,0x7f030280,0x7f030281,0x7f030282,0x7f030284,0x7f030285,0x7f030286,0x7f030287,0x7f030288,0x7f0302c1,0x7f030341,0x7f030342,0x7f030343,0x7f030344,0x7f030345,0x7f030346,0x7f030347,0x7f030348,0x7f030349,0x7f03034a,0x7f03034b,0x7f03034c,0x7f03034d,0x7f03034e,0x7f03034f,0x7f030350,0x7f030351,0x7f030352,0x7f030353,0x7f030354,0x7f030355,0x7f030356,0x7f030357,0x7f030358,0x7f030359,0x7f03035a,0x7f03035b,0x7f03035c,0x7f03035d,0x7f03035e,0x7f03035f,0x7f030360,0x7f030361,0x7f030362,0x7f030363,0x7f030364,0x7f030365,0x7f030366,0x7f030367,0x7f030368,0x7f030369,0x7f03036a,0x7f03036b,0x7f03036c,0x7f03036d,0x7f03036e,0x7f030370,0x7f030371,0x7f030375,0x7f030376,0x7f030377,0x7f030378,0x7f030379,0x7f03037a,0x7f03037b,0x7f03037f,0x7f03038a,0x7f030412,0x7f030413,0x7f0304ea,0x7f0304f4,0x7f0304fd,0x7f030526,0x7f030527,0x7f030528,0x7f030680,0x7f030682,0x7f030684,0x7f03069b};
       oi.w = new int[115]{0x10100c4,0x10100d5,0x10100d6,0x10100d7,0x10100d8,0x10100d9,0x10100dc,0x10100f4,0x10100f5,0x10100f6,0x10100f7,0x10100f8,0x10100f9,0x10100fa,0x101011f,0x1010120,0x101013f,0x1010140,0x10103b3,0x10103b4,0x10103b5,0x10103b6,0x1010440,0x101053b,0x101053c,0x7f030085,0x7f030086,0x7f030087,0x7f0300f6,0x7f03011b,0x7f03011c,0x7f03011d,0x7f03011e,0x7f03011f,0x7f030173,0x7f030176,0x7f030177,0x7f030276,0x7f030277,0x7f030278,0x7f030279,0x7f03027a,0x7f03027b,0x7f03027c,0x7f03027d,0x7f03027e,0x7f03027f,0x7f030280,0x7f030281,0x7f030282,0x7f030284,0x7f030285,0x7f030286,0x7f030287,0x7f030288,0x7f0302c1,0x7f030337,0x7f030341,0x7f030342,0x7f030343,0x7f030344,0x7f030345,0x7f030346,0x7f030347,0x7f030348,0x7f030349,0x7f03034a,0x7f03034b,0x7f03034c,0x7f03034d,0x7f03034e,0x7f03034f,0x7f030350,0x7f030351,0x7f030352,0x7f030353,0x7f030354,0x7f030355,0x7f030356,0x7f030357,0x7f030358,0x7f030359,0x7f03035a,0x7f03035b,0x7f03035c,0x7f03035d,0x7f03035e,0x7f03035f,0x7f030360,0x7f030361,0x7f030362,0x7f030363,0x7f030364,0x7f030365,0x7f030366,0x7f030367,0x7f030368,0x7f030369,0x7f03036a,0x7f03036b,0x7f03036c,0x7f03036d,0x7f03036e,0x7f030370,0x7f030371,0x7f030375,0x7f030376,0x7f030377,0x7f030378,0x7f030379,0x7f03037a,0x7f03037b,0x7f03037f,0x7f030384,0x7f03038a};
       oi.x = new int[108]{0x10100c4,0x10100d0,0x10100dc,0x10100f4,0x10100f5,0x10100f7,0x10100f8,0x10100f9,0x10100fa,0x101011f,0x1010120,0x101013f,0x1010140,0x101031f,0x1010320,0x1010321,0x1010322,0x1010323,0x1010324,0x1010325,0x1010326,0x1010327,0x1010328,0x10103b5,0x10103b6,0x10103fa,0x1010440,0x7f03003b,0x7f03003c,0x7f030085,0x7f030086,0x7f030087,0x7f0300f6,0x7f030176,0x7f0301dc,0x7f030276,0x7f030277,0x7f030278,0x7f030279,0x7f03027a,0x7f03027b,0x7f03027c,0x7f03027d,0x7f03027e,0x7f03027f,0x7f030280,0x7f030281,0x7f030282,0x7f030284,0x7f030285,0x7f030286,0x7f030287,0x7f030288,0x7f0302c1,0x7f030341,0x7f030342,0x7f030343,0x7f030347,0x7f03034b,0x7f03034c,0x7f03034d,0x7f030350,0x7f030351,0x7f030352,0x7f030353,0x7f030354,0x7f030355,0x7f030356,0x7f030357,0x7f030358,0x7f030359,0x7f03035a,0x7f03035b,0x7f03035e,0x7f030363,0x7f030364,0x7f030367,0x7f030368,0x7f030369,0x7f03036a,0x7f03036b,0x7f03036c,0x7f03036d,0x7f03036e,0x7f030370,0x7f030371,0x7f030375,0x7f030376,0x7f030377,0x7f030378,0x7f030379,0x7f03037a,0x7f03037b,0x7f03037f,0x7f03038a,0x7f030412,0x7f030413,0x7f030414,0x7f0304ea,0x7f0304f4,0x7f0304fd,0x7f030526,0x7f030527,0x7f030528,0x7f030680,0x7f030682,0x7f030684,0x7f03069b};
       oi.y = new int[11]{0x7f03005d,0x7f0301a7,0x7f0301a8,0x7f0301a9,0x7f0301aa,0x7f0301ab,0x7f0301ac,0x7f0301ae,0x7f0301af,0x7f0301b0,0x7f0303ed};
       oi.z = new int[76]{0x10100c4,0x10100f4,0x10100f5,0x10100f7,0x10100f8,0x10100f9,0x10100fa,0x10103b5,0x10103b6,0x7f030085,0x7f030086,0x7f030087,0x7f0300f6,0x7f030176,0x7f030177,0x7f0302c1,0x7f030341,0x7f030342,0x7f030343,0x7f030344,0x7f030345,0x7f030346,0x7f030347,0x7f030348,0x7f030349,0x7f03034a,0x7f03034b,0x7f03034c,0x7f03034d,0x7f03034e,0x7f03034f,0x7f030350,0x7f030351,0x7f030352,0x7f030353,0x7f030354,0x7f030355,0x7f030356,0x7f030357,0x7f030358,0x7f030359,0x7f03035a,0x7f03035b,0x7f03035c,0x7f03035d,0x7f03035e,0x7f03035f,0x7f030360,0x7f030361,0x7f030362,0x7f030364,0x7f030365,0x7f030366,0x7f030367,0x7f030368,0x7f030369,0x7f03036a,0x7f03036b,0x7f03036c,0x7f03036d,0x7f03036e,0x7f030370,0x7f030371,0x7f030375,0x7f030376,0x7f030377,0x7f030378,0x7f030379,0x7f03037a,0x7f03037b,0x7f03037f,0x7f03038a,0x7f0303e4,0x7f0303e9,0x7f0303ef,0x7f0303f4};
       oi.A = new int[10]{0x7f03003b,0x7f03003c,0x7f0301dc,0x7f030411,0x7f030413,0x7f0304ea,0x7f030526,0x7f030527,0x7f030528,0x7f030682};
       oi.B = new int[5]{0x10100dc,0x101031f,0x7f030363,0x7f030412,0x7f03069b};
       oi.C = new int[2]{0x10100d0,0x7f030178};
       oi.D = new int[12]{0x1010320,0x1010321,0x1010322,0x1010323,0x1010324,0x1010325,0x1010326,0x1010327,0x1010328,0x10103fa,0x1010440,0x7f030680};
       oi.E = new int[5]{0x7f030178,0x7f03053b,0x7f03053c,0x7f03053d,0x7f03053e};
       oi.F = new dy1(null);
       oi.G = new ry1(2);
    }
    public void oi(){
       super();
    }
    public static final Iterable a(Iterable p0){
       co5.o(p0, "items");
       if (p0 instanceof c) {
          if (!p0 instanceof Collection || !p0.isEmpty()) {
             Iterator iterator1 = p0.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (!iterator1.next() instanceof k23) {
                      iterator1 = 0;
                      break ;
                   }
                }
             }
             if (i) {
             label_005c :
                return p0;
             }
          }
          int i = 1;
       }
       ArrayList uArrayList = dj0.i0(p0);
       ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          k23.c.getClass();
          uArrayList1.add(h23.b(iterator.next()));
       }
       uArrayList = uArrayList1;
       goto label_005c ;
    }
    public static final c b(List p0){
       ys5 v;
       if (p0 != null && !p0.isEmpty()) {
          v = c.n(oi.a(p0));
          co5.l(v, "{\n            ImmutableL…)\n            \)\n        }");
       }else {
          v = ys5.v;
          co5.l(v, "{\n            ImmutableList.of\(\)\n        }");
       }
       return v;
    }
    public static final void c(vi7 p0,t26 p1,vj3 p2){
       vi7 a;
       SavedStateHandleController savedStateHa;
       co5.o(p1, "registry");
       co5.o(p2, "lifecycle");
       String str = "androidx.lifecycle.savedstate.vm.tag";
       if ((a = p0.a) == null) {
          savedStateHa = null;
       }else {
          _monitor_enter(a);
          savedStateHa = p0.a.get(str);
          _monitor_exit(a);
       }
       if (savedStateHa != null && savedStateHa.c == null) {
          savedStateHa.b(p2, p1);
          oi.n(p2, p1);
       }
       return;
    }
    public static final Object d(vj3 p0,au0 p1){
       o oo;
       o v;
       ks5 a2;
       if (p1 instanceof o) {
          oo = p1;
          o x = oo.x;
          int i = Integer.MIN_VALUE;
          if ((x & i)) {
             oo.x = x - i;
          label_0018 :
             o w = oo.w;
             dx0 a = dx0.a;
             o x1 = oo.x;
             jc7 a1 = jc7.a;
             if (x1 != null) {
                if (x1 == 1) {
                   v = oo.v;
                   oo = oo.t;
                   eb3.G(w);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(w);
                w = (p0.b().compareTo(uj3.t) >= 0)? 1: 0;
                if (w) {
                   return a1;
                }else {
                   ks5 oks5 = new ks5();
                   oo.t = p0;
                   oo.v = oks5;
                   oo.x = 1;
                   wb0 owb0 = new wb0(1, ye7.E(oo));
                   owb0.p();
                   -Lifecycles$awaitStarted$2$1 oo1 = new -Lifecycles$awaitStarted$2$1(owb0);
                   oks5.a = oo1;
                   p0.a(oo1);
                   if (owb0.o() == a) {
                      return a;
                   }else {
                      vj3 ovj3 = p0;
                      a2 = oks5;
                   }
                }
             }
             if ((a2 = v.a) != null) {
                oo.c(a2);
             }
             return a1;
          }
       }
       oo = new o(p1);
       goto label_0018 ;
    }
    public static final SavedStateHandleController e(t26 p0,vj3 p1,String p2,Bundle p3){
       SavedStateHandleController savedStateHa = new SavedStateHandleController(gg1.v(p0.a(p2), p3), p2);
       savedStateHa.b(p1, p0);
       oi.n(p1, p0);
       return savedStateHa;
    }
    public static final boolean f(k23 p0,ju2 p1){
       k23 ok23;
       if (p0 == p1) {
          return true;
       }
       if (p0 == null) {
          k23.c.getClass();
          p0 = k23.L();
       }
       if (p1 == null) {
          k23.c.getClass();
          ok23 = k23.L();
       }
       return co5.c(p0, ok23);
    }
    public static a56 g(CoordinatorLayout p0){
       View childAt;
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return oi.F;
          }
          childAt = p0.getChildAt(i);
          if (childAt instanceof RecyclerView) {
             break ;
          }else if(childAt instanceof NestedScrollView){
             return new g54(childAt);
          }else {
             i = i + 1;
          }
       }
       return new b7(25, childAt);
    }
    public static jt h(vv p0){
       int i1;
       c uoc;
       c uoc1;
       e73 uoe731;
       aq6 uoaq61;
       aq6 b;
       int i2;
       int i = 1;
       eo5[] uoeo5Array = new eo5[i];
       uoeo5Array[0] = new ih1();
       HashSet hashSet = vv7.p(uoeo5Array);
       vv a = p0.a;
       if (a.b != yp6.m0) {
          hashSet.add(new bh1(a, p0.b));
       }
       HashSet hashSet1 = new HashSet(i);
       vv e = p0.e;
       if (e.c()) {
          ks0 oks0 = e.b();
          d73 uod73 = new d73();
          aq6 uoaq6 = td7.d(oks0.a);
          vv d = p0.d;
          if (uoaq6 != null && (!d.contains(uoaq6) && ((i1 = uoaq6.b.ordinal()) == i && (i1 != 3 && (i1 != 5 && (i1 != 51 && i1 != 52)))))) {
             uod73.D0(uoaq6);
          }
          if ((uoc = oks0.d.f()) != null) {
             e73 uoe73 = uoc.q(0);
             while (uoe73.hasNext()) {
                if ((uoc1 = uoe73.next().c.f()) != null) {
                   uoe731 = uoc1.q(0);
                   while (uoe731.hasNext()) {
                      if ((uoaq61 = td7.d(uoe731.next().a)) != null && !d.contains(uoaq61)) {
                         uod73.D0(uoaq61);
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
          hashSet1.addAll(uod73.H0());
       }
       e = p0.a;
       uoe731 = ((b = e.b) != yp6.A && b != yp6.B)? 0: 1;
       if (uoe731) {
          hashSet.add(new ch1(e));
          p0 = p0.a(new dl6(e));
       }else if(b == yp6.l0){
          uoe731 = 1;
       }else {
          uoe731 = 0;
       }
       if (uoe731) {
          hashSet.add(new eh1(e));
          p0 = p0.a(new dl6(e));
       }else if(b == yp6.m0){
          uoe731 = 1;
       }else {
          uoe731 = 0;
       }
       if (uoe731) {
          hashSet.add(new yg1(e));
          p0 = p0.a(new dl6(e));
       }else if((i2 = b.ordinal()) != i && (i2 != 3 && (i2 != 5 && (i2 != 51 && i2 != 52)))){
          i = 0;
       }
       if (i) {
          hashSet1.add(e);
       }
       hashSet1.removeAll(p0.d);
       if (!hashSet1.isEmpty()) {
          hashSet.add(new zg1(hashSet1));
          p0 = p0.a(hashSet1);
       }
    }
    public static xt i(vv p0){
       if (p0.l != null) {
          return xt.e();
       }
       ad6 uoad6 = new ad6(p0);
       uoad6.e(true);
       return xt.d(uoad6.b());
    }
    public static final boolean j(c p0,Collection p1){
       boolean b = true;
       if (p0 != p1) {
          int i = (p0 != null && !p0.isEmpty())? 0: 1;
          if (i) {
             i = (p1 != null && !p1.isEmpty())? 0: 1;
             if (!i) {
             label_0021 :
                b = false;
             }
          }else {
             goto label_0021 ;
          }
       }
       return b;
    }
    public static final boolean k(a23 p0,au2 p1){
       boolean b = true;
       if (p0 != p1) {
          int i = (p0 != null && !p0.keySet().isEmpty())? 0: 1;
          if (i) {
             i = (p1 != null && !p1.keySet().isEmpty())? 0: 1;
             if (!i) {
             label_0029 :
                b = false;
             }
          }else {
             goto label_0029 ;
          }
       }
       return b;
    }
    public static final c l(Parcel p0){
       co5.o(p0, "parcel");
       ArrayList uArrayList = new ArrayList(p0.readInt());
       p0.readTypedList(uArrayList, k23.CREATOR);
       c uoc = c.o(uArrayList);
       co5.l(uoc, "copyOf\(list\)");
       return uoc;
    }
    public static a28 m(BasePendingResult p0){
       m07 om07 = new m07();
       p0.C(new mu7(p0, om07, new dt3(18)));
       return om07.a;
    }
    public static void n(vj3 p0,t26 p1){
       uj3 ouj3;
       if ((ouj3 = p0.b()) != uj3.b) {
          ouj3 = (ouj3.compareTo(uj3.t) >= 0)? 1: 0;
          if (!ouj3) {
             p0.a(new LegacySavedStateHandleController$tryToAddRecreator$1(p0, p1));
          label_0022 :
             return;
          }
       }
       p1.d();
       goto label_0022 ;
    }
    public static final void o(Parcel p0,c p1){
       co5.o(p0, "dest");
       co5.o(p1, "list");
       p0.writeInt(p1.size());
       p0.writeTypedList(p1);
    }
}
