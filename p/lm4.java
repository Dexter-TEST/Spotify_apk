package p.lm4;
import p.mn4;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.kl4;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class lm4 extends mn4	// class@001d80 from classes.dex
{
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public void lm4(Bitmap p0,int p1,int p2){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
       this.c = -1;
       this.d = p2;
    }
    public final Object a(qg2 p0,qg2 p1,qg2 p2,qg2 p3,kl4 p4,qg2 p5,qg2 p6,qg2 p7,qg2 p8,kl4 p9,qg2 p10,qg2 p11,qg2 p12,qg2 p13,qg2 p14,qg2 p15,qg2 p16,qg2 p17,qg2 p18,qg2 p19,qg2 p20,qg2 p21,qg2 p22,qg2 p23,qg2 p24,qg2 p25,qg2 p26,qg2 p27,qg2 p28,qg2 p29,qg2 p30,qg2 p31){
       return p30.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof lm4) {
          return false;
       }
       if (p0.b != this.b || (p0.c != this.c || (p0.d != this.d || !p0.a.equals(this.a)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.d).hashCode() + ((Integer.valueOf(this.c).hashCode() + ((Integer.valueOf(this.b).hashCode() + ((this.a.hashCode() + 0) * 31)) * 31)) * 31));
    }
    public final String toString(){
       return tp2.n("ColorsExtracted{cover="+this.a+", backgroundColor="+this.b+", titleColor="+this.c+", textColor=", this.d, '}');
    }
}
