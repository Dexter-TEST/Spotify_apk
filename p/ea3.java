package p.ea3;
import p.da3;
import java.lang.Object;
import java.lang.String;
import p.mi;
import p.oe0;
import java.nio.charset.Charset;
import java.net.URLDecoder;
import p.co5;
import java.lang.CharSequence;
import p.av6;

public final class ea3 implements da3	// class@00144b from classes.dex
{
    public final int a;

    public void ea3(int p0){
       this.a = p0;
       super();
    }
    public final String a(String p0){
       switch (this.a){
           case 0:
             return mi.t(p0, "adjust_campaign");
           case 1:
             p0 = URLDecoder.decode(mi.t(p0, "_branch_link"), oe0.a.name());
             co5.l(p0, "branchLink");
             return mi.t(p0, "~campaign");
           default:
             return mi.t(p0, "branch_campaign");
       }
    }
    public final boolean b(String p0){
       switch (this.a){
           case 0:
           case 1:
             boolean b = (av6.f0(p0, "_branch_link") && av6.f0(p0, "~campaign"))? true: false;
             return b;
             break;
           default:
             return av6.f0(p0, "branch_campaign");
       }
       return av6.f0(p0, "adjust_campaign");
    }
}
