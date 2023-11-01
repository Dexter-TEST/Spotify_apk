package p.st5;
import p.cm5;
import java.lang.Object;
import p.wc;
import p.ay6;
import p.wf2;

public final class st5 implements cm5	// class@002698 from classes.dex
{
    public final boolean a;
    public final int b;
    public final ay6 c;

    public void st5(boolean p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ay6(new wc(6, this));
    }
    public final boolean a(){
       st5 value;
       boolean b = ((value = this.c.getValue()) != null)? value.a(): this.a;
       return b;
    }
    public final int b(){
       st5 value;
       int i = ((value = this.c.getValue()) != null)? value.b(): this.b;
       return i;
    }
}
