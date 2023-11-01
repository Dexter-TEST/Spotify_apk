package p.wd6;
import p.zr0;
import java.lang.String;
import p.qd;
import java.lang.Object;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import p.fd6;
import java.lang.StringBuilder;
import p.tp2;

public final class wd6 implements zr0	// class@002b17 from classes.dex
{
    public final String a;
    public final int b;
    public final qd c;
    public final boolean d;

    public void wd6(String p0,int p1,qd p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       return new fd6(p0, p2, this);
    }
    public final String toString(){
       return tp2.n("ShapePath{name="+this.a+", index=", this.b, '}');
    }
}
