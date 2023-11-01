package p.aa0;
import java.io.Serializable;
import java.lang.Object;

public final class aa0 implements Serializable	// class@000f41 from classes.dex
{
    public static final aa0 a;

    static {
       aa0.a = new aa0();
    }
    public void aa0(){
       super();
    }
    private Object readResolve(){
       return aa0.a;
    }
}
