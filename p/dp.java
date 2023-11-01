package p.dp;
import p.aw6;
import p.ti3;
import java.lang.Object;
import p.g15;
import p.mp;
import p.vp;
import java.lang.Class;
import p.fq;
import p.qp;
import p.wb7;
import p.f15;
import java.util.ArrayList;
import p.kc1;

public final class dp implements aw6	// class@001393 from classes.dex
{
    public final int a;
    public final ti3 b;

    public void dp(ti3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       dp tb = this.b;
       switch (this.a){
           case 0:
             return tb.get();
           case 1:
             return tb.get();
           case 2:
             mp omp = tb.get();
             omp.getClass();
             g15 og15 = omp.a.get();
             og15.getClass();
             f15 uof15 = new f15(og15);
             uof15.c.add(0, new fq(0, new qp(omp, 0)));
             uof15.g = new wb7(new qp(omp, 1), new qp(omp, 2));
             f15 uof151 = new f15(new g15(uof15));
             uof151.a = new kc1();
             return new g15(uof151);
           case 3:
             return tb.get().B;
           default:
             return tb.get().B;
       }
    }
}
