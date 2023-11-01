package p.fv5;
import java.lang.Object;
import p.u54;
import p.ev5;
import java.lang.String;
import p.co5;
import p.we7;
import p.f70;

public abstract class fv5	// class@001647 from classes.dex
{

    public void fv5(){
       super();
    }
    public static final ev5 c(u54 p0,byte[] p1){
       co5.o(p1, "content");
       int len = p1.length;
       we7.c((long)p1.length, (long)0, (long)len);
       return new ev5(p0, p1, len, 0);
    }
    public abstract long a();
    public abstract u54 b();
    public abstract void d(f70 p0);
}
