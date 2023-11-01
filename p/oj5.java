package p.oj5;
import java.lang.Float;
import p.x3;
import java.lang.Object;
import android.view.View;
import p.mj5;

public abstract class oj5	// class@002132 from classes.dex
{
    public static final x3 a;
    public static final x3 b;
    public static final x3 c;
    public static final x3 d;

    static {
       oj5.a = new x3(Float.valueOf(0x3f7851ec));
       Float uFloat = Float.valueOf(0x3f7d70a4);
       oj5.b = new x3(uFloat);
       oj5.c = new x3(Float.valueOf(0x3f75c28f));
       oj5.d = new x3(uFloat);
    }
    public static mj5 a(View p0){
       return new mj5(p0, oj5.c.a.floatValue());
    }
    public static mj5 b(View p0){
       return new mj5(p0, oj5.a.a.floatValue());
    }
    public static mj5 c(View p0){
       return new mj5(p0, oj5.b.a.floatValue());
    }
}
