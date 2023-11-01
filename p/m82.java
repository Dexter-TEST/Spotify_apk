package p.m82;
import p.ir0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.kv6;

public final class m82 extends Enum implements ir0	// class@001e43 from classes.dex
{
    public static final m82 a;
    public static final m82[] b;

    static {
       m82 om82 = new m82();
       m82.a = om82;
       m82[] om82Array = new m82[]{om82};
       m82.b = om82Array;
    }
    public void m82(){
       super("INSTANCE", 0);
    }
    public static m82 valueOf(String p0){
       return Enum.valueOf(m82.class, p0);
    }
    public static m82[] values(){
       return m82.b.clone();
    }
    public final void accept(Object p0){
       p0.a(Long.MAX_VALUE);
    }
}
