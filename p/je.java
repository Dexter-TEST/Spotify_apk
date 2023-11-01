package p.je;
import android.view.animation.LinearInterpolator;
import p.j02;
import p.i02;
import p.tk3;
import android.view.animation.DecelerateInterpolator;

public abstract class je	// class@001ac1 from classes.dex
{
    public static final LinearInterpolator a;
    public static final j02 b;
    public static final i02 c;
    public static final tk3 d;
    public static final DecelerateInterpolator e;

    static {
       je.a = new LinearInterpolator();
       je.b = new j02();
       je.c = new i02();
       je.d = new tk3();
       je.e = new DecelerateInterpolator();
    }
}
