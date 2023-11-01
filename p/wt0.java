package p.wt0;
import p.p2;
import p.v26;
import p.kf6;
import p.x12;
import java.lang.String;
import java.lang.Class;
import p.m26;
import p.vi7;
import java.lang.Object;
import p.co5;
import p.vt0;

public final class wt0 extends p2	// class@002b9e from classes.dex
{
    public final kf6 d;
    public final x12 e;

    public void wt0(v26 p0,kf6 p1,x12 p2){
       super(p0);
       this.d = p1;
       this.e = p2;
    }
    public final vi7 d(String p0,Class p1,m26 p2){
       co5.o(p2, "handle");
       return new vt0(p2, this.d, this.e);
    }
}
