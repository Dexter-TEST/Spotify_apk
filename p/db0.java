package p.db0;
import p.vq5;
import p.up0;
import p.ma0;
import p.jn6;
import p.ll1;
import p.zr5;
import p.cs5;
import java.lang.Object;
import java.util.List;
import p.jb0;
import p.la0;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.dg7;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import p.f5;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p.fb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Locale;
import p.ox7;
import p.av6;
import p.yq5;
import p.hn6;
import p.in6;
import java.util.Arrays;
import p.xl3;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.lang.System;
import p.g00;

public final class db0 extends vq5	// class@001312 from classes.dex
{
    public final up0 w;
    public final jn6 x;
    public List y;
    public String z;

    public void db0(up0 p0){
       super();
       this.x = new jn6(new ma0(this));
       this.y = ll1.a;
       this.z = "";
       this.v = false;
       this.w = p0;
    }
    public final void n(zr5 p0,int p1){
       jb0 ojb0 = this.t.get(p1);
       co5.o(ojb0, "callingCode");
       jb0 u = p0.u;
       u.getClass();
       la0 c = ojb0.c;
       co5.o(c, "text");
       u.b.setText(c);
       String str = "\x20\x02"+ojb0.b;
       co5.o(str, "text");
       u.c.setText(str);
       p0.a.setOnClickListener(new f5(10, p0, ojb0));
    }
    public final zr5 o(int p0,RecyclerView p1){
       co5.o(p1, "container");
       return new fb0(p1, this.w);
    }
    public final void r(zr5 p0){
    }
    public final void s(zr5 p0){
    }
    public final void t(zr5 p0){
       p0.getClass();
    }
    public final void w(){
       ArrayList uArrayList;
       jn6 f1;
       jn6 g;
       int i3;
       int i4;
       jn6 f2;
       int i5;
       int i6;
       jn6 e;
       int i7;
       int i8;
       int i9;
       int i = 1;
       int i1 = 0;
       int i2 = (!this.z.length())? 1: 0;
       if (i2) {
          uArrayList = new ArrayList(this.y);
       }else {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = this.y.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             String str = obj.c.toLowerCase(new Locale(ox7.j()));
             co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
             if (av6.f0(str, this.z)) {
                uArrayList1.add(obj);
             }
          }
          uArrayList = uArrayList1;
       }
       this.t = uArrayList;
       if (this.v != null) {
          this.g();
       }
       db0 tx = this.x;
       tx.a();
       jn6 f = tx.f;
       if (!f instanceof hn6) {
          if (tx.g == null) {
             tx.g = new hn6(f);
          }
          tx.f = tx.g;
       }
       tx.a();
       if ((f = tx.h) != null) {
          Arrays.fill(tx.a, i1, f, null);
          tx.h = i1;
          tx.f.d(i1, f);
       }
       la0 ola0 = la0.class;
       Object[] objArray = uArrayList.toArray(Array.newInstance(ola0, uArrayList.size()));
       tx.a();
       if (objArray.length && objArray.length >= i) {
          if (!objArray.length) {
             i3 = 0;
          }else {
             Arrays.sort(objArray, tx.f);
             i4 = 1;
             i5 = 0;
             i3 = 1;
             while (i4 < objArray.length) {
                object oobject2 = objArray[i4];
                if (!tx.f.compare(objArray[i5], oobject2)) {
                   i7 = i5;
                   while (true) {
                      i9 = -1;
                      if (i7 < i3) {
                         if (tx.f.b(objArray[i7], oobject2)) {
                         label_00d5 :
                            if (i7 != i9) {
                               objArray[i7] = oobject2;
                            }else if(i3 != i4){
                               objArray[i3] = oobject2;
                            }
                            i3 = i3 + 1;
                         }else {
                            i7 = i7 + 1;
                         }
                      }else {
                         i7 = -1;
                         goto label_00d5 ;
                      }
                   }
                }else if(i3 != i4){
                   objArray[i3] = oobject2;
                }
                i5 = i3 + 1;
                i3 = i5;
                i5 = i3;
                i4 = i4 + 1;
             }
          }
          if (tx.h == null) {
             tx.a = objArray;
             tx.h = i3;
             tx.f.k(i1, i3);
          }else if(i4 = tx.f instanceof hn6 ^ i){
             tx.a();
             f2 = tx.f;
             if (!f2 instanceof hn6) {
                if (tx.g == null) {
                   tx.g = new hn6(f2);
                }
                tx.f = tx.g;
             }
          }
          tx.b = tx.a;
          tx.c = i1;
          f2 = tx.h;
          tx.d = f2;
          tx.a = Array.newInstance(ola0, ((f2 + i3) + 10));
          tx.e = i1;
          while (true) {
             jn6 c = tx.c;
             f2 = tx.d;
             if (c >= f2 && i1 >= i3) {
                break ;
             }else if(c == f2){
                i3 = i3 - i1;
                System.arraycopy(objArray, i1, tx.a, tx.e, i3);
                i2 = tx.e + i3;
                tx.e = i2;
                tx.h = tx.h + i3;
                tx.f.k((i2 - i3), i3);
                break ;
             }else if(i1 == i3){
                i5 = f2 - c;
                System.arraycopy(tx.b, c, tx.a, tx.e, i5);
                tx.e = tx.e + i5;
                break ;
             }else {
                object oobject = tx.b[c];
                object oobject1 = objArray[i1];
                if ((i6 = tx.f.compare(oobject, oobject1)) > 0) {
                   e = tx.e;
                   i7 = e + 1;
                   tx.e = i7;
                   tx.a[e] = oobject1;
                   i8 = tx.h + i;
                   tx.h = i8;
                   i1 = i1 + 1;
                   i7 = i7 - i;
                   tx.f.k(i7, i);
                }else if(!i6 && tx.f.b(oobject, oobject1)){
                   jn6 e1 = tx.e;
                   i9 = e1 + 1;
                   tx.e = i9;
                   tx.a[e1] = oobject1;
                   i1 = i1 + 1;
                   i6 = tx.c + i;
                   tx.c = i6;
                   if (!tx.f.a(oobject, oobject1)) {
                      e = tx.f;
                      i7 = tx.e - i;
                      e.l(i7, i, e.c(oobject, oobject1));
                   }
                }else {
                   e = tx.e;
                   i7 = e + 1;
                   tx.e = i7;
                   tx.a[e] = oobject;
                   i8 = tx.c + i;
                   tx.c = i8;
                }
             }
          }
          tx.b = null;
          if (i4) {
             tx.a();
             f1 = tx.f;
             if (f1 instanceof hn6) {
                f1.b.a();
             }
             g = tx.g;
             if (tx.f == g) {
                tx.f = g.a;
             }
          }
       }
       tx.a();
       f1 = tx.f;
       if (f1 instanceof hn6) {
          f1.b.a();
       }
       g = tx.g;
       if (tx.f == g) {
          tx.f = g.a;
       }
       return;
    }
}
