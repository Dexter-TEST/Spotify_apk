package p.e18;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.String;

public final class e18 implements ThreadFactory	// class@0013ff from classes.dex
{
    public static final e18 a;

    static {
       e18.a = new e18();
    }
    public void e18(){
       super();
    }
    public final Thread newThread(Runnable p0){
       return new Thread(p0, "UpdateListenerExecutor");
    }
}
