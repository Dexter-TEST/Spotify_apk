package p.hx;
import java.lang.Enum;
import p.gx;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class hx extends Enum	// class@0018e3 from classes.dex
{
    public static final gx a;
    public static final hx[] b;

    static {
       gx ogx = new gx();
       hx.a = ogx;
       hx[] ohxArray = new hx[]{ogx};
       hx.b = ohxArray;
    }
    public void hx(){
       super("VERIFIED", 0);
    }
    public static hx valueOf(String p0){
       return Enum.valueOf(hx.class, p0);
    }
    public static hx[] values(){
       return hx.b.clone();
    }
}
