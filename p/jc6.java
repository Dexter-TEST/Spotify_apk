package p.jc6;
import p.yf2;
import p.kf6;
import java.lang.String;
import java.lang.Object;
import p.hj4;
import p.co5;
import java.lang.Class;
import p.az5;

public final class jc6 implements yf2	// class@001aae from classes.dex
{
    public final kf6 a;
    public final String b;
    public final boolean c;
    public final String t;

    public void jc6(kf6 p0,String p1,boolean p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public final Object apply(Object p0){
       co5.l(p0, "username");
       this.a.c.getClass();
       p0 = new az5();
       co5.o(this.b, "mixId");
       if (this.c != null) {
          co5.o(this.t, "interactionId");
       }
       return p0;
    }
}
