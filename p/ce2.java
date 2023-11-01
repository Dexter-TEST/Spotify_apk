package p.ce2;
import p.aj7;
import java.lang.Object;
import java.lang.Class;
import p.vi7;
import p.tq3;
import androidx.fragment.app.p;
import p.bg4;
import p.me4;

public final class ce2 implements aj7	// class@0011ed from classes.dex
{
    public final int a;

    public void ce2(int p0){
       this.a = p0;
       super();
    }
    public final vi7 a(Class p0){
       switch (this.a){
           case 0:
             return new p(true);
           case 1:
             return new tq3();
           default:
             return new bg4();
       }
    }
    public final vi7 b(Class p0,me4 p1){
       switch (this.a){
           case 0:
             return this.a(p0);
           case 1:
             return this.a(p0);
           default:
             return this.a(p0);
       }
    }
}
