package p.tx7;
import p.ly7;
import java.lang.Object;
import p.hy7;
import p.jy7;
import p.jx7;
import p.o08;
import p.a70;
import p.tu6;
import p.xw7;
import android.content.Context;
import p.wz7;
import p.dx7;

public final class tx7 implements ly7	// class@002802 from classes.dex
{
    public final int a;
    public final ly7 b;

    public void tx7(ly7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object c(){
       tx7 tb = this.b;
       switch (this.a){
           case 0:
             a70 a = tb.a.a;
             tu6.E(a);
             return new xw7(a);
           case 1:
             return new jx7(jy7.a(tb));
           default:
             return new wz7(tb.c());
       }
    }
}
