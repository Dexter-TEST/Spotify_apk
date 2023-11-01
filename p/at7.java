package p.at7;
import p.j80;
import java.lang.String;
import p.ir2;
import p.m95;
import java.lang.Object;
import p.co5;
import java.lang.Character;
import p.e70;
import java.util.ArrayList;
import java.util.List;
import p.dj0;
import p.ye7;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.en6;

public abstract class at7	// class@00016c from classes2.dex
{
    public static final j80 a;
    public static final j80 b;
    public static final j80 c;
    public static final j80 d;
    public static final j80 e;

    static {
       at7.a = ir2.t("/");
       at7.b = ir2.t("\\");
       at7.c = ir2.t("/\\");
       at7.d = ir2.t(".");
       at7.e = ir2.t("..");
    }
    public static final int a(m95 p0){
       int i = -1;
       if (!p0.a.d()) {
       }else {
          p0 = p0.a;
          int i1 = 0;
          if (p0.i(i1) != (byte)47) {
             byte b = (byte)92;
             if (p0.i(i1) == b) {
                if (p0.d() > 2 && p0.i(1) == b) {
                   j80 b1 = at7.b;
                   co5.o(b1, "other");
                   if ((i1 = p0.f(b1.a, 2)) == i) {
                      i = p0.d();
                   }else {
                      i = i1;
                   }
                }
             }else if(p0.d() > 2 && (p0.i(1) == (byte)58 && p0.i(2) == b)){
                char c = (char)p0.i(i1);
                int i2 = (97 <= c && c < '{')? 1: 0;
                if (!i2) {
                   if (65 <= c && c < '[') {
                      i1 = 1;
                   }
                   if (i1) {
                   label_007a :
                      i = 3;
                   }
                }else {
                   goto label_007a ;
                }
             }
          }
          i = 1;
       }
       return i;
    }
    public static final m95 b(m95 p0,m95 p1,boolean p2){
       j80 oj80;
       co5.o(p0, "<this>");
       co5.o(p1, "child");
       int i = (at7.a(p1) != -1)? 1: 0;
       if (!i && p1.e() == null) {
          if ((oj80 = at7.c(p0)) == null && (oj80 = at7.c(p1)) == null) {
             oj80 = at7.f(m95.b);
          }
          e70 uoe70 = new e70();
          uoe70.u0(p0.a);
          if ((uoe70.b) > 0) {
             uoe70.u0(oj80);
          }
          uoe70.u0(p1.a);
          return at7.d(uoe70, p2);
       }else {
          return p1;
       }
    }
    public static final j80 c(m95 p0){
       j80 a = at7.a;
       if (j80.g(p0.a, a) != -1) {
       }else {
          a = at7.b;
          if (j80.g(p0.a, a) == -1) {
             a = null;
          }
       }
       return a;
    }
    public static final m95 d(e70 p0,boolean p1){
       int i2;
       ArrayList uArrayList;
       j80 d;
       long l;
       j80 oj801;
       e70 uoe70 = p0;
       e70 uoe701 = new e70();
       j80 oj80 = null;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (!uoe70.l(0, at7.a)) {
             j80 b = at7.b;
             if (uoe70.l(0, b)) {
             label_0155 :
                byte b1 = p0.readByte();
                if (oj80 == null) {
                   oj80 = at7.e(b1);
                }
                i1 = i1 + 1;
             }else if(i1 >= 2 && co5.c(oj80, b)){
                i2 = 1;
             }else {
                i2 = 0;
             }
             j80 c = at7.c;
             int i3 = -1;
             if (i2) {
                co5.i(oj80);
                uoe701.u0(oj80);
                uoe701.u0(oj80);
             }else if(i1 > 0){
                co5.i(oj80);
                uoe701.u0(oj80);
             }else {
                l = uoe70.p(c);
                if (oj80 == null) {
                   oj80 = (!(l - i3))? at7.f(m95.b): at7.e(uoe70.h0(l));
                }
                long l1 = 2;
                if (co5.c(oj80, b) && ((uoe70.b - l1) >= 0 && uoe70.h0(1) == (byte)58)) {
                   char c1 = (char)uoe70.h0(0);
                   uArrayList = (97 <= c1 && c1 < '{')? 1: 0;
                   if (!uArrayList) {
                      c1 = (65 <= c1 && c1 < '[')? 1: 0;
                      if (!c1) {
                         i1 = 0;
                      label_009e :
                         if (i1) {
                            if (!(l - l1)) {
                               uoe701.I(uoe70, 3);
                            }else {
                               uoe701.I(uoe70, l1);
                            }
                         }
                      }
                   }
                   c1 = 1;
                   goto label_009e ;
                }
             }
             i3 = ((uoe701.b) > 0)? 1: 0;
             uArrayList = new ArrayList();
             while (true) {
                d = at7.d;
                if (!p0.F()) {
                   l = uoe70.p(c);
                   if (!(l - -1)) {
                      oj801 = p0.m0();
                   }else {
                      oj801 = uoe70.q(l);
                      p0.readByte();
                   }
                   j80 e = at7.e;
                   if (co5.c(oj801, e)) {
                      if (i3 && uArrayList.isEmpty()) {
                         continue ;
                      }else if(p1 && (i3 && (uArrayList.isEmpty() && !co5.c(dj0.r0(uArrayList), e)))){
                         if (i2 && (uArrayList.size() == 1 || uArrayList.isEmpty())) {
                            continue ;
                         }else {
                            uArrayList.remove(ye7.B(uArrayList));
                            continue ;
                         }
                      }else {
                         uArrayList.add(oj801);
                      }
                   }else if(!co5.c(oj801, d) && !co5.c(oj801, j80.t)){
                      uArrayList.add(oj801);
                      continue ;
                   }else {
                      continue ;
                   }
                }else {
                   break ;
                }
             }
             int i4 = uArrayList.size();
             for (; i < i4; i = i + 1) {
                if (i > 0) {
                   uoe701.u0(oj80);
                }
                uoe701.u0(uArrayList.get(i));
             }
             if (!(uoe701.b)) {
                uoe701.u0(d);
             }
          }else {
             goto label_0155 ;
          }
       }
       return new m95(uoe701.m0());
    }
    public static final j80 e(byte p0){
       j80 a;
       if (p0 == 47) {
          a = at7.a;
       }else if(p0 == 92){
          a = at7.b;
       }else {
          throw new IllegalArgumentException(tp2.k("not a directory separator: ", p0));
       }
       return a;
    }
    public static final j80 f(String p0){
       j80 a;
       if (co5.c(p0, "/")) {
          a = at7.a;
       }else if(co5.c(p0, "\\")){
          a = at7.b;
       }else {
          throw new IllegalArgumentException(en6.n("not a directory separator: ", p0));
       }
       return a;
    }
}
