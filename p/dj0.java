package p.dj0;
import p.cj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Number;
import java.lang.Iterable;
import java.util.List;
import java.lang.String;
import p.co5;
import java.util.Collection;
import p.ye7;
import p.ll1;
import java.util.AbstractCollection;
import java.util.Set;
import java.util.LinkedHashSet;
import p.pl1;
import p.xe7;
import p.di7;
import java.util.RandomAccess;
import java.util.ListIterator;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import p.zf2;
import java.lang.Appendable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import p.uk;

public abstract class dj0 extends cj0	// class@001357 from classes.dex
{

    public static final int[] A0(ArrayList p0){
       int[] ointArray = new int[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          ointArray[i] = iterator.next().intValue();
          i = i1;
       }
       return ointArray;
    }
    public static final List B0(Iterable p0){
       int i;
       ArrayList uArrayList;
       co5.o(p0, "<this>");
       if (!p0 instanceof Collection) {
          return ye7.N(dj0.D0(p0));
       }
       Collection uCollection = p0;
       if (i = uCollection.size()) {
          if (i != 1) {
             uArrayList = dj0.C0(uCollection);
          }else if(p0 instanceof List){
             p0 = p0.get(0);
          }else {
             p0 = p0.iterator().next();
          }
          uArrayList = ye7.J(p0);
       }else {
          uArrayList = ll1.a;
       }
       return uArrayList;
    }
    public static final ArrayList C0(Collection p0){
       co5.o(p0, "<this>");
       return new ArrayList(p0);
    }
    public static final List D0(Iterable p0){
       co5.o(p0, "<this>");
       if (p0 instanceof Collection) {
          return dj0.C0(p0);
       }
       ArrayList uArrayList = new ArrayList();
       dj0.z0(p0, uArrayList);
       return uArrayList;
    }
    public static final Set E0(Collection p0){
       co5.o(p0, "<this>");
       return new LinkedHashSet(p0);
    }
    public static final Set F0(Collection p0){
       int i;
       co5.o(p0, "<this>");
       pl1 a = pl1.a;
       if (i = p0.size()) {
          if (i != 1) {
             a = new LinkedHashSet(xe7.F(p0.size()));
             dj0.z0(p0, a);
          }else if(p0 instanceof List){
             p0 = p0.get(0);
          }else {
             p0 = p0.iterator().next();
          }
          a = co5.H(p0);
       }
       return a;
    }
    public static final di7 e0(Iterable p0){
       co5.o(p0, "<this>");
       return new di7(2, p0);
    }
    public static final boolean f0(Collection p0,Object p1){
       co5.o(p0, "<this>");
       return p0.contains(p1);
    }
    public static final List g0(List p0){
       co5.o(p0, "<this>");
       return dj0.B0(dj0.E0(p0));
    }
    public static final List h0(List p0,int p1){
       co5.o(p0, "<this>");
       int i = 1;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          if (!p1) {
             return dj0.B0(p0);
          }else if((i1 = p0.size() - p1) <= 0){
             return ll1.a;
          }else if(i1 == i){
             return ye7.J(dj0.r0(p0));
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             if (p0 instanceof RandomAccess) {
                i1 = p0.size();
                for (; p1 < i1; p1++) {
                   uArrayList.add(p0.get(p1));
                }
             }else {
                ListIterator listIterator = p0.listIterator(p1);
                while (listIterator.hasNext()) {
                   uArrayList.add(listIterator.next());
                }
             }
             return uArrayList;
          }
       }else {
          throw new IllegalArgumentException(tp2.l("Requested element count ", p1, " is less than zero.").toString());
       }
    }
    public static final ArrayList i0(Iterable p0){
       Object obj;
       co5.o(p0, "<this>");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if ((obj = iterator.next()) != null) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final Object j0(Iterable p0){
       co5.o(p0, "<this>");
       if (p0 instanceof List) {
          return dj0.k0(p0);
       }
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          return iterator.next();
       }
       throw new NoSuchElementException("Collection is empty.");
    }
    public static final Object k0(List p0){
       co5.o(p0, "<this>");
       if (!p0.isEmpty()) {
          return p0.get(0);
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final Object l0(List p0){
       co5.o(p0, "<this>");
       p0 = (p0.isEmpty())? null: p0.get(0);
       return p0;
    }
    public static final Object m0(int p0,List p1){
       Object obj = (p0 >= 0 && p0 <= ye7.B(p1))? p1.get(p0): null;
       return obj;
    }
    public static final int n0(Collection p0,Object p1){
       co5.o(p0, "<this>");
       if (p0 instanceof List) {
          return p0.indexOf(p1);
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return -1;
          }
          Object obj = iterator.next();
          if (i >= 0) {
             if (co5.c(p1, obj)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             ye7.W();
             throw 0;
          }
       }
       return i;
    }
    public static final Appendable o0(Iterable p0,StringBuilder p1,CharSequence p2,CharSequence p3,CharSequence p4,int p5,CharSequence p6,zf2 p7){
       co5.o(p0, "<this>");
       co5.o(p2, "separator");
       co5.o(p3, "prefix");
       co5.o(p4, "postfix");
       co5.o(p6, "truncated");
       Appendable uAppendable = p1+p3;
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if ((i++) > 1) {
             uAppendable = uAppendable.append(p2);
          }
          if (p5 >= 0 && i > p5) {
             break ;
          }
          ye7.a(uAppendable, obj, p7);
       }
       if (p5 >= 0 && i > p5) {
          uAppendable = uAppendable+p6;
       }
       return uAppendable+p4;
    }
    public static Appendable p0(ArrayList p0,StringBuilder p1){
       dj0.o0(p0, p1, "\n", "", "", -1, "...", null);
       return p1;
    }
    public static String q0(Iterable p0,String p1,String p2,String p3,zf2 p4,int p5){
       if ((p5 & 0x01)) {
          p1 = ", ";
       }
       String str = p1;
       String str1 = "";
       String str2 = ((p5 & 0x02))? str1: p2;
       String str3 = ((p5 & 0x04))? str1: p3;
       int i = ((p5 & 0x08))? -1: 0;
       String str4 = ((p5 & 0x10))? "...": null;
       zf2 ozf2 = ((p5 & 0x20))? null: p4;
       co5.o(p0, "<this>");
       co5.o(str, "separator");
       co5.o(str2, "prefix");
       co5.o(str3, "postfix");
       co5.o(str4, "truncated");
       p1 = "";
       dj0.o0(p0, p1, str, str2, str3, i, str4, ozf2);
       str1 = p1;
       co5.l(str1, "joinTo\(StringBuilder\(\), …ed, transform\).toString\(\)");
       return str1;
    }
    public static final Object r0(List p0){
       co5.o(p0, "<this>");
       if (!p0.isEmpty()) {
          return p0.get(ye7.B(p0));
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final Object s0(List p0){
       co5.o(p0, "<this>");
       p0 = (p0.isEmpty())? null: p0.get((p0.size() - 1));
       return p0;
    }
    public static final Comparable t0(ArrayList p0){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Comparable uComparable = iterator.next();
       while (iterator.hasNext()) {
          Comparable uComparable1 = iterator.next();
          if (uComparable.compareTo(uComparable1) < 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final ArrayList u0(Iterable p0,Collection p1){
       ArrayList uArrayList;
       co5.o(p1, "<this>");
       co5.o(p0, "elements");
       if (p0 instanceof Collection) {
          uArrayList = new ArrayList((p0.size() + p1.size()));
          uArrayList.addAll(p1);
          uArrayList.addAll(p0);
          return uArrayList;
       }else {
          uArrayList = new ArrayList(p1);
          cj0.c0(p0, uArrayList);
          return uArrayList;
       }
    }
    public static final ArrayList v0(Object p0,Collection p1){
       co5.o(p1, "<this>");
       ArrayList uArrayList = new ArrayList((p1.size() + 1));
       uArrayList.addAll(p1);
       uArrayList.add(p0);
       return uArrayList;
    }
    public static final List w0(List p0){
       co5.o(p0, "<this>");
       if (p0.size() <= 1) {
          return dj0.B0(p0);
       }
       p0 = dj0.D0(p0);
       Collections.reverse(p0);
       return p0;
    }
    public static final List x0(List p0,Comparator p1){
       if (p0.size() <= 1) {
          return dj0.B0(p0);
       }
       Object[] objArray = new Object[0];
       Object[] objArray1 = p0.toArray(objArray);
       co5.o(objArray1, "<this>");
       if (objArray1.length > 1) {
          Arrays.sort(objArray1, p1);
       }
       return uk.h0(objArray1);
    }
    public static final List y0(Iterable p0,int p1){
       co5.o(p0, "<this>");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          if (!p1) {
             return ll1.a;
          }else if(p0 instanceof Collection){
             if (p1 >= p0.size()) {
                return dj0.B0(p0);
             }else if(p1 == 1){
                return ye7.J(dj0.j0(p0));
             }
          }
          ArrayList uArrayList = new ArrayList(p1);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
             if ((i = i + 1) == p1) {
                break ;
             }
          }
          return ye7.N(uArrayList);
       }else {
          throw new IllegalArgumentException(tp2.l("Requested element count ", p1, " is less than zero.").toString());
       }
    }
    public static final void z0(Iterable p0,AbstractCollection p1){
       co5.o(p0, "<this>");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.add(iterator.next());
       }
       return;
    }
}
