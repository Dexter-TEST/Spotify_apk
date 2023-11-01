package p.mi7;
import p.lq6;
import p.rk7;
import java.lang.Object;
import p.wh6;
import p.qv3;
import p.fr5;
import p.vg7;
import p.uf;
import p.gh4;
import java.lang.Long;
import p.jq6;
import p.zr5;
import p.li7;
import android.util.SparseArray;
import java.util.List;
import java.util.ArrayList;
import p.zn;
import java.util.Arrays;
import java.lang.Math;
import java.lang.System;
import android.view.View;
import p.wg7;
import p.hr5;
import p.qq6;
import p.th5;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class mi7 implements lq6, rk7	// class@001ea3 from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void mi7(int p0){
       this.a = p0;
       if (p0 != 2) {
          super();
          this.c = new wh6();
          this.b = new qv3();
          return;
       }else {
          super();
          return;
       }
    }
    public void mi7(fr5 p0){
       this.a = 3;
       super();
       this.c = p0;
       this.b = new vg7();
    }
    public void mi7(uf p0,gh4 p1){
       this.a = 4;
       this.b = p0;
       super();
       this.c = p1;
    }
    public final long a(long p0){
       Long longx;
       if ((longx = this.b.f(p0, null)) == null) {
          mi7 tc = this.c;
          jq6 a = tc.a;
          tc.a = 1 + a;
          longx = Long.valueOf(a);
          this.b.h(p0, longx);
       }
       return longx.longValue();
    }
    public final int b(int p0){
       return p0;
    }
    public final void c(zr5 p0){
       li7 orDefault;
       if ((orDefault = this.c.getOrDefault(p0, null)) == null) {
          orDefault = li7.a();
          this.c.put(p0, orDefault);
       }
       orDefault.a = orDefault.a | 0x01;
       return;
    }
    public final int d(int p0){
       List list;
       if ((list = this.b.b.get(p0)) == null) {
          list = new ArrayList();
          this.b.b.put(p0, list);
       }
       if (!list.contains(this.c)) {
          list.add(this.c);
       }
       return p0;
    }
    public final void e(zr5 p0,zn p1){
       li7 orDefault;
       if ((orDefault = this.c.getOrDefault(p0, null)) == null) {
          orDefault = li7.a();
          this.c.put(p0, orDefault);
       }
       orDefault.c = p1;
       orDefault.a = orDefault.a | 0x08;
       return;
    }
    public final void f(zr5 p0,zn p1){
       li7 orDefault;
       if ((orDefault = this.c.getOrDefault(p0, null)) == null) {
          orDefault = li7.a();
          this.c.put(p0, orDefault);
       }
       orDefault.b = p1;
       orDefault.a = orDefault.a | 0x04;
       return;
    }
    public final void g(){
       mi7 tc;
       switch (this.a){
           case 0:
           default:
             if ((tc = this.c) != null) {
                Arrays.fill(tc, -1);
             }
             this.b = null;
             return;
       }
       this.c.clear();
       this.b.c();
       return;
    }
    public final void h(int p0){
       int[] ointArray;
       mi7 tc = this.c;
       if (tc == null) {
          ointArray = new int[(Math.max(p0, 10) + 1)];
          this.c = ointArray;
          Arrays.fill(ointArray, -1);
       }else if(p0 >= tc.length){
          mi7 omi7 = tc;
          int len = tc.length;
          while (len <= p0) {
             len = len * 2;
          }
          ointArray = new int[len];
          this.c = ointArray;
          System.arraycopy(omi7, 0, ointArray, 0, omi7.length);
          mi7 tc1 = this.c;
          tc = tc1;
          Arrays.fill(tc, omi7.length, tc1.length, -1);
       }
       return;
    }
    public final View i(int p0,int p1,int p2,int p3){
       int paddingLeft;
       View view1;
       mi7 tc = this.c;
       fr5 b = tc.b;
       switch (tc.a){
           case 0:
             paddingLeft = b.getPaddingLeft();
             break;
           default:
             paddingLeft = b.getPaddingTop();
       }
       int i = this.c.c();
       int i1 = (p1 > p0)? 1: -1;
       View view = null;
       while (true) {
          if (p0 == p1) {
             return view;
          }
          mi7 tc1 = this.c;
          fr5 b1 = tc1.b;
          switch (tc1.a){
              case 0:
                view1 = b1.H(p0);
                break;
              default:
                view1 = b1.H(p0);
          }
          mi7 tb = this.b;
          mi7 omi7 = tb;
          omi7.b = paddingLeft;
          omi7.c = i;
          omi7.d = this.c.b(view1);
          omi7.e = this.c.a(view1);
          if (p2) {
             int i2 = p2 | 0x00;
             if (tb.a = i2) {
                break ;
             }
          }
          if (p3) {
             mi7 tb1 = this.b;
             int i3 = p3 | 0x00;
             tb1.a = i3;
             if (tb1.a()) {
                view = view1;
             }
          }
          p0 = p0 + i1;
       }
       return view1;
    }
    public final int j(int p0){
       mi7 tc;
       qq6 oqq6;
       int i;
       if ((tc = this.c) == null) {
          return -1;
       }
       if (p0 >= tc.length) {
          return -1;
       }
       tc = this.b;
       if (tc != null) {
          oqq6 = null;
          if (tc != null) {
             i = tc.size() - 1;
             while (i >= 0) {
                qq6 oqq61 = this.b.get(i);
                if (oqq61.a == p0) {
                   qq6 oqq62 = oqq61;
                   break ;
                }
                i = i - 1;
             }
          }
          if (oqq6 != null) {
             this.b.remove(oqq6);
          }
          i = this.b.size();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (this.b.get(i1).a >= p0) {
                label_005b :
                   if (i1 != -1) {
                      this.b.remove(i1);
                      oqq6 = this.b.get(i1).a;
                   label_0072 :
                      if (oqq6 == -1) {
                         break ;
                      }else {
                         i = Math.min((oqq6 + 1), this.c.length);
                         Arrays.fill(this.c, p0, i, -1);
                         return i;
                      }
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = -1;
                goto label_005b ;
             }
          }
          tc = this.c;
          Arrays.fill(tc, p0, tc.length, -1);
          return this.c.length;
       }
       oqq6 = -1;
       goto label_0072 ;
    }
    public final boolean k(View p0){
       int paddingLeft;
       mi7 tb = this.b;
       mi7 tc = this.c;
       fr5 b = tc.b;
       switch (tc.a){
           case 0:
             paddingLeft = b.getPaddingLeft();
             break;
           default:
             paddingLeft = b.getPaddingTop();
       }
       tb.b = paddingLeft;
       tb.c = this.c.c();
       tb.d = this.c.b(p0);
       tb.e = this.c.a(p0);
       mi7 tb1 = this.b;
       tb1.a = 0x6003 | 0x00;
       return tb1.a();
    }
    public final void l(int p0,int p1){
       mi7 tc;
       qq6 a;
       if ((tc = this.c) != null && p0 < tc.length) {
          int i = p0 + p1;
          this.h(i);
          mi7 tc1 = this.c;
          System.arraycopy(tc1, p0, tc1, i, ((tc1.length - p0) - p1));
          int i1 = -1;
          Arrays.fill(this.c, p0, i, i1);
          if ((tc = this.b) != null) {
             i = tc.size() + i1;
             while (i >= 0) {
                qq6 oqq6 = this.b.get(i);
                if ((a = oqq6.a) >= p0) {
                   i1 = a + p1;
                   oqq6.a = i1;
                }
                i = i - 1;
             }
          }
       }
       return;
    }
    public final void m(int p0,int p1){
       mi7 tc;
       qq6 a;
       if ((tc = this.c) != null && p0 < tc.length) {
          int i = p0 + p1;
          this.h(i);
          mi7 tc1 = this.c;
          System.arraycopy(tc1, i, tc1, p0, ((tc1.length - p0) - p1));
          tc1 = this.c;
          Arrays.fill(tc1, (tc1.length - p1), tc1.length, -1);
          if ((tc1 = this.b) != null) {
             int i1 = tc1.size() - 1;
             while (i1 >= 0) {
                qq6 oqq6 = this.b.get(i1);
                if ((a = oqq6.a) >= p0) {
                   if (a < i) {
                      this.b.remove(i1);
                   }else {
                      int i2 = a - p1;
                      oqq6.a = i2;
                   }
                }
                i1 = i1 - 1;
             }
          }
       }
       return;
    }
    public final zn n(zr5 p0,int p1){
       int i;
       li7 oli7;
       li7 b;
       if ((i = this.c.e(p0)) < 0) {
          return null;
       }
       if ((oli7 = this.c.j(i)) != null) {
          li7 a = oli7.a;
          if ((a & p1)) {
             int i1 = a & (~ p1);
             oli7.a = i1;
             if (p1 == 4) {
                b = oli7.b;
             }else if(p1 == 8){
                b = oli7.c;
             }else {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
             }
             if (!((i1 & 0x0c))) {
                this.c.i(i);
                oli7.a = 0;
                oli7.b = null;
                oli7.c = null;
                li7.d.b(oli7);
             }
             return b;
          }
       }
       return null;
    }
    public final void o(zr5 p0){
       li7 orDefault;
       if ((orDefault = this.c.getOrDefault(p0, null)) == null) {
          return;
       }
       orDefault.a = orDefault.a & 0xfe;
       return;
    }
    public final void p(zr5 p0){
       li7 oli7;
       int i = this.b.j() - 1;
       while (i >= 0) {
          if (p0 == this.b.k(i)) {
             mi7 tb = this.b;
             qv3 c = tb.c;
             Object v = qv3.v;
             if (c[i] != v) {
                c[i] = v;
                tb.a = true;
                break ;
             }else if((oli7 = this.c.remove(p0)) != null){
                oli7.a = 0;
                oli7.b = null;
                oli7.c = null;
                li7.d.b(oli7);
             }
             return;
          }else {
             i = i - 1;
          }
       }
    }
}
