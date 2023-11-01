package p.pi2;
import p.oi2;
import java.lang.Object;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public final class pi2	// class@002268 from classes.dex
{
    public final oi2 a;
    public final int[] b;

    public void pi2(oi2 p0,int[] p1){
       super();
       if (!p1.length) {
          throw new IllegalArgumentException();
       }
       this.a = p0;
       int len = p1.length;
       int i = 1;
       if (len > i && !p1[0]) {
          int i1 = 1;
          while (i1 < len && !p1[i1]) {
             i1 = i1 + 1;
          }
          if (i1 == len) {
             int[] ointArray = new int[i];
             ointArray[0] = 0;
             this.b = ointArray;
             return;
          }else {
             len = len - i1;
             int[] ointArray1 = new int[len];
             this.b = ointArray1;
             System.arraycopy(p1, i1, ointArray1, 0, len);
             return;
          }
       }else {
          this.b = p1;
          return;
       }
    }
    public final pi2 a(pi2 p0){
       pi2 ta = this.a;
       if (!ta.equals(p0.a)) {
          throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
       }
       if (this.b()) {
          return p0;
       }
       if (p0.b()) {
          return this;
       }
       pi2 tb = this.b;
       p0 = p0.b;
       if (tb.length <= p0.length) {
          tb = p0;
          p0 = tb;
       }
       int[] ointArray = new int[tb.length];
       int i = tb.length - p0.length;
       System.arraycopy(tb, 0, ointArray, 0, i);
       for (int i1 = i; i1 < tb.length; i1 = i1 + 1) {
          int i2 = i1 - i;
          i2 = p0[i2] ^ tb[i1];
          ointArray[i1] = i2;
       }
       return new pi2(ta, ointArray);
    }
    public final boolean b(){
       if (!this.b[0]) {
          return true;
       }
       return 0;
    }
    public final pi2 c(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException();
       }
       pi2 ta = this.a;
       if (!p1) {
          return ta.c;
       }
       pi2 tb = this.b;
       int len = tb.length;
       int[] ointArray = new int[(p0 + len)];
       for (int i = 0; i < len; i = i + 1) {
          ointArray[i] = ta.a(tb[i], p1);
       }
       return new pi2(ta, ointArray);
    }
    public final String toString(){
       pi2 ta;
       pi2 tb = this.b;
       StringBuilder str = new StringBuilder(((tb.length - 1) * 8));
       int len = tb.length;
       while (true) {
          if ((len = len - 1) < 0) {
             return str;
          }
          int i = tb.length - 1;
          i = i - len;
          if (i = tb[i]) {
             if (i < 0) {
                str = str.append(" - ");
                i = - i;
             }else if(str.length() > 0){
                str = str.append(" + ");
             }
             int i1 = 1;
             if (!len || i != i1) {
                ta = this.a;
                if (i) {
                   if (!(i = ta.b[i])) {
                      str = str.append('1');
                   }else if(i == i1){
                      str = str.append('a');
                   }else {
                      str = str.append("a^").append(i);
                   }
                }else {
                   break ;
                }
             }
             if (len) {
                if (len == i1) {
                   str = str.append('x');
                }else {
                   str = str.append("x^").append(len);
                }
             }
          }
       }
       ta.getClass();
       throw new IllegalArgumentException();
    }
}
