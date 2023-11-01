package p.o71;
import p.zr5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class o71	// class@0020c1 from classes.dex
{
    public zr5 a;
    public zr5 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void o71(zr5 p0,zr5 p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final String toString(){
       return tp2.n("ChangeInfo{oldHolder="+this.a+", newHolder="+this.b+", fromX="+this.c+", fromY="+this.d+", toX="+this.e+", toY=", this.f, '}');
    }
}
