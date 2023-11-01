package p.gw1;
import p.sd7;
import java.lang.String;
import java.lang.Object;
import p.co5;

public final class gw1 implements sd7	// class@00178e from classes.dex
{
    public final String b;

    public void gw1(String p0){
       super();
       this.b = p0;
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       boolean b = (this.b.length() == p0.length())? true: false;
       return b;
    }
    public final boolean b(String p0){
       co5.o(p0, "segment");
       return co5.c(this.b, p0);
    }
}
