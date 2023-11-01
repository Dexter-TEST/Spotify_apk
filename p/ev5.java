package p.ev5;
import p.fv5;
import p.u54;
import p.f70;

public final class ev5 extends fv5	// class@001507 from classes.dex
{
    public final u54 a;
    public final int b;
    public final byte[] c;
    public final int d;

    public void ev5(u54 p0,byte[] p1,int p2,int p3){
       this.a = p0;
       this.b = p2;
       this.c = p1;
       this.d = p3;
       super();
    }
    public final long a(){
       return (long)this.b;
    }
    public final u54 b(){
       return this.a;
    }
    public final void d(f70 p0){
       p0.write(this.c, this.d, this.b);
    }
}
