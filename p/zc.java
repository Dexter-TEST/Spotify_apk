package p.zc;
import p.cm5;
import p.oo0;
import java.lang.Object;
import p.o26;
import p.ay6;
import p.wf2;

public final class zc implements cm5	// class@002ed0 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final oo0 d;
    public final ay6 e;

    public void zc(boolean p0,boolean p1,boolean p2,oo0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = new ay6(new o26(21, this));
    }
    public final boolean a(){
       zc value;
       boolean b = ((value = this.e.getValue()) != null)? value.a(): this.a;
       return b;
    }
    public final boolean b(){
       zc value;
       boolean b = ((value = this.e.getValue()) != null)? value.b(): this.b;
       return b;
    }
    public final boolean c(){
       zc value;
       boolean b = ((value = this.e.getValue()) != null)? value.c(): this.c;
       return b;
    }
}
