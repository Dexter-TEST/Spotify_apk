package p.j0;
import p.vw0;
import p.ww0;
import java.lang.Object;
import p.ng2;
import p.xw0;
import java.lang.String;
import p.co5;
import p.vv7;
import p.is7;

public abstract class j0 implements vw0	// class@001a42 from classes.dex
{
    public final ww0 a;

    public void j0(ww0 p0){
       super();
       this.a = p0;
    }
    public final Object J(Object p0,ng2 p1){
       return p1.b(p0, this);
    }
    public final xw0 T(xw0 p0){
       co5.o(p0, "context");
       return vv7.G(this, p0);
    }
    public vw0 f(ww0 p0){
       return is7.o(this, p0);
    }
    public final ww0 getKey(){
       return this.a;
    }
    public xw0 y(ww0 p0){
       return is7.u(this, p0);
    }
}
