package p.ow1;
import p.a02;
import java.lang.Object;
import p.vq7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ow1 implements a02	// class@0021a0 from classes.dex
{
    public static final ow1 a;

    static {
       ow1.a = new ow1();
    }
    public void ow1(){
       super();
    }
    public final Object get(){
       return new vq7(1, Executors.newSingleThreadExecutor());
    }
}
