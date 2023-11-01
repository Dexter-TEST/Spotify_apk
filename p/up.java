package p.up;
import p.r90;
import java.lang.Object;
import p.bv5;
import p.t90;
import p.aw6;
import p.g15;
import p.oy6;
import java.lang.Class;
import p.zu5;
import java.lang.String;

public final class up implements r90	// class@0028fa from classes.dex
{
    public final int a;
    public final Object b;

    public void up(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final t90 a(bv5 p0){
       up tb = this.b;
       switch (this.a){
           case 0:
             return tb.b.get().a(p0);
           case 1:
             return tb.get().a(p0);
           default:
             p0.getClass();
             zu5 ozu5 = new zu5(p0);
             ozu5.d("X-Allow-Offline-Mode", "true");
             return tb.a(ozu5.b());
       }
    }
}
