package p.yo4;
import java.lang.Object;
import java.util.Objects;

public abstract class yo4	// class@002dfa from classes.dex
{

    public static boolean a(Object p0,Object p1){
       return Objects.equals(p0, p1);
    }
    public static int b(Object[] p0){
       return Objects.hash(p0);
    }
}
