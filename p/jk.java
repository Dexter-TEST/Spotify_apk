package p.jk;
import p.zv6;
import p.yf2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.ArrayList;

public final class jk extends Enum implements zv6, yf2	// class@001af7 from classes.dex
{
    public static final jk a;
    public static final jk[] b;

    static {
       jk ojk = new jk();
       jk.a = ojk;
       jk[] ojkArray = new jk[]{ojk};
       jk.b = ojkArray;
    }
    public void jk(){
       super("INSTANCE", 0);
    }
    public static jk valueOf(String p0){
       return Enum.valueOf(jk.class, p0);
    }
    public static jk[] values(){
       return jk.b.clone();
    }
    public final Object apply(Object p0){
       return new ArrayList();
    }
    public final Object get(){
       return new ArrayList();
    }
}
