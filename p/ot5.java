package p.ot5;
import p.cm5;
import p.oo0;
import java.lang.Object;
import p.wc;
import p.ay6;
import p.wf2;

public final class ot5 implements cm5	// class@002189 from classes.dex
{
    public final boolean a;
    public final oo0 b;
    public final ay6 c;

    public void ot5(boolean p0,oo0 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ay6(new wc(7, this));
    }
    public final boolean a(){
       ot5 value;
       boolean b = ((value = this.c.getValue()) != null)? value.a(): this.a;
       return b;
    }
}
