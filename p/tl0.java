package p.tl0;
import p.au0;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import p.xw0;

public final class tl0 implements au0	// class@002790 from classes.dex
{
    public static final tl0 a;

    static {
       tl0.a = new tl0();
    }
    public void tl0(){
       super();
    }
    public final void d(Object p0){
       throw new IllegalStateException("This continuation is already complete".toString());
    }
    public final xw0 getContext(){
       throw new IllegalStateException("This continuation is already complete".toString());
    }
    public final String toString(){
       return "This continuation is already complete";
    }
}
