package p.uc3;
import p.tc3;
import java.lang.String;
import java.lang.Object;
import java.util.Set;
import p.co5;
import p.pl1;
import java.lang.IllegalStateException;
import p.ec6;
import java.lang.Integer;
import java.util.Collection;
import p.av6;

public final class uc3	// class@002883 from classes.dex
{
    public final tc3 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public void uc3(tc3 p0,int[] p1,String[] p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       int i = 1;
       int i1 = (!p2.length)? 1: 0;
       Set set = ((i1 ^ i))? co5.H(p2[0]): pl1.a;
       this.d = set;
       if (p1.length != p2.length) {
          i = 0;
       }
       if (i) {
          return;
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final void a(Set p0){
       uc3 tb = this.b;
       int len = tb.length;
       pl1 a = pl1.a;
       if (len) {
          int i = 0;
          if (len != 1) {
             a = new ec6();
             len = tb.length;
             int i1 = 0;
             while (i < len) {
                int i2 = i1 + 1;
                if (p0.contains(Integer.valueOf(tb[i]))) {
                   a.add(this.c[i1]);
                }
                i = i + 1;
                i1 = i2;
             }
             co5.f(a);
          }else if(p0.contains(Integer.valueOf(tb[i]))){
             a = this.d;
          }
       }
       if ((a.isEmpty() ^ 1)) {
          this.a.a(a);
       }
       return;
    }
    public final void b(String[] p0){
       int i1;
       uc3 tc = this.c;
       int len = tc.length;
       pl1 a = pl1.a;
       if (len) {
          int i = 0;
          if (len != 1) {
             a = new ec6();
             len = p0.length;
             i1 = 0;
             while (i1 < len) {
                object oobject = p0[i1];
                int len1 = tc.length;
                int i2 = 0;
                while (i2 < len1) {
                   object oobject1 = tc[i2];
                   if (av6.i0(oobject1, oobject, true)) {
                      a.add(oobject1);
                   }
                   i2 = i2 + 1;
                }
                i1 = i1 + 1;
             }
             co5.f(a);
          }else {
             len = p0.length;
             i1 = 0;
             while (i1 < len) {
                if (av6.i0(p0[i1], tc[i], true)) {
                   i = 1;
                   break ;
                }
                i1 = i1 + 1;
             }
             if (i) {
                a = this.d;
             }
          }
       }
       if ((a.isEmpty() ^ true)) {
          this.a.a(a);
       }
       return;
    }
}
