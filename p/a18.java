package p.a18;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.String;

public final class a18 implements ThreadFactory	// class@000ef7 from classes.dex
{
    public static final a18 a;

    static {
       a18.a = new a18();
    }
    public void a18(){
       super();
    }
    public final Thread newThread(Runnable p0){
       return new Thread(p0, "AssetPackBackgroundExecutor");
    }
}
