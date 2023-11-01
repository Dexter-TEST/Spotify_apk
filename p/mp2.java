package p.mp2;
import java.lang.Iterable;
import p.ch3;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.io2;
import p.av6;
import java.util.Date;
import p.t51;
import p.sm2;
import java.util.AbstractCollection;
import p.cj0;
import java.util.Arrays;
import java.util.Iterator;
import p.t65;
import p.ko6;
import p.xe7;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import p.ll1;
import java.lang.StringBuilder;
import p.we7;

public final class mp2 implements Iterable, ch3	// class@001edc from classes.dex
{
    public final String[] a;

    public void mp2(String[] p0){
       super();
       this.a = p0;
    }
    public final String a(String p0){
       int i1;
       object oobject;
       co5.o(p0, "name");
       mp2 ta = this.a;
       int i = ta.length - 2;
       if ((i1 = io2.m(i, 0, -2)) <= i) {
          while (true) {
             int i2 = i - 2;
             if (av6.i0(p0, ta[i], true)) {
                oobject = ta[(i + true)];
                break ;
             }else if(i == i1){
                i = i2;
             }
          }
          return oobject;
       }
       p0 = null;
    }
    public final Date b(String p0){
       Date uDate = ((p0 = this.a(p0)) == null)? null: t51.a(p0);
       return uDate;
    }
    public final String c(int p0){
       return this.a[(p0 * 2)];
    }
    public final sm2 d(){
       sm2 osm2 = new sm2();
       cj0.d0(osm2.a, this.a);
       return osm2;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof mp2 && Arrays.equals(this.a, p0.a))? true: false;
       return b;
    }
    public final String g(int p0){
       return this.a[((p0 * 2) + 1)];
    }
    public final int hashCode(){
       return Arrays.hashCode(this.a);
    }
    public final Iterator iterator(){
       int i = this.a.length / 2;
       t65[] ot65Array = new t65[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ot65Array[i1] = new t65(this.c(i1), this.g(i1));
       }
       return xe7.D(ot65Array);
    }
    public final List k(String p0){
       List list1;
       co5.o(p0, "name");
       int i = this.a.length / 2;
       List list = null;
       int i1 = 0;
       while (i1 < i) {
          int i2 = i1 + 1;
          if (av6.i0(p0, this.c(i1), true)) {
             if (list == null) {
                list = new ArrayList(2);
             }
             list.add(this.g(i1));
          }
          i1 = i2;
       }
       if (list != null) {
          list1 = Collections.unmodifiableList(list);
          co5.l(list1, "{\n      Collections.unmodifiableList\(result\)\n    }");
       }else {
          list1 = ll1.a;
       }
       return list1;
    }
    public final String toString(){
       String str = "";
       int i = this.a.length / 2;
       for (int i1 = 0; i1 < i; i1 = i2) {
          int i2 = i1 + 1;
          String str1 = this.c(i1);
          String str2 = this.g(i1);
          str = str.append(str1).append(": ");
          if (we7.q(str1)) {
             str2 = "¦¦";
          }
          str = str.append(str2).append("\n");
       }
       str = str;
       co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str;
    }
}
