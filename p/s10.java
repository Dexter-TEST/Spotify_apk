package p.s10;
import p.qg2;
import p.t10;
import java.lang.Object;
import p.n10;
import p.a;
import p.l10;
import java.util.Calendar;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.m10;
import java.lang.Class;
import p.ko1;
import java.lang.Integer;
import p.nr;
import p.o10;
import java.util.GregorianCalendar;
import java.lang.Boolean;

public final class s10 implements qg2	// class@002598 from classes.dex
{
    public final int a;
    public final t10 b;

    public void s10(t10 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       int i1 = 1;
       s10 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             ko1 oko1 = new ko1(tb, i);
             oko1.t = Integer.valueOf(p0.a);
             return xt.d(oko1.g());
           case 1:
             p0 = new Object[i1];
             p0[i] = new l10(tb.a);
             return xt.a(vv7.p(p0));
           default:
             s10 os10 = tb;
             os10.getClass();
             ko1 oko11 = new ko1(os10, i);
             o10 a = p0.a;
             oko11.b = a;
             p0 = p0.b;
             GregorianCalendar v12 = new GregorianCalendar((p0.get(i1) - tb.c), p0.get(2), p0.get(5), 23, 59, 59);
             v12.set(14, 999);
             int i2 = p0.get(2);
             if (!a.before(new GregorianCalendar((p0.get(i1) - 112), i2, p0.get(5))) && !a.after(v12)) {
                i = true;
             }
             oko11.c = Boolean.valueOf(i);
             return xt.d(oko11.g());
       }
    }
}
