package p.zu6;
import p.ng2;
import p.gi3;
import java.lang.Object;
import java.lang.CharSequence;
import p.t65;
import java.lang.String;
import p.co5;
import p.av6;
import java.lang.Integer;
import java.util.List;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import p.ib3;
import p.gb3;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import p.xw0;
import p.vw0;

public final class zu6 extends gi3 implements ng2	// class@002f6c from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;

    public void zu6(int p0,Object p1,boolean p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super(2);
    }
    public final t65 a(int p0,CharSequence p1){
       int i2;
       t65 ot651;
       Iterator iterator;
       t65 ot652;
       Object obj1;
       t65 ot65 = null;
       int i = 1;
       zu6 tc = this.c;
       String str = "$this$$receiver";
       switch (this.a){
           case 0:
             co5.o(p1, str);
             if ((p0 = av6.o0(p0, p1, this.b, tc)) >= 0) {
                ot65 = new t65(Integer.valueOf(p0), Integer.valueOf(i));
             }
             break;
           default:
             co5.o(p1, str);
             zu6 tb = this.b;
             int i1 = 0;
             if (tb == null && tc.size() == i) {
                if (i2 = tc.size()) {
                   if (i2 == i) {
                      String str1 = tc.get(i1);
                      if ((p0 = av6.n0(p1, str1, p0, i1, 4)) >= 0) {
                         ot651 = new t65(Integer.valueOf(p0), str1);
                      label_00f7 :
                         if (ot651 != null) {
                            ot65 = new t65(ot651.a, Integer.valueOf(ot651.b.length()));
                         }
                      }
                   }else {
                      throw new IllegalArgumentException("List has more than one element.");
                   }
                }else {
                   throw new NoSuchElementException("List is empty.");
                }
             }else if(p0 < 0){
                p0 = 0;
             }
             ib3 i3 = new ib3(p0, p1.length());
             gb3 c = i3.c;
             gb3 b = i3.b;
             if (p1 instanceof String) {
                if (c > null && (p0 <= b || (c < null && b <= p0))) {
                label_0086 :
                   iterator = tc.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         ot652 = iterator.next();
                         Object obj = ot652;
                         if (!av6.u0(0, p0, obj.length(), obj, p1, tb)) {
                            continue ;
                         }
                      }else {
                         ot652 = ot65;
                      }
                      if (ot652 != null) {
                         ot651 = new t65(Integer.valueOf(p0), ot652);
                         goto label_00f7 ;
                      }else if(p0 != b){
                         p0 = p0 + c;
                         goto label_0086 ;
                      }
                   }
                   return ot65;
                }
             }else if(c > null && (p0 <= b || (c < null && b <= p0))){
                while (true) {
                   iterator = tc.iterator();
                   break ;
                }
                while (true) {
                   if (iterator.hasNext()) {
                      ot652 = iterator.next();
                      if (!(obj1 = ot652)) {
                         continue ;
                      }
                   }else {
                      ot652 = ot65;
                   }
                   if (ot652 != null) {
                      ot651 = new t65(Integer.valueOf(p0), ot652);
                      goto label_00f7 ;
                   }else if(p0 != b){
                      p0 = p0 + c;
                   }
                }
             }
             ot651 = ot65;
             goto label_00f7 ;
       }
       return ot65;
    }
    public final Object b(Object p0,Object p1){
       switch (this.a){
           case 0:
             return this.a(p1.intValue(), p0);
           case 1:
             return this.a(p1.intValue(), p0);
           default:
             return p0.T(p1);
       }
    }
}
