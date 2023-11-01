package p.hd;
import p.xn2;
import android.os.Handler;
import android.os.Looper;

public abstract class hd	// class@001831 from classes.dex
{
    public static final xn2 a;

    static {
       hd.a = new xn2(new Handler(Looper.getMainLooper()));
    }
}
