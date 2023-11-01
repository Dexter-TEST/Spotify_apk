package p.qs1;
import p.wt1;
import p.j94;
import p.xc5;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class qs1 extends wt1	// class@002403 from classes.dex
{
    public final boolean a;

    public void qs1(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(j94 p0,j94 p1,j94 p2,j94 p3,j94 p4,j94 p5,j94 p6,j94 p7,j94 p8,xc5 p9){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof qs1) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.a, 0);
    }
    public final String toString(){
       return kg4.p("AvailableOfflineUpdated{availableOffline=", this.a, '}');
    }
}
