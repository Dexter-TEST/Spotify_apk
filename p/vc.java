package p.vc;
import p.cm5;
import p.oo0;
import java.lang.Object;
import p.wc;
import p.ay6;
import p.wf2;

public final class vc implements cm5	// class@0029ca from classes.dex
{
    public final boolean a;
    public final oo0 b;
    public final ay6 c;

    public void vc(boolean p0,oo0 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ay6(new wc(4, this));
    }
    public final boolean a(){
       vc value;
       boolean b = ((value = this.c.getValue()) != null)? value.a(): this.a;
       return b;
    }
}
