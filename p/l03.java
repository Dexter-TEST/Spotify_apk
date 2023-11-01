package p.l03;
import p.zt2;
import p.ty0;
import java.lang.String;
import p.a23;
import p.au2;

public abstract class l03	// class@001cb9 from classes.dex
{
    public static final au2 a;
    public static final au2 b;

    static {
       l03.a = ty0.b().b("appearDisabled", true).d();
       l03.b = ty0.b().b("appearDisabled", false).d();
    }
    public static au2 a(boolean p0){
       au2 a = (p0)? l03.a: l03.b;
       return a;
    }
}
