package p.zu2;
import p.cv2;
import java.lang.String;
import p.r45;
import p.j33;
import p.qg2;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class zu2 extends cv2	// class@002f68 from classes.dex
{
    public final String a;
    public final r45 b;
    public final r45 c;
    public final boolean d;

    public void zu2(String p0,r45 p1,r45 p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Object a(j33 p0,j33 p1,qg2 p2,qg2 p3,j33 p4,j33 p5,qg2 p6){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zu2) {
          return false;
       }
       if (p0.d != this.d || (!p0.a.equals(this.a) || (!p0.b.equals(this.b) || !p0.c.equals(this.c)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.d, ((this.c.hashCode() + ((this.b.hashCode() + tp2.g(this.a, 0, 31)) * 31)) * 31));
    }
    public final String toString(){
       return kg4.p("Play{uri="+this.a+", offlineUri="+this.b+", uid="+this.c+", mobileOnDemandLicense=", this.d, '}');
    }
}
