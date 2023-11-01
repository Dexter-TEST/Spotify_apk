package p.jo5;
import java.io.Serializable;
import java.lang.Object;
import p.lo5;

public final class jo5 implements Serializable	// class@001b17 from classes.dex
{
    public static final jo5 a;

    static {
       jo5.a = new jo5();
    }
    public void jo5(){
       super();
    }
    private final Object readResolve(){
       return lo5.a;
    }
}
