package p.qa6;
import p.zf2;
import p.gh2;
import p.la6;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.util.Iterator;

public final class qa6 extends gh2 implements zf2	// class@002365 from classes.dex
{
    public static final qa6 z;

    static {
       qa6.z = new qa6();
    }
    public void qa6(){
       super(1, la6.class, "iterator", "iterator\(\)Ljava/util/Iterator;");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return p0.iterator();
    }
}
