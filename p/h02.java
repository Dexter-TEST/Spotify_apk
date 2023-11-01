package p.h02;
import p.a2;
import p.cf7;
import java.util.Random;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.lang.String;
import p.co5;

public final class h02 extends a2	// class@0017b3 from classes.dex
{
    public final cf7 c;

    public void h02(){
       super();
       this.c = new cf7(9);
    }
    public final Random e(){
       Object obj = this.c.get();
       co5.l(obj, "implStorage.get\(\)");
       return obj;
    }
}
