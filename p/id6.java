package p.id6;
import p.zr0;
import java.lang.String;
import android.graphics.Path$FillType;
import p.qd;
import java.lang.Object;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import p.s42;
import java.lang.StringBuilder;
import p.kg4;

public final class id6 implements zr0	// class@001973 from classes.dex
{
    public final boolean a;
    public final Path$FillType b;
    public final qd c;
    public final qd d;
    public final boolean e;

    public void id6(String p0,boolean p1,Path$FillType p2,qd p3,qd p4,boolean p5){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       return new s42(p0, p2, this);
    }
    public final String toString(){
       return kg4.p("ShapeFill{color=, fillEnabled=", this.a, '}');
    }
}
