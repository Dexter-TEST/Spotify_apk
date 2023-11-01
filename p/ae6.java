package p.ae6;
import p.zr0;
import java.lang.String;
import p.rd;
import java.lang.Object;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import p.v97;
import java.lang.StringBuilder;

public final class ae6 implements zr0	// class@000f69 from classes.dex
{
    public final int a;
    public final rd b;
    public final rd c;
    public final rd d;
    public final boolean e;

    public void ae6(String p0,int p1,rd p2,rd p3,rd p4,boolean p5){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       return new v97(p2, this);
    }
    public final String toString(){
       return "Trim Path: {start: "+this.b+", end: "+this.c+", offset: "+this.d+"}";
    }
}
