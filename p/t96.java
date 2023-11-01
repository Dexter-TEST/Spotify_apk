package p.t96;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class t96 extends Enum	// class@002729 from classes.dex
{
    public static final t96[] a;

    static {
       t96[] ot96Array = new t96[]{new t96("BEGINNING", 0),new t96("END", 1),new t96("CURRENT", 2)};
       t96.a = ot96Array;
    }
    public void t96(String p0,int p1){
       super(p0, p1);
    }
    public static t96 valueOf(String p0){
       return Enum.valueOf(t96.class, p0);
    }
    public static t96[] values(){
       return t96.a.clone();
    }
}
