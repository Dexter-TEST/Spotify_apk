package p.dp5;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import p.vj1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.ja7;
import p.mg3;
import java.lang.Class;
import java.lang.String;
import p.he3;

public final class dp5	// class@001390 from classes.dex
{
    public final vj1[] a;
    public final int b;

    public void dp5(HashMap p0){
       super();
       int i = ((i = p0.size()) <= 64)? i + i: i + (i >> 2);
       int i1 = 8;
       while (i1 < i) {
          i1 = i1 + i1;
       }
       this.b = i1 - 1;
       vj1[] ovj1Array = new vj1[i1];
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ja7 key = uEntry.getKey();
          int i2 = key.a & this.b;
          ovj1Array[i2] = new vj1(ovj1Array[i2], key, uEntry.getValue());
       }
       this.a = ovj1Array;
       return;
    }
    public final mg3 a(Class p0){
       object oobject;
       vj1 c;
       if ((oobject = this.a[(p0.getName().hashCode() & this.b)]) == null) {
          return null;
       }
       int i = (oobject.d == p0 && oobject.a == null)? 1: 0;
       if (i) {
          return oobject.b;
       }else {
          while (true) {
             if ((c = oobject.c) == null) {
                return null;
             }
             i = (c.d == p0 && c.a == null)? 1: 0;
             if (i) {
                break ;
             }
          }
          return c.b;
       }
    }
    public final mg3 b(he3 p0){
       object oobject;
       vj1 c;
       if ((oobject = this.a[((p0.b - 1) & this.b)]) == null) {
          return null;
       }
       int i = (oobject.a == null && p0.equals(oobject.e))? 1: 0;
       if (i) {
          return oobject.b;
       }else {
          while (true) {
             if ((c = oobject.c) == null) {
                return null;
             }
             i = (c.a == null && p0.equals(c.e))? 1: 0;
             if (i) {
                break ;
             }
          }
          return c.b;
       }
    }
}
