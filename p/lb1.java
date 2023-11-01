package p.lb1;
import java.util.concurrent.Executor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Runnable;

public final class lb1 extends Enum implements Executor	// class@001d1c from classes.dex
{
    public static final lb1 a;
    public static final lb1[] b;

    static {
       lb1 olb1 = new lb1();
       lb1.a = olb1;
       lb1[] olb1Array = new lb1[]{olb1};
       lb1.b = olb1Array;
    }
    public void lb1(){
       super("INSTANCE", 0);
    }
    public static lb1 valueOf(String p0){
       return Enum.valueOf(lb1.class, p0);
    }
    public static lb1[] values(){
       return lb1.b.clone();
    }
    public final void execute(Runnable p0){
       p0.run();
    }
    public final String toString(){
       return "DirectExecutor";
    }
}
