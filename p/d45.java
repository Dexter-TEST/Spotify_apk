package p.d45;
import java.lang.Object;
import java.lang.Integer;

public final class d45	// class@0012d8 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public Object[] d;

    public void d45(int p0){
       super();
       p0 = 1 << (Integer.numberOfLeadingZeros((p0 - 1)) - 32);
       this.a = p0 - 1;
       this.c = (int)(0x3f400000 * (float)p0);
       Object[] objArray = new Object[p0];
       this.d = objArray;
    }
    public final void a(Object p0){
       object oobject;
       d45 td = this.d;
       d45 ta = this.a;
       int i = p0.hashCode() * -1640531527;
       i = (i ^ (i >> 16)) & ta;
       if ((oobject = td[i]) != null) {
          if (oobject.equals(p0)) {
             return;
          }else {
             while (true) {
                i = i + 1;
                i = i & ta;
                if ((oobject = td[i]) != null) {
                   if (oobject.equals(p0)) {
                      return;
                   }
                   continue ;
                }
             }
          }
       }
       td[i] = p0;
       int i1 = this.b + 1;
       this.b = i1;
       if (i1 >= this.c) {
          td = this.d;
          int len = td.length;
          i = len << 1;
          int i2 = i - 1;
          Object[] objArray = new Object[i];
          while (true) {
             int i3 = i1 - 1;
             if (i1) {
                do {
                   len = len - 1;
                } while ((i1 = td[len]) == null);
                i1 = i1.hashCode() * -1640531527;
                int i4 = i1 >> 16;
                i1 = i1 ^ i4;
                i1 = i1 & i2;
                if (objArray[i1] != null) {
                   do {
                      i1++;
                      i1 = i1 & i2;
                   } while (objArray[i1] == null);
                }
                objArray[i1] = td[len];
                i1 = i3;
             }else {
                break ;
             }
          }
          this.a = i2;
          this.c = (int)((float)i * 0x3f400000);
          this.d = objArray;
       }
       return;
    }
    public final void b(int p0,int p1,Object[] p2){
       object oobject;
       this.b = this.b - 1;
       while (true) {
          int i = p0 + 1;
          break ;
       }
       while (true) {
          i = i & p1;
          if ((oobject = p2[i]) == null) {
             break ;
          }else {
             int i1 = oobject.hashCode() * -1640531527;
             int i2 = i1 >> 16;
             i1 = i1 ^ i2;
             i1 = i1 & p1;
             if (p0 <= i) {
                if (p0 >= i1 || i1 > i) {
                label_0029 :
                   p2[p0] = oobject;
                   p0 = i;
                }
             }else if(p0 >= i1 && i1 > i){
                goto label_0029 ;
             }
             i = i + 1;
          }
       }
       p2[p0] = null;
       return;
    }
}
