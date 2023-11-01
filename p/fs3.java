package p.fs3;
import p.mj7;
import java.util.HashMap;
import p.ns3;
import java.lang.Object;
import java.lang.String;
import p.eo5;
import p.co5;
import java.lang.StringBuilder;
import p.sz1;

public final class fs3	// class@00162a from classes.dex
{
    public final ns3 a;
    public final String b;
    public StringBuilder c;
    public static final mj7 d;
    public static final HashMap e;

    static {
       fs3.d = new mj7(14, 0);
       fs3.e = new HashMap();
    }
    public void fs3(){
       super();
       this.a = ns3.a;
       eo5.C("Request", "tag");
       this.b = co5.K("Request", "FacebookSDK.");
       this.c = "";
    }
    public final void a(Object p0,String p1){
       co5.o(p1, "key");
       co5.o(p0, "value");
       this.c();
    }
    public final void b(){
       String str = this.c;
       co5.l(str, "contents.toString\(\)");
       mj7.j(this.a, this.b, str);
       this.c = "";
    }
    public final void c(){
       sz1.i(this.a);
    }
}
