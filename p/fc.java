package p.fc;
import java.lang.String;
import java.lang.Class;

public abstract class fc	// class@0015a3 from classes.dex
{
    public static final Class a;
    public static final boolean b;

    static {
       Class uClass = Class.forName("libcore.io.Memory");
       fc.a = uClass;
       boolean b = (Class.forName("org.robolectric.Robolectric") != null)? true: false;
       fc.b = b;
    }
    public static boolean a(){
       boolean b = (fc.a != null && !fc.b)? true: false;
       return b;
    }
}
