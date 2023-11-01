package p.m50;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class m50 extends Enum	// class@001e27 from classes.dex
{
    public static final m50 a;
    public static final m50 b;
    public static final m50[] c;

    static {
       m50 om50 = new m50(0, "OPEN");
       m50.a = om50;
       m50 om501 = new m50(1, "CLOSED");
       m50.b = om501;
       m50[] om50Array = new m50[]{om50,om501};
       m50.c = om50Array;
    }
    public void m50(int p0,String p1){
       super(p1, p0);
    }
    public static m50 valueOf(String p0){
       return Enum.valueOf(m50.class, p0);
    }
    public static m50[] values(){
       return m50.c.clone();
    }
}
