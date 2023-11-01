package p.o73;
import p.d73;
import java.util.Comparator;
import java.lang.Class;
import java.lang.Object;
import com.google.common.collect.d;
import com.google.common.collect.h;
import p.a73;
import com.google.common.collect.e;
import p.w51;
import java.util.Arrays;
import p.ys5;
import com.google.common.collect.c;

public final class o73 extends d73	// class@0020c3 from classes.dex
{
    public final Comparator I;

    public void o73(Comparator p0){
       super();
       p0.getClass();
       this.I = p0;
    }
    public final d73 F0(Object p0){
       super.F0(p0);
       return this;
    }
    public final d H0(){
       throw null;
    }
    public final h J0(){
       h oh;
       int i2;
       a73 tF = this.F;
       a73 tG = this.G;
       o73 tI = this.I;
       if (tG == null) {
          oh = e.w(tI);
       }else {
          w51.e(tG, tF);
          Arrays.sort(tF, 0, tG, tI);
          int i = 1;
          int i1 = 1;
          while (i < tG) {
             object oobject = tF[i];
             if (i2 = i1 - 1) {
                i2 = i1 + 1;
                tF[i1] = oobject;
                i1 = i2;
             }
             i = i + 1;
          }
          Arrays.fill(tF, i1, tG, null);
          if (i1 < (tF.length / 2)) {
             tF = Arrays.copyOf(tF, i1);
          }
          oh = new h(c.m(i1, tF), tI);
       }
       this.G = oh.size();
       this.H = true;
       return oh;
    }
}
