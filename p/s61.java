package p.s61;
import android.os.Build$VERSION;

public abstract class s61	// class@0025c7 from classes.dex
{
    public static final boolean a;

    static {
       boolean b = (Build$VERSION.SDK_INT >= 28)? true: false;
       s61.a = b;
    }
}
