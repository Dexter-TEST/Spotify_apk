package p.km0;
import p.do5;
import p.lm0;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import p.io2;
import p.mm0;

public final class km0 extends do5	// class@001c3c from classes.dex
{
    public final List F;
    public final lm0 G;

    public void km0(lm0 p0,List p1){
       this.G = p0;
       this.F = p1;
       super();
    }
    public final int A(){
       return this.G.v.size();
    }
    public final boolean b(int p0,int p1){
       return io2.j(this.G.v.get(p0), this.F.get(p1));
    }
    public final boolean c(int p0,int p1){
       mm0 omm0 = this.G.v.get(p0);
       mm0 omm01 = this.F.get(p1);
       boolean b = (omm0.b == omm01.b && !(omm0.a - omm01.a))? true: false;
       return b;
    }
    public final int z(){
       return this.F.size();
    }
}
