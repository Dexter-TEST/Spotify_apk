package p.qd;
import p.a27;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.ph3;
import p.yl2;
import java.lang.System;
import java.util.Arrays;
import p.qy;
import p.md6;
import p.zl2;
import p.jb3;
import p.ij0;
import p.l27;

public final class qd extends a27	// class@002381 from classes.dex
{
    public final int c;

    public void qd(int p0,List p1){
       this.c = p0;
       super(3, p1);
    }
    public void qd(ArrayList p0){
       this.c = 1;
       int i = 0;
       for (int i1 = 0; i1 < p0.size(); i1 = i1 + 1) {
          ph3 oph3 = p0.get(i1);
          ph3 b = oph3.b;
          ph3 c = oph3.c;
          if (b != null && c != null) {
             yl2 a = b.a;
             yl2 a1 = c.a;
             if (a.length != a1.length) {
                int i2 = a.length + a1.length;
                float[] uofloatArray = new float[i2];
                System.arraycopy(a, i, uofloatArray, i, a.length);
                System.arraycopy(a1, i, uofloatArray, a.length, a1.length);
                Arrays.sort(uofloatArray);
                a = Float.NaN;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                   int i5 = uofloatArray[i3];
                   if (a - i5) {
                      uofloatArray[i4] = i5;
                      i4 = i4 + 1;
                      int i6 = uofloatArray[i3];
                   }
                   i3 = i3 + 1;
                }
                float[] uofloatArray1 = Arrays.copyOfRange(uofloatArray, i, i4);
                yl2 oyl2 = b.a(uofloatArray1);
                oph3 = new ph3(oyl2, c.a(uofloatArray1));
             }
          }
          p0.set(i1, oph3);
       }
       super(3, p0);
       return;
    }
    public final qy a(){
       a27 tb = this.b;
       switch (this.c){
           case 0:
             return new ij0(tb);
           case 1:
             return new zl2(0, tb);
           case 2:
             return new jb3(tb);
           case 3:
             return new zl2(1, tb);
           case 4:
             return new zl2(2, tb);
           case 5:
             return new md6(tb);
           default:
             return new l27(tb);
       }
    }
}
