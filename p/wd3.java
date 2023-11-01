package p.wd3;
import p.d1;
import java.lang.Object;

public final class wd3 extends d1	// class@002b14 from classes.dex
{
    public final Object[] c;
    public final int t;
    public static final wd3 v;

    static {
       Object[] objArray = new Object[0];
       wd3.v = new wd3(objArray);
    }
    public void wd3(Object[] p0){
       super(0, 0);
       this.c = p0;
       this.t = 0;
    }
    public final Object b(int p0){
       return this.c[(this.t + p0)];
    }
}
