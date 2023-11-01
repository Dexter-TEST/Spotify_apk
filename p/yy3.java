package p.yy3;
import p.aj7;
import p.uy3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.vi7;
import p.xy3;
import p.me4;

public final class yy3 implements aj7	// class@002e4f from classes.dex
{
    public final uy3 a;

    public void yy3(uy3 p0){
       co5.o(p0, "injector");
       super();
       this.a = p0;
    }
    public final vi7 a(Class p0){
       return new xy3(this.a);
    }
    public final vi7 b(Class p0,me4 p1){
       return this.a(p0);
    }
}
