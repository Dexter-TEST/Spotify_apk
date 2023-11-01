package p.mb2;
import java.util.Comparator;
import java.lang.Object;
import p.pz5;
import p.sl;
import p.tl;
import p.so1;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.Long;
import p.ya3;
import p.u;
import p.lt;
import java.lang.Integer;

public final class mb2 implements Comparator	// class@001e5f from classes.dex
{
    public final int a;

    public void mb2(int p0){
       this.a = p0;
       super();
    }
    public final int compare(Object p0,Object p1){
       int b1;
       int i2;
       int i3;
       lt b2;
       int i = -1;
       int i1 = 0;
       String str = "o2";
       switch (this.a){
           case 0:
             if (p0.length != p1.length) {
                i1 = p0.length - p1.length;
             }else {
                i = 0;
                while (i < p0.length) {
                   byte b = p0[i];
                   b1 = p1[i];
                   if (b != b1) {
                      i1 = b - b1;
                      break ;
                   }
                   i = i + 1;
                }
             }
             return i1;
             break;
           case 1:
             co5.l(p1, str);
             return p0.a(p1);
           case 2:
             co5.l(p1, str);
             return p0.a(p1);
           case 3:
             co5.l(p1, str);
             p0.getClass();
             if ((p0 = p0.c) != null) {
                long l = p0.longValue();
                if ((p0 = p1.c) != null) {
                   if ((v5 = p0.longValue() - l) >= 0) {
                      if (!v5) {
                         i = 0;
                      }
                   }
                }
                i = 1;
             }
             return i;
             break;
           case 4:
             sl a = p0.a;
             sl a1 = p1.a;
             if (a < a1) {
                b1 = -1;
             }else if(a > a1){
                b1 = 1;
             }else {
                b1 = 0;
             }
             if (!b1) {
                p0 = p0.b;
                p1 = p1.b;
                if (p0 >= p1) {
                   i = (p0 > p1)? 1: 0;
                }
                b1 = i;
             }
             return b1;
             break;
           case 5:
             i2 = p0.position();
             i3 = p1.position();
             if (i2 >= i3) {
                i = (i2 == i3)? 0: 1;
             }
             return i;
             break;
           default:
             i2 = ((b2 = p0.b) != null && (p0 = p0.c) != null)? p0.intValue() * b2.intValue(): 0;
             i3 = ((b2 = p1.b) != null && (p1 = p1.c) != null)? p1.intValue() * b2.intValue(): 0;
             if (i2 >= i3) {
                i = (i2 == i3)? 0: 1;
             }
             return i;
       }
    }
}
