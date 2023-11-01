package p.y86;
import p.aj7;
import p.fh5;
import p.si4;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.Class;
import p.vi7;
import p.x86;
import p.me4;

public final class y86 implements aj7	// class@002d6d from classes.dex
{
    public final fh5 a;
    public final si4 b;
    public final Scheduler c;
    public final Scheduler d;

    public void y86(fh5 p0,si4 p1,Scheduler p2,Scheduler p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final vi7 a(Class p0){
       return new x86(this.a, this.b, this.c, this.d);
    }
    public final vi7 b(Class p0,me4 p1){
       return this.a(p0);
    }
}
