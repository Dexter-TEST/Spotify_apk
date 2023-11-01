package p.x18;
import p.ly7;
import java.lang.Object;
import p.o08;
import p.a70;
import p.tu6;
import p.t18;
import android.content.Context;
import p.gz7;
import p.dx7;

public final class x18 implements ly7	// class@002bef from classes.dex
{
    public final int a;
    public final ly7 b;

    public void x18(ly7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object c(){
       x18 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new gz7(tb.c());
       }
       a70 a = tb.a.a;
       tu6.E(a);
       return new t18(a);
    }
}
