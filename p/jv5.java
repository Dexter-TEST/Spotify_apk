package p.jv5;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import p.iv5;
import java.lang.String;

public final class jv5 implements ThreadFactory	// class@001b53 from classes.dex
{
    public final String a;
    public final int b;

    public void jv5(){
       super();
       this.a = "fonts-androidx";
       this.b = 10;
    }
    public final Thread newThread(Runnable p0){
       return new iv5(p0, this.a, this.b);
    }
}
