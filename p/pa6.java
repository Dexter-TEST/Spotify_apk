package p.pa6;
import p.b17;
import java.util.Iterator;
import p.la6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.di7;
import p.aq0;
import p.n26;
import p.ol1;
import p.ni2;
import p.wc;

public abstract class pa6 extends b17	// class@002225 from classes.dex
{

    public static final la6 F(Iterator p0){
       co5.o(p0, "<this>");
       di7 uodi7 = new di7(4, p0);
       if (uodi7 instanceof aq0) {
       }else {
          uodi7 = new aq0(uodi7);
       }
       return uodi7;
    }
    public static final la6 G(Object p0,n26 p1){
       p0 = (p0 == null)? ol1.a: new ni2(new wc(11, p0), p1);
       return p0;
    }
}
