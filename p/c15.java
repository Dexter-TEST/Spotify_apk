package p.c15;
import p.fx5;
import p.x10;
import p.g70;
import p.nn6;
import p.hp5;
import p.xe7;
import p.u54;

public final class c15 extends fx5	// class@00018b from classes2.dex
{
    public final fx5 b;
    public final hp5 c;
    public IOException t;

    public void c15(fx5 p0){
       super();
       this.b = p0;
       this.c = xe7.f(new x10(this, p0.y()));
    }
    public final void close(){
       this.b.close();
    }
    public final long f(){
       return this.b.f();
    }
    public final u54 x(){
       return this.b.x();
    }
    public final g70 y(){
       return this.c;
    }
}
