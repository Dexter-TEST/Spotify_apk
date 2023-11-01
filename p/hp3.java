package p.hp3;
import p.eo1;
import java.lang.Object;
import p.gp3;

public final class hp3	// class@001898 from classes.dex
{
    public final og2 a;
    public static final hp3 b;
    public static final hp3 c;
    public static final hp3 d;
    public static final hp3 e;
    public static final hp3 f;

    static {
       hp3.b = new hp3(16.00f);
       hp3.c = new hp3(32.00f);
       hp3.d = new hp3(64.00f);
       hp3.e = new hp3(128.00f);
       hp3.f = new hp3(new eo1(1));
    }
    public void hp3(float p0){
       super();
       this.a = new gp3(p0);
    }
    public void hp3(eo1 p0){
       super();
       this.a = p0;
    }
}
