package p.n87;
import android.os.Build$VERSION;

public abstract class n87	// class@001f8c from classes.dex
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
       boolean b = true;
       n87.a = b;
       n87.b = b;
       if (Build$VERSION.SDK_INT >= 28) {
       }else {
          b = false;
       }
       n87.c = b;
    }
}
