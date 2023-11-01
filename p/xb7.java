package p.xb7;
import p.zw0;
import p.xw0;
import java.lang.Runnable;
import p.ms7;
import p.ww0;
import p.vw0;
import p.kg4;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class xb7 extends zw0	// class@002c47 from classes.dex
{
    public static final int c;

    static {
       xb7 oxb7 = new xb7();
    }
    public void xb7(){
       super();
    }
    public final void g0(xw0 p0,Runnable p1){
       kg4.v(p0.f(ms7.b));
       throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
    public final zw0 i0(int p0){
       throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
    public final String toString(){
       return "Dispatchers.Unconfined";
    }
}
