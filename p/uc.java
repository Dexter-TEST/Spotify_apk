package p.uc;
import p.cm5;
import p.oo0;
import java.lang.Object;
import p.o26;
import p.ay6;
import p.wf2;

public final class uc implements cm5	// class@002888 from classes.dex
{
    public final boolean a;
    public final oo0 b;
    public final ay6 c;

    public void uc(boolean p0,oo0 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ay6(new o26(29, this));
    }
    public final boolean a(){
       uc value;
       boolean b = ((value = this.c.getValue()) != null)? value.a(): this.a;
       return b;
    }
}
