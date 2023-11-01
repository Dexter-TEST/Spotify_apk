package p.tq5;
import p.zr0;
import java.lang.String;
import p.rd;
import p.wd;
import java.lang.Object;
import p.yd;
import p.qd;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import p.sq5;
import p.ku5;
import java.lang.StringBuilder;

public final class tq5 implements zr0	// class@0027c1 from classes.dex
{
    public final int a;
    public final rd b;
    public final boolean c;
    public final yd d;
    public final Object e;

    public void tq5(String p0,rd p1,rd p2,wd p3,boolean p4){
       this.a = 1;
       super();
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.c = p4;
    }
    public void tq5(String p0,yd p1,qd p2,rd p3,boolean p4){
       this.a = 0;
       super();
       this.d = p1;
       this.e = p2;
       this.b = p3;
       this.c = p4;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       switch (this.a){
           case 0:
           default:
             return new ku5(p0, p2, this);
       }
       return new sq5(p0, p2, this);
    }
    public final String toString(){
       switch (this.a){
           case 0:
           default:
             return super.toString();
       }
       return "RectangleShape{position="+this.d+", size="+this.e+'}';
    }
}
