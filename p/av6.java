package p.av6;
import p.yu6;
import java.lang.CharSequence;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.i91;
import p.zu6;
import p.e93;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.ib3;
import p.gb3;
import java.lang.Integer;
import p.vv7;
import p.uk;
import java.util.NoSuchElementException;
import java.util.Collection;
import p.hb3;
import p.cc1;
import p.c87;
import p.la6;
import p.zf2;
import p.oa6;
import p.ye7;
import java.lang.StringBuilder;
import java.lang.OutOfMemoryError;
import p.tp2;
import java.lang.IllegalArgumentException;

public abstract class av6 extends yu6	// class@000fff from classes.dex
{

    public static List A0(CharSequence p0,char[] p1){
       List list;
       co5.o(p0, "<this>");
       if (p1.length == 1) {
          list = av6.z0(0, p0, String.valueOf(p1[0]), 0);
       }else {
          av6.y0(0);
          e93 uoe93 = new e93(new i91(p0, 0, 0, new zu6(0, p1, 0)));
          ArrayList uArrayList = new ArrayList(aj0.b0(uoe93));
          Iterator iterator = uoe93.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(av6.E0(p0, iterator.next()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static List B0(CharSequence p0,String[] p1,int p2,int p3){
       List list;
       if ((p3 & 0x04)) {
          p2 = 0;
       }
       co5.o(p0, "<this>");
       int i = 1;
       if (p1.length == i) {
          object oobject = p1[0];
          if (oobject.length()) {
             i = 0;
          }
          if (!i) {
             list = av6.z0(p2, p0, oobject, 0);
          label_004b :
             return list;
          }
       }
       e93 uoe93 = new e93(av6.t0(p0, p1, 0, p2));
       ArrayList uArrayList = new ArrayList(aj0.b0(uoe93));
       Iterator iterator = uoe93.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(av6.E0(p0, iterator.next()));
       }
       list = uArrayList;
       goto label_004b ;
    }
    public static final boolean C0(int p0,String p1,String p2,boolean p3){
       co5.o(p1, "<this>");
       if (!p3) {
          return p1.startsWith(p2, p0);
       }
       return av6.u0(p0, 0, p2.length(), p1, p2, p3);
    }
    public static final boolean D0(String p0,String p1,boolean p2){
       co5.o(p0, "<this>");
       co5.o(p1, "prefix");
       if (!p2) {
          return p0.startsWith(p1);
       }
       return av6.u0(0, 0, p1.length(), p0, p1, p2);
    }
    public static final String E0(CharSequence p0,ib3 p1){
       co5.o(p0, "<this>");
       co5.o(p1, "range");
       return p0.subSequence(Integer.valueOf(p1.a).intValue(), (Integer.valueOf(p1.b).intValue() + 1)).toString();
    }
    public static String F0(String p0,char p1){
       int i;
       if ((i = av6.m0(p0, p1, 0, 0, 6)) == -1) {
       }else {
          i++;
          p0 = p0.substring(i, p0.length());
          co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static String G0(String p0,String p1){
       int i;
       co5.o(p1, "delimiter");
       if ((i = av6.n0(p0, p1, 0, 0, 6)) == -1) {
       }else {
          p0 = p0.substring((p1.length() + i), p0.length());
          co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static final String H0(char p0,String p1,String p2){
       int i;
       co5.o(p1, "<this>");
       co5.o(p2, "missingDelimiterValue");
       if ((i = av6.q0(p1, p0, 0, 6)) == -1) {
       }else {
          i++;
          p2 = p1.substring(i, p1.length());
          co5.l(p2, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static String I0(String p0,char p1){
       int i;
       if ((i = av6.m0(p0, p1, 0, 0, 6)) == -1) {
       }else {
          p0 = p0.substring(0, i);
          co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static String J0(String p0,char p1){
       int i;
       co5.o(p0, "<this>");
       co5.o(p0, "missingDelimiterValue");
       if ((i = av6.q0(p0, p1, 0, 6)) == -1) {
       }else {
          p0 = p0.substring(0, i);
          co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static final CharSequence K0(CharSequence p0){
       co5.o(p0, "<this>");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = vv7.z(p0.charAt(i3));
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1));
    }
    public static boolean e0(CharSequence p0,char p1){
       co5.o(p0, "<this>");
       int i = 0;
       if (av6.m0(p0, p1, i, i, 2) >= 0) {
          i = true;
       }
       return i;
    }
    public static boolean f0(CharSequence p0,CharSequence p1){
       co5.o(p0, "<this>");
       co5.o(p1, "other");
       int i = 0;
       if (p1 instanceof String) {
          if (av6.n0(p0, p1, i, false, 2) >= 0) {
          label_0028 :
             i = true;
          }
       }else if(av6.l0(p0, p1, 0, p0.length(), false, false) >= 0){
          goto label_0028 ;
       }
       return i;
    }
    public static final boolean g0(String p0,String p1,boolean p2){
       co5.o(p0, "<this>");
       co5.o(p1, "suffix");
       if (!p2) {
          return p0.endsWith(p1);
       }
       return av6.u0((p0.length() - p1.length()), 0, p1.length(), p0, p1, true);
    }
    public static boolean h0(CharSequence p0,char p1){
       boolean b = false;
       if (p0.length() > 0 && vv7.q(p0.charAt(av6.j0(p0)), p1, b)) {
          b = true;
       }
       return b;
    }
    public static final boolean i0(String p0,String p1,boolean p2){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
          return b;
       }else if(!p2){
          b = p0.equals(p1);
       }else {
          b = p0.equalsIgnoreCase(p1);
       }
       return b;
    }
    public static final int j0(CharSequence p0){
       co5.o(p0, "<this>");
       return (p0.length() - 1);
    }
    public static final int k0(int p0,CharSequence p1,String p2,boolean p3){
       co5.o(p1, "<this>");
       co5.o(p2, "string");
       p0 = (!p3 && p1 instanceof String)? p1.indexOf(p2, p0): av6.l0(p1, p2, p0, p1.length(), p3, false);
       return p0;
    }
    public static final int l0(CharSequence p0,CharSequence p1,int p2,int p3,boolean p4,boolean p5){
       ib3 oib3;
       gb3 b;
       if (!p5) {
          if (p2 < 0) {
             p2 = 0;
          }
          int i = p0.length();
          if (p3 > i) {
             p3 = i;
          }
          oib3 = new ib3(p2, p3);
       }else {
          int i1 = av6.j0(p0);
          if (p2 > i1) {
             p2 = i1;
          }
          if (p3 < 0) {
             p3 = 0;
          }
          b = new gb3(p2, p3, -1);
       }
       gb3 a = oib3.a;
       gb3 c = oib3.c;
       b = oib3.b;
       if (p0 instanceof String && p1 instanceof String) {
          if (c > null && (a <= b || (c < null && b <= a))) {
             while (true) {
                if (av6.u0(0, a, p1.length(), p1, p0, p4)) {
                   return a;
                }
                if (a != b) {
                   a = a + c;
                }
             }
          }
       }else if(c > null && (a <= b || (c < null && b <= a))){
          while (true) {
             if (av6.v0(p1, 0, p0, a, p1.length(), p4)) {
                return a;
             }
             if (a != b) {
                a = a + c;
             }
          }
       }
       return -1;
    }
    public static int m0(CharSequence p0,char p1,int p2,boolean p3,int p4){
       int i;
       if ((p4 & 0x02)) {
          p2 = 0;
       }
       if ((p4 & 0x04)) {
          p3 = false;
       }
       co5.o(p0, "<this>");
       if (!p3 && p0 instanceof String) {
          i = p0.indexOf(p1, p2);
       }else {
          char[] uocharArray = new char[]{p1};
          i = av6.o0(p2, p0, p3, uocharArray);
       }
       return i;
    }
    public static int n0(CharSequence p0,String p1,int p2,boolean p3,int p4){
       if ((p4 & 0x02)) {
          p2 = 0;
       }
       if ((p4 & 0x04)) {
          p3 = false;
       }
       return av6.k0(p2, p0, p1, p3);
    }
    public static final int o0(int p0,CharSequence p1,boolean p2,char[] p3){
       gb3 c;
       int i;
       int i1;
       co5.o(p1, "<this>");
       co5.o(p3, "chars");
       if (!p2 && (p3.length == 1 && p1 instanceof String)) {
          return p1.indexOf(uk.q0(p3), p0);
       }
       if (p0 < 0) {
          p0 = 0;
       }
       ib3 oib3 = new ib3(p0, av6.j0(p1));
       gb3 b = oib3.b;
       if ((c = oib3.c) > null) {
          if (p0 <= b) {
          label_0037 :
             i = 1;
          label_003a :
             if (!i) {
                gb3 ogb3 = b;
             }
             while (true) {
                if (!i) {
                   return -1;
                }
                if (p0 == b) {
                   if (i) {
                      i1 = p0;
                      i = 0;
                   }else {
                      throw new NoSuchElementException();
                   }
                }else {
                   i1 = c + p0;
                }
                char c1 = p1.charAt(p0);
                int len = p3.length;
                int i2 = 0;
                while (true) {
                   if (i2 < len) {
                      if (vv7.q(p3[i2], c1, p2)) {
                         c1 = 1;
                      label_0065 :
                         if (c1) {
                            break ;
                         }else {
                            p0 = i1;
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }else {
                      c1 = 0;
                      goto label_0065 ;
                   }
                }
                return p0;
             }
          }
       }else if(p0 >= b){
          goto label_0037 ;
       }
       i = 0;
       goto label_003a ;
    }
    public static final boolean p0(CharSequence p0){
       int i;
       co5.o(p0, "<this>");
       boolean b = true;
       if (p0.length()) {
          ib3 oib3 = new ib3(0, (p0.length() - 1));
          if (!oib3 instanceof Collection || !oib3.isEmpty()) {
             Iterator iterator = oib3.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (!vv7.z(p0.charAt(iterator.nextInt()))) {
                      i = 0;
                      break ;
                   }
                }
             }
             if (!i) {
                b = false;
             }
          }
          i = 1;
       }
       return b;
    }
    public static int q0(CharSequence p0,char p1,int p2,int p3){
       int i;
       if (p3 = p3 & 0x02) {
          p2 = av6.j0(p0);
       }
       co5.o(p0, "<this>");
       if (!p0 instanceof String) {
          char[] uocharArray = new char[]{p1};
          if (p0 instanceof String) {
             i = p0.lastIndexOf(uk.q0(uocharArray), p2);
          }else {
             int i1 = av6.j0(p0);
             if (p2 > i1) {
                p2 = i1;
             }
             while (true) {
                if (-1 < p2) {
                   if (vv7.q(uocharArray[0], p0.charAt(p2), 0)) {
                      i = p2;
                      break ;
                   }else {
                      p2--;
                   }
                }else {
                   i = -1;
                   break ;
                }
             }
          }
       }else {
          i = p0.lastIndexOf(p1, p2);
       }
       return i;
    }
    public static int r0(String p0,String p1,int p2){
       p2 = ((p2 & 0x02))? av6.j0(p0): 0;
       co5.o(p0, "<this>");
       co5.o(p1, "string");
       return p0.lastIndexOf(p1, p2);
    }
    public static final List s0(CharSequence p0){
       co5.o(p0, "<this>");
       String[] stringArray = new String[]{"\r\n","\n","\r"};
       return ye7.N(oa6.H(new c87(av6.t0(p0, stringArray, false, false), new cc1(9, p0))));
    }
    public static i91 t0(CharSequence p0,String[] p1,boolean p2,int p3){
       av6.y0(p3);
       return new i91(p0, 0, p3, new zu6(1, uk.h0(p1), p2));
    }
    public static final boolean u0(int p0,int p1,int p2,String p3,String p4,boolean p5){
       co5.o(p3, "<this>");
       co5.o(p4, "other");
       boolean b = (!p5)? p3.regionMatches(p0, p4, p1, p2): p3.regionMatches(p5, p0, p4, p1, p2);
       return b;
    }
    public static final boolean v0(CharSequence p0,int p1,CharSequence p2,int p3,int p4,boolean p5){
       co5.o(p0, "<this>");
       co5.o(p2, "other");
       if (p3 < 0 || (p1 < 0 || (p1 > (p0.length() - p4) || p3 > (p2.length() - p4)))) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p4) {
             return true;
          }
          int i1 = p1 + i;
          int i2 = p3 + i;
          if (!vv7.q(p0.charAt(i1), p2.charAt(i2), p5)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static final String w0(String p0,String p1){
       if (!av6.D0(p1, p0, false)) {
          return p1;
       }
       p0 = p1.substring(p0.length());
       co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
       return p0;
    }
    public static String x0(String p0,String p1,String p2){
       int i;
       int i3;
       co5.o(p0, "<this>");
       co5.o(p1, "oldValue");
       co5.o(p2, "newValue");
       if ((i = av6.k0(0, p0, p1, 0)) < 0) {
       }else {
          int i1 = p1.length();
          int i2 = 1;
          if (i1 >= i2) {
             i2 = i1;
          }
          if ((i3 = p2.length() + (p0.length() - i1)) >= 0) {
             StringBuilder str = new StringBuilder(i3);
             i3 = 0;
             while (true) {
                str = str.append(p0, i3, i).append(p2);
                i3 = i + i1;
                if (i < p0.length()) {
                   i = i + i2;
                   if ((i = av6.k0(i, p0, p1, 0)) <= 0) {
                      break ;
                   }
                }else {
                   break ;
                }
             }
             p0 = str+p0;
             co5.l(p0, "stringBuilder.append\(this, i, length\).toString\(\)");
          }else {
             throw new OutOfMemoryError();
          }
       }
       return p0;
    }
    public static final void y0(int p0){
       int i = (p0 >= 0)? 1: 0;
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException(tp2.k("Limit must be non-negative, but was ", p0).toString());
       }
    }
    public static final List z0(int p0,CharSequence p1,String p2,boolean p3){
       int i1;
       av6.y0(p0);
       int i = 0;
       if ((i1 = av6.k0(i, p1, p2, p3)) == -1 || p0 == 1) {
          return ye7.J(p1.toString());
       }
       int i2 = (p0 > 0)? 1: 0;
       int i3 = 10;
       if (i2 && p0 <= i3) {
          i3 = p0;
       }
       ArrayList uArrayList = new ArrayList(i3);
       do {
          uArrayList.add(p1.subSequence(i, i1).toString());
          i = p2.length() + i1;
          if (i2) {
             i3 = p0 - 1;
             if (uArrayList.size() == i3) {
                break ;
             }
          }
       } while ((i1 = av6.k0(i, p1, p2, p3)) == -1);
       uArrayList.add(p1.subSequence(i, p1.length()).toString());
       return uArrayList;
    }
}
