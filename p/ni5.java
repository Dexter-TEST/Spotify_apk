package p.ni5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ni5 extends Enum	// class@001fe5 from classes.dex
{
    public static final ni5 a;
    public static final ni5 b;
    public static final ni5[] c;

    static {
       ni5 oni5 = new ni5("NONE", 0);
       ni5.a = oni5;
       ni5 oni51 = new ni5("MEDIA", 1);
       ni5.b = oni51;
       ni5[] oni5Array = new ni5[]{oni5,oni51};
       ni5.c = oni5Array;
    }
    public void ni5(String p0,int p1){
       super(p0, p1);
    }
    public static ni5 valueOf(String p0){
       return Enum.valueOf(ni5.class, p0);
    }
    public static ni5[] values(){
       return ni5.c.clone();
    }
}
