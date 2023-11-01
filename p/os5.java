package p.os5;
import p.ie3;
import p.yh5;
import p.bd7;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;

public abstract class os5	// class@002180 from classes.dex
{
    public static final os5 a;

    static {
       yh5 oyh5 = (ie3.a < 9)? new yh5(): new bd7();
       os5.a = oyh5;
    }
    public void os5(){
       super();
    }
    public abstract void a(AccessibleObject p0);
}
