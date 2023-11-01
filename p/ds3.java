package p.ds3;
import p.n26;
import p.cs3;
import java.lang.Object;
import p.nb7;
import java.lang.String;
import p.co5;
import java.util.UUID;
import p.zf2;
import p.pb7;
import p.nb3;
import p.mb3;
import p.y55;

public final class ds3	// class@0013a8 from classes.dex
{
    public final zf2 a;
    public final zf2 b;

    public void ds3(){
       super();
       this.a = n26.P;
       this.b = cs3.b;
    }
    public final void a(nb7 p0){
       co5.o(p0, "impressionEvent");
       co5.l(UUID.randomUUID().toString(), "randomUUID\(\).toString\(\)");
       String str = this.a.invoke(p0);
       co5.l(UUID.randomUUID().toString(), "randomUUID\(\).toString\(\)");
    }
    public final nb3 b(pb7 p0){
       co5.o(p0, "interactionEvent");
       String str = UUID.randomUUID().toString();
       co5.l(str, "randomUUID\(\).toString\(\)");
       String str1 = this.b.invoke(p0);
       mb3 omb3 = new mb3(str);
       String str2 = UUID.randomUUID().toString();
       co5.l(str2, "randomUUID\(\).toString\(\)");
       return new nb3(omb3, new y55(str2));
    }
}
