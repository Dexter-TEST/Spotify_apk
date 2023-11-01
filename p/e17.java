package p.e17;
import p.ur3;
import p.az5;
import p.uz0;
import java.util.EnumSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.d17;
import p.wr3;
import java.util.AbstractCollection;
import p.zr3;

public final class e17 implements ur3	// class@0013fe from classes.dex
{
    public final zr3 a;
    public final zr3 b;
    public final zr3 c;
    public final zr3 d;
    public final zr3 e;
    public final zr3 f;

    static {
       az5 uoaz5 = new az5();
    }
    public void e17(uz0 p0,EnumSet p1){
       co5.o(p0, "telemetryManager");
       co5.o(p1, "enabledLogLevels");
       super();
       d17 uod17 = new d17(p0, 1);
       d17 uod171 = new d17(p0, 4);
       uod171 = new d17(p0, 3);
       d17 uod172 = new d17(p0, 5);
       d17 uod173 = new d17(p0, 2);
       d17 uod174 = new d17(p0, 0);
       d17 uod175 = new d17(p0, 6);
       p1.contains(wr3.a);
       fv1 n = zr3.n;
       if (p1.contains(wr3.b)) {
       }else {
          uod17 = n;
       }
       this.a = uod17;
       if (!p1.contains(wr3.c)) {
          fv1 uofv1 = n;
       }
       this.b = uod171;
       if (!p1.contains(wr3.t)) {
          uod172 = n;
       }
       this.c = uod172;
       if (!p1.contains(wr3.v)) {
          uod173 = n;
       }
       this.d = uod173;
       if (!p1.contains(wr3.w)) {
          uod174 = n;
       }
       this.e = uod174;
       if (!p1.contains(wr3.x)) {
          uod175 = n;
       }
       this.f = uod175;
       return;
    }
    public final zr3 a(){
       return this.d;
    }
    public final zr3 b(){
       return this.b;
    }
    public final zr3 c(){
       return this.c;
    }
    public final zr3 d(){
       return this.e;
    }
    public final zr3 e(){
       return this.f;
    }
    public final zr3 f(){
       return this.a;
    }
}
