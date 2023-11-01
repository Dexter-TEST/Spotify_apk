package p.vj6;
import p.zv6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.NoSuchElementException;

public final class vj6 extends Enum implements zv6	// class@002a0a from classes.dex
{
    public static final vj6 a;
    public static final vj6[] b;

    static {
       vj6 ovj6 = new vj6();
       vj6.a = ovj6;
       vj6[] ovj6Array = new vj6[]{ovj6};
       vj6.b = ovj6Array;
    }
    public void vj6(){
       super("INSTANCE", 0);
    }
    public static vj6 valueOf(String p0){
       return Enum.valueOf(vj6.class, p0);
    }
    public static vj6[] values(){
       return vj6.b.clone();
    }
    public final Object get(){
       return new NoSuchElementException();
    }
}
