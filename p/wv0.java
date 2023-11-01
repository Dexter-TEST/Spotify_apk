package p.wv0;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.b17;

public final class wv0 extends Exception	// class@002bb0 from classes.dex
{
    public final int a;
    public final Map b;
    public static final int c;

    public void wv0(int p0,String p1,String p2,Map p3,String p4,Map p5,byte[] p6,String p7){
       co5.o(p2, "message");
       super("{status="+p0+", uri="+p1+", reason="+p7+", message=\""+p2+"\", headers=\""+p3+"\", request={action=\""+p4+"\", headers=\""+p5+"\", body=\""+b17.A(p6)+"\"}}");
       this.a = p0;
       this.b = p3;
    }
}
