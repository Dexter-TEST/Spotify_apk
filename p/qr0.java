package p.qr0;
import p.oe1;
import p.r95;
import p.my;
import p.bw3;
import p.sy;
import p.kd6;
import p.sv3;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import p.zr0;
import p.or0;
import p.wd;
import p.zh3;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Path;
import p.lr7;
import p.bn2;
import java.util.ListIterator;
import p.ku5;
import java.util.Collections;
import java.util.Collection;
import android.graphics.Canvas;
import p.qy;
import java.lang.Integer;
import java.lang.Class;

public final class qr0 implements oe1, r95, my	// class@0023fa from classes.dex
{
    public final Matrix a;
    public final Path b;
    public final RectF c;
    public final boolean d;
    public final List e;
    public final bw3 f;
    public final lr7 g;

    public void qr0(bw3 p0,sy p1,kd6 p2,sv3 p3){
       or0 oor0;
       zr0 ozr01;
       kd6 c = p2.c;
       p2 = p2.b;
       ArrayList uArrayList = new ArrayList(p2.size());
       int i = 0;
       int i1 = 0;
       while (i1 < p2.size()) {
          if ((oor0 = p2.get(i1).a(p0, p3, p1)) != null) {
             uArrayList.add(oor0);
          }
          i1 = i1 + 1;
       }
       while (true) {
          if (i < p2.size()) {
             zr0 ozr0 = p2.get(i);
             if (ozr0 instanceof wd) {
                ozr01 = ozr0;
                break ;
             }else {
                i = i + 1;
             }
          }else {
             ozr01 = null;
             break ;
          }
       }
       super(p0, p1, c, uArrayList, ozr01);
       return;
    }
    public void qr0(bw3 p0,sy p1,boolean p2,ArrayList p3,wd p4){
       super();
       zh3 ozh3 = new zh3();
       RectF ozh31 = new RectF();
       this.a = new Matrix();
       this.b = new Path();
       this.c = new RectF();
       this.f = p0;
       this.d = p2;
       this.e = p3;
       if (p4 != null) {
          lr7 olr7 = new lr7(p4);
          this.g = olr7;
          olr7.a(p1);
          olr7.b(this);
       }
       ArrayList uArrayList = new ArrayList();
       int i = p3.size();
       while ((i--) >= 0) {
          or0 oor0 = p3.get(i);
          if (oor0 instanceof bn2) {
             uArrayList.add(oor0);
          }
       }
       i = uArrayList.size();
       while ((i--) >= 0) {
          bn2 uobn2 = uArrayList.get(i);
          ku5 oku5 = p3.listIterator(p3.size());
          if (uobn2.i != null) {
          }else {
             do {
             } while (oku5.hasPrevious() && oku5.previous() != uobn2);
             ArrayList uArrayList1 = new ArrayList();
             while (oku5.hasPrevious()) {
                uArrayList1.add(oku5.previous());
                oku5.remove();
             }
             Collections.reverse(uArrayList1);
             qr0 oku51 = new qr0(uobn2.c, uobn2.d, uobn2.e, uArrayList1, null);
             uobn2.i = oku5;
          }
       }
       return;
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       qr0 tg;
       qr0 ta = this.a;
       ta.set(p1);
       if ((tg = this.g) != null) {
          ta.preConcat(tg.f());
       }
       tg = this.c;
       tg.set(0, 0, 0, 0);
       qr0 te = this.e;
       int i = te.size();
       while ((i = i - 1) >= 0) {
          or0 oor0 = te.get(i);
          if (oor0 instanceof oe1) {
             oor0.a(tg, ta, p2);
             p0.union(tg);
          }
       }
       return;
    }
    public final void b(){
       this.f.invalidateSelf();
    }
    public final void c(List p0,List p1){
       qr0 te = this.e;
       ArrayList uArrayList = new ArrayList((te.size() + p0.size()));
       uArrayList.addAll(p0);
       for (int i = te.size() - 1; i >= 0; i--) {
          or0 oor0 = te.get(i);
          oor0.c(uArrayList, te.subList(0, i));
          uArrayList.add(oor0);
       }
       return;
    }
    public final Path d(){
       qr0 tg;
       qr0 ta = this.a;
       ta.reset();
       if ((tg = this.g) != null) {
          ta.set(tg.f());
       }
       tg = this.b;
       tg.reset();
       if (this.d != null) {
          return tg;
       }else {
          qr0 te = this.e;
          int i = te.size() - 1;
          while (i >= 0) {
             or0 oor0 = te.get(i);
             if (oor0 instanceof r95) {
                tg.addPath(oor0.d(), ta);
             }
             i = i - 1;
          }
          return tg;
       }
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       qr0 tg;
       lr7 j;
       if (this.d != null) {
          return;
       }
       qr0 ta = this.a;
       ta.set(p1);
       if ((tg = this.g) != null) {
          ta.preConcat(tg.f());
          int i = ((j = tg.j) == null)? 100: j.e().intValue();
          p2 = (int)(((((float)i / 100.00f) * (float)p2) / 0x437f0000) * 0x437f0000);
       }
       this.f.getClass();
       tg = this.e;
       int i1 = tg.size();
       while ((i1 = i1 - 1) >= 0) {
          Object obj = tg.get(i1);
          if (obj instanceof oe1) {
             obj.e(p0, ta, p2);
          }
       }
       return;
    }
}
