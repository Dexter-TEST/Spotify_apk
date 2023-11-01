package p.iz5;
import p.my;
import p.or0;
import p.bw3;
import p.sy;
import p.hz5;
import java.lang.Object;
import java.lang.Class;
import p.qy;
import p.yd;
import java.util.List;

public final class iz5 implements my, or0	// class@001a35 from classes.dex
{
    public final bw3 a;
    public final qy b;
    public gd6 c;

    public void iz5(bw3 p0,sy p1,hz5 p2){
       super();
       this.a = p0;
       p2.getClass();
       qy oqy = p2.a.a();
       this.b = oqy;
       p1.f(oqy);
       oqy.a(this);
    }
    public static int f(int p0,int p1){
       int i = p0 / p1;
       if (((p0 ^ p1)) < 0 && ((p1 * i)) != p0) {
          i = i - 1;
       }
       return (p0 - (i * p1));
    }
    public final void b(){
       this.a.invalidateSelf();
    }
    public final void c(List p0,List p1){
    }
}
