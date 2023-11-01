package p.cb0;
import p.qg2;
import p.b;
import java.lang.Object;
import p.va0;
import java.lang.Class;
import p.ko1;
import p.or;
import p.xt;
import java.lang.NullPointerException;
import java.lang.String;
import p.xa0;
import p.ta0;
import p.ua0;
import java.util.List;
import p.pa0;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.HashSet;
import p.vv7;
import java.util.Set;

public final class cb0 implements qg2	// class@0011d0 from classes.dex
{
    public final int a;
    public final b b;

    public void cb0(b p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       ko1 oko1;
       int i = 0;
       cb0 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             oko1 = new ko1(tb, i);
             oko1.c = p0.a;
             return xt.d(oko1.h());
           case 1:
             tb.getClass();
             oko1 = new ko1(tb, i);
             oko1.b = p0.a;
             return xt.d(oko1.h());
           case 2:
             tb.getClass();
             oko1 = new ko1(tb, i);
             if ((p0 = p0.a) != null) {
                oko1.t = p0;
                return xt.d(oko1.h());
             }else {
                throw new NullPointerException("Null callingCodes");
             }
             break;
           default:
             if (tb.c.size() < 2) {
                p0 = xt.e();
             }else {
                p0 = new Object[]{new pa0(tb.b, tb.c)};
                p0 = xt.a(vv7.p(p0));
             }
             return p0;
       }
    }
}
