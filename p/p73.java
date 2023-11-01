package p.p73;
import java.io.Serializable;
import java.util.Comparator;
import java.lang.Object;
import p.o73;
import p.w51;
import p.a73;
import java.lang.System;
import com.google.common.collect.h;

public final class p73 implements Serializable	// class@002206 from classes.dex
{
    public final Comparator a;
    public final Object[] b;

    public void p73(Comparator p0,Object[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object readResolve(){
       o73 oo73 = new o73(this.a);
       p73 tb = this.b;
       int len = tb.length;
       w51.e(len, tb);
       oo73.E0((oo73.G + len));
       System.arraycopy(tb, 0, oo73.F, oo73.G, len);
       oo73.G = oo73.G + len;
       return oo73.J0();
    }
}
